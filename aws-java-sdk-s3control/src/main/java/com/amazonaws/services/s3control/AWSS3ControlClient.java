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
package com.amazonaws.services.s3control;

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

import com.amazonaws.services.s3control.AWSS3ControlClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.s3control.model.*;

import com.amazonaws.services.s3control.model.transform.*;

import com.amazonaws.arn.Arn;
import com.amazonaws.arn.AwsResource;
import static com.amazonaws.services.s3control.S3ControlHandlerContextKey.S3_ARNABLE_FIELD;

/**
 * Client for accessing AWS S3 Control. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Web Services S3 Control provides access to Amazon S3 control plane actions.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSS3ControlClient extends AmazonWebServiceClient implements AWSS3Control {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSS3Control.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "s3";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * Map of exception unmarshallers for all modeled exceptions
     */
    private final Map<String, Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallersMap = new HashMap<String, Unmarshaller<AmazonServiceException, Node>>();

    /**
     * List of exception unmarshallers for all modeled exceptions Even though this exceptionUnmarshallers is not used in
     * Clients, this is not removed since this was directly used by Client extended classes. Using this list can cause
     * performance impact.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    protected Unmarshaller<AmazonServiceException, Node> defaultUnmarshaller;

    public static AWSS3ControlClientBuilder builder() {
        return AWSS3ControlClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS S3 Control using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSS3ControlClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS S3 Control using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSS3ControlClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        if (exceptionUnmarshallersMap.get("InvalidRequestException") == null) {
            exceptionUnmarshallersMap.put("InvalidRequestException", new InvalidRequestExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("InvalidNextTokenException") == null) {
            exceptionUnmarshallersMap.put("InvalidNextTokenException", new InvalidNextTokenExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("JobStatusException") == null) {
            exceptionUnmarshallersMap.put("JobStatusException", new JobStatusExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new JobStatusExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("NoSuchPublicAccessBlockConfiguration") == null) {
            exceptionUnmarshallersMap.put("NoSuchPublicAccessBlockConfiguration", new NoSuchPublicAccessBlockConfigurationExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new NoSuchPublicAccessBlockConfigurationExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("InternalServiceException") == null) {
            exceptionUnmarshallersMap.put("InternalServiceException", new InternalServiceExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("BucketAlreadyExists") == null) {
            exceptionUnmarshallersMap.put("BucketAlreadyExists", new BucketAlreadyExistsExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new BucketAlreadyExistsExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("NotFoundException") == null) {
            exceptionUnmarshallersMap.put("NotFoundException", new NotFoundExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("TooManyTagsException") == null) {
            exceptionUnmarshallersMap.put("TooManyTagsException", new TooManyTagsExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("IdempotencyException") == null) {
            exceptionUnmarshallersMap.put("IdempotencyException", new IdempotencyExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new IdempotencyExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("BucketAlreadyOwnedByYou") == null) {
            exceptionUnmarshallersMap.put("BucketAlreadyOwnedByYou", new BucketAlreadyOwnedByYouExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new BucketAlreadyOwnedByYouExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("TooManyRequestsException") == null) {
            exceptionUnmarshallersMap.put("TooManyRequestsException", new TooManyRequestsExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        if (exceptionUnmarshallersMap.get("BadRequestException") == null) {
            exceptionUnmarshallersMap.put("BadRequestException", new BadRequestExceptionUnmarshaller());
        }
        exceptionUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        defaultUnmarshaller = new StandardErrorUnmarshaller(com.amazonaws.services.s3control.model.AWSS3ControlException.class);
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.s3control.model.AWSS3ControlException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("s3-control.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/s3control/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/s3control/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associate your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance. Use this
     * action if you want to create access grants for users or groups from your corporate identity directory. First, you
     * must add your corporate identity directory to Amazon Web Services IAM Identity Center. Then, you can associate
     * this IAM Identity Center instance with your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:AssociateAccessGrantsIdentityCenter</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permissions: <code>sso:CreateApplication</code>,
     * <code>sso:PutApplicationGrant</code>, and <code>sso:PutApplicationAuthenticationMethod</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param associateAccessGrantsIdentityCenterRequest
     * @return Result of the AssociateAccessGrantsIdentityCenter operation returned by the service.
     * @sample AWSS3Control.AssociateAccessGrantsIdentityCenter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AssociateAccessGrantsIdentityCenter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAccessGrantsIdentityCenterResult associateAccessGrantsIdentityCenter(AssociateAccessGrantsIdentityCenterRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAccessGrantsIdentityCenter(request);
    }

    @SdkInternalApi
    final AssociateAccessGrantsIdentityCenterResult executeAssociateAccessGrantsIdentityCenter(
            AssociateAccessGrantsIdentityCenterRequest associateAccessGrantsIdentityCenterRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAccessGrantsIdentityCenterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAccessGrantsIdentityCenterRequest> request = null;
        Response<AssociateAccessGrantsIdentityCenterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAccessGrantsIdentityCenterRequestMarshaller().marshall(super
                        .beforeMarshalling(associateAccessGrantsIdentityCenterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAccessGrantsIdentityCenter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(associateAccessGrantsIdentityCenterRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(associateAccessGrantsIdentityCenterRequest.getAccountId(), "AccountId",
                        "associateAccessGrantsIdentityCenterRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", associateAccessGrantsIdentityCenterRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<AssociateAccessGrantsIdentityCenterResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<AssociateAccessGrantsIdentityCenterResult>(
                    new AssociateAccessGrantsIdentityCenterResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an access grant that gives a grantee access to your S3 data. The grantee can be an IAM user or role or a
     * directory user, or group. Before you can create a grant, you must have an S3 Access Grants instance in the same
     * Region as the S3 data. You can create an S3 Access Grants instance using the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessGrantsInstance.html"
     * >CreateAccessGrantsInstance</a>. You must also have registered at least one S3 data location in your S3 Access
     * Grants instance using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessGrantsLocation.html"
     * >CreateAccessGrantsLocation</a>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * For any directory identity - <code>sso:DescribeInstance</code> and <code>sso:DescribeApplication</code>
     * </p>
     * <p>
     * For directory users - <code>identitystore:DescribeUser</code>
     * </p>
     * <p>
     * For directory groups - <code>identitystore:DescribeGroup</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantRequest
     * @return Result of the CreateAccessGrant operation returned by the service.
     * @sample AWSS3Control.CreateAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAccessGrantResult createAccessGrant(CreateAccessGrantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessGrant(request);
    }

    @SdkInternalApi
    final CreateAccessGrantResult executeCreateAccessGrant(CreateAccessGrantRequest createAccessGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessGrantRequest> request = null;
        Response<CreateAccessGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessGrantRequestMarshaller().marshall(super.beforeMarshalling(createAccessGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessGrantRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessGrantRequest.getAccountId(), "AccountId", "createAccessGrantRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessGrantRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessGrantResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessGrantResult>(
                    new CreateAccessGrantResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an S3 Access Grants instance, which serves as a logical grouping for access grants. You can create one S3
     * Access Grants instance per Region per account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * To associate an IAM Identity Center instance with your S3 Access Grants instance, you must also have the
     * <code>sso:DescribeInstance</code>, <code>sso:CreateApplication</code>, <code>sso:PutApplicationGrant</code>, and
     * <code>sso:PutApplicationAuthenticationMethod</code> permissions.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantsInstanceRequest
     * @return Result of the CreateAccessGrantsInstance operation returned by the service.
     * @sample AWSS3Control.CreateAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessGrantsInstanceResult createAccessGrantsInstance(CreateAccessGrantsInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessGrantsInstance(request);
    }

    @SdkInternalApi
    final CreateAccessGrantsInstanceResult executeCreateAccessGrantsInstance(CreateAccessGrantsInstanceRequest createAccessGrantsInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessGrantsInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessGrantsInstanceRequest> request = null;
        Response<CreateAccessGrantsInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessGrantsInstanceRequestMarshaller().marshall(super.beforeMarshalling(createAccessGrantsInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessGrantsInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessGrantsInstanceRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessGrantsInstanceRequest.getAccountId(), "AccountId", "createAccessGrantsInstanceRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessGrantsInstanceRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessGrantsInstanceResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessGrantsInstanceResult>(
                    new CreateAccessGrantsInstanceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The S3 data location that you would like to register in your S3 Access Grants instance. Your S3 data must be in
     * the same Region as your S3 Access Grants instance. The location can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default S3 location <code>s3://</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A bucket - <code>S3://&lt;bucket-name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A bucket and prefix - <code>S3://&lt;bucket-name&gt;/&lt;prefix&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register a location, you must include the IAM role that has permission to manage the S3 location that
     * you are registering. Give S3 Access Grants permission to assume this role <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-location.html">using a policy</a>. S3
     * Access Grants assumes this role to manage access to the location and to vend temporary credentials to grantees or
     * client applications.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permission for the specified IAM role: <code>iam:PassRole</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantsLocationRequest
     * @return Result of the CreateAccessGrantsLocation operation returned by the service.
     * @sample AWSS3Control.CreateAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessGrantsLocationResult createAccessGrantsLocation(CreateAccessGrantsLocationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessGrantsLocation(request);
    }

    @SdkInternalApi
    final CreateAccessGrantsLocationResult executeCreateAccessGrantsLocation(CreateAccessGrantsLocationRequest createAccessGrantsLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessGrantsLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessGrantsLocationRequest> request = null;
        Response<CreateAccessGrantsLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessGrantsLocationRequestMarshaller().marshall(super.beforeMarshalling(createAccessGrantsLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessGrantsLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessGrantsLocationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessGrantsLocationRequest.getAccountId(), "AccountId", "createAccessGrantsLocationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessGrantsLocationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessGrantsLocationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessGrantsLocationResult>(
                    new CreateAccessGrantsLocationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates an access point and associates it with the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <note>
     * <p>
     * S3 on Outposts only supports VPC-style access points.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">
     * Accessing Amazon S3 on Outposts using virtual private cloud (VPC) only access points</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html#API_control_CreateAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p/>
     * <p>
     * The following actions are related to <code>CreateAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointRequest
     * @return Result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3Control.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAccessPointResult createAccessPoint(CreateAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessPoint(request);
    }

    @SdkInternalApi
    final CreateAccessPointResult executeCreateAccessPoint(CreateAccessPointRequest createAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPointRequest> request = null;
        Response<CreateAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = createAccessPointRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    createAccessPointRequest = createAccessPointRequest.clone();
                    createAccessPointRequest.setBucket(resource.getBucketName());

                    String accountId = createAccessPointRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    createAccessPointRequest.setAccountId(accountIdInArn);
                }
                request = new CreateAccessPointRequestMarshaller().marshall(super.beforeMarshalling(createAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessPointRequest.getAccountId(), "AccountId", "createAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessPointResult>(
                    new CreateAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates an Object Lambda Access Point. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointForObjectLambdaRequest
     * @return Result of the CreateAccessPointForObjectLambda operation returned by the service.
     * @sample AWSS3Control.CreateAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessPointForObjectLambdaResult createAccessPointForObjectLambda(CreateAccessPointForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessPointForObjectLambda(request);
    }

    @SdkInternalApi
    final CreateAccessPointForObjectLambdaResult executeCreateAccessPointForObjectLambda(
            CreateAccessPointForObjectLambdaRequest createAccessPointForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessPointForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPointForObjectLambdaRequest> request = null;
        Response<CreateAccessPointForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessPointForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(createAccessPointForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessPointForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessPointForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessPointForObjectLambdaRequest.getAccountId(), "AccountId",
                        "createAccessPointForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessPointForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessPointForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessPointForObjectLambdaResult>(
                    new CreateAccessPointForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">Create Bucket</a> in the <i>Amazon
     * S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket,
     * you must have S3 on Outposts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Not every string is an acceptable bucket name. For information on bucket naming restrictions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules">Working
     * with Amazon S3 Buckets</a>.
     * </p>
     * <p>
     * S3 on Outposts buckets support:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * LifecycleConfigurations for deleting expired objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OnOutpostsRestrictionsLimitations.html"> Amazon S3
     * on Outposts Restrictions and Limitations</a>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your API request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html#API_control_CreateBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>CreateBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBucketRequest
     * @return Result of the CreateBucket operation returned by the service.
     * @throws BucketAlreadyExistsException
     *         The requested Outposts bucket name is not available. The bucket namespace is shared by all users of the
     *         Outposts in this Region. Select a different name and try again.
     * @throws BucketAlreadyOwnedByYouException
     *         The Outposts bucket you tried to create already exists, and you own it.
     * @sample AWSS3Control.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBucketResult createBucket(CreateBucketRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBucket(request);
    }

    @SdkInternalApi
    final CreateBucketResult executeCreateBucket(CreateBucketRequest createBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(createBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBucketRequest> request = null;
        Response<CreateBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBucketRequestMarshaller().marshall(super.beforeMarshalling(createBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateBucketResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateBucketResult>(
                    new CreateBucketResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation creates an S3 Batch Operations job.
     * </p>
     * <p>
     * You can use S3 Batch Operations to perform large-scale batch actions on Amazon S3 objects. Batch Operations can
     * run a single action on lists of Amazon S3 objects that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * For information about permissions required to use the Batch Operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops-iam-role-policies.html">Granting
     * permissions for S3 Batch Operations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_JobOperation.html">JobOperation</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @sample AWSS3Control.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestMarshaller().marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createJobRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createJobRequest.getAccountId(), "AccountId", "createJobRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createJobRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateJobResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateJobResult>(
                    new CreateJobResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates a Multi-Region Access Point and associates it with the specified buckets. For more information about
     * creating Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html">Creating
     * Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This request is asynchronous, meaning that you might receive a response before the command has completed. When
     * this request provides a response, it provides a token that you can use to monitor the status of the request with
     * <code>DescribeMultiRegionAccessPointOperation</code>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMultiRegionAccessPointRequest
     * @return Result of the CreateMultiRegionAccessPoint operation returned by the service.
     * @sample AWSS3Control.CreateMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMultiRegionAccessPointResult createMultiRegionAccessPoint(CreateMultiRegionAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMultiRegionAccessPoint(request);
    }

    @SdkInternalApi
    final CreateMultiRegionAccessPointResult executeCreateMultiRegionAccessPoint(CreateMultiRegionAccessPointRequest createMultiRegionAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(createMultiRegionAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMultiRegionAccessPointRequest> request = null;
        Response<CreateMultiRegionAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMultiRegionAccessPointRequestMarshaller().marshall(super.beforeMarshalling(createMultiRegionAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMultiRegionAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createMultiRegionAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createMultiRegionAccessPointRequest.getAccountId(), "AccountId",
                        "createMultiRegionAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createMultiRegionAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateMultiRegionAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateMultiRegionAccessPointResult>(
                    new CreateMultiRegionAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new S3 Storage Lens group and associates it with the specified Amazon Web Services account ID. An S3
     * Storage Lens group is a custom grouping of objects based on prefix, suffix, object tags, object size, object age,
     * or a combination of these filters. For each Storage Lens group that you’ve created, you can also optionally add
     * Amazon Web Services resource tags. For more information about S3 Storage Lens groups, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups-overview.html">Working with S3
     * Storage Lens groups</a>.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:CreateStorageLensGroup</code> action.
     * If you’re trying to create a Storage Lens group with Amazon Web Services resource tags, you must also have
     * permission to perform the <code>s3:TagResource</code> action. For more information about the required Storage
     * Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param createStorageLensGroupRequest
     * @return Result of the CreateStorageLensGroup operation returned by the service.
     * @sample AWSS3Control.CreateStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStorageLensGroupResult createStorageLensGroup(CreateStorageLensGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStorageLensGroup(request);
    }

    @SdkInternalApi
    final CreateStorageLensGroupResult executeCreateStorageLensGroup(CreateStorageLensGroupRequest createStorageLensGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createStorageLensGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageLensGroupRequest> request = null;
        Response<CreateStorageLensGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorageLensGroupRequestMarshaller().marshall(super.beforeMarshalling(createStorageLensGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStorageLensGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createStorageLensGroupRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createStorageLensGroupRequest.getAccountId(), "AccountId", "createStorageLensGroupRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createStorageLensGroupRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateStorageLensGroupResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateStorageLensGroupResult>(
                    new CreateStorageLensGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the access grant from the S3 Access Grants instance. You cannot undo an access grant deletion and the
     * grantee will no longer have access to the S3 data.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantRequest
     * @return Result of the DeleteAccessGrant operation returned by the service.
     * @sample AWSS3Control.DeleteAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAccessGrantResult deleteAccessGrant(DeleteAccessGrantRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessGrant(request);
    }

    @SdkInternalApi
    final DeleteAccessGrantResult executeDeleteAccessGrant(DeleteAccessGrantRequest deleteAccessGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessGrantRequest> request = null;
        Response<DeleteAccessGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessGrantRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessGrantRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessGrantRequest.getAccountId(), "AccountId", "deleteAccessGrantRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessGrantRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessGrantResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessGrantResult>(
                    new DeleteAccessGrantResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes your S3 Access Grants instance. You must first delete the access grants and locations before S3 Access
     * Grants can delete the instance. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrant.html">DeleteAccessGrant</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrantsLocation.html">
     * DeleteAccessGrantsLocation</a>. If you have associated an IAM Identity Center instance with your S3 Access Grants
     * instance, you must first dissassociate the Identity Center instance from the S3 Access Grants instance before you
     * can delete the S3 Access Grants instance. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AssociateAccessGrantsIdentityCenter.html"
     * >AssociateAccessGrantsIdentityCenter</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DissociateAccessGrantsIdentityCenter.html"
     * >DissociateAccessGrantsIdentityCenter</a>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsInstanceRequest
     * @return Result of the DeleteAccessGrantsInstance operation returned by the service.
     * @sample AWSS3Control.DeleteAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessGrantsInstanceResult deleteAccessGrantsInstance(DeleteAccessGrantsInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessGrantsInstance(request);
    }

    @SdkInternalApi
    final DeleteAccessGrantsInstanceResult executeDeleteAccessGrantsInstance(DeleteAccessGrantsInstanceRequest deleteAccessGrantsInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessGrantsInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessGrantsInstanceRequest> request = null;
        Response<DeleteAccessGrantsInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessGrantsInstanceRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessGrantsInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessGrantsInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessGrantsInstanceRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessGrantsInstanceRequest.getAccountId(), "AccountId", "deleteAccessGrantsInstanceRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessGrantsInstanceRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessGrantsInstanceResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessGrantsInstanceResult>(
                    new DeleteAccessGrantsInstanceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the resource policy of the S3 Access Grants instance. The resource policy is used to manage cross-account
     * access to your S3 Access Grants instance. By deleting the resource policy, you delete any cross-account
     * permissions to your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsInstanceResourcePolicyRequest
     * @return Result of the DeleteAccessGrantsInstanceResourcePolicy operation returned by the service.
     * @sample AWSS3Control.DeleteAccessGrantsInstanceResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessGrantsInstanceResourcePolicyResult deleteAccessGrantsInstanceResourcePolicy(DeleteAccessGrantsInstanceResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessGrantsInstanceResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteAccessGrantsInstanceResourcePolicyResult executeDeleteAccessGrantsInstanceResourcePolicy(
            DeleteAccessGrantsInstanceResourcePolicyRequest deleteAccessGrantsInstanceResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessGrantsInstanceResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessGrantsInstanceResourcePolicyRequest> request = null;
        Response<DeleteAccessGrantsInstanceResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessGrantsInstanceResourcePolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAccessGrantsInstanceResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessGrantsInstanceResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessGrantsInstanceResourcePolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessGrantsInstanceResourcePolicyRequest.getAccountId(), "AccountId",
                        "deleteAccessGrantsInstanceResourcePolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessGrantsInstanceResourcePolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessGrantsInstanceResourcePolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessGrantsInstanceResourcePolicyResult>(
                    new DeleteAccessGrantsInstanceResourcePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a location from your S3 Access Grants instance. You can only delete a location registration from an
     * S3 Access Grants instance if there are no grants associated with this location. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrant.html">Delete a grant</a> for
     * information on how to delete grants. You need to have at least one registered location in your S3 Access Grants
     * instance in order to create access grants.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsLocationRequest
     * @return Result of the DeleteAccessGrantsLocation operation returned by the service.
     * @sample AWSS3Control.DeleteAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessGrantsLocationResult deleteAccessGrantsLocation(DeleteAccessGrantsLocationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessGrantsLocation(request);
    }

    @SdkInternalApi
    final DeleteAccessGrantsLocationResult executeDeleteAccessGrantsLocation(DeleteAccessGrantsLocationRequest deleteAccessGrantsLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessGrantsLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessGrantsLocationRequest> request = null;
        Response<DeleteAccessGrantsLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessGrantsLocationRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessGrantsLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessGrantsLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessGrantsLocationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessGrantsLocationRequest.getAccountId(), "AccountId", "deleteAccessGrantsLocationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessGrantsLocationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessGrantsLocationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessGrantsLocationResult>(
                    new DeleteAccessGrantsLocationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the specified access point.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html#API_control_DeleteAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointRequest
     * @return Result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAccessPointResult deleteAccessPoint(DeleteAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPoint(request);
    }

    @SdkInternalApi
    final DeleteAccessPointResult executeDeleteAccessPoint(DeleteAccessPointRequest deleteAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointRequest> request = null;
        Response<DeleteAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = deleteAccessPointRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    deleteAccessPointRequest = deleteAccessPointRequest.clone();
                    deleteAccessPointRequest.setName(resource.getAccessPointName());

                    String accountId = deleteAccessPointRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteAccessPointRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteAccessPointRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointRequest.getAccountId(), "AccountId", "deleteAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointResult>(
                    new DeleteAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the specified Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointForObjectLambdaRequest
     * @return Result of the DeleteAccessPointForObjectLambda operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPointForObjectLambdaResult deleteAccessPointForObjectLambda(DeleteAccessPointForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPointForObjectLambda(request);
    }

    @SdkInternalApi
    final DeleteAccessPointForObjectLambdaResult executeDeleteAccessPointForObjectLambda(
            DeleteAccessPointForObjectLambdaRequest deleteAccessPointForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointForObjectLambdaRequest> request = null;
        Response<DeleteAccessPointForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPointForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessPointForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPointForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointForObjectLambdaRequest.getAccountId(), "AccountId",
                        "deleteAccessPointForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointForObjectLambdaResult>(
                    new DeleteAccessPointForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html#API_control_DeleteAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyRequest
     * @return Result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPointPolicyResult deleteAccessPointPolicy(DeleteAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPointPolicy(request);
    }

    @SdkInternalApi
    final DeleteAccessPointPolicyResult executeDeleteAccessPointPolicy(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointPolicyRequest> request = null;
        Response<DeleteAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = deleteAccessPointPolicyRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    deleteAccessPointPolicyRequest = deleteAccessPointPolicyRequest.clone();
                    deleteAccessPointPolicyRequest.setName(resource.getAccessPointName());

                    String accountId = deleteAccessPointPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteAccessPointPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointPolicyRequest.getAccountId(), "AccountId", "deleteAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointPolicyResult>(
                    new DeleteAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Removes the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyForObjectLambdaRequest
     * @return Result of the DeleteAccessPointPolicyForObjectLambda operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPointPolicyForObjectLambdaResult deleteAccessPointPolicyForObjectLambda(DeleteAccessPointPolicyForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPointPolicyForObjectLambda(request);
    }

    @SdkInternalApi
    final DeleteAccessPointPolicyForObjectLambdaResult executeDeleteAccessPointPolicyForObjectLambda(
            DeleteAccessPointPolicyForObjectLambdaRequest deleteAccessPointPolicyForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointPolicyForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointPolicyForObjectLambdaRequest> request = null;
        Response<DeleteAccessPointPolicyForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPointPolicyForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAccessPointPolicyForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPointPolicyForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId",
                        "deleteAccessPointPolicyForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointPolicyForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointPolicyForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointPolicyForObjectLambdaResult>(
                    new DeleteAccessPointPolicyForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a> in the <i>Amazon S3
     * API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the
     * bucket must be deleted before the bucket itself can be deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html#API_control_DeleteBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketRequest
     * @return Result of the DeleteBucket operation returned by the service.
     * @sample AWSS3Control.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBucketResult deleteBucket(DeleteBucketRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucket(request);
    }

    @SdkInternalApi
    final DeleteBucketResult executeDeleteBucket(DeleteBucketRequest deleteBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketRequest> request = null;
        Response<DeleteBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketRequest = deleteBucketRequest.clone();
                    deleteBucketRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketRequest.getAccountId(), "AccountId", "deleteBucketRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketResult>(
                    new DeleteBucketResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the
     * lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire,
     * and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the
     * deleted lifecycle configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3-outposts:PutLifecycleConfiguration</code>
     * action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission
     * to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html#API_control_DeleteBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For more information about object expiration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
     * >Elements to Describe Lifecycle Actions</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketLifecycleConfigurationRequest
     * @return Result of the DeleteBucketLifecycleConfiguration operation returned by the service.
     * @sample AWSS3Control.DeleteBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBucketLifecycleConfigurationResult deleteBucketLifecycleConfiguration(DeleteBucketLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final DeleteBucketLifecycleConfigurationResult executeDeleteBucketLifecycleConfiguration(
            DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketLifecycleConfigurationRequest> request = null;
        Response<DeleteBucketLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketLifecycleConfigurationRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketLifecycleConfigurationRequest = deleteBucketLifecycleConfigurationRequest.clone();
                    deleteBucketLifecycleConfigurationRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketLifecycleConfigurationRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketLifecycleConfigurationRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketLifecycleConfigurationRequestMarshaller()
                        .marshall(super.beforeMarshalling(deleteBucketLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketLifecycleConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketLifecycleConfigurationRequest.getAccountId(), "AccountId",
                        "deleteBucketLifecycleConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketLifecycleConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketLifecycleConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketLifecycleConfigurationResult>(
                    new DeleteBucketLifecycleConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketPolicy.html">DeleteBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * This implementation of the DELETE action uses the policy subresource to delete the policy of a specified Amazon
     * S3 on Outposts bucket. If you are using an identity other than the root user of the Amazon Web Services account
     * that owns the bucket, the calling identity must have the <code>s3-outposts:DeleteBucketPolicy</code> permissions
     * on the specified Outposts bucket and belong to the bucket owner's account to use this action. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon
     * S3 on Outposts</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you don't have <code>DeleteBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html#API_control_DeleteBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketPolicyRequest
     * @return Result of the DeleteBucketPolicy operation returned by the service.
     * @sample AWSS3Control.DeleteBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBucketPolicyResult deleteBucketPolicy(DeleteBucketPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketPolicy(request);
    }

    @SdkInternalApi
    final DeleteBucketPolicyResult executeDeleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketPolicyRequest> request = null;
        Response<DeleteBucketPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketPolicyRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketPolicyRequest = deleteBucketPolicyRequest.clone();
                    deleteBucketPolicyRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketPolicyRequest.getAccountId(), "AccountId", "deleteBucketPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketPolicyResult>(
                    new DeleteBucketPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation deletes an Amazon S3 on Outposts bucket's replication configuration. To delete an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html"
     * >DeleteBucketReplication</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the replication configuration from the specified S3 on Outposts bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the
     * <code>s3-outposts:PutReplicationConfiguration</code> action. The Outposts bucket owner has this permission by
     * default and can grant it to others. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up IAM with S3 on
     * Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts buckets</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html#API_control_DeleteBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html">
     * PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html">
     * GetBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketReplicationRequest
     * @return Result of the DeleteBucketReplication operation returned by the service.
     * @sample AWSS3Control.DeleteBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketReplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBucketReplicationResult deleteBucketReplication(DeleteBucketReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketReplication(request);
    }

    @SdkInternalApi
    final DeleteBucketReplicationResult executeDeleteBucketReplication(DeleteBucketReplicationRequest deleteBucketReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketReplicationRequest> request = null;
        Response<DeleteBucketReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBucketReplicationRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketReplicationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketReplicationRequest.getAccountId(), "AccountId", "deleteBucketReplicationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketReplicationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketReplicationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketReplicationResult>(
                    new DeleteBucketReplicationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the tags from the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>PutBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html#API_control_DeleteBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketTaggingRequest
     * @return Result of the DeleteBucketTagging operation returned by the service.
     * @sample AWSS3Control.DeleteBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketTagging" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBucketTaggingResult deleteBucketTagging(DeleteBucketTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketTagging(request);
    }

    @SdkInternalApi
    final DeleteBucketTaggingResult executeDeleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketTaggingRequest> request = null;
        Response<DeleteBucketTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketTaggingRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketTaggingRequest = deleteBucketTaggingRequest.clone();
                    deleteBucketTaggingRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketTaggingRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketTaggingRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketTaggingRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketTaggingRequest.getAccountId(), "AccountId", "deleteBucketTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketTaggingResult>(
                    new DeleteBucketTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the entire tag set from the specified S3 Batch Operations job.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>DeleteJobTagging</code> operation, you must have permission to perform the
     * <code>s3:DeleteJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteJobTaggingRequest
     * @return Result of the DeleteJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @sample AWSS3Control.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobTaggingResult deleteJobTagging(DeleteJobTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJobTagging(request);
    }

    @SdkInternalApi
    final DeleteJobTaggingResult executeDeleteJobTagging(DeleteJobTaggingRequest deleteJobTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobTaggingRequest> request = null;
        Response<DeleteJobTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobTaggingRequestMarshaller().marshall(super.beforeMarshalling(deleteJobTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJobTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteJobTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteJobTaggingRequest.getAccountId(), "AccountId", "deleteJobTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteJobTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteJobTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteJobTaggingResult>(
                    new DeleteJobTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes a Multi-Region Access Point. This action does not delete the buckets associated with the Multi-Region
     * Access Point, only the Multi-Region Access Point itself.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This request is asynchronous, meaning that you might receive a response before the command has completed. When
     * this request provides a response, it provides a token that you can use to monitor the status of the request with
     * <code>DescribeMultiRegionAccessPointOperation</code>.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMultiRegionAccessPointRequest
     * @return Result of the DeleteMultiRegionAccessPoint operation returned by the service.
     * @sample AWSS3Control.DeleteMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMultiRegionAccessPointResult deleteMultiRegionAccessPoint(DeleteMultiRegionAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMultiRegionAccessPoint(request);
    }

    @SdkInternalApi
    final DeleteMultiRegionAccessPointResult executeDeleteMultiRegionAccessPoint(DeleteMultiRegionAccessPointRequest deleteMultiRegionAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMultiRegionAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMultiRegionAccessPointRequest> request = null;
        Response<DeleteMultiRegionAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMultiRegionAccessPointRequestMarshaller().marshall(super.beforeMarshalling(deleteMultiRegionAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMultiRegionAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteMultiRegionAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteMultiRegionAccessPointRequest.getAccountId(), "AccountId",
                        "deleteMultiRegionAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteMultiRegionAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteMultiRegionAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteMultiRegionAccessPointResult>(
                    new DeleteMultiRegionAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletePublicAccessBlockRequest
     * @return Result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3Control.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePublicAccessBlockResult deletePublicAccessBlock(DeletePublicAccessBlockRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePublicAccessBlock(request);
    }

    @SdkInternalApi
    final DeletePublicAccessBlockResult executeDeletePublicAccessBlock(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePublicAccessBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePublicAccessBlockRequest> request = null;
        Response<DeletePublicAccessBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePublicAccessBlockRequestMarshaller().marshall(super.beforeMarshalling(deletePublicAccessBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePublicAccessBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deletePublicAccessBlockRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deletePublicAccessBlockRequest.getAccountId(), "AccountId", "deletePublicAccessBlockRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deletePublicAccessBlockRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeletePublicAccessBlockResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeletePublicAccessBlockResult>(
                    new DeletePublicAccessBlockResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfiguration</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationRequest
     * @return Result of the DeleteStorageLensConfiguration operation returned by the service.
     * @sample AWSS3Control.DeleteStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageLensConfigurationResult deleteStorageLensConfiguration(DeleteStorageLensConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageLensConfiguration(request);
    }

    @SdkInternalApi
    final DeleteStorageLensConfigurationResult executeDeleteStorageLensConfiguration(DeleteStorageLensConfigurationRequest deleteStorageLensConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageLensConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageLensConfigurationRequest> request = null;
        Response<DeleteStorageLensConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageLensConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteStorageLensConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageLensConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteStorageLensConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteStorageLensConfigurationRequest.getAccountId(), "AccountId",
                        "deleteStorageLensConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteStorageLensConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteStorageLensConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteStorageLensConfigurationResult>(
                    new DeleteStorageLensConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationTaggingRequest
     * @return Result of the DeleteStorageLensConfigurationTagging operation returned by the service.
     * @sample AWSS3Control.DeleteStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageLensConfigurationTaggingResult deleteStorageLensConfigurationTagging(DeleteStorageLensConfigurationTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageLensConfigurationTagging(request);
    }

    @SdkInternalApi
    final DeleteStorageLensConfigurationTaggingResult executeDeleteStorageLensConfigurationTagging(
            DeleteStorageLensConfigurationTaggingRequest deleteStorageLensConfigurationTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageLensConfigurationTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageLensConfigurationTaggingRequest> request = null;
        Response<DeleteStorageLensConfigurationTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageLensConfigurationTaggingRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteStorageLensConfigurationTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageLensConfigurationTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId",
                        "deleteStorageLensConfigurationTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteStorageLensConfigurationTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteStorageLensConfigurationTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteStorageLensConfigurationTaggingResult>(
                    new DeleteStorageLensConfigurationTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing S3 Storage Lens group.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:DeleteStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param deleteStorageLensGroupRequest
     * @return Result of the DeleteStorageLensGroup operation returned by the service.
     * @sample AWSS3Control.DeleteStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageLensGroupResult deleteStorageLensGroup(DeleteStorageLensGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageLensGroup(request);
    }

    @SdkInternalApi
    final DeleteStorageLensGroupResult executeDeleteStorageLensGroup(DeleteStorageLensGroupRequest deleteStorageLensGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageLensGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageLensGroupRequest> request = null;
        Response<DeleteStorageLensGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageLensGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteStorageLensGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageLensGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteStorageLensGroupRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteStorageLensGroupRequest.getAccountId(), "AccountId", "deleteStorageLensGroupRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteStorageLensGroupRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteStorageLensGroupResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteStorageLensGroupResult>(
                    new DeleteStorageLensGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>DescribeJob</code> operation, you must have permission to perform the
     * <code>s3:DescribeJob</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws InternalServiceException
     * @sample AWSS3Control.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJob(request);
    }

    @SdkInternalApi
    final DescribeJobResult executeDescribeJob(DescribeJobRequest describeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestMarshaller().marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(describeJobRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(describeJobRequest.getAccountId(), "AccountId", "describeJobRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", describeJobRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DescribeJobResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DescribeJobResult>(
                    new DescribeJobResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Retrieves the status of an asynchronous request to manage a Multi-Region Access Point. For more information about
     * managing Multi-Region Access Points and how asynchronous requests work, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MrapOperations.html">Using Multi-Region Access
     * Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMultiRegionAccessPointOperationRequest
     * @return Result of the DescribeMultiRegionAccessPointOperation operation returned by the service.
     * @sample AWSS3Control.DescribeMultiRegionAccessPointOperation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeMultiRegionAccessPointOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMultiRegionAccessPointOperationResult describeMultiRegionAccessPointOperation(DescribeMultiRegionAccessPointOperationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMultiRegionAccessPointOperation(request);
    }

    @SdkInternalApi
    final DescribeMultiRegionAccessPointOperationResult executeDescribeMultiRegionAccessPointOperation(
            DescribeMultiRegionAccessPointOperationRequest describeMultiRegionAccessPointOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMultiRegionAccessPointOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMultiRegionAccessPointOperationRequest> request = null;
        Response<DescribeMultiRegionAccessPointOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMultiRegionAccessPointOperationRequestMarshaller().marshall(super
                        .beforeMarshalling(describeMultiRegionAccessPointOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMultiRegionAccessPointOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(describeMultiRegionAccessPointOperationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(describeMultiRegionAccessPointOperationRequest.getAccountId(), "AccountId",
                        "describeMultiRegionAccessPointOperationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", describeMultiRegionAccessPointOperationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DescribeMultiRegionAccessPointOperationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DescribeMultiRegionAccessPointOperationResult>(
                    new DescribeMultiRegionAccessPointOperationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dissociates the Amazon Web Services IAM Identity Center instance from the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DissociateAccessGrantsIdentityCenter</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>sso:DeleteApplication</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param dissociateAccessGrantsIdentityCenterRequest
     * @return Result of the DissociateAccessGrantsIdentityCenter operation returned by the service.
     * @sample AWSS3Control.DissociateAccessGrantsIdentityCenter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DissociateAccessGrantsIdentityCenter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DissociateAccessGrantsIdentityCenterResult dissociateAccessGrantsIdentityCenter(DissociateAccessGrantsIdentityCenterRequest request) {
        request = beforeClientExecution(request);
        return executeDissociateAccessGrantsIdentityCenter(request);
    }

    @SdkInternalApi
    final DissociateAccessGrantsIdentityCenterResult executeDissociateAccessGrantsIdentityCenter(
            DissociateAccessGrantsIdentityCenterRequest dissociateAccessGrantsIdentityCenterRequest) {

        ExecutionContext executionContext = createExecutionContext(dissociateAccessGrantsIdentityCenterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DissociateAccessGrantsIdentityCenterRequest> request = null;
        Response<DissociateAccessGrantsIdentityCenterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DissociateAccessGrantsIdentityCenterRequestMarshaller().marshall(super
                        .beforeMarshalling(dissociateAccessGrantsIdentityCenterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DissociateAccessGrantsIdentityCenter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(dissociateAccessGrantsIdentityCenterRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(dissociateAccessGrantsIdentityCenterRequest.getAccountId(), "AccountId",
                        "dissociateAccessGrantsIdentityCenterRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", dissociateAccessGrantsIdentityCenterRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DissociateAccessGrantsIdentityCenterResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DissociateAccessGrantsIdentityCenterResult>(
                    new DissociateAccessGrantsIdentityCenterResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the details of an access grant from your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantRequest
     * @return Result of the GetAccessGrant operation returned by the service.
     * @sample AWSS3Control.GetAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccessGrantResult getAccessGrant(GetAccessGrantRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessGrant(request);
    }

    @SdkInternalApi
    final GetAccessGrantResult executeGetAccessGrant(GetAccessGrantRequest getAccessGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessGrantRequest> request = null;
        Response<GetAccessGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessGrantRequestMarshaller().marshall(super.beforeMarshalling(getAccessGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessGrantRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessGrantRequest.getAccountId(), "AccountId", "getAccessGrantRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessGrantRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessGrantResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessGrantResult>(
                    new GetAccessGrantResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the S3 Access Grants instance for a Region in your account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceRequest
     * @return Result of the GetAccessGrantsInstance operation returned by the service.
     * @sample AWSS3Control.GetAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessGrantsInstanceResult getAccessGrantsInstance(GetAccessGrantsInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessGrantsInstance(request);
    }

    @SdkInternalApi
    final GetAccessGrantsInstanceResult executeGetAccessGrantsInstance(GetAccessGrantsInstanceRequest getAccessGrantsInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessGrantsInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessGrantsInstanceRequest> request = null;
        Response<GetAccessGrantsInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessGrantsInstanceRequestMarshaller().marshall(super.beforeMarshalling(getAccessGrantsInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessGrantsInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessGrantsInstanceRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessGrantsInstanceRequest.getAccountId(), "AccountId", "getAccessGrantsInstanceRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessGrantsInstanceRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessGrantsInstanceResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessGrantsInstanceResult>(
                    new GetAccessGrantsInstanceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve the S3 Access Grants instance that contains a particular prefix.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstanceForPrefix</code> permission for the caller account to use this
     * operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * The prefix owner account must grant you the following permissions to their S3 Access Grants instance:
     * <code>s3:GetAccessGrantsInstanceForPrefix</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceForPrefixRequest
     * @return Result of the GetAccessGrantsInstanceForPrefix operation returned by the service.
     * @sample AWSS3Control.GetAccessGrantsInstanceForPrefix
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceForPrefix"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessGrantsInstanceForPrefixResult getAccessGrantsInstanceForPrefix(GetAccessGrantsInstanceForPrefixRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessGrantsInstanceForPrefix(request);
    }

    @SdkInternalApi
    final GetAccessGrantsInstanceForPrefixResult executeGetAccessGrantsInstanceForPrefix(
            GetAccessGrantsInstanceForPrefixRequest getAccessGrantsInstanceForPrefixRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessGrantsInstanceForPrefixRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessGrantsInstanceForPrefixRequest> request = null;
        Response<GetAccessGrantsInstanceForPrefixResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessGrantsInstanceForPrefixRequestMarshaller().marshall(super.beforeMarshalling(getAccessGrantsInstanceForPrefixRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessGrantsInstanceForPrefix");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessGrantsInstanceForPrefixRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessGrantsInstanceForPrefixRequest.getAccountId(), "AccountId",
                        "getAccessGrantsInstanceForPrefixRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessGrantsInstanceForPrefixRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessGrantsInstanceForPrefixResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessGrantsInstanceForPrefixResult>(
                    new GetAccessGrantsInstanceForPrefixResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resource policy of the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceResourcePolicyRequest
     * @return Result of the GetAccessGrantsInstanceResourcePolicy operation returned by the service.
     * @sample AWSS3Control.GetAccessGrantsInstanceResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessGrantsInstanceResourcePolicyResult getAccessGrantsInstanceResourcePolicy(GetAccessGrantsInstanceResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessGrantsInstanceResourcePolicy(request);
    }

    @SdkInternalApi
    final GetAccessGrantsInstanceResourcePolicyResult executeGetAccessGrantsInstanceResourcePolicy(
            GetAccessGrantsInstanceResourcePolicyRequest getAccessGrantsInstanceResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessGrantsInstanceResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessGrantsInstanceResourcePolicyRequest> request = null;
        Response<GetAccessGrantsInstanceResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessGrantsInstanceResourcePolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessGrantsInstanceResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessGrantsInstanceResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessGrantsInstanceResourcePolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessGrantsInstanceResourcePolicyRequest.getAccountId(), "AccountId",
                        "getAccessGrantsInstanceResourcePolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessGrantsInstanceResourcePolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessGrantsInstanceResourcePolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessGrantsInstanceResourcePolicyResult>(
                    new GetAccessGrantsInstanceResourcePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a particular location registered in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsLocationRequest
     * @return Result of the GetAccessGrantsLocation operation returned by the service.
     * @sample AWSS3Control.GetAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessGrantsLocationResult getAccessGrantsLocation(GetAccessGrantsLocationRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessGrantsLocation(request);
    }

    @SdkInternalApi
    final GetAccessGrantsLocationResult executeGetAccessGrantsLocation(GetAccessGrantsLocationRequest getAccessGrantsLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessGrantsLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessGrantsLocationRequest> request = null;
        Response<GetAccessGrantsLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessGrantsLocationRequestMarshaller().marshall(super.beforeMarshalling(getAccessGrantsLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessGrantsLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessGrantsLocationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessGrantsLocationRequest.getAccountId(), "AccountId", "getAccessGrantsLocationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessGrantsLocationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessGrantsLocationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessGrantsLocationResult>(
                    new GetAccessGrantsLocationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointRequest
     * @return Result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3Control.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccessPointResult getAccessPoint(GetAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPoint(request);
    }

    @SdkInternalApi
    final GetAccessPointResult executeGetAccessPoint(GetAccessPointRequest getAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointRequest> request = null;
        Response<GetAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = getAccessPointRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    getAccessPointRequest = getAccessPointRequest.clone();
                    getAccessPointRequest.setName(resource.getAccessPointName());

                    String accountId = getAccessPointRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getAccessPointRequest.setAccountId(accountIdInArn);
                }
                request = new GetAccessPointRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointRequest.getAccountId(), "AccountId", "getAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointResult>(
                    new GetAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointConfigurationForObjectLambda.html"
     * >PutAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointConfigurationForObjectLambdaRequest
     * @return Result of the GetAccessPointConfigurationForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointConfigurationForObjectLambdaResult getAccessPointConfigurationForObjectLambda(GetAccessPointConfigurationForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointConfigurationForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointConfigurationForObjectLambdaResult executeGetAccessPointConfigurationForObjectLambda(
            GetAccessPointConfigurationForObjectLambdaRequest getAccessPointConfigurationForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointConfigurationForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointConfigurationForObjectLambdaRequest> request = null;
        Response<GetAccessPointConfigurationForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointConfigurationForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessPointConfigurationForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointConfigurationForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointConfigurationForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointConfigurationForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointConfigurationForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointConfigurationForObjectLambdaResult>(
                    new GetAccessPointConfigurationForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified Object Lambda Access Point
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointForObjectLambdaRequest
     * @return Result of the GetAccessPointForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointForObjectLambdaResult getAccessPointForObjectLambda(GetAccessPointForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointForObjectLambdaResult executeGetAccessPointForObjectLambda(GetAccessPointForObjectLambdaRequest getAccessPointForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointForObjectLambdaRequest> request = null;
        Response<GetAccessPointForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointForObjectLambdaResult>(
                    new GetAccessPointForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyRequest
     * @return Result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyResult getAccessPointPolicy(GetAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicy(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyResult executeGetAccessPointPolicy(GetAccessPointPolicyRequest getAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyRequest> request = null;
        Response<GetAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = getAccessPointPolicyRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    getAccessPointPolicyRequest = getAccessPointPolicyRequest.clone();
                    getAccessPointPolicyRequest.setName(resource.getAccessPointName());

                    String accountId = getAccessPointPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getAccessPointPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new GetAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyRequest.getAccountId(), "AccountId", "getAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyResult>(
                    new GetAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyForObjectLambdaRequest
     * @return Result of the GetAccessPointPolicyForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyForObjectLambdaResult getAccessPointPolicyForObjectLambda(GetAccessPointPolicyForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicyForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyForObjectLambdaResult executeGetAccessPointPolicyForObjectLambda(
            GetAccessPointPolicyForObjectLambdaRequest getAccessPointPolicyForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyForObjectLambdaRequest> request = null;
        Response<GetAccessPointPolicyForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointPolicyForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessPointPolicyForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicyForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointPolicyForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyForObjectLambdaResult>(
                    new GetAccessPointPolicyForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @return Result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyStatusResult getAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicyStatus(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyStatusResult executeGetAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyStatusRequest> request = null;
        Response<GetAccessPointPolicyStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointPolicyStatusRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointPolicyStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicyStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyStatusRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyStatusRequest.getAccountId(), "AccountId", "getAccessPointPolicyStatusRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyStatusRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyStatusResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyStatusResult>(
                    new GetAccessPointPolicyStatusResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the status of the resource policy associated with an Object Lambda Access Point.
     * </p>
     * 
     * @param getAccessPointPolicyStatusForObjectLambdaRequest
     * @return Result of the GetAccessPointPolicyStatusForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyStatusForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatusForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyStatusForObjectLambdaResult getAccessPointPolicyStatusForObjectLambda(GetAccessPointPolicyStatusForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicyStatusForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyStatusForObjectLambdaResult executeGetAccessPointPolicyStatusForObjectLambda(
            GetAccessPointPolicyStatusForObjectLambdaRequest getAccessPointPolicyStatusForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyStatusForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyStatusForObjectLambdaRequest> request = null;
        Response<GetAccessPointPolicyStatusForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointPolicyStatusForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessPointPolicyStatusForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicyStatusForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyStatusForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyStatusForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointPolicyStatusForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyStatusForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyStatusForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyStatusForObjectLambdaResult>(
                    new GetAccessPointPolicyStatusForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html"> Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts
     * bucket, the calling identity must have the <code>s3-outposts:GetBucket</code> permissions on the specified
     * Outposts bucket and belong to the Outposts bucket owner's account in order to use this action. Only users from
     * Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.
     * </p>
     * <p>
     * If you don't have <code>s3-outposts:GetBucket</code> permissions or you're not using an identity that belongs to
     * the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html#API_control_GetBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketRequest
     * @return Result of the GetBucket operation returned by the service.
     * @sample AWSS3Control.GetBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketResult getBucket(GetBucketRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucket(request);
    }

    @SdkInternalApi
    final GetBucketResult executeGetBucket(GetBucketRequest getBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketRequest> request = null;
        Response<GetBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketRequest = getBucketRequest.clone();
                    getBucketRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketRequestMarshaller().marshall(super.beforeMarshalling(getBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketRequest.getAccountId(), "AccountId", "getBucketRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketResult>(
                    new GetBucketResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html"
     * >GetBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the lifecycle configuration information set on the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * and for information about lifecycle configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"> Object Lifecycle
     * Management</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>s3-outposts:GetLifecycleConfiguration</code>
     * action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to
     * others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html#API_control_GetBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * <code>GetBucketLifecycleConfiguration</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchLifecycleConfiguration</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * SOAP Fault Code Prefix: Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>GetBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketLifecycleConfigurationRequest
     * @return Result of the GetBucketLifecycleConfiguration operation returned by the service.
     * @sample AWSS3Control.GetBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBucketLifecycleConfigurationResult getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final GetBucketLifecycleConfigurationResult executeGetBucketLifecycleConfiguration(
            GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketLifecycleConfigurationRequest> request = null;
        Response<GetBucketLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketLifecycleConfigurationRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketLifecycleConfigurationRequest = getBucketLifecycleConfigurationRequest.clone();
                    getBucketLifecycleConfigurationRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketLifecycleConfigurationRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketLifecycleConfigurationRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketLifecycleConfigurationRequestMarshaller().marshall(super.beforeMarshalling(getBucketLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketLifecycleConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketLifecycleConfigurationRequest.getAccountId(), "AccountId",
                        "getBucketLifecycleConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketLifecycleConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketLifecycleConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketLifecycleConfigurationResult>(
                    new GetBucketLifecycleConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicy.html">GetBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the policy of a specified Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket,
     * the calling identity must have the <code>GetBucketPolicy</code> permissions on the specified bucket and belong to
     * the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts
     * bucket. If you don't have <code>s3-outposts:GetBucketPolicy</code> permissions or you're not using an identity
     * that belongs to the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html#API_control_GetBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketPolicyRequest
     * @return Result of the GetBucketPolicy operation returned by the service.
     * @sample AWSS3Control.GetBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketPolicyResult getBucketPolicy(GetBucketPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketPolicy(request);
    }

    @SdkInternalApi
    final GetBucketPolicyResult executeGetBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketPolicyRequest> request = null;
        Response<GetBucketPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketPolicyRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketPolicyRequest = getBucketPolicyRequest.clone();
                    getBucketPolicyRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketPolicyRequestMarshaller().marshall(super.beforeMarshalling(getBucketPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketPolicyRequest.getAccountId(), "AccountId", "getBucketPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketPolicyResult>(
                    new GetBucketPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation gets an Amazon S3 on Outposts bucket's replication configuration. To get an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the replication configuration of an S3 on Outposts bucket. For more information about S3 on Outposts, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * This action requires permissions for the <code>s3-outposts:GetReplicationConfiguration</code> action. The
     * Outposts bucket owner has this permission by default and can grant it to others. For more information about
     * permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up
     * IAM with S3 on Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts bucket</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html#API_control_GetBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * If you include the <code>Filter</code> element in a replication configuration, you must also include the
     * <code>DeleteMarkerReplication</code>, <code>Status</code>, and <code>Priority</code> elements. The response also
     * returns those elements.
     * </p>
     * <p>
     * For information about S3 on Outposts replication failure reasons, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-eventbridge.html#outposts-replication-failure-codes"
     * >Replication failure reasons</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html">
     * PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html">
     * DeleteBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketReplicationRequest
     * @return Result of the GetBucketReplication operation returned by the service.
     * @sample AWSS3Control.GetBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketReplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBucketReplicationResult getBucketReplication(GetBucketReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketReplication(request);
    }

    @SdkInternalApi
    final GetBucketReplicationResult executeGetBucketReplication(GetBucketReplicationRequest getBucketReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketReplicationRequest> request = null;
        Response<GetBucketReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketReplicationRequestMarshaller().marshall(super.beforeMarshalling(getBucketReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketReplicationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketReplicationRequest.getAccountId(), "AccountId", "getBucketReplicationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketReplicationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketReplicationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketReplicationResult>(
                    new GetBucketReplicationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the tag set associated with the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>GetBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * <code>GetBucketTagging</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchTagSetError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: There is no tag set associated with the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html#API_control_GetBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketTaggingRequest
     * @return Result of the GetBucketTagging operation returned by the service.
     * @sample AWSS3Control.GetBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketTaggingResult getBucketTagging(GetBucketTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketTagging(request);
    }

    @SdkInternalApi
    final GetBucketTaggingResult executeGetBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketTaggingRequest> request = null;
        Response<GetBucketTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketTaggingRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketTaggingRequest = getBucketTaggingRequest.clone();
                    getBucketTaggingRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketTaggingRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketTaggingRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketTaggingRequestMarshaller().marshall(super.beforeMarshalling(getBucketTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketTaggingRequest.getAccountId(), "AccountId", "getBucketTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketTaggingResult>(
                    new GetBucketTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation returns the versioning state for S3 on Outposts buckets only. To return the versioning state for
     * an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the versioning state for an S3 on Outposts bucket. With S3 Versioning, you can save multiple distinct
     * copies of your objects and recover from unintended user actions and application failures.
     * </p>
     * <p>
     * If you've never set versioning on your bucket, it has no versioning state. In that case, the
     * <code>GetBucketVersioning</code> request does not return a versioning state value.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html">Versioning</a> in the <i>Amazon S3
     * User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html#API_control_GetBucketVersioning_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketVersioning</code> for S3 on Outposts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html">PutBucketVersioning
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketVersioningRequest
     * @return Result of the GetBucketVersioning operation returned by the service.
     * @sample AWSS3Control.GetBucketVersioning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketVersioning" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBucketVersioningResult getBucketVersioning(GetBucketVersioningRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketVersioning(request);
    }

    @SdkInternalApi
    final GetBucketVersioningResult executeGetBucketVersioning(GetBucketVersioningRequest getBucketVersioningRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketVersioningRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketVersioningRequest> request = null;
        Response<GetBucketVersioningResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketVersioningRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketVersioningRequest = getBucketVersioningRequest.clone();
                    getBucketVersioningRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketVersioningRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketVersioningRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketVersioningRequestMarshaller().marshall(super.beforeMarshalling(getBucketVersioningRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketVersioning");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketVersioningRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketVersioningRequest.getAccountId(), "AccountId", "getBucketVersioningRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketVersioningRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketVersioningResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketVersioningResult>(
                    new GetBucketVersioningResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a temporary access credential from S3 Access Grants to the grantee or client application. The <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html">temporary credential</a> is an
     * Amazon Web Services STS token that grants them access to the S3 data.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetDataAccess</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * The IAM role that S3 Access Grants assumes must have the following permissions specified in the trust policy when
     * registering the location: <code>sts:AssumeRole</code>, for directory users or groups <code>sts:SetContext</code>,
     * and for IAM users or roles <code>sts:SetSourceIdentity</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getDataAccessRequest
     * @return Result of the GetDataAccess operation returned by the service.
     * @sample AWSS3Control.GetDataAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetDataAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataAccessResult getDataAccess(GetDataAccessRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataAccess(request);
    }

    @SdkInternalApi
    final GetDataAccessResult executeGetDataAccess(GetDataAccessRequest getDataAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataAccessRequest> request = null;
        Response<GetDataAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataAccessRequestMarshaller().marshall(super.beforeMarshalling(getDataAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getDataAccessRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getDataAccessRequest.getAccountId(), "AccountId", "getDataAccessRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getDataAccessRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetDataAccessResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetDataAccessResult>(
                    new GetDataAccessResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags on an S3 Batch Operations job.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>GetJobTagging</code> operation, you must have permission to perform the
     * <code>s3:GetJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getJobTaggingRequest
     * @return Result of the GetJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @sample AWSS3Control.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobTaggingResult getJobTagging(GetJobTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobTagging(request);
    }

    @SdkInternalApi
    final GetJobTaggingResult executeGetJobTagging(GetJobTaggingRequest getJobTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobTaggingRequest> request = null;
        Response<GetJobTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobTaggingRequestMarshaller().marshall(super.beforeMarshalling(getJobTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getJobTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getJobTaggingRequest.getAccountId(), "AccountId", "getJobTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getJobTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetJobTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetJobTaggingResult>(
                    new GetJobTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointRequest
     * @return Result of the GetMultiRegionAccessPoint operation returned by the service.
     * @sample AWSS3Control.GetMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMultiRegionAccessPointResult getMultiRegionAccessPoint(GetMultiRegionAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeGetMultiRegionAccessPoint(request);
    }

    @SdkInternalApi
    final GetMultiRegionAccessPointResult executeGetMultiRegionAccessPoint(GetMultiRegionAccessPointRequest getMultiRegionAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(getMultiRegionAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMultiRegionAccessPointRequest> request = null;
        Response<GetMultiRegionAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMultiRegionAccessPointRequestMarshaller().marshall(super.beforeMarshalling(getMultiRegionAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMultiRegionAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getMultiRegionAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getMultiRegionAccessPointRequest.getAccountId(), "AccountId", "getMultiRegionAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getMultiRegionAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetMultiRegionAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetMultiRegionAccessPointResult>(
                    new GetMultiRegionAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the access control policy of the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicyStatus.html">
     * GetMultiRegionAccessPointPolicyStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPointPolicy.html">
     * PutMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointPolicyRequest
     * @return Result of the GetMultiRegionAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.GetMultiRegionAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMultiRegionAccessPointPolicyResult getMultiRegionAccessPointPolicy(GetMultiRegionAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetMultiRegionAccessPointPolicy(request);
    }

    @SdkInternalApi
    final GetMultiRegionAccessPointPolicyResult executeGetMultiRegionAccessPointPolicy(
            GetMultiRegionAccessPointPolicyRequest getMultiRegionAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getMultiRegionAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMultiRegionAccessPointPolicyRequest> request = null;
        Response<GetMultiRegionAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMultiRegionAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(getMultiRegionAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMultiRegionAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getMultiRegionAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getMultiRegionAccessPointPolicyRequest.getAccountId(), "AccountId",
                        "getMultiRegionAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getMultiRegionAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetMultiRegionAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetMultiRegionAccessPointPolicyResult>(
                    new GetMultiRegionAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Indicates whether the specified Multi-Region Access Point has an access control policy that allows public access.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPointPolicyStatus</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicy.html">
     * GetMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPointPolicy.html">
     * PutMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointPolicyStatusRequest
     * @return Result of the GetMultiRegionAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3Control.GetMultiRegionAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMultiRegionAccessPointPolicyStatusResult getMultiRegionAccessPointPolicyStatus(GetMultiRegionAccessPointPolicyStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetMultiRegionAccessPointPolicyStatus(request);
    }

    @SdkInternalApi
    final GetMultiRegionAccessPointPolicyStatusResult executeGetMultiRegionAccessPointPolicyStatus(
            GetMultiRegionAccessPointPolicyStatusRequest getMultiRegionAccessPointPolicyStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getMultiRegionAccessPointPolicyStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMultiRegionAccessPointPolicyStatusRequest> request = null;
        Response<GetMultiRegionAccessPointPolicyStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMultiRegionAccessPointPolicyStatusRequestMarshaller().marshall(super
                        .beforeMarshalling(getMultiRegionAccessPointPolicyStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMultiRegionAccessPointPolicyStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getMultiRegionAccessPointPolicyStatusRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getMultiRegionAccessPointPolicyStatusRequest.getAccountId(), "AccountId",
                        "getMultiRegionAccessPointPolicyStatusRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getMultiRegionAccessPointPolicyStatusRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetMultiRegionAccessPointPolicyStatusResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetMultiRegionAccessPointPolicyStatusResult>(
                    new GetMultiRegionAccessPointPolicyStatusResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the routing configuration for a Multi-Region Access Point, indicating which Regions are active or
     * passive.
     * </p>
     * <p>
     * To obtain routing control changes and failover requests, use the Amazon S3 failover control infrastructure
     * endpoints in these five Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>us-east-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>us-west-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-southeast-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-northeast-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eu-west-1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointRoutesRequest
     * @return Result of the GetMultiRegionAccessPointRoutes operation returned by the service.
     * @sample AWSS3Control.GetMultiRegionAccessPointRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMultiRegionAccessPointRoutesResult getMultiRegionAccessPointRoutes(GetMultiRegionAccessPointRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeGetMultiRegionAccessPointRoutes(request);
    }

    @SdkInternalApi
    final GetMultiRegionAccessPointRoutesResult executeGetMultiRegionAccessPointRoutes(
            GetMultiRegionAccessPointRoutesRequest getMultiRegionAccessPointRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(getMultiRegionAccessPointRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMultiRegionAccessPointRoutesRequest> request = null;
        Response<GetMultiRegionAccessPointRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMultiRegionAccessPointRoutesRequestMarshaller().marshall(super.beforeMarshalling(getMultiRegionAccessPointRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMultiRegionAccessPointRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getMultiRegionAccessPointRoutesRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getMultiRegionAccessPointRoutesRequest.getAccountId(), "AccountId",
                        "getMultiRegionAccessPointRoutesRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getMultiRegionAccessPointRoutesRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetMultiRegionAccessPointRoutesResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetMultiRegionAccessPointRoutesResult>(
                    new GetMultiRegionAccessPointRoutesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getPublicAccessBlockRequest
     * @return Result of the GetPublicAccessBlock operation returned by the service.
     * @throws NoSuchPublicAccessBlockConfigurationException
     *         Amazon S3 throws this exception if you make a <code>GetPublicAccessBlock</code> request against an
     *         account that doesn't have a <code>PublicAccessBlockConfiguration</code> set.
     * @sample AWSS3Control.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPublicAccessBlockResult getPublicAccessBlock(GetPublicAccessBlockRequest request) {
        request = beforeClientExecution(request);
        return executeGetPublicAccessBlock(request);
    }

    @SdkInternalApi
    final GetPublicAccessBlockResult executeGetPublicAccessBlock(GetPublicAccessBlockRequest getPublicAccessBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(getPublicAccessBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicAccessBlockRequest> request = null;
        Response<GetPublicAccessBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPublicAccessBlockRequestMarshaller().marshall(super.beforeMarshalling(getPublicAccessBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPublicAccessBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getPublicAccessBlockRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getPublicAccessBlockRequest.getAccountId(), "AccountId", "getPublicAccessBlockRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getPublicAccessBlockRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetPublicAccessBlockResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetPublicAccessBlockResult>(
                    new GetPublicAccessBlockResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets the Amazon S3 Storage Lens configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens
     * metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage Lens
     * metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationRequest
     * @return Result of the GetStorageLensConfiguration operation returned by the service.
     * @sample AWSS3Control.GetStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStorageLensConfigurationResult getStorageLensConfiguration(GetStorageLensConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageLensConfiguration(request);
    }

    @SdkInternalApi
    final GetStorageLensConfigurationResult executeGetStorageLensConfiguration(GetStorageLensConfigurationRequest getStorageLensConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageLensConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageLensConfigurationRequest> request = null;
        Response<GetStorageLensConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageLensConfigurationRequestMarshaller().marshall(super.beforeMarshalling(getStorageLensConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageLensConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getStorageLensConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getStorageLensConfigurationRequest.getAccountId(), "AccountId",
                        "getStorageLensConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getStorageLensConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetStorageLensConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetStorageLensConfigurationResult>(
                    new GetStorageLensConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationTaggingRequest
     * @return Result of the GetStorageLensConfigurationTagging operation returned by the service.
     * @sample AWSS3Control.GetStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStorageLensConfigurationTaggingResult getStorageLensConfigurationTagging(GetStorageLensConfigurationTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageLensConfigurationTagging(request);
    }

    @SdkInternalApi
    final GetStorageLensConfigurationTaggingResult executeGetStorageLensConfigurationTagging(
            GetStorageLensConfigurationTaggingRequest getStorageLensConfigurationTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageLensConfigurationTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageLensConfigurationTaggingRequest> request = null;
        Response<GetStorageLensConfigurationTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageLensConfigurationTaggingRequestMarshaller()
                        .marshall(super.beforeMarshalling(getStorageLensConfigurationTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageLensConfigurationTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId",
                        "getStorageLensConfigurationTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getStorageLensConfigurationTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetStorageLensConfigurationTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetStorageLensConfigurationTaggingResult>(
                    new GetStorageLensConfigurationTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Storage Lens group configuration details.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:GetStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param getStorageLensGroupRequest
     * @return Result of the GetStorageLensGroup operation returned by the service.
     * @sample AWSS3Control.GetStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetStorageLensGroupResult getStorageLensGroup(GetStorageLensGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageLensGroup(request);
    }

    @SdkInternalApi
    final GetStorageLensGroupResult executeGetStorageLensGroup(GetStorageLensGroupRequest getStorageLensGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageLensGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageLensGroupRequest> request = null;
        Response<GetStorageLensGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageLensGroupRequestMarshaller().marshall(super.beforeMarshalling(getStorageLensGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageLensGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getStorageLensGroupRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getStorageLensGroupRequest.getAccountId(), "AccountId", "getStorageLensGroupRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getStorageLensGroupRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetStorageLensGroupResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetStorageLensGroupResult>(
                    new GetStorageLensGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of access grants in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrants</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsRequest
     * @return Result of the ListAccessGrants operation returned by the service.
     * @sample AWSS3Control.ListAccessGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrants" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccessGrantsResult listAccessGrants(ListAccessGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessGrants(request);
    }

    @SdkInternalApi
    final ListAccessGrantsResult executeListAccessGrants(ListAccessGrantsRequest listAccessGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessGrantsRequest> request = null;
        Response<ListAccessGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessGrantsRequestMarshaller().marshall(super.beforeMarshalling(listAccessGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessGrantsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessGrantsRequest.getAccountId(), "AccountId", "listAccessGrantsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessGrantsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessGrantsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessGrantsResult>(
                    new ListAccessGrantsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of S3 Access Grants instances. An S3 Access Grants instance serves as a logical grouping for your
     * individual access grants. You can only have one S3 Access Grants instance per Region per account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrantsInstances</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsInstancesRequest
     * @return Result of the ListAccessGrantsInstances operation returned by the service.
     * @sample AWSS3Control.ListAccessGrantsInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessGrantsInstancesResult listAccessGrantsInstances(ListAccessGrantsInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessGrantsInstances(request);
    }

    @SdkInternalApi
    final ListAccessGrantsInstancesResult executeListAccessGrantsInstances(ListAccessGrantsInstancesRequest listAccessGrantsInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessGrantsInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessGrantsInstancesRequest> request = null;
        Response<ListAccessGrantsInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessGrantsInstancesRequestMarshaller().marshall(super.beforeMarshalling(listAccessGrantsInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessGrantsInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessGrantsInstancesRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessGrantsInstancesRequest.getAccountId(), "AccountId", "listAccessGrantsInstancesRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessGrantsInstancesRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessGrantsInstancesResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessGrantsInstancesResult>(
                    new ListAccessGrantsInstancesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the locations registered in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrantsLocations</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsLocationsRequest
     * @return Result of the ListAccessGrantsLocations operation returned by the service.
     * @sample AWSS3Control.ListAccessGrantsLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsLocations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessGrantsLocationsResult listAccessGrantsLocations(ListAccessGrantsLocationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessGrantsLocations(request);
    }

    @SdkInternalApi
    final ListAccessGrantsLocationsResult executeListAccessGrantsLocations(ListAccessGrantsLocationsRequest listAccessGrantsLocationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessGrantsLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessGrantsLocationsRequest> request = null;
        Response<ListAccessGrantsLocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessGrantsLocationsRequestMarshaller().marshall(super.beforeMarshalling(listAccessGrantsLocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessGrantsLocations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessGrantsLocationsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessGrantsLocationsRequest.getAccountId(), "AccountId", "listAccessGrantsLocationsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessGrantsLocationsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessGrantsLocationsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessGrantsLocationsResult>(
                    new ListAccessGrantsLocationsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of the access points that are owned by the current account that's associated with the specified
     * bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access
     * points (or the number specified in <code>maxResults</code>, whichever is less), the response will include a
     * continuation token that you can use to list the additional access points.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPoints</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsRequest
     * @return Result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3Control.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccessPointsResult listAccessPoints(ListAccessPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessPoints(request);
    }

    @SdkInternalApi
    final ListAccessPointsResult executeListAccessPoints(ListAccessPointsRequest listAccessPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPointsRequest> request = null;
        Response<ListAccessPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = listAccessPointsRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    listAccessPointsRequest = listAccessPointsRequest.clone();
                    listAccessPointsRequest.setBucket(resource.getBucketName());

                    String accountId = listAccessPointsRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    listAccessPointsRequest.setAccountId(accountIdInArn);
                }
                request = new ListAccessPointsRequestMarshaller().marshall(super.beforeMarshalling(listAccessPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessPointsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessPointsRequest.getAccountId(), "AccountId", "listAccessPointsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessPointsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessPointsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessPointsResult>(
                    new ListAccessPointsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns some or all (up to 1,000) access points associated with the Object Lambda Access Point per call. If there
     * are more access points than what can be returned in one call, the response will include a continuation token that
     * you can use to list the additional access points.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPointsForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsForObjectLambdaRequest
     * @return Result of the ListAccessPointsForObjectLambda operation returned by the service.
     * @sample AWSS3Control.ListAccessPointsForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPointsForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessPointsForObjectLambdaResult listAccessPointsForObjectLambda(ListAccessPointsForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessPointsForObjectLambda(request);
    }

    @SdkInternalApi
    final ListAccessPointsForObjectLambdaResult executeListAccessPointsForObjectLambda(
            ListAccessPointsForObjectLambdaRequest listAccessPointsForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessPointsForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPointsForObjectLambdaRequest> request = null;
        Response<ListAccessPointsForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessPointsForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(listAccessPointsForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessPointsForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessPointsForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessPointsForObjectLambdaRequest.getAccountId(), "AccountId",
                        "listAccessPointsForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessPointsForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessPointsForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessPointsForObjectLambdaResult>(
                    new ListAccessPointsForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists current S3 Batch Operations jobs as well as the jobs that have ended within the last 90 days for the Amazon
     * Web Services account making the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>ListJobs</code> operation, you must have permission to perform the <code>s3:ListJobs</code>
     * action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws InvalidNextTokenException
     * @sample AWSS3Control.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
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
                request = new ListJobsRequestMarshaller().marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listJobsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listJobsRequest.getAccountId(), "AccountId", "listJobsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listJobsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListJobsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListJobsResult>(
                    new ListJobsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of the Multi-Region Access Points currently associated with the specified Amazon Web Services
     * account. Each call can return up to 100 Multi-Region Access Points, the maximum number of Multi-Region Access
     * Points that can be associated with a single account.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>ListMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMultiRegionAccessPointsRequest
     * @return Result of the ListMultiRegionAccessPoints operation returned by the service.
     * @sample AWSS3Control.ListMultiRegionAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListMultiRegionAccessPoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMultiRegionAccessPointsResult listMultiRegionAccessPoints(ListMultiRegionAccessPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListMultiRegionAccessPoints(request);
    }

    @SdkInternalApi
    final ListMultiRegionAccessPointsResult executeListMultiRegionAccessPoints(ListMultiRegionAccessPointsRequest listMultiRegionAccessPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMultiRegionAccessPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMultiRegionAccessPointsRequest> request = null;
        Response<ListMultiRegionAccessPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMultiRegionAccessPointsRequestMarshaller().marshall(super.beforeMarshalling(listMultiRegionAccessPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMultiRegionAccessPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listMultiRegionAccessPointsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listMultiRegionAccessPointsRequest.getAccountId(), "AccountId",
                        "listMultiRegionAccessPointsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listMultiRegionAccessPointsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListMultiRegionAccessPointsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListMultiRegionAccessPointsResult>(
                    new ListMultiRegionAccessPointsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using
     * Amazon S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListRegionalBuckets.html#API_control_ListRegionalBuckets_Examples"
     * >Examples</a> section.
     * </p>
     * 
     * @param listRegionalBucketsRequest
     * @return Result of the ListRegionalBuckets operation returned by the service.
     * @sample AWSS3Control.ListRegionalBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListRegionalBuckets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRegionalBucketsResult listRegionalBuckets(ListRegionalBucketsRequest request) {
        request = beforeClientExecution(request);
        return executeListRegionalBuckets(request);
    }

    @SdkInternalApi
    final ListRegionalBucketsResult executeListRegionalBuckets(ListRegionalBucketsRequest listRegionalBucketsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRegionalBucketsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegionalBucketsRequest> request = null;
        Response<ListRegionalBucketsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegionalBucketsRequestMarshaller().marshall(super.beforeMarshalling(listRegionalBucketsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRegionalBuckets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listRegionalBucketsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listRegionalBucketsRequest.getAccountId(), "AccountId", "listRegionalBucketsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listRegionalBucketsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListRegionalBucketsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListRegionalBucketsResult>(
                    new ListRegionalBucketsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:ListStorageLensConfigurations</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param listStorageLensConfigurationsRequest
     * @return Result of the ListStorageLensConfigurations operation returned by the service.
     * @sample AWSS3Control.ListStorageLensConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStorageLensConfigurationsResult listStorageLensConfigurations(ListStorageLensConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListStorageLensConfigurations(request);
    }

    @SdkInternalApi
    final ListStorageLensConfigurationsResult executeListStorageLensConfigurations(ListStorageLensConfigurationsRequest listStorageLensConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStorageLensConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStorageLensConfigurationsRequest> request = null;
        Response<ListStorageLensConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStorageLensConfigurationsRequestMarshaller().marshall(super.beforeMarshalling(listStorageLensConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStorageLensConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listStorageLensConfigurationsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listStorageLensConfigurationsRequest.getAccountId(), "AccountId",
                        "listStorageLensConfigurationsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listStorageLensConfigurationsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListStorageLensConfigurationsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListStorageLensConfigurationsResult>(
                    new ListStorageLensConfigurationsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Storage Lens groups in the specified home Region.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:ListStorageLensGroups</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param listStorageLensGroupsRequest
     * @return Result of the ListStorageLensGroups operation returned by the service.
     * @sample AWSS3Control.ListStorageLensGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStorageLensGroupsResult listStorageLensGroups(ListStorageLensGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListStorageLensGroups(request);
    }

    @SdkInternalApi
    final ListStorageLensGroupsResult executeListStorageLensGroups(ListStorageLensGroupsRequest listStorageLensGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStorageLensGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStorageLensGroupsRequest> request = null;
        Response<ListStorageLensGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStorageLensGroupsRequestMarshaller().marshall(super.beforeMarshalling(listStorageLensGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStorageLensGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listStorageLensGroupsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listStorageLensGroupsRequest.getAccountId(), "AccountId", "listStorageLensGroupsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listStorageLensGroupsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListStorageLensGroupsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListStorageLensGroupsResult>(
                    new ListStorageLensGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation allows you to list all the Amazon Web Services resource tags for a specified resource. Each tag is
     * a label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     * filter resources.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListTagsForResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AWSS3Control.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listTagsForResourceRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listTagsForResourceRequest.getAccountId(), "AccountId", "listTagsForResourceRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listTagsForResourceRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListTagsForResourceResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the resource policy of the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:PutAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param putAccessGrantsInstanceResourcePolicyRequest
     * @return Result of the PutAccessGrantsInstanceResourcePolicy operation returned by the service.
     * @sample AWSS3Control.PutAccessGrantsInstanceResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccessGrantsInstanceResourcePolicyResult putAccessGrantsInstanceResourcePolicy(PutAccessGrantsInstanceResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessGrantsInstanceResourcePolicy(request);
    }

    @SdkInternalApi
    final PutAccessGrantsInstanceResourcePolicyResult executePutAccessGrantsInstanceResourcePolicy(
            PutAccessGrantsInstanceResourcePolicyRequest putAccessGrantsInstanceResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessGrantsInstanceResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessGrantsInstanceResourcePolicyRequest> request = null;
        Response<PutAccessGrantsInstanceResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessGrantsInstanceResourcePolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(putAccessGrantsInstanceResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessGrantsInstanceResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessGrantsInstanceResourcePolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessGrantsInstanceResourcePolicyRequest.getAccountId(), "AccountId",
                        "putAccessGrantsInstanceResourcePolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessGrantsInstanceResourcePolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessGrantsInstanceResourcePolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessGrantsInstanceResourcePolicyResult>(
                    new PutAccessGrantsInstanceResourcePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Replaces configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointConfigurationForObjectLambda.html"
     * >GetAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointConfigurationForObjectLambdaRequest
     * @return Result of the PutAccessPointConfigurationForObjectLambda operation returned by the service.
     * @sample AWSS3Control.PutAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccessPointConfigurationForObjectLambdaResult putAccessPointConfigurationForObjectLambda(PutAccessPointConfigurationForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessPointConfigurationForObjectLambda(request);
    }

    @SdkInternalApi
    final PutAccessPointConfigurationForObjectLambdaResult executePutAccessPointConfigurationForObjectLambda(
            PutAccessPointConfigurationForObjectLambdaRequest putAccessPointConfigurationForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessPointConfigurationForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessPointConfigurationForObjectLambdaRequest> request = null;
        Response<PutAccessPointConfigurationForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessPointConfigurationForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(putAccessPointConfigurationForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessPointConfigurationForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId",
                        "putAccessPointConfigurationForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessPointConfigurationForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessPointConfigurationForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessPointConfigurationForObjectLambdaResult>(
                    new PutAccessPointConfigurationForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html#API_control_PutAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyRequest
     * @return Result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAccessPointPolicyResult putAccessPointPolicy(PutAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessPointPolicy(request);
    }

    @SdkInternalApi
    final PutAccessPointPolicyResult executePutAccessPointPolicy(PutAccessPointPolicyRequest putAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessPointPolicyRequest> request = null;
        Response<PutAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = putAccessPointPolicyRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    putAccessPointPolicyRequest = putAccessPointPolicyRequest.clone();
                    putAccessPointPolicyRequest.setName(resource.getAccessPointName());

                    String accountId = putAccessPointPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putAccessPointPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new PutAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(putAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessPointPolicyRequest.getAccountId(), "AccountId", "putAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessPointPolicyResult>(
                    new PutAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates or replaces resource policy for an Object Lambda Access Point. For an example policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-create.html#olap-create-cli">Creating Object
     * Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyForObjectLambdaRequest
     * @return Result of the PutAccessPointPolicyForObjectLambda operation returned by the service.
     * @sample AWSS3Control.PutAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccessPointPolicyForObjectLambdaResult putAccessPointPolicyForObjectLambda(PutAccessPointPolicyForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessPointPolicyForObjectLambda(request);
    }

    @SdkInternalApi
    final PutAccessPointPolicyForObjectLambdaResult executePutAccessPointPolicyForObjectLambda(
            PutAccessPointPolicyForObjectLambdaRequest putAccessPointPolicyForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessPointPolicyForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessPointPolicyForObjectLambdaRequest> request = null;
        Response<PutAccessPointPolicyForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessPointPolicyForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(putAccessPointPolicyForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessPointPolicyForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId",
                        "putAccessPointPolicyForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessPointPolicyForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessPointPolicyForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessPointPolicyForObjectLambdaResult>(
                    new PutAccessPointPolicyForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration
     * to an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html"
     * >PutBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing lifecycle
     * configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain
     * period of time and abort incomplete multipart uploads.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html#API_control_PutBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketLifecycleConfigurationRequest
     * @return Result of the PutBucketLifecycleConfiguration operation returned by the service.
     * @sample AWSS3Control.PutBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutBucketLifecycleConfigurationResult putBucketLifecycleConfiguration(PutBucketLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final PutBucketLifecycleConfigurationResult executePutBucketLifecycleConfiguration(
            PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketLifecycleConfigurationRequest> request = null;
        Response<PutBucketLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketLifecycleConfigurationRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketLifecycleConfigurationRequest = putBucketLifecycleConfigurationRequest.clone();
                    putBucketLifecycleConfigurationRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketLifecycleConfigurationRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketLifecycleConfigurationRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketLifecycleConfigurationRequestMarshaller().marshall(super.beforeMarshalling(putBucketLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketLifecycleConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketLifecycleConfigurationRequest.getAccountId(), "AccountId",
                        "putBucketLifecycleConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketLifecycleConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketLifecycleConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketLifecycleConfigurationResult>(
                    new PutBucketLifecycleConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketPolicy.html">PutBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts
     * bucket, the calling identity must have the <code>PutBucketPolicy</code> permissions on the specified Outposts
     * bucket and belong to the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html#API_control_PutBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketPolicyRequest
     * @return Result of the PutBucketPolicy operation returned by the service.
     * @sample AWSS3Control.PutBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutBucketPolicyResult putBucketPolicy(PutBucketPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketPolicy(request);
    }

    @SdkInternalApi
    final PutBucketPolicyResult executePutBucketPolicy(PutBucketPolicyRequest putBucketPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketPolicyRequest> request = null;
        Response<PutBucketPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketPolicyRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketPolicyRequest = putBucketPolicyRequest.clone();
                    putBucketPolicyRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketPolicyRequestMarshaller().marshall(super.beforeMarshalling(putBucketPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketPolicyRequest.getAccountId(), "AccountId", "putBucketPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketPolicyResult>(
                    new PutBucketPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket's replication configuration. To create an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a replication configuration or replaces an existing one. For information about S3 replication on Outposts
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * Specify the replication configuration in the request body. In the replication configuration, you provide the
     * following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the destination bucket or buckets where you want S3 on Outposts to replicate objects
     * </p>
     * </li>
     * <li>
     * <p>
     * The Identity and Access Management (IAM) role that S3 on Outposts can assume to replicate objects on your behalf
     * </p>
     * </li>
     * <li>
     * <p>
     * Other relevant information, such as replication rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * A replication configuration must include at least one rule and can contain a maximum of 100. Each rule identifies
     * a subset of objects to replicate by filtering the objects in the source Outposts bucket. To choose additional
     * subsets of objects to replicate, add a rule for each subset.
     * </p>
     * <p>
     * To specify a subset of the objects in the source Outposts bucket to apply a replication rule to, add the
     * <code>Filter</code> element as a child of the <code>Rule</code> element. You can filter objects based on an
     * object key prefix, one or more object tags, or both. When you add the <code>Filter</code> element in the
     * configuration, you must also add the following elements: <code>DeleteMarkerReplication</code>,
     * <code>Status</code>, and <code>Priority</code>.
     * </p>
     * <p>
     * Using <code>PutBucketReplication</code> on Outposts requires that both the source and destination buckets must
     * have versioning enabled. For information about enabling versioning on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsManagingVersioning.html">Managing S3
     * Versioning for your S3 on Outposts bucket</a>.
     * </p>
     * <p>
     * For information about S3 on Outposts replication failure reasons, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-eventbridge.html#outposts-replication-failure-codes"
     * >Replication failure reasons</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Handling Replication of Encrypted Objects</b>
     * </p>
     * <p>
     * Outposts buckets are encrypted at all times. All the objects in the source Outposts bucket are encrypted and can
     * be replicated. Also, all the replicas in the destination Outposts bucket are encrypted with the same encryption
     * key as the objects in the source Outposts bucket.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * To create a <code>PutBucketReplication</code> request, you must have
     * <code>s3-outposts:PutReplicationConfiguration</code> permissions for the bucket. The Outposts bucket owner has
     * this permission by default and can grant it to others. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up IAM with S3 on
     * Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts buckets</a>.
     * </p>
     * <note>
     * <p>
     * To perform this operation, the user or role must also have the <code>iam:CreateRole</code> and
     * <code>iam:PassRole</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a user permissions to
     * pass a role to an Amazon Web Services service</a>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html#API_control_PutBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html">
     * GetBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html">
     * DeleteBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketReplicationRequest
     * @return Result of the PutBucketReplication operation returned by the service.
     * @sample AWSS3Control.PutBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketReplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutBucketReplicationResult putBucketReplication(PutBucketReplicationRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketReplication(request);
    }

    @SdkInternalApi
    final PutBucketReplicationResult executePutBucketReplication(PutBucketReplicationRequest putBucketReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketReplicationRequest> request = null;
        Response<PutBucketReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBucketReplicationRequestMarshaller().marshall(super.beforeMarshalling(putBucketReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketReplicationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketReplicationRequest.getAccountId(), "AccountId", "putBucketReplicationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketReplicationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketReplicationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketReplicationResult>(
                    new PutBucketReplicationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the tags for an S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get
     * your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources,
     * organize your billing information according to resources with the same tag key values. For example, you can tag
     * several resources with a specific application name, and then organize your billing information to see the total
     * cost of that application across several services. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Cost allocation and
     * tagging</a>.
     * </p>
     * <note>
     * <p>
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html"> Using cost allocation in
     * Amazon S3 bucket tags</a>.
     * </p>
     * </note>
     * <p>
     * To use this action, you must have permissions to perform the <code>s3-outposts:PutBucketTagging</code> action.
     * The Outposts bucket owner has this permission by default and can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * > Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing access permissions
     * to your Amazon S3 resources</a>.
     * </p>
     * <p>
     * <code>PutBucketTagging</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>InvalidTagError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For information about tag restrictions, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">
     * User-Defined Tag Restrictions</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html"> Amazon Web
     * Services-Generated Cost Allocation Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>MalformedXMLError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The XML provided does not match the schema.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>OperationAbortedError </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: A conflicting conditional action is currently in progress against this resource. Try again.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InternalError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The service was unable to apply the provided tag to the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html#API_control_PutBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketTaggingRequest
     * @return Result of the PutBucketTagging operation returned by the service.
     * @sample AWSS3Control.PutBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutBucketTaggingResult putBucketTagging(PutBucketTaggingRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketTagging(request);
    }

    @SdkInternalApi
    final PutBucketTaggingResult executePutBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketTaggingRequest> request = null;
        Response<PutBucketTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketTaggingRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketTaggingRequest = putBucketTaggingRequest.clone();
                    putBucketTaggingRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketTaggingRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketTaggingRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketTaggingRequestMarshaller().marshall(super.beforeMarshalling(putBucketTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketTaggingRequest.getAccountId(), "AccountId", "putBucketTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketTaggingResult>(
                    new PutBucketTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation sets the versioning state for S3 on Outposts buckets only. To set the versioning state for an S3
     * bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the versioning state for an S3 on Outposts bucket. With S3 Versioning, you can save multiple distinct copies
     * of your objects and recover from unintended user actions and application failures.
     * </p>
     * <p>
     * You can set the versioning state to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Enabled</b> - Enables versioning for the objects in the bucket. All objects added to the bucket receive a
     * unique version ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Suspended</b> - Suspends versioning for the objects in the bucket. All objects added to the bucket receive the
     * version ID <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you've never set versioning on your bucket, it has no versioning state. In that case, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html">
     * GetBucketVersioning</a> request does not return a versioning state value.
     * </p>
     * <p>
     * When you enable S3 Versioning, for each object in your bucket, you have a current version and zero or more
     * noncurrent versions. You can configure your bucket S3 Lifecycle rules to expire noncurrent versions after a
     * specified time period. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsLifecycleManaging.html"> Creating and
     * managing a lifecycle configuration for your S3 on Outposts bucket</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you have an object expiration lifecycle configuration in your non-versioned bucket and you want to maintain
     * the same permanent delete behavior when you enable versioning, you must add a noncurrent expiration policy. The
     * noncurrent expiration lifecycle configuration will manage the deletes of the noncurrent object versions in the
     * version-enabled bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html">Versioning</a> in the <i>Amazon S3
     * User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html#API_control_PutBucketVersioning_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketVersioning</code> for S3 on Outposts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html">GetBucketVersioning
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketVersioningRequest
     * @return Result of the PutBucketVersioning operation returned by the service.
     * @sample AWSS3Control.PutBucketVersioning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketVersioning" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutBucketVersioningResult putBucketVersioning(PutBucketVersioningRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketVersioning(request);
    }

    @SdkInternalApi
    final PutBucketVersioningResult executePutBucketVersioning(PutBucketVersioningRequest putBucketVersioningRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketVersioningRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketVersioningRequest> request = null;
        Response<PutBucketVersioningResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketVersioningRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketVersioningRequest = putBucketVersioningRequest.clone();
                    putBucketVersioningRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketVersioningRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketVersioningRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketVersioningRequestMarshaller().marshall(super.beforeMarshalling(putBucketVersioningRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketVersioning");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketVersioningRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketVersioningRequest.getAccountId(), "AccountId", "putBucketVersioningRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketVersioningRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketVersioningResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketVersioningResult>(
                    new PutBucketVersioningResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the supplied tag-set on an S3 Batch Operations job.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request
     * against the tagging subresource that is associated with the job. To modify the existing tag set, you can either
     * replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag
     * set using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>, modify
     * that tag set, and use this operation to replace the tag set with the one you modified. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">
     * Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations
     * job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see <a
     * href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deleting existing tags for your Batch Operations job, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * request is preferred because it achieves the same result without incurring charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * A few things to consider about using tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon S3 limits the maximum number of tags to 50 tags per job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate up to 50 tags with a job as long as they have unique tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in
     * length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>PutJobTagging</code> operation, you must have permission to perform the
     * <code>s3:PutJobTagging</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putJobTaggingRequest
     * @return Result of the PutJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws TooManyTagsException
     *         Amazon S3 throws this exception if you have too many tags in your tag set.
     * @sample AWSS3Control.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutJobTaggingResult putJobTagging(PutJobTaggingRequest request) {
        request = beforeClientExecution(request);
        return executePutJobTagging(request);
    }

    @SdkInternalApi
    final PutJobTaggingResult executePutJobTagging(PutJobTaggingRequest putJobTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(putJobTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobTaggingRequest> request = null;
        Response<PutJobTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobTaggingRequestMarshaller().marshall(super.beforeMarshalling(putJobTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutJobTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putJobTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putJobTaggingRequest.getAccountId(), "AccountId", "putJobTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putJobTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutJobTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutJobTaggingResult>(
                    new PutJobTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Associates an access control policy with the specified Multi-Region Access Point. Each Multi-Region Access Point
     * can have only one policy, so a request made to this action replaces any existing policy that is associated with
     * the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutMultiRegionAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicy.html">
     * GetMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicyStatus.html">
     * GetMultiRegionAccessPointPolicyStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putMultiRegionAccessPointPolicyRequest
     * @return Result of the PutMultiRegionAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.PutMultiRegionAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutMultiRegionAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutMultiRegionAccessPointPolicyResult putMultiRegionAccessPointPolicy(PutMultiRegionAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutMultiRegionAccessPointPolicy(request);
    }

    @SdkInternalApi
    final PutMultiRegionAccessPointPolicyResult executePutMultiRegionAccessPointPolicy(
            PutMultiRegionAccessPointPolicyRequest putMultiRegionAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putMultiRegionAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMultiRegionAccessPointPolicyRequest> request = null;
        Response<PutMultiRegionAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMultiRegionAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(putMultiRegionAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMultiRegionAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putMultiRegionAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putMultiRegionAccessPointPolicyRequest.getAccountId(), "AccountId",
                        "putMultiRegionAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putMultiRegionAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutMultiRegionAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutMultiRegionAccessPointPolicyResult>(
                    new PutMultiRegionAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For this
     * operation, users must have the <code>s3:PutAccountPublicAccessBlock</code> permission. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon
     * S3 block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPublicAccessBlockRequest
     * @return Result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3Control.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutPublicAccessBlockResult putPublicAccessBlock(PutPublicAccessBlockRequest request) {
        request = beforeClientExecution(request);
        return executePutPublicAccessBlock(request);
    }

    @SdkInternalApi
    final PutPublicAccessBlockResult executePutPublicAccessBlock(PutPublicAccessBlockRequest putPublicAccessBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(putPublicAccessBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPublicAccessBlockRequest> request = null;
        Response<PutPublicAccessBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPublicAccessBlockRequestMarshaller().marshall(super.beforeMarshalling(putPublicAccessBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPublicAccessBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putPublicAccessBlockRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putPublicAccessBlockRequest.getAccountId(), "AccountId", "putPublicAccessBlockRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putPublicAccessBlockRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutPublicAccessBlockResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutPublicAccessBlockResult>(
                    new PutPublicAccessBlockResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Working with Amazon S3 Storage Lens</a>
     * in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage Lens
     * metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationRequest
     * @return Result of the PutStorageLensConfiguration operation returned by the service.
     * @sample AWSS3Control.PutStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutStorageLensConfigurationResult putStorageLensConfiguration(PutStorageLensConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutStorageLensConfiguration(request);
    }

    @SdkInternalApi
    final PutStorageLensConfigurationResult executePutStorageLensConfiguration(PutStorageLensConfigurationRequest putStorageLensConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putStorageLensConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutStorageLensConfigurationRequest> request = null;
        Response<PutStorageLensConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutStorageLensConfigurationRequestMarshaller().marshall(super.beforeMarshalling(putStorageLensConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutStorageLensConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putStorageLensConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putStorageLensConfigurationRequest.getAccountId(), "AccountId",
                        "putStorageLensConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putStorageLensConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutStorageLensConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutStorageLensConfigurationResult>(
                    new PutStorageLensConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage
     * Lens, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage
     * activity and usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationTaggingRequest
     * @return Result of the PutStorageLensConfigurationTagging operation returned by the service.
     * @sample AWSS3Control.PutStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutStorageLensConfigurationTaggingResult putStorageLensConfigurationTagging(PutStorageLensConfigurationTaggingRequest request) {
        request = beforeClientExecution(request);
        return executePutStorageLensConfigurationTagging(request);
    }

    @SdkInternalApi
    final PutStorageLensConfigurationTaggingResult executePutStorageLensConfigurationTagging(
            PutStorageLensConfigurationTaggingRequest putStorageLensConfigurationTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(putStorageLensConfigurationTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutStorageLensConfigurationTaggingRequest> request = null;
        Response<PutStorageLensConfigurationTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutStorageLensConfigurationTaggingRequestMarshaller()
                        .marshall(super.beforeMarshalling(putStorageLensConfigurationTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutStorageLensConfigurationTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId",
                        "putStorageLensConfigurationTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putStorageLensConfigurationTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutStorageLensConfigurationTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutStorageLensConfigurationTaggingResult>(
                    new PutStorageLensConfigurationTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Submits an updated route configuration for a Multi-Region Access Point. This API operation updates the routing
     * status for the specified Regions from active to passive, or from passive to active. A value of <code>0</code>
     * indicates a passive status, which means that traffic won't be routed to the specified Region. A value of
     * <code>100</code> indicates an active status, which means that traffic will be routed to the specified Region. At
     * least one Region must be active at all times.
     * </p>
     * <p>
     * When the routing configuration is changed, any in-progress operations (uploads, copies, deletes, and so on) to
     * formerly active Regions will continue to run to their final completion state (success or failure). The routing
     * configurations of any Regions that aren’t specified remain unchanged.
     * </p>
     * <note>
     * <p>
     * Updated routing configurations might not be immediately applied. It can take up to 2 minutes for your changes to
     * take effect.
     * </p>
     * </note>
     * <p>
     * To submit routing control changes and failover requests, use the Amazon S3 failover control infrastructure
     * endpoints in these five Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>us-east-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>us-west-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-southeast-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-northeast-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eu-west-1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param submitMultiRegionAccessPointRoutesRequest
     * @return Result of the SubmitMultiRegionAccessPointRoutes operation returned by the service.
     * @sample AWSS3Control.SubmitMultiRegionAccessPointRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SubmitMultiRegionAccessPointRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SubmitMultiRegionAccessPointRoutesResult submitMultiRegionAccessPointRoutes(SubmitMultiRegionAccessPointRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeSubmitMultiRegionAccessPointRoutes(request);
    }

    @SdkInternalApi
    final SubmitMultiRegionAccessPointRoutesResult executeSubmitMultiRegionAccessPointRoutes(
            SubmitMultiRegionAccessPointRoutesRequest submitMultiRegionAccessPointRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(submitMultiRegionAccessPointRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitMultiRegionAccessPointRoutesRequest> request = null;
        Response<SubmitMultiRegionAccessPointRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitMultiRegionAccessPointRoutesRequestMarshaller()
                        .marshall(super.beforeMarshalling(submitMultiRegionAccessPointRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubmitMultiRegionAccessPointRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(submitMultiRegionAccessPointRoutesRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(submitMultiRegionAccessPointRoutesRequest.getAccountId(), "AccountId",
                        "submitMultiRegionAccessPointRoutesRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", submitMultiRegionAccessPointRoutesRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<SubmitMultiRegionAccessPointRoutesResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<SubmitMultiRegionAccessPointRoutesResult>(
                    new SubmitMultiRegionAccessPointRoutesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Web Services resource tag or updates an existing resource tag. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources. You can add up to 50 Amazon Web Services resource tags for each S3 resource.
     * </p>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:TagResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AWSS3Control.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/TagResource" target="_top">AWS API
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
                request = new TagResourceRequestMarshaller().marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(tagResourceRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(tagResourceRequest.getAccountId(), "AccountId", "tagResourceRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", tagResourceRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<TagResourceResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<TagResourceResult>(
                    new TagResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation removes the specified Amazon Web Services resource tags from an S3 resource. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:UntagResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AWSS3Control.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UntagResource" target="_top">AWS API
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
                request = new UntagResourceRequestMarshaller().marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(untagResourceRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(untagResourceRequest.getAccountId(), "AccountId", "untagResourceRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", untagResourceRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UntagResourceResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UntagResourceResult>(
                    new UntagResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the IAM role of a registered location in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:UpdateAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permission: <code>iam:PassRole</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateAccessGrantsLocationRequest
     * @return Result of the UpdateAccessGrantsLocation operation returned by the service.
     * @sample AWSS3Control.UpdateAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccessGrantsLocationResult updateAccessGrantsLocation(UpdateAccessGrantsLocationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccessGrantsLocation(request);
    }

    @SdkInternalApi
    final UpdateAccessGrantsLocationResult executeUpdateAccessGrantsLocation(UpdateAccessGrantsLocationRequest updateAccessGrantsLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccessGrantsLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessGrantsLocationRequest> request = null;
        Response<UpdateAccessGrantsLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessGrantsLocationRequestMarshaller().marshall(super.beforeMarshalling(updateAccessGrantsLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccessGrantsLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(updateAccessGrantsLocationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(updateAccessGrantsLocationRequest.getAccountId(), "AccountId", "updateAccessGrantsLocationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", updateAccessGrantsLocationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UpdateAccessGrantsLocationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UpdateAccessGrantsLocationResult>(
                    new UpdateAccessGrantsLocationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing S3 Batch Operations job's priority. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>UpdateJobPriority</code> operation, you must have permission to perform the
     * <code>s3:UpdateJobPriority</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobPriorityRequest
     * @return Result of the UpdateJobPriority operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws InternalServiceException
     * @sample AWSS3Control.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateJobPriorityResult updateJobPriority(UpdateJobPriorityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobPriority(request);
    }

    @SdkInternalApi
    final UpdateJobPriorityResult executeUpdateJobPriority(UpdateJobPriorityRequest updateJobPriorityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobPriorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobPriorityRequest> request = null;
        Response<UpdateJobPriorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobPriorityRequestMarshaller().marshall(super.beforeMarshalling(updateJobPriorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobPriority");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(updateJobPriorityRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(updateJobPriorityRequest.getAccountId(), "AccountId", "updateJobPriorityRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", updateJobPriorityRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UpdateJobPriorityResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UpdateJobPriorityResult>(
                    new UpdateJobPriorityResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
     * an existing job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>UpdateJobStatus</code> operation, you must have permission to perform the
     * <code>s3:UpdateJobStatus</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobStatusRequest
     * @return Result of the UpdateJobStatus operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws JobStatusException
     * @throws InternalServiceException
     * @sample AWSS3Control.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJobStatusResult updateJobStatus(UpdateJobStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobStatus(request);
    }

    @SdkInternalApi
    final UpdateJobStatusResult executeUpdateJobStatus(UpdateJobStatusRequest updateJobStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobStatusRequest> request = null;
        Response<UpdateJobStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobStatusRequestMarshaller().marshall(super.beforeMarshalling(updateJobStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(updateJobStatusRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(updateJobStatusRequest.getAccountId(), "AccountId", "updateJobStatusRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", updateJobStatusRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UpdateJobStatusResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UpdateJobStatusResult>(
                    new UpdateJobStatusResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the existing Storage Lens group.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:UpdateStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param updateStorageLensGroupRequest
     * @return Result of the UpdateStorageLensGroup operation returned by the service.
     * @sample AWSS3Control.UpdateStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateStorageLensGroupResult updateStorageLensGroup(UpdateStorageLensGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStorageLensGroup(request);
    }

    @SdkInternalApi
    final UpdateStorageLensGroupResult executeUpdateStorageLensGroup(UpdateStorageLensGroupRequest updateStorageLensGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStorageLensGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStorageLensGroupRequest> request = null;
        Response<UpdateStorageLensGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStorageLensGroupRequestMarshaller().marshall(super.beforeMarshalling(updateStorageLensGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStorageLensGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(updateStorageLensGroupRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(updateStorageLensGroupRequest.getAccountId(), "AccountId", "updateStorageLensGroupRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", updateStorageLensGroupRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UpdateStorageLensGroupResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UpdateStorageLensGroupResult>(
                    new UpdateStorageLensGroupResultStaxUnmarshaller());

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
    public com.amazonaws.services.s3control.S3ControlResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        ResponseMetadata metadata = client.getResponseMetadataForRequest(request);
        if (metadata != null)
            return new com.amazonaws.services.s3control.S3ControlResponseMetadata(metadata);
        else
            return null;
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallersMap, defaultUnmarshaller);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
