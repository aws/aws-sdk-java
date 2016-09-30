/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
import com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.services.identitymanagement.model.transform.*;

/**
 * Client for accessing IAM. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Identity and Access Management</fullname>
 * <p>
 * AWS Identity and Access Management (IAM) is a web service that you can use to manage users and user permissions under
 * your AWS account. This guide provides descriptions of IAM actions that you can call programmatically. For general
 * information about IAM, see <a href="http://aws.amazon.com/iam/">AWS Identity and Access Management (IAM)</a>. For the
 * user guide for IAM, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/">Using IAM</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to IAM and AWS. For
 * example, the SDKs take care of tasks such as cryptographically signing requests (see below), managing errors, and
 * retrying requests automatically. For information about the AWS SDKs, including how to download and install them, see
 * the <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a> page.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to IAM. However, you can also use the IAM Query
 * API to make direct calls to the IAM web service. To learn more about the IAM Query API, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
 * <i>Using IAM</i> guide. IAM supports GET and POST requests for all actions. That is, the API does not require you to
 * use GET for some actions and POST for others. However, GET requests are subject to the limitation size of a URL.
 * Therefore, for operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed using an access key ID and a secret access key. We strongly recommend that you do not use
 * your AWS account access key ID and secret access key for everyday work with IAM. You can use the access key ID and
 * secret access key for an IAM user or you can use the AWS Security Token Service to generate temporary security
 * credentials and use those to sign requests.
 * </p>
 * <p>
 * To sign requests, we recommend that you use <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>. If you have an
 * existing application that uses Signature Version 2, you do not have to update it to use Signature Version 4. However,
 * some operations now require Signature Version 4. The documentation for operations that require version 4 indicate
 * this requirement.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a>.
 * This topic provides general information about the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html">IAM Best Practices</a>. This topic
 * presents a list of suggestions for using the IAM service to help secure your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a>.
 * This set of topics walk you through the process of signing a request using an access key ID and secret access key.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonIdentityManagementClient extends AmazonWebServiceClient implements AmazonIdentityManagement {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonIdentityManagement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iam";

    private volatile AmazonIdentityManagementWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on IAM. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     */
    public AmazonIdentityManagementClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on IAM. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     *        The client configuration options controlling how this client connects to IAM (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonIdentityManagementClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on IAM using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on IAM using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to IAM (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on IAM using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on IAM using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to IAM (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on IAM using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to IAM (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on IAM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonIdentityManagementClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DeleteConflictExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PasswordPolicyViolationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CredentialReportExpiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidUserTypeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchEntityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityTemporarilyUnmodifiableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateSSHPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KeyPairMismatchExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CredentialReportNotReadyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceFailureExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyEvaluationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAuthenticationCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CredentialReportNotPresentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnrecognizedPublicKeyEncodingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.identitymanagement.model.AmazonIdentityManagementException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("iam.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/identitymanagement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/identitymanagement/request.handler2s"));
    }

    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM
     * OpenID Connect (OIDC) provider resource.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
     * </p>
     * 
     * @param addClientIDToOpenIDConnectProviderRequest
     * @return Result of the AddClientIDToOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddClientIDToOpenIDConnectProvider
     */
    @Override
    public AddClientIDToOpenIDConnectProviderResult addClientIDToOpenIDConnectProvider(
            AddClientIDToOpenIDConnectProviderRequest addClientIDToOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(addClientIDToOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddClientIDToOpenIDConnectProviderRequest> request = null;
        Response<AddClientIDToOpenIDConnectProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddClientIDToOpenIDConnectProviderRequestMarshaller()
                        .marshall(super.beforeMarshalling(addClientIDToOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddClientIDToOpenIDConnectProviderResult> responseHandler = new StaxResponseHandler<AddClientIDToOpenIDConnectProviderResult>(
                    new AddClientIDToOpenIDConnectProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified IAM role to the specified instance profile.
     * </p>
     * <note>
     * <p>
     * The caller of this API must be granted the <code>PassRole</code> permission on the IAM role by a permission
     * policy.
     * </p>
     * </note>
     * <p>
     * For more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For more
     * information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param addRoleToInstanceProfileRequest
     * @return Result of the AddRoleToInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddRoleToInstanceProfile
     */
    @Override
    public AddRoleToInstanceProfileResult addRoleToInstanceProfile(AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(addRoleToInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddRoleToInstanceProfileRequest> request = null;
        Response<AddRoleToInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddRoleToInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(addRoleToInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddRoleToInstanceProfileResult> responseHandler = new StaxResponseHandler<AddRoleToInstanceProfileResult>(
                    new AddRoleToInstanceProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * 
     * @param addUserToGroupRequest
     * @return Result of the AddUserToGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddUserToGroup
     */
    @Override
    public AddUserToGroupResult addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(addUserToGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddUserToGroupRequest> request = null;
        Response<AddUserToGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddUserToGroupRequestMarshaller().marshall(super.beforeMarshalling(addUserToGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddUserToGroupResult> responseHandler = new StaxResponseHandler<AddUserToGroupResult>(
                    new AddUserToGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the specified managed policy to the specified IAM group.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a group. To embed an inline policy in a group, use
     * <a>PutGroupPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachGroupPolicyRequest
     * @return Result of the AttachGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachGroupPolicy
     */
    @Override
    public AttachGroupPolicyResult attachGroupPolicy(AttachGroupPolicyRequest attachGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachGroupPolicyRequest> request = null;
        Response<AttachGroupPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(attachGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachGroupPolicyResult> responseHandler = new StaxResponseHandler<AttachGroupPolicyResult>(
                    new AttachGroupPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the specified managed policy to the specified IAM role.
     * </p>
     * <p>
     * When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access)
     * policy. You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the
     * same time as the role, using <a>CreateRole</a>. You can update a role's trust policy using
     * <a>UpdateAssumeRolePolicy</a>.
     * </p>
     * <p>
     * Use this API to attach a <i>managed</i> policy to a role. To embed an inline policy in a role, use
     * <a>PutRolePolicy</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachRolePolicyRequest
     * @return Result of the AttachRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachRolePolicy
     */
    @Override
    public AttachRolePolicyResult attachRolePolicy(AttachRolePolicyRequest attachRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachRolePolicyRequest> request = null;
        Response<AttachRolePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(attachRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachRolePolicyResult> responseHandler = new StaxResponseHandler<AttachRolePolicyResult>(
                    new AttachRolePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the specified managed policy to the specified user.
     * </p>
     * <p>
     * You use this API to attach a <i>managed</i> policy to a user. To embed an inline policy in a user, use
     * <a>PutUserPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachUserPolicyRequest
     * @return Result of the AttachUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachUserPolicy
     */
    @Override
    public AttachUserPolicyResult attachUserPolicy(AttachUserPolicyRequest attachUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachUserPolicyRequest> request = null;
        Response<AttachUserPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(attachUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachUserPolicyResult> responseHandler = new StaxResponseHandler<AttachUserPolicyResult>(
                    new AttachUserPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the password of the IAM user who is calling this action. The root account password is not affected by
     * this action.
     * </p>
     * <p>
     * To change the password for a different user, see <a>UpdateLoginProfile</a>. For more information about modifying
     * passwords, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing
     * Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param changePasswordRequest
     * @return Result of the ChangePassword operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidUserTypeException
     *         The request was rejected because the type of user for the transaction was incorrect.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ChangePassword
     */
    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(changePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangePasswordRequest> request = null;
        Response<ChangePasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangePasswordRequestMarshaller().marshall(super.beforeMarshalling(changePasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ChangePasswordResult> responseHandler = new StaxResponseHandler<ChangePasswordResult>(
                    new ChangePasswordResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default
     * status for new keys is <code>Active</code>.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
     * the request. Because this action works for access keys under the AWS account, you can use this action to manage
     * root credentials even if the AWS account has no associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * To ensure the security of your AWS account, the secret access key is accessible only during key and user
     * creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a
     * secret key is lost, you can delete the access keys for the associated user and then create new keys.
     * </p>
     * </important>
     * 
     * @param createAccessKeyRequest
     * @return Result of the CreateAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateAccessKey
     */
    @Override
    public CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest createAccessKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(createAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessKeyRequest> request = null;
        Response<CreateAccessKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessKeyRequestMarshaller().marshall(super.beforeMarshalling(createAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateAccessKeyResult> responseHandler = new StaxResponseHandler<CreateAccessKeyResult>(
                    new CreateAccessKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateAccessKeyResult createAccessKey() {
        return createAccessKey(new CreateAccessKeyRequest());
    }

    /**
     * <p>
     * Creates an alias for your AWS account. For information about using an AWS account alias, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
     * ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createAccountAliasRequest
     * @return Result of the CreateAccountAlias operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateAccountAlias
     */
    @Override
    public CreateAccountAliasResult createAccountAlias(CreateAccountAliasRequest createAccountAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountAliasRequest> request = null;
        Response<CreateAccountAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountAliasRequestMarshaller().marshall(super.beforeMarshalling(createAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateAccountAliasResult> responseHandler = new StaxResponseHandler<CreateAccountAliasResult>(
                    new CreateAccountAliasResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateGroup
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestMarshaller().marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateGroupResult> responseHandler = new StaxResponseHandler<CreateGroupResult>(new CreateGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new instance profile. For information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * For information about the number of instance profiles you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return Result of the CreateInstanceProfile operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateInstanceProfile
     */
    @Override
    public CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(createInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceProfileRequest> request = null;
        Response<CreateInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(createInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateInstanceProfileResult> responseHandler = new StaxResponseHandler<CreateInstanceProfileResult>(
                    new CreateInstanceProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a password for the specified user, giving the user the ability to access AWS services through the AWS
     * Management Console. For more information about managing passwords, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing Passwords</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createLoginProfileRequest
     * @return Result of the CreateLoginProfile operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateLoginProfile
     */
    @Override
    public CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest createLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(createLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoginProfileRequest> request = null;
        Response<CreateLoginProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(createLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateLoginProfileResult> responseHandler = new StaxResponseHandler<CreateLoginProfileResult>(
                    new CreateLoginProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that supports <a
     * href="http://openid.net/connect/">OpenID Connect (OIDC)</a>.
     * </p>
     * <p>
     * The OIDC provider that you create with this operation can be used as a principal in a role's trust policy to
     * establish a trust relationship between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the URL of the OIDC identity provider (IdP) to trust, a list
     * of client IDs (also known as audiences) that identify the application or applications that are allowed to
     * authenticate using the OIDC provider, and a list of thumbprints of the server certificate(s) that the IdP uses.
     * You get all of this information from the OIDC IdP that you want to use for access to AWS.
     * </p>
     * <note>
     * <p>
     * Because trust for the OIDC provider is ultimately derived from the IAM provider that this action creates, it is a
     * best practice to limit access to the <a>CreateOpenIDConnectProvider</a> action to highly-privileged users.
     * </p>
     * </note>
     * 
     * @param createOpenIDConnectProviderRequest
     * @return Result of the CreateOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateOpenIDConnectProvider
     */
    @Override
    public CreateOpenIDConnectProviderResult createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(createOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOpenIDConnectProviderRequest> request = null;
        Response<CreateOpenIDConnectProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(createOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateOpenIDConnectProviderResult> responseHandler = new StaxResponseHandler<CreateOpenIDConnectProviderResult>(
                    new CreateOpenIDConnectProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new managed policy for your AWS account.
     * </p>
     * <p>
     * This operation creates a policy version with a version identifier of <code>v1</code> and sets v1 as the policy's
     * default version. For more information about policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policies in general, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyRequest
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreatePolicy
     */
    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestMarshaller().marshall(super.beforeMarshalling(createPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreatePolicyResult> responseHandler = new StaxResponseHandler<CreatePolicyResult>(new CreatePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy
     * version. A managed policy can have up to five versions. If the policy has five versions, you must delete an
     * existing version using <a>DeletePolicyVersion</a> before you create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version. The default version is the version that
     * is in effect for the IAM users, groups, and roles to which the policy is attached.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyVersionRequest
     * @return Result of the CreatePolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreatePolicyVersion
     */
    @Override
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyVersionRequest> request = null;
        Response<CreatePolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(createPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreatePolicyVersionResult> responseHandler = new StaxResponseHandler<CreatePolicyVersionResult>(
                    new CreatePolicyVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new role for your AWS account. For more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For
     * information about limitations on role names and the number of roles you can create, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createRoleRequest
     * @return Result of the CreateRole operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateRole
     */
    @Override
    public CreateRoleResult createRole(CreateRoleRequest createRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(createRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoleRequest> request = null;
        Response<CreateRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoleRequestMarshaller().marshall(super.beforeMarshalling(createRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateRoleResult> responseHandler = new StaxResponseHandler<CreateRoleResult>(new CreateRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.
     * </p>
     * <p>
     * The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust
     * policy to enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role
     * that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to
     * AWS.
     * </p>
     * <p>
     * When you create the SAML provider resource, you upload an a SAML metadata document that you get from your IdP and
     * that includes the issuer's name, expiration information, and keys that can be used to validate the SAML
     * authentication response (assertions) that the IdP sends. You must generate the metadata document using the
     * identity management software that is used as your organization's IdP.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html">Enabling SAML
     * 2.0 Federated Users to Access the AWS Management Console</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createSAMLProviderRequest
     * @return Result of the CreateSAMLProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateSAMLProvider
     */
    @Override
    public CreateSAMLProviderResult createSAMLProvider(CreateSAMLProviderRequest createSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(createSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSAMLProviderRequest> request = null;
        Response<CreateSAMLProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(createSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateSAMLProviderResult> responseHandler = new StaxResponseHandler<CreateSAMLProviderResult>(
                    new CreateSAMLProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new IAM user for your AWS account.
     * </p>
     * <p>
     * For information about limitations on the number of IAM users you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateUser
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest createUserRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateUserResult> responseHandler = new StaxResponseHandler<CreateUserResult>(new CreateUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use <a>EnableMFADevice</a>
     * to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA
     * devices, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual
     * MFA Device</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on Entities</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * The seed information contained in the QR code and the Base32 string should be treated like any other secret
     * access information, such as your AWS access keys or your passwords. After you provision your virtual device, you
     * should ensure that the information is destroyed following secure procedures.
     * </p>
     * </important>
     * 
     * @param createVirtualMFADeviceRequest
     * @return Result of the CreateVirtualMFADevice operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateVirtualMFADevice
     */
    @Override
    public CreateVirtualMFADeviceResult createVirtualMFADevice(CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(createVirtualMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualMFADeviceRequest> request = null;
        Response<CreateVirtualMFADeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(createVirtualMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateVirtualMFADeviceResult> responseHandler = new StaxResponseHandler<CreateVirtualMFADeviceResult>(
                    new CreateVirtualMFADeviceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association with the user name for which it was
     * originally enabled.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual MFA Device</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deactivateMFADeviceRequest
     * @return Result of the DeactivateMFADevice operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeactivateMFADevice
     */
    @Override
    public DeactivateMFADeviceResult deactivateMFADevice(DeactivateMFADeviceRequest deactivateMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(deactivateMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivateMFADeviceRequest> request = null;
        Response<DeactivateMFADeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivateMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(deactivateMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeactivateMFADeviceResult> responseHandler = new StaxResponseHandler<DeactivateMFADeviceResult>(
                    new DeactivateMFADeviceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the access key pair associated with the specified IAM user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
     * the request. Because this action works for access keys under the AWS account, you can use this action to manage
     * root credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param deleteAccessKeyRequest
     * @return Result of the DeleteAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccessKey
     */
    @Override
    public DeleteAccessKeyResult deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessKeyRequest> request = null;
        Response<DeleteAccessKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessKeyRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAccessKeyResult> responseHandler = new StaxResponseHandler<DeleteAccessKeyResult>(
                    new DeleteAccessKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using an AWS account alias, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
     * ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @return Result of the DeleteAccountAlias operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccountAlias
     */
    @Override
    public DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountAliasRequest> request = null;
        Response<DeleteAccountAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountAliasRequestMarshaller().marshall(super.beforeMarshalling(deleteAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAccountAliasResult> responseHandler = new StaxResponseHandler<DeleteAccountAliasResult>(
                    new DeleteAccountAliasResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the password policy for the AWS account. There are no parameters.
     * </p>
     * 
     * @param deleteAccountPasswordPolicyRequest
     * @return Result of the DeleteAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccountPasswordPolicy
     */
    @Override
    public DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAccountPasswordPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountPasswordPolicyRequest> request = null;
        Response<DeleteAccountPasswordPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountPasswordPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteAccountPasswordPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAccountPasswordPolicyResult> responseHandler = new StaxResponseHandler<DeleteAccountPasswordPolicyResult>(
                    new DeleteAccountPasswordPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy() {
        return deleteAccountPasswordPolicy(new DeleteAccountPasswordPolicyRequest());
    }

    /**
     * <p>
     * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteGroup
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteGroupResult> responseHandler = new StaxResponseHandler<DeleteGroupResult>(new DeleteGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To detach a managed policy from a group, use
     * <a>DetachGroupPolicy</a>. For more information about policies, refer to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteGroupPolicyRequest
     * @return Result of the DeleteGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteGroupPolicy
     */
    @Override
    public DeleteGroupPolicyResult deleteGroupPolicy(DeleteGroupPolicyRequest deleteGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupPolicyRequest> request = null;
        Response<DeleteGroupPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteGroupPolicyResult> responseHandler = new StaxResponseHandler<DeleteGroupPolicyResult>(
                    new DeleteGroupPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified instance profile. The instance profile must not have an associated role.
     * </p>
     * <important>
     * <p>
     * Make sure you do not have any Amazon EC2 instances running with the instance profile you are about to delete.
     * Deleting a role or instance profile that is associated with a running instance will break any applications
     * running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @return Result of the DeleteInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteInstanceProfile
     */
    @Override
    public DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceProfileRequest> request = null;
        Response<DeleteInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(deleteInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteInstanceProfileResult> responseHandler = new StaxResponseHandler<DeleteInstanceProfileResult>(
                    new DeleteInstanceProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services
     * through the AWS Management Console.
     * </p>
     * <important>
     * <p>
     * Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the
     * API. To prevent all user access you must also either make any access keys inactive or delete them. For more
     * information about making keys inactive or deleting them, see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>.
     * </p>
     * </important>
     * 
     * @param deleteLoginProfileRequest
     * @return Result of the DeleteLoginProfile operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteLoginProfile
     */
    @Override
    public DeleteLoginProfileResult deleteLoginProfile(DeleteLoginProfileRequest deleteLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoginProfileRequest> request = null;
        Response<DeleteLoginProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(deleteLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteLoginProfileResult> responseHandler = new StaxResponseHandler<DeleteLoginProfileResult>(
                    new DeleteLoginProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM.
     * </p>
     * <p>
     * Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in
     * their trust policies. Any attempt to assume a role that references a deleted provider fails.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you call the action for a provider that does
     * not exist.
     * </p>
     * 
     * @param deleteOpenIDConnectProviderRequest
     * @return Result of the DeleteOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteOpenIDConnectProvider
     */
    @Override
    public DeleteOpenIDConnectProviderResult deleteOpenIDConnectProvider(DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOpenIDConnectProviderRequest> request = null;
        Response<DeleteOpenIDConnectProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(deleteOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteOpenIDConnectProviderResult> responseHandler = new StaxResponseHandler<DeleteOpenIDConnectProviderResult>(
                    new DeleteOpenIDConnectProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified managed policy.
     * </p>
     * <p>
     * Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that
     * it is attached to, and you must delete all of the policy's versions. The following steps describe the process for
     * deleting a managed policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Detach the policy from all users, groups, and roles that the policy is attached to, using the
     * <a>DetachUserPolicy</a>, <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a> APIs. To list all the users,
     * groups, and roles that a policy is attached to, use <a>ListEntitiesForPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete all versions of the policy using <a>DeletePolicyVersion</a>. To list the policy's versions, use
     * <a>ListPolicyVersions</a>. You cannot use <a>DeletePolicyVersion</a> to delete the version that is marked as the
     * default version. You delete the policy's default version in the next step of the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the policy (this automatically deletes the policy's default version) using this API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeletePolicy
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<DeletePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestMarshaller().marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeletePolicyResult> responseHandler = new StaxResponseHandler<DeletePolicyResult>(new DeletePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version from the specified managed policy.
     * </p>
     * <p>
     * You cannot delete the default version from a policy using this API. To delete the default version from a policy,
     * use <a>DeletePolicy</a>. To find out which version of a policy is marked as the default version, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * For information about versions for managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     * @return Result of the DeletePolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeletePolicyVersion
     */
    @Override
    public DeletePolicyVersionResult deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyVersionRequest> request = null;
        Response<DeletePolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(deletePolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeletePolicyVersionResult> responseHandler = new StaxResponseHandler<DeletePolicyVersionResult>(
                    new DeletePolicyVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <important>
     * <p>
     * Make sure you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role
     * or instance profile that is associated with a running instance will break any applications running on the
     * instance.
     * </p>
     * </important>
     * 
     * @param deleteRoleRequest
     * @return Result of the DeleteRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRole
     */
    @Override
    public DeleteRoleResult deleteRole(DeleteRoleRequest deleteRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoleRequest> request = null;
        Response<DeleteRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoleRequestMarshaller().marshall(super.beforeMarshalling(deleteRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteRoleResult> responseHandler = new StaxResponseHandler<DeleteRoleResult>(new DeleteRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To detach a managed policy from a role, use
     * <a>DetachRolePolicy</a>. For more information about policies, refer to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteRolePolicyRequest
     * @return Result of the DeleteRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRolePolicy
     */
    @Override
    public DeleteRolePolicyResult deleteRolePolicy(DeleteRolePolicyRequest deleteRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRolePolicyRequest> request = null;
        Response<DeleteRolePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteRolePolicyResult> responseHandler = new StaxResponseHandler<DeleteRolePolicyResult>(
                    new DeleteRolePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a SAML provider resource in IAM.
     * </p>
     * <p>
     * Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN
     * as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider
     * resource ARN fails.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param deleteSAMLProviderRequest
     * @return Result of the DeleteSAMLProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteSAMLProvider
     */
    @Override
    public DeleteSAMLProviderResult deleteSAMLProvider(DeleteSAMLProviderRequest deleteSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSAMLProviderRequest> request = null;
        Response<DeleteSAMLProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(deleteSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteSAMLProviderResult> responseHandler = new StaxResponseHandler<DeleteSAMLProviderResult>(
                    new DeleteSAMLProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified SSH public key.
     * </p>
     * <p>
     * The SSH public key deleted by this action is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param deleteSSHPublicKeyRequest
     * @return Result of the DeleteSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.DeleteSSHPublicKey
     */
    @Override
    public DeleteSSHPublicKeyResult deleteSSHPublicKey(DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSSHPublicKeyRequest> request = null;
        Response<DeleteSSHPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(deleteSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteSSHPublicKeyResult> responseHandler = new StaxResponseHandler<DeleteSSHPublicKeyResult>(
                    new DeleteSSHPublicKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have
     * implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates,
     * it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We
     * recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command
     * to delete the certificate. For more information, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html"
     * >DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API Reference</i>.
     * </p>
     * </important>
     * 
     * @param deleteServerCertificateRequest
     * @return Result of the DeleteServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteServerCertificate
     */
    @Override
    public DeleteServerCertificateResult deleteServerCertificate(DeleteServerCertificateRequest deleteServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServerCertificateRequest> request = null;
        Response<DeleteServerCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(deleteServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteServerCertificateResult> responseHandler = new StaxResponseHandler<DeleteServerCertificateResult>(
                    new DeleteServerCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a signing certificate associated with the specified IAM user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
     * the request. Because this action works for access keys under the AWS account, you can use this action to manage
     * root credentials even if the AWS account has no associated IAM users.
     * </p>
     * 
     * @param deleteSigningCertificateRequest
     * @return Result of the DeleteSigningCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteSigningCertificate
     */
    @Override
    public DeleteSigningCertificateResult deleteSigningCertificate(DeleteSigningCertificateRequest deleteSigningCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSigningCertificateRequest> request = null;
        Response<DeleteSigningCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSigningCertificateRequestMarshaller().marshall(super.beforeMarshalling(deleteSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteSigningCertificateResult> responseHandler = new StaxResponseHandler<DeleteSigningCertificateResult>(
                    new DeleteSigningCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing
     * certificates, or attached policies.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUser
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteUserResult> responseHandler = new StaxResponseHandler<DeleteUserResult>(new DeleteUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To detach a managed policy from a user, use
     * <a>DetachUserPolicy</a>. For more information about policies, refer to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteUserPolicyRequest
     * @return Result of the DeleteUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUserPolicy
     */
    @Override
    public DeleteUserPolicyResult deleteUserPolicy(DeleteUserPolicyRequest deleteUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPolicyRequest> request = null;
        Response<DeleteUserPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteUserPolicyResult> responseHandler = new StaxResponseHandler<DeleteUserPolicyResult>(
                    new DeleteUserPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <note>
     * <p>
     * You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA
     * devices, see <a>DeactivateMFADevice</a>.
     * </p>
     * </note>
     * 
     * @param deleteVirtualMFADeviceRequest
     * @return Result of the DeleteVirtualMFADevice operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteVirtualMFADevice
     */
    @Override
    public DeleteVirtualMFADeviceResult deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualMFADeviceRequest> request = null;
        Response<DeleteVirtualMFADeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(deleteVirtualMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteVirtualMFADeviceResult> responseHandler = new StaxResponseHandler<DeleteVirtualMFADeviceResult>(
                    new DeleteVirtualMFADeviceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified managed policy from the specified IAM group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To delete an inline policy, use the
     * <a>DeleteGroupPolicy</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachGroupPolicyRequest
     * @return Result of the DetachGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachGroupPolicy
     */
    @Override
    public DetachGroupPolicyResult detachGroupPolicy(DetachGroupPolicyRequest detachGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachGroupPolicyRequest> request = null;
        Response<DetachGroupPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(detachGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachGroupPolicyResult> responseHandler = new StaxResponseHandler<DetachGroupPolicyResult>(
                    new DetachGroupPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified managed policy from the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To delete an inline policy, use the
     * <a>DeleteRolePolicy</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachRolePolicyRequest
     * @return Result of the DetachRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachRolePolicy
     */
    @Override
    public DetachRolePolicyResult detachRolePolicy(DetachRolePolicyRequest detachRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachRolePolicyRequest> request = null;
        Response<DetachRolePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(detachRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachRolePolicyResult> responseHandler = new StaxResponseHandler<DetachRolePolicyResult>(
                    new DetachRolePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified managed policy from the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To delete an inline policy, use the
     * <a>DeleteUserPolicy</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachUserPolicyRequest
     * @return Result of the DetachUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachUserPolicy
     */
    @Override
    public DetachUserPolicyResult detachUserPolicy(DetachUserPolicyRequest detachUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachUserPolicyRequest> request = null;
        Response<DetachUserPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(detachUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachUserPolicyResult> responseHandler = new StaxResponseHandler<DetachUserPolicyResult>(
                    new DetachUserPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is
     * required for every subsequent login by the IAM user associated with the device.
     * </p>
     * 
     * @param enableMFADeviceRequest
     * @return Result of the EnableMFADevice operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws InvalidAuthenticationCodeException
     *         The request was rejected because the authentication code was not recognized. The error message describes
     *         the specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.EnableMFADevice
     */
    @Override
    public EnableMFADeviceResult enableMFADevice(EnableMFADeviceRequest enableMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(enableMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableMFADeviceRequest> request = null;
        Response<EnableMFADeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(enableMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EnableMFADeviceResult> responseHandler = new StaxResponseHandler<EnableMFADeviceResult>(
                    new EnableMFADeviceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a credential report for the AWS account. For more information about the credential report, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param generateCredentialReportRequest
     * @return Result of the GenerateCredentialReport operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GenerateCredentialReport
     */
    @Override
    public GenerateCredentialReportResult generateCredentialReport(GenerateCredentialReportRequest generateCredentialReportRequest) {
        ExecutionContext executionContext = createExecutionContext(generateCredentialReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateCredentialReportRequest> request = null;
        Response<GenerateCredentialReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateCredentialReportRequestMarshaller().marshall(super.beforeMarshalling(generateCredentialReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GenerateCredentialReportResult> responseHandler = new StaxResponseHandler<GenerateCredentialReportResult>(
                    new GenerateCredentialReportResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GenerateCredentialReportResult generateCredentialReport() {
        return generateCredentialReport(new GenerateCredentialReportRequest());
    }

    /**
     * <p>
     * Retrieves information about when the specified access key was last used. The information includes the date and
     * time of last use, along with the AWS service and region that were specified in the last request made with that
     * key.
     * </p>
     * 
     * @param getAccessKeyLastUsedRequest
     * @return Result of the GetAccessKeyLastUsed operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.GetAccessKeyLastUsed
     */
    @Override
    public GetAccessKeyLastUsedResult getAccessKeyLastUsed(GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccessKeyLastUsedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessKeyLastUsedRequest> request = null;
        Response<GetAccessKeyLastUsedResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessKeyLastUsedRequestMarshaller().marshall(super.beforeMarshalling(getAccessKeyLastUsedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAccessKeyLastUsedResult> responseHandler = new StaxResponseHandler<GetAccessKeyLastUsedResult>(
                    new GetAccessKeyLastUsedResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their
     * relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users,
     * groups, roles, and policies) in your account.
     * </p>
     * <p>
     * You can optionally filter the results using the <code>Filter</code> parameter. You can paginate the results using
     * the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getAccountAuthorizationDetailsRequest
     * @return Result of the GetAccountAuthorizationDetails operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountAuthorizationDetails
     */
    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountAuthorizationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountAuthorizationDetailsRequest> request = null;
        Response<GetAccountAuthorizationDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountAuthorizationDetailsRequestMarshaller().marshall(super.beforeMarshalling(getAccountAuthorizationDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAccountAuthorizationDetailsResult> responseHandler = new StaxResponseHandler<GetAccountAuthorizationDetailsResult>(
                    new GetAccountAuthorizationDetailsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails() {
        return getAccountAuthorizationDetails(new GetAccountAuthorizationDetailsRequest());
    }

    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more information about using a password policy, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html">Managing an IAM
     * Password Policy</a>.
     * </p>
     * 
     * @param getAccountPasswordPolicyRequest
     * @return Result of the GetAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountPasswordPolicy
     */
    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy(GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountPasswordPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountPasswordPolicyRequest> request = null;
        Response<GetAccountPasswordPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountPasswordPolicyRequestMarshaller().marshall(super.beforeMarshalling(getAccountPasswordPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAccountPasswordPolicyResult> responseHandler = new StaxResponseHandler<GetAccountPasswordPolicyResult>(
                    new GetAccountPasswordPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy() {
        return getAccountPasswordPolicy(new GetAccountPasswordPolicyRequest());
    }

    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the AWS account.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getAccountSummaryRequest
     * @return Result of the GetAccountSummary operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountSummary
     */
    @Override
    public GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest getAccountSummaryRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSummaryRequest> request = null;
        Response<GetAccountSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSummaryRequestMarshaller().marshall(super.beforeMarshalling(getAccountSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetAccountSummaryResult> responseHandler = new StaxResponseHandler<GetAccountSummaryResult>(
                    new GetAccountSummaryResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetAccountSummaryResult getAccountSummary() {
        return getAccountSummary(new GetAccountSummaryRequest());
    }

    /**
     * <p>
     * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of
     * one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request, and can be evaluated by testing against a value specified in an IAM policy. Use
     * GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call
     * <a>SimulateCustomPolicy</a>. Note that all parameters are shown in unencoded form here for clarity, but must be
     * URL encoded to be included as a part of a real HTML request.
     * </p>
     * 
     * @param getContextKeysForCustomPolicyRequest
     * @return Result of the GetContextKeysForCustomPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetContextKeysForCustomPolicy
     */
    @Override
    public GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getContextKeysForCustomPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContextKeysForCustomPolicyRequest> request = null;
        Response<GetContextKeysForCustomPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContextKeysForCustomPolicyRequestMarshaller().marshall(super.beforeMarshalling(getContextKeysForCustomPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetContextKeysForCustomPolicyResult> responseHandler = new StaxResponseHandler<GetContextKeysForCustomPolicyResult>(
                    new GetContextKeysForCustomPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of all of the context keys referenced in all of the IAM policies attached to the specified IAM
     * entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all
     * of the policies attached to groups that the user is a member of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies, specified as strings. If you want to
     * include <i>only</i> a list of policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted to other users. If you do not want
     * users to see other user's permissions, then consider allowing them to use <a>GetContextKeysForCustomPolicy</a>
     * instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request, and can be evaluated by testing against a value in an IAM policy. Use
     * <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call
     * <a>SimulatePrincipalPolicy</a>.
     * </p>
     * 
     * @param getContextKeysForPrincipalPolicyRequest
     * @return Result of the GetContextKeysForPrincipalPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetContextKeysForPrincipalPolicy
     */
    @Override
    public GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(
            GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getContextKeysForPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContextKeysForPrincipalPolicyRequest> request = null;
        Response<GetContextKeysForPrincipalPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContextKeysForPrincipalPolicyRequestMarshaller().marshall(super.beforeMarshalling(getContextKeysForPrincipalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetContextKeysForPrincipalPolicyResult> responseHandler = new StaxResponseHandler<GetContextKeysForPrincipalPolicyResult>(
                    new GetContextKeysForPrincipalPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more information about the credential report, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getCredentialReportRequest
     * @return Result of the GetCredentialReport operation returned by the service.
     * @throws CredentialReportNotPresentException
     *         The request was rejected because the credential report does not exist. To generate a credential report,
     *         use <a>GenerateCredentialReport</a>.
     * @throws CredentialReportExpiredException
     *         The request was rejected because the most recent credential report has expired. To generate a new
     *         credential report, use <a>GenerateCredentialReport</a>. For more information about credential report
     *         expiration, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting
     *         Credential Reports</a> in the <i>IAM User Guide</i>.
     * @throws CredentialReportNotReadyException
     *         The request was rejected because the credential report is still being generated.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetCredentialReport
     */
    @Override
    public GetCredentialReportResult getCredentialReport(GetCredentialReportRequest getCredentialReportRequest) {
        ExecutionContext executionContext = createExecutionContext(getCredentialReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCredentialReportRequest> request = null;
        Response<GetCredentialReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCredentialReportRequestMarshaller().marshall(super.beforeMarshalling(getCredentialReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCredentialReportResult> responseHandler = new StaxResponseHandler<GetCredentialReportResult>(
                    new GetCredentialReportResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetCredentialReportResult getCredentialReport() {
        return getCredentialReport(new GetCredentialReportRequest());
    }

    /**
     * <p>
     * Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetGroup
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest getGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestMarshaller().marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetGroupResult> responseHandler = new StaxResponseHandler<GetGroupResult>(new GetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the specified IAM group.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is
     * attached to a group, use <a>GetPolicy</a> to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getGroupPolicyRequest
     * @return Result of the GetGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetGroupPolicy
     */
    @Override
    public GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest getGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupPolicyRequest> request = null;
        Response<GetGroupPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(getGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetGroupPolicyResult> responseHandler = new StaxResponseHandler<GetGroupPolicyResult>(
                    new GetGroupPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and
     * role. For more information about instance profiles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return Result of the GetInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetInstanceProfile
     */
    @Override
    public GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(getInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceProfileRequest> request = null;
        Response<GetInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(getInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetInstanceProfileResult> responseHandler = new StaxResponseHandler<GetInstanceProfileResult>(
                    new GetInstanceProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned
     * a password, the action returns a 404 (<code>NoSuchEntity</code>) error.
     * </p>
     * 
     * @param getLoginProfileRequest
     * @return Result of the GetLoginProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetLoginProfile
     */
    @Override
    public GetLoginProfileResult getLoginProfile(GetLoginProfileRequest getLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(getLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoginProfileRequest> request = null;
        Response<GetLoginProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(getLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetLoginProfileResult> responseHandler = new StaxResponseHandler<GetLoginProfileResult>(
                    new GetLoginProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
     * </p>
     * 
     * @param getOpenIDConnectProviderRequest
     * @return Result of the GetOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetOpenIDConnectProvider
     */
    @Override
    public GetOpenIDConnectProviderResult getOpenIDConnectProvider(GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(getOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIDConnectProviderRequest> request = null;
        Response<GetOpenIDConnectProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(getOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetOpenIDConnectProviderResult> responseHandler = new StaxResponseHandler<GetOpenIDConnectProviderResult>(
                    new GetOpenIDConnectProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified managed policy, including the policy's default version and the total
     * number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific
     * users, groups, and roles that the policy is attached to, use the <a>ListEntitiesForPolicy</a> API. This API
     * returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy,
     * use <a>GetPolicyVersion</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve information about an inline policy that is
     * embedded with an IAM user, group, or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetPolicy
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestMarshaller().marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetPolicyResult> responseHandler = new StaxResponseHandler<GetPolicyResult>(new GetPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified version of the specified managed policy, including the policy document.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * To list the available versions for a policy, use <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve information about an inline policy that is
     * embedded in a user, group, or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or <a>GetRolePolicy</a>
     * API.
     * </p>
     * <p>
     * For more information about the types of policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyVersionRequest
     * @return Result of the GetPolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetPolicyVersion
     */
    @Override
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyVersionRequest> request = null;
        Response<GetPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(getPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetPolicyVersionResult> responseHandler = new StaxResponseHandler<GetPolicyVersionResult>(
                    new GetPolicyVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy
     * that grants permission to assume the role. For more information about roles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * 
     * @param getRoleRequest
     * @return Result of the GetRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetRole
     */
    @Override
    public GetRoleResult getRole(GetRoleRequest getRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(getRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoleRequest> request = null;
        Response<GetRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoleRequestMarshaller().marshall(super.beforeMarshalling(getRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetRoleResult> responseHandler = new StaxResponseHandler<GetRoleResult>(new GetRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded with the specified IAM role.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached
     * to a role, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about roles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * 
     * @param getRolePolicyRequest
     * @return Result of the GetRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetRolePolicy
     */
    @Override
    public GetRolePolicyResult getRolePolicy(GetRolePolicyRequest getRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRolePolicyRequest> request = null;
        Response<GetRolePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(getRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetRolePolicyResult> responseHandler = new StaxResponseHandler<GetRolePolicyResult>(new GetRolePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created
     * or updated.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param getSAMLProviderRequest
     * @return Result of the GetSAMLProvider operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetSAMLProvider
     */
    @Override
    public GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest getSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(getSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSAMLProviderRequest> request = null;
        Response<GetSAMLProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(getSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSAMLProviderResult> responseHandler = new StaxResponseHandler<GetSAMLProviderResult>(
                    new GetSAMLProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified SSH public key, including metadata about the key.
     * </p>
     * <p>
     * The SSH public key retrieved by this action is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param getSSHPublicKeyRequest
     * @return Result of the GetSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws UnrecognizedPublicKeyEncodingException
     *         The request was rejected because the public key encoding format is unsupported or unrecognized.
     * @sample AmazonIdentityManagement.GetSSHPublicKey
     */
    @Override
    public GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest getSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(getSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSSHPublicKeyRequest> request = null;
        Response<GetSSHPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(getSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetSSHPublicKeyResult> responseHandler = new StaxResponseHandler<GetSSHPublicKeyResult>(
                    new GetSSHPublicKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified server certificate stored in IAM.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getServerCertificateRequest
     * @return Result of the GetServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetServerCertificate
     */
    @Override
    public GetServerCertificateResult getServerCertificate(GetServerCertificateRequest getServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(getServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServerCertificateRequest> request = null;
        Response<GetServerCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(getServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetServerCertificateResult> responseHandler = new StaxResponseHandler<GetServerCertificateResult>(
                    new GetServerCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to
     * sign the request to this API.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetUser
     */
    @Override
    public GetUserResult getUser(GetUserRequest getUserRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestMarshaller().marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetUserResult> responseHandler = new StaxResponseHandler<GetUserResult>(new GetUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetUserResult getUser() {
        return getUser(new GetUserRequest());
    }

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the specified IAM user.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached
     * to a user, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getUserPolicyRequest
     * @return Result of the GetUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetUserPolicy
     */
    @Override
    public GetUserPolicyResult getUserPolicy(GetUserPolicyRequest getUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserPolicyRequest> request = null;
        Response<GetUserPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(getUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetUserPolicyResult> responseHandler = new StaxResponseHandler<GetUserPolicyResult>(new GetUserPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the access key IDs associated with the specified IAM user. If there are none, the
     * action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * <note>
     * <p>
     * To ensure the security of your AWS account, the secret access key is accessible only during key and user
     * creation.
     * </p>
     * </note>
     * 
     * @param listAccessKeysRequest
     * @return Result of the ListAccessKeys operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAccessKeys
     */
    @Override
    public ListAccessKeysResult listAccessKeys(ListAccessKeysRequest listAccessKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listAccessKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessKeysRequest> request = null;
        Response<ListAccessKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessKeysRequestMarshaller().marshall(super.beforeMarshalling(listAccessKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAccessKeysResult> responseHandler = new StaxResponseHandler<ListAccessKeysResult>(
                    new ListAccessKeysResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAccessKeysResult listAccessKeys() {
        return listAccessKeys(new ListAccessKeysRequest());
    }

    /**
     * <p>
     * Lists the account alias associated with the AWS account (Note: you can have only one). For information about
     * using an AWS account alias, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listAccountAliasesRequest
     * @return Result of the ListAccountAliases operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAccountAliases
     */
    @Override
    public ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest listAccountAliasesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAccountAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAliasesRequest> request = null;
        Response<ListAccountAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAliasesRequestMarshaller().marshall(super.beforeMarshalling(listAccountAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAccountAliasesResult> responseHandler = new StaxResponseHandler<ListAccountAliasesResult>(
                    new ListAccountAliasesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAccountAliasesResult listAccountAliases() {
        return listAccountAliases(new ListAccountAliasesRequest());
    }

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM group.
     * </p>
     * <p>
     * An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the
     * <a>ListGroupPolicies</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified group (or none that match the specified path prefix), the
     * action returns an empty list.
     * </p>
     * 
     * @param listAttachedGroupPoliciesRequest
     * @return Result of the ListAttachedGroupPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedGroupPolicies
     */
    @Override
    public ListAttachedGroupPoliciesResult listAttachedGroupPolicies(ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedGroupPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedGroupPoliciesRequest> request = null;
        Response<ListAttachedGroupPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedGroupPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listAttachedGroupPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAttachedGroupPoliciesResult> responseHandler = new StaxResponseHandler<ListAttachedGroupPoliciesResult>(
                    new ListAttachedGroupPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM role.
     * </p>
     * <p>
     * An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the
     * <a>ListRolePolicies</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified role (or none that match the specified path prefix), the
     * action returns an empty list.
     * </p>
     * 
     * @param listAttachedRolePoliciesRequest
     * @return Result of the ListAttachedRolePolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedRolePolicies
     */
    @Override
    public ListAttachedRolePoliciesResult listAttachedRolePolicies(ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedRolePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedRolePoliciesRequest> request = null;
        Response<ListAttachedRolePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedRolePoliciesRequestMarshaller().marshall(super.beforeMarshalling(listAttachedRolePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAttachedRolePoliciesResult> responseHandler = new StaxResponseHandler<ListAttachedRolePoliciesResult>(
                    new ListAttachedRolePoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the
     * <a>ListUserPolicies</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified group (or none that match the specified path prefix), the
     * action returns an empty list.
     * </p>
     * 
     * @param listAttachedUserPoliciesRequest
     * @return Result of the ListAttachedUserPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedUserPolicies
     */
    @Override
    public ListAttachedUserPoliciesResult listAttachedUserPolicies(ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedUserPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedUserPoliciesRequest> request = null;
        Response<ListAttachedUserPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedUserPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listAttachedUserPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAttachedUserPoliciesResult> responseHandler = new StaxResponseHandler<ListAttachedUserPoliciesResult>(
                    new ListAttachedUserPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all IAM users, groups, and roles that the specified managed policy is attached to.
     * </p>
     * <p>
     * You can use the optional <code>EntityFilter</code> parameter to limit the results to a particular type of entity
     * (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set
     * <code>EntityFilter</code> to <code>Role</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listEntitiesForPolicyRequest
     * @return Result of the ListEntitiesForPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListEntitiesForPolicy
     */
    @Override
    public ListEntitiesForPolicyResult listEntitiesForPolicy(ListEntitiesForPolicyRequest listEntitiesForPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(listEntitiesForPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesForPolicyRequest> request = null;
        Response<ListEntitiesForPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesForPolicyRequestMarshaller().marshall(super.beforeMarshalling(listEntitiesForPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListEntitiesForPolicyResult> responseHandler = new StaxResponseHandler<ListEntitiesForPolicyResult>(
                    new ListEntitiesForPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified IAM group.
     * </p>
     * <p>
     * An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a
     * group, use <a>ListAttachedGroupPolicies</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified group, the action returns an empty list.
     * </p>
     * 
     * @param listGroupPoliciesRequest
     * @return Result of the ListGroupPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroupPolicies
     */
    @Override
    public ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest listGroupPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listGroupPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupPoliciesRequest> request = null;
        Response<ListGroupPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listGroupPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListGroupPoliciesResult> responseHandler = new StaxResponseHandler<ListGroupPoliciesResult>(
                    new ListGroupPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IAM groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroups
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestMarshaller().marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListGroupsResult> responseHandler = new StaxResponseHandler<ListGroupsResult>(new ListGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListGroupsResult listGroups() {
        return listGroups(new ListGroupsRequest());
    }

    /**
     * <p>
     * Lists the IAM groups that the specified IAM user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsForUserRequest
     * @return Result of the ListGroupsForUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroupsForUser
     */
    @Override
    public ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest listGroupsForUserRequest) {
        ExecutionContext executionContext = createExecutionContext(listGroupsForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsForUserRequest> request = null;
        Response<ListGroupsForUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsForUserRequestMarshaller().marshall(super.beforeMarshalling(listGroupsForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListGroupsForUserResult> responseHandler = new StaxResponseHandler<ListGroupsForUserResult>(
                    new ListGroupsForUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If there are none, the action returns an empty
     * list. For more information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return Result of the ListInstanceProfiles operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListInstanceProfiles
     */
    @Override
    public ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest listInstanceProfilesRequest) {
        ExecutionContext executionContext = createExecutionContext(listInstanceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceProfilesRequest> request = null;
        Response<ListInstanceProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceProfilesRequestMarshaller().marshall(super.beforeMarshalling(listInstanceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListInstanceProfilesResult> responseHandler = new StaxResponseHandler<ListInstanceProfilesResult>(
                    new ListInstanceProfilesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListInstanceProfilesResult listInstanceProfiles() {
        return listInstanceProfiles(new ListInstanceProfilesRequest());
    }

    /**
     * <p>
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the action returns an
     * empty list. For more information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesForRoleRequest
     * @return Result of the ListInstanceProfilesForRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListInstanceProfilesForRole
     */
    @Override
    public ListInstanceProfilesForRoleResult listInstanceProfilesForRole(ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(listInstanceProfilesForRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceProfilesForRoleRequest> request = null;
        Response<ListInstanceProfilesForRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceProfilesForRoleRequestMarshaller().marshall(super.beforeMarshalling(listInstanceProfilesForRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListInstanceProfilesForRoleResult> responseHandler = new StaxResponseHandler<ListInstanceProfilesForRoleResult>(
                    new ListInstanceProfilesForRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this action lists all the
     * MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request for this API.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listMFADevicesRequest
     * @return Result of the ListMFADevices operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListMFADevices
     */
    @Override
    public ListMFADevicesResult listMFADevices(ListMFADevicesRequest listMFADevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(listMFADevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMFADevicesRequest> request = null;
        Response<ListMFADevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMFADevicesRequestMarshaller().marshall(super.beforeMarshalling(listMFADevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListMFADevicesResult> responseHandler = new StaxResponseHandler<ListMFADevicesResult>(
                    new ListMFADevicesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListMFADevicesResult listMFADevices() {
        return listMFADevices(new ListMFADevicesRequest());
    }

    /**
     * <p>
     * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
     * </p>
     * 
     * @param listOpenIDConnectProvidersRequest
     * @return Result of the ListOpenIDConnectProviders operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListOpenIDConnectProviders
     */
    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders(ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest) {
        ExecutionContext executionContext = createExecutionContext(listOpenIDConnectProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOpenIDConnectProvidersRequest> request = null;
        Response<ListOpenIDConnectProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOpenIDConnectProvidersRequestMarshaller().marshall(super.beforeMarshalling(listOpenIDConnectProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListOpenIDConnectProvidersResult> responseHandler = new StaxResponseHandler<ListOpenIDConnectProvidersResult>(
                    new ListOpenIDConnectProvidersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders() {
        return listOpenIDConnectProviders(new ListOpenIDConnectProvidersRequest());
    }

    /**
     * <p>
     * Lists all the managed policies that are available in your AWS account, including your own customer-defined
     * managed policies and all AWS managed policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the optional <code>OnlyAttached</code>,
     * <code>Scope</code>, and <code>PathPrefix</code> parameters. For example, to list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>. To list only AWS managed policies,
     * set <code>Scope</code> to <code>AWS</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListPolicies
     */
    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPoliciesResult> responseHandler = new StaxResponseHandler<ListPoliciesResult>(new ListPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPoliciesResult listPolicies() {
        return listPolicies(new ListPoliciesRequest());
    }

    /**
     * <p>
     * Lists information about the versions of the specified managed policy, including the version that is currently set
     * as the policy's default version.
     * </p>
     * <p>
     * For more information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     * @return Result of the ListPolicyVersions operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListPolicyVersions
     */
    @Override
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyVersionsRequest> request = null;
        Response<ListPolicyVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyVersionsRequestMarshaller().marshall(super.beforeMarshalling(listPolicyVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPolicyVersionsResult> responseHandler = new StaxResponseHandler<ListPolicyVersionsResult>(
                    new ListPolicyVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified IAM role.
     * </p>
     * <p>
     * An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a
     * role, use <a>ListAttachedRolePolicies</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified role, the action returns an empty list.
     * </p>
     * 
     * @param listRolePoliciesRequest
     * @return Result of the ListRolePolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListRolePolicies
     */
    @Override
    public ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest listRolePoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRolePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRolePoliciesRequest> request = null;
        Response<ListRolePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRolePoliciesRequestMarshaller().marshall(super.beforeMarshalling(listRolePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListRolePoliciesResult> responseHandler = new StaxResponseHandler<ListRolePoliciesResult>(
                    new ListRolePoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IAM roles that have the specified path prefix. If there are none, the action returns an empty list. For
     * more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listRolesRequest
     * @return Result of the ListRoles operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListRoles
     */
    @Override
    public ListRolesResult listRoles(ListRolesRequest listRolesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRolesRequest> request = null;
        Response<ListRolesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRolesRequestMarshaller().marshall(super.beforeMarshalling(listRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListRolesResult> responseHandler = new StaxResponseHandler<ListRolesResult>(new ListRolesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListRolesResult listRoles() {
        return listRoles(new ListRolesRequest());
    }

    /**
     * <p>
     * Lists the SAML provider resource objects defined in IAM in the account.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param listSAMLProvidersRequest
     * @return Result of the ListSAMLProviders operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListSAMLProviders
     */
    @Override
    public ListSAMLProvidersResult listSAMLProviders(ListSAMLProvidersRequest listSAMLProvidersRequest) {
        ExecutionContext executionContext = createExecutionContext(listSAMLProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSAMLProvidersRequest> request = null;
        Response<ListSAMLProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSAMLProvidersRequestMarshaller().marshall(super.beforeMarshalling(listSAMLProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListSAMLProvidersResult> responseHandler = new StaxResponseHandler<ListSAMLProvidersResult>(
                    new ListSAMLProvidersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListSAMLProvidersResult listSAMLProviders() {
        return listSAMLProviders(new ListSAMLProvidersRequest());
    }

    /**
     * <p>
     * Returns information about the SSH public keys associated with the specified IAM user. If there are none, the
     * action returns an empty list.
     * </p>
     * <p>
     * The SSH public keys returned by this action are used only for authenticating the IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listSSHPublicKeysRequest
     * @return Result of the ListSSHPublicKeys operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.ListSSHPublicKeys
     */
    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys(ListSSHPublicKeysRequest listSSHPublicKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listSSHPublicKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSSHPublicKeysRequest> request = null;
        Response<ListSSHPublicKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSSHPublicKeysRequestMarshaller().marshall(super.beforeMarshalling(listSSHPublicKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListSSHPublicKeysResult> responseHandler = new StaxResponseHandler<ListSSHPublicKeysResult>(
                    new ListSSHPublicKeysResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys() {
        return listSSHPublicKeys(new ListSSHPublicKeysRequest());
    }

    /**
     * <p>
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the action
     * returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listServerCertificatesRequest
     * @return Result of the ListServerCertificates operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListServerCertificates
     */
    @Override
    public ListServerCertificatesResult listServerCertificates(ListServerCertificatesRequest listServerCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listServerCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServerCertificatesRequest> request = null;
        Response<ListServerCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServerCertificatesRequestMarshaller().marshall(super.beforeMarshalling(listServerCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListServerCertificatesResult> responseHandler = new StaxResponseHandler<ListServerCertificatesResult>(
                    new ListServerCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListServerCertificatesResult listServerCertificates() {
        return listServerCertificates(new ListServerCertificatesRequest());
    }

    /**
     * <p>
     * Returns information about the signing certificates associated with the specified IAM user. If there are none, the
     * action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing certificates, you can still paginate the results using
     * the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS
     * access key ID used to sign the request for this API. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param listSigningCertificatesRequest
     * @return Result of the ListSigningCertificates operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListSigningCertificates
     */
    @Override
    public ListSigningCertificatesResult listSigningCertificates(ListSigningCertificatesRequest listSigningCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listSigningCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSigningCertificatesRequest> request = null;
        Response<ListSigningCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSigningCertificatesRequestMarshaller().marshall(super.beforeMarshalling(listSigningCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListSigningCertificatesResult> responseHandler = new StaxResponseHandler<ListSigningCertificatesResult>(
                    new ListSigningCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListSigningCertificatesResult listSigningCertificates() {
        return listSigningCertificates(new ListSigningCertificatesRequest());
    }

    /**
     * <p>
     * Lists the names of the inline policies embedded in the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a
     * user, use <a>ListAttachedUserPolicies</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified user, the action returns an empty list.
     * </p>
     * 
     * @param listUserPoliciesRequest
     * @return Result of the ListUserPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListUserPolicies
     */
    @Override
    public ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest listUserPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoliciesRequest> request = null;
        Response<ListUserPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listUserPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListUserPoliciesResult> responseHandler = new StaxResponseHandler<ListUserPoliciesResult>(
                    new ListUserPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the action returns all
     * users in the AWS account. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListUsers
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller().marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListUsersResult> responseHandler = new StaxResponseHandler<ListUsersResult>(new ListUsersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListUsersResult listUsers() {
        return listUsers(new ListUsersRequest());
    }

    /**
     * <p>
     * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an
     * assignment status, the action returns a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listVirtualMFADevicesRequest
     * @return Result of the ListVirtualMFADevices operation returned by the service.
     * @sample AmazonIdentityManagement.ListVirtualMFADevices
     */
    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices(ListVirtualMFADevicesRequest listVirtualMFADevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(listVirtualMFADevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualMFADevicesRequest> request = null;
        Response<ListVirtualMFADevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualMFADevicesRequestMarshaller().marshall(super.beforeMarshalling(listVirtualMFADevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListVirtualMFADevicesResult> responseHandler = new StaxResponseHandler<ListVirtualMFADevicesResult>(
                    new ListVirtualMFADevicesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices() {
        return listVirtualMFADevices(new ListVirtualMFADevicesRequest());
    }

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the specified IAM group.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To attach a managed policy to a group, use
     * <a>AttachGroupPolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed
     * Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed in a group, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutGroupPolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putGroupPolicyRequest
     * @return Result of the PutGroupPolicy operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutGroupPolicy
     */
    @Override
    public PutGroupPolicyResult putGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutGroupPolicyRequest> request = null;
        Response<PutGroupPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(putGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutGroupPolicyResult> responseHandler = new StaxResponseHandler<PutGroupPolicyResult>(
                    new PutGroupPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the specified IAM role.
     * </p>
     * <p>
     * When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions)
     * policy. The role's trust policy is created at the same time as the role, using <a>CreateRole</a>. You can update
     * a role's trust policy using <a>UpdateAssumeRolePolicy</a>. For more information about IAM roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a managed policy to a role, use
     * <a>AttachRolePolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about policies,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed with a role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutRolePolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putRolePolicyRequest
     * @return Result of the PutRolePolicy operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutRolePolicy
     */
    @Override
    public PutRolePolicyResult putRolePolicy(PutRolePolicyRequest putRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRolePolicyRequest> request = null;
        Response<PutRolePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(putRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutRolePolicyResult> responseHandler = new StaxResponseHandler<PutRolePolicyResult>(new PutRolePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use
     * <a>AttachUserPolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about policies,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed in a user, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutUserPolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putUserPolicyRequest
     * @return Result of the PutUserPolicy operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutUserPolicy
     */
    @Override
    public PutUserPolicyResult putUserPolicy(PutUserPolicyRequest putUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutUserPolicyRequest> request = null;
        Response<PutUserPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(putUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutUserPolicyResult> responseHandler = new StaxResponseHandler<PutUserPolicyResult>(new PutUserPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified
     * IAM OpenID Connect (OIDC) provider resource object.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you try to remove a client ID that does not
     * exist.
     * </p>
     * 
     * @param removeClientIDFromOpenIDConnectProviderRequest
     * @return Result of the RemoveClientIDFromOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveClientIDFromOpenIDConnectProvider
     */
    @Override
    public RemoveClientIDFromOpenIDConnectProviderResult removeClientIDFromOpenIDConnectProvider(
            RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(removeClientIDFromOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveClientIDFromOpenIDConnectProviderRequest> request = null;
        Response<RemoveClientIDFromOpenIDConnectProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveClientIDFromOpenIDConnectProviderRequestMarshaller().marshall(super
                        .beforeMarshalling(removeClientIDFromOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveClientIDFromOpenIDConnectProviderResult> responseHandler = new StaxResponseHandler<RemoveClientIDFromOpenIDConnectProviderResult>(
                    new RemoveClientIDFromOpenIDConnectProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified IAM role from the specified EC2 instance profile.
     * </p>
     * <important>
     * <p>
     * Make sure you do not have any Amazon EC2 instances running with the role you are about to remove from the
     * instance profile. Removing a role from an instance profile that is associated with a running instance break any
     * applications running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about IAM roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For more
     * information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param removeRoleFromInstanceProfileRequest
     * @return Result of the RemoveRoleFromInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveRoleFromInstanceProfile
     */
    @Override
    public RemoveRoleFromInstanceProfileResult removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(removeRoleFromInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveRoleFromInstanceProfileRequest> request = null;
        Response<RemoveRoleFromInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveRoleFromInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(removeRoleFromInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveRoleFromInstanceProfileResult> responseHandler = new StaxResponseHandler<RemoveRoleFromInstanceProfileResult>(
                    new RemoveRoleFromInstanceProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * 
     * @param removeUserFromGroupRequest
     * @return Result of the RemoveUserFromGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveUserFromGroup
     */
    @Override
    public RemoveUserFromGroupResult removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(removeUserFromGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveUserFromGroupRequest> request = null;
        Response<RemoveUserFromGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveUserFromGroupRequestMarshaller().marshall(super.beforeMarshalling(removeUserFromGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveUserFromGroupResult> responseHandler = new StaxResponseHandler<RemoveUserFromGroupResult>(
                    new RemoveUserFromGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Synchronizes the specified MFA device with its IAM resource object on the AWS servers.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual MFA Device</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param resyncMFADeviceRequest
     * @return Result of the ResyncMFADevice operation returned by the service.
     * @throws InvalidAuthenticationCodeException
     *         The request was rejected because the authentication code was not recognized. The error message describes
     *         the specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ResyncMFADevice
     */
    @Override
    public ResyncMFADeviceResult resyncMFADevice(ResyncMFADeviceRequest resyncMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(resyncMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResyncMFADeviceRequest> request = null;
        Response<ResyncMFADeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResyncMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(resyncMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResyncMFADeviceResult> responseHandler = new StaxResponseHandler<ResyncMFADeviceResult>(
                    new ResyncMFADeviceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version.
     * </p>
     * <p>
     * This action affects all users, groups, and roles that the policy is attached to. To list the users, groups, and
     * roles that the policy is attached to, use the <a>ListEntitiesForPolicy</a> API.
     * </p>
     * <p>
     * For information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     * @return Result of the SetDefaultPolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.SetDefaultPolicyVersion
     */
    @Override
    public SetDefaultPolicyVersionResult setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(setDefaultPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultPolicyVersionRequest> request = null;
        Response<SetDefaultPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultPolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(setDefaultPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetDefaultPolicyVersionResult> responseHandler = new StaxResponseHandler<SetDefaultPolicyVersionResult>(
                    new SetDefaultPolicyVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API actions and
     * AWS resources to determine the policies' effective permissions. The policies are provided as strings.
     * </p>
     * <p>
     * The simulation does not perform the API actions; it only checks the authorization to determine if the simulated
     * policies allow or deny the actions.
     * </p>
     * <p>
     * If you want to simulate existing policies attached to an IAM user, group, or role, use
     * <a>SimulatePrincipalPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get
     * the list of context keys that the policies require for correct simulation, use
     * <a>GetContextKeysForCustomPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use <code>MaxItems</code> and <code>Marker</code> parameters to paginate the
     * results.
     * </p>
     * 
     * @param simulateCustomPolicyRequest
     * @return Result of the SimulateCustomPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyEvaluationException
     *         The request failed because a provided policy could not be successfully evaluated. An additional detail
     *         message indicates the source of the failure.
     * @sample AmazonIdentityManagement.SimulateCustomPolicy
     */
    @Override
    public SimulateCustomPolicyResult simulateCustomPolicy(SimulateCustomPolicyRequest simulateCustomPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(simulateCustomPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SimulateCustomPolicyRequest> request = null;
        Response<SimulateCustomPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SimulateCustomPolicyRequestMarshaller().marshall(super.beforeMarshalling(simulateCustomPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SimulateCustomPolicyResult> responseHandler = new StaxResponseHandler<SimulateCustomPolicyResult>(
                    new SimulateCustomPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API actions and AWS resources
     * to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a
     * user, then the simulation also includes all of the policies that are attached to groups that the user belongs to
     * .
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies specified as strings to include in the
     * simulation. If you want to simulate only policies specified as strings, use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * You can also optionally include one resource-based policy to be evaluated with each of the resources included in
     * the simulation.
     * </p>
     * <p>
     * The simulation does not perform the API actions, it only checks the authorization to determine if the simulated
     * policies allow or deny the actions.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted to other users. If you do not want
     * users to see other user's permissions, then consider allowing them to use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get
     * the list of context keys that the policies require for correct simulation, use
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use the <code>MaxItems</code> and <code>Marker</code> parameters to paginate the
     * results.
     * </p>
     * 
     * @param simulatePrincipalPolicyRequest
     * @return Result of the SimulatePrincipalPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyEvaluationException
     *         The request failed because a provided policy could not be successfully evaluated. An additional detail
     *         message indicates the source of the failure.
     * @sample AmazonIdentityManagement.SimulatePrincipalPolicy
     */
    @Override
    public SimulatePrincipalPolicyResult simulatePrincipalPolicy(SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(simulatePrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SimulatePrincipalPolicyRequest> request = null;
        Response<SimulatePrincipalPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SimulatePrincipalPolicyRequestMarshaller().marshall(super.beforeMarshalling(simulatePrincipalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SimulatePrincipalPolicyResult> responseHandler = new StaxResponseHandler<SimulatePrincipalPolicyResult>(
                    new SimulatePrincipalPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This action can be used to
     * disable a user's key as part of a key rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html">Managing Keys and
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccessKeyRequest
     * @return Result of the UpdateAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAccessKey
     */
    @Override
    public UpdateAccessKeyResult updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessKeyRequest> request = null;
        Response<UpdateAccessKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessKeyRequestMarshaller().marshall(super.beforeMarshalling(updateAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateAccessKeyResult> responseHandler = new StaxResponseHandler<UpdateAccessKeyResult>(
                    new UpdateAccessKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the password policy settings for the AWS account.
     * </p>
     * <note>
     * <p>
     * This action does not support partial updates. No parameters are required, but if you do not specify a parameter,
     * that parameter's value reverts to its default value. See the <b>Request Parameters</b> section for each
     * parameter's default value.
     * </p>
     * </note>
     * <p>
     * For more information about using a password policy, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html">Managing an IAM
     * Password Policy</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccountPasswordPolicyRequest
     * @return Result of the UpdateAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAccountPasswordPolicy
     */
    @Override
    public UpdateAccountPasswordPolicyResult updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAccountPasswordPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountPasswordPolicyRequest> request = null;
        Response<UpdateAccountPasswordPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountPasswordPolicyRequestMarshaller().marshall(super.beforeMarshalling(updateAccountPasswordPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateAccountPasswordPolicyResult> responseHandler = new StaxResponseHandler<UpdateAccountPasswordPolicyResult>(
                    new UpdateAccountPasswordPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the
     * "role trust policy". For more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * 
     * @param updateAssumeRolePolicyRequest
     * @return Result of the UpdateAssumeRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAssumeRolePolicy
     */
    @Override
    public UpdateAssumeRolePolicyResult updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssumeRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssumeRolePolicyRequest> request = null;
        Response<UpdateAssumeRolePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssumeRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(updateAssumeRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateAssumeRolePolicyResult> responseHandler = new StaxResponseHandler<UpdateAssumeRolePolicyResult>(
                    new UpdateAssumeRolePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name and/or the path of the specified IAM group.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a group's path or name. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html">Renaming Users and
     * Groups</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change an IAM group name the requester must have appropriate permissions on both the source object and the
     * target object. For example, to change "Managers" to "MGRs", the entity making the request must have permission on
     * both "Managers" and "MGRs", or must have permission on all (*). For more information about permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html">Permissions and Policies</a>.
     * </p>
     * </note>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateGroup
     */
    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupRequest> request = null;
        Response<UpdateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestMarshaller().marshall(super.beforeMarshalling(updateGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateGroupResult> responseHandler = new StaxResponseHandler<UpdateGroupResult>(new UpdateGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the password for the specified IAM user.
     * </p>
     * <p>
     * IAM users can change their own passwords by calling <a>ChangePassword</a>. For more information about modifying
     * passwords, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing
     * Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateLoginProfileRequest
     * @return Result of the UpdateLoginProfile operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateLoginProfile
     */
    @Override
    public UpdateLoginProfileResult updateLoginProfile(UpdateLoginProfileRequest updateLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(updateLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLoginProfileRequest> request = null;
        Response<UpdateLoginProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(updateLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateLoginProfileResult> responseHandler = new StaxResponseHandler<UpdateLoginProfileResult>(
                    new UpdateLoginProfileResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider
     * resource object with a new list of thumbprints.
     * </p>
     * <p>
     * The list that you pass with this action completely replaces the existing list of thumbprints. (The lists are not
     * merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs
     * rarely. However, if the provider's certificate <i>does</i> change, any attempt to assume an IAM role that
     * specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.
     * </p>
     * <note>
     * <p>
     * Because trust for the OIDC provider is ultimately derived from the provider's certificate and is validated by the
     * thumbprint, it is a best practice to limit access to the <code>UpdateOpenIDConnectProviderThumbprint</code>
     * action to highly-privileged users.
     * </p>
     * </note>
     * 
     * @param updateOpenIDConnectProviderThumbprintRequest
     * @return Result of the UpdateOpenIDConnectProviderThumbprint operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateOpenIDConnectProviderThumbprint
     */
    @Override
    public UpdateOpenIDConnectProviderThumbprintResult updateOpenIDConnectProviderThumbprint(
            UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest) {
        ExecutionContext executionContext = createExecutionContext(updateOpenIDConnectProviderThumbprintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOpenIDConnectProviderThumbprintRequest> request = null;
        Response<UpdateOpenIDConnectProviderThumbprintResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOpenIDConnectProviderThumbprintRequestMarshaller().marshall(super
                        .beforeMarshalling(updateOpenIDConnectProviderThumbprintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateOpenIDConnectProviderThumbprintResult> responseHandler = new StaxResponseHandler<UpdateOpenIDConnectProviderThumbprintResult>(
                    new UpdateOpenIDConnectProviderThumbprintResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the metadata document for an existing SAML provider resource object.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param updateSAMLProviderRequest
     * @return Result of the UpdateSAMLProvider operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateSAMLProvider
     */
    @Override
    public UpdateSAMLProviderResult updateSAMLProvider(UpdateSAMLProviderRequest updateSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSAMLProviderRequest> request = null;
        Response<UpdateSAMLProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(updateSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateSAMLProviderResult> responseHandler = new StaxResponseHandler<UpdateSAMLProviderResult>(
                    new UpdateSAMLProviderResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot
     * be used for authentication. This action can be used to disable a user's SSH public key as part of a key rotation
     * work flow.
     * </p>
     * <p>
     * The SSH public key affected by this action is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param updateSSHPublicKeyRequest
     * @return Result of the UpdateSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.UpdateSSHPublicKey
     */
    @Override
    public UpdateSSHPublicKeyResult updateSSHPublicKey(UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSSHPublicKeyRequest> request = null;
        Response<UpdateSSHPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(updateSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateSSHPublicKeyResult> responseHandler = new StaxResponseHandler<UpdateSSHPublicKeyResult>(
                    new UpdateSSHPublicKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate stored in IAM.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a server certificate's path or name. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
     * >Renaming a Server Certificate</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change a server certificate name the requester must have appropriate permissions on both the source object and
     * the target object. For example, to change the name from "ProductionCert" to "ProdCert", the entity making the
     * request must have permission on "ProductionCert" and "ProdCert", or must have permission on all (*). For more
     * information about permissions, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     * Management</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServerCertificateRequest
     * @return Result of the UpdateServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateServerCertificate
     */
    @Override
    public UpdateServerCertificateResult updateServerCertificate(UpdateServerCertificateRequest updateServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServerCertificateRequest> request = null;
        Response<UpdateServerCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(updateServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateServerCertificateResult> responseHandler = new StaxResponseHandler<UpdateServerCertificateResult>(
                    new UpdateServerCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This action
     * can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param updateSigningCertificateRequest
     * @return Result of the UpdateSigningCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateSigningCertificate
     */
    @Override
    public UpdateSigningCertificateResult updateSigningCertificate(UpdateSigningCertificateRequest updateSigningCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSigningCertificateRequest> request = null;
        Response<UpdateSigningCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSigningCertificateRequestMarshaller().marshall(super.beforeMarshalling(updateSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateSigningCertificateResult> responseHandler = new StaxResponseHandler<UpdateSigningCertificateResult>(
                    new UpdateSigningCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name and/or the path of the specified IAM user.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing an IAM user's path or name. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming">Renaming an IAM
     * User</a> and <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html">Renaming an
     * IAM Group</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change a user name the requester must have appropriate permissions on both the source object and the target
     * object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and
     * Robert, or must have permission on all (*). For more information about permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html">Permissions and Policies</a>.
     * </p>
     * </note>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateUser
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest updateUserRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestMarshaller().marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateUserResult> responseHandler = new StaxResponseHandler<UpdateUserResult>(new UpdateUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads an SSH public key and associates it with the specified IAM user.
     * </p>
     * <p>
     * The SSH public key uploaded by this action can be used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param uploadSSHPublicKeyRequest
     * @return Result of the UploadSSHPublicKey operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidPublicKeyException
     *         The request was rejected because the public key is malformed or otherwise invalid.
     * @throws DuplicateSSHPublicKeyException
     *         The request was rejected because the SSH public key is already associated with the specified IAM user.
     * @throws UnrecognizedPublicKeyEncodingException
     *         The request was rejected because the public key encoding format is unsupported or unrecognized.
     * @sample AmazonIdentityManagement.UploadSSHPublicKey
     */
    @Override
    public UploadSSHPublicKeyResult uploadSSHPublicKey(UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadSSHPublicKeyRequest> request = null;
        Response<UploadSSHPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(uploadSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UploadSSHPublicKeyResult> responseHandler = new StaxResponseHandler<UploadSSHPublicKeyResult>(
                    new UploadSSHPublicKeyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key
     * certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about the number of server certificates you can upload, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html">Limitations on IAM Entities and
     * Objects</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because the body of the public key certificate, private key, and the certificate chain can be large, you should
     * use POST rather than GET when calling <code>UploadServerCertificate</code>. For information about setting up
     * signatures and authorization through the API, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a> in
     * the <i>AWS General Reference</i>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html">Calling the API by Making HTTP Query
     * Requests</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param uploadServerCertificateRequest
     * @return Result of the UploadServerCertificate operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedCertificateException
     *         The request was rejected because the certificate was malformed or expired. The error message describes
     *         the specific error.
     * @throws KeyPairMismatchException
     *         The request was rejected because the public key certificate and the private key do not match.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UploadServerCertificate
     */
    @Override
    public UploadServerCertificateResult uploadServerCertificate(UploadServerCertificateRequest uploadServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadServerCertificateRequest> request = null;
        Response<UploadServerCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(uploadServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UploadServerCertificateResult> responseHandler = new StaxResponseHandler<UploadServerCertificateResult>(
                    new UploadServerCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509
     * signing certificates to validate requests that are signed with a corresponding private key. When you upload the
     * certificate, its default status is <code>Active</code>.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the IAM user name is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * <note>
     * <p>
     * Because the body of a X.509 certificate can be large, you should use POST rather than GET when calling
     * <code>UploadSigningCertificate</code>. For information about setting up signatures and authorization through the
     * API, go to <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API
     * Requests</a> in the <i>AWS General Reference</i>. For general information about using the Query API with IAM, go
     * to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param uploadSigningCertificateRequest
     * @return Result of the UploadSigningCertificate operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedCertificateException
     *         The request was rejected because the certificate was malformed or expired. The error message describes
     *         the specific error.
     * @throws InvalidCertificateException
     *         The request was rejected because the certificate is invalid.
     * @throws DuplicateCertificateException
     *         The request was rejected because the same certificate is associated with an IAM user in the account.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UploadSigningCertificate
     */
    @Override
    public UploadSigningCertificateResult uploadSigningCertificate(UploadSigningCertificateRequest uploadSigningCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadSigningCertificateRequest> request = null;
        Response<UploadSigningCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadSigningCertificateRequestMarshaller().marshall(super.beforeMarshalling(uploadSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UploadSigningCertificateResult> responseHandler = new StaxResponseHandler<UploadSigningCertificateResult>(
                    new UploadSigningCertificateResultStaxUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    public AmazonIdentityManagementWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonIdentityManagementWaiters(this);
                }
            }
        }
        return waiters;
    }

}
