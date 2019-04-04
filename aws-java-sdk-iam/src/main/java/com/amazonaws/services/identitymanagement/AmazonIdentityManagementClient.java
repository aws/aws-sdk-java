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
package com.amazonaws.services.identitymanagement;

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

import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;
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
 * user guide for IAM, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/">Using IAM</a>.
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
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
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
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>. If you have an
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
 * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a>.
 * This topic provides general information about the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html">IAM Best Practices</a>. This topic
 * presents a list of suggestions for using the IAM service to help secure your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a>.
 * This set of topics walk you through the process of signing a request using an access key ID and secret access key.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonIdentityManagementClient extends AmazonWebServiceClient implements AmazonIdentityManagement {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonIdentityManagement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iam";

    private volatile AmazonIdentityManagementWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#defaultClient()}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AmazonIdentityManagementClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonIdentityManagementClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonIdentityManagementClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonIdentityManagementClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonIdentityManagementClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonIdentityManagementClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonIdentityManagementClientBuilder builder() {
        return AmazonIdentityManagementClientBuilder.standard();
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
        this(clientParams, false);
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
    AmazonIdentityManagementClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnmodifiableEntityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DeleteConflictExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PasswordPolicyViolationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CredentialReportExpiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidUserTypeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchEntityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityTemporarilyUnmodifiableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceNotSupportedExceptionUnmarshaller());
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
        exceptionUnmarshallers.add(new PolicyNotAttachableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.identitymanagement.model.AmazonIdentityManagementException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("iam.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/identitymanagement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/identitymanagement/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM
     * OpenID Connect (OIDC) provider resource.
     * </p>
     * <p>
     * This operation is idempotent; it does not fail or return an error if you add an existing client ID to the
     * provider.
     * </p>
     * 
     * @param addClientIDToOpenIDConnectProviderRequest
     * @return Result of the AddClientIDToOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddClientIDToOpenIDConnectProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AddClientIDToOpenIDConnectProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddClientIDToOpenIDConnectProviderResult addClientIDToOpenIDConnectProvider(AddClientIDToOpenIDConnectProviderRequest request) {
        request = beforeClientExecution(request);
        return executeAddClientIDToOpenIDConnectProvider(request);
    }

    @SdkInternalApi
    final AddClientIDToOpenIDConnectProviderResult executeAddClientIDToOpenIDConnectProvider(
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddClientIDToOpenIDConnectProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and
     * this limit cannot be increased. You can remove the existing role and then add a different role to an instance
     * profile. You must then wait for the change to appear across all of AWS because of <a
     * href="https://en.wikipedia.org/wiki/Eventual_consistency">eventual consistency</a>. To force the change, you must
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html">
     * disassociate the instance profile</a> and then <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html">associate the
     * instance profile</a>, or you can stop your instance and then restart it.
     * </p>
     * <note>
     * <p>
     * The caller of this API must be granted the <code>PassRole</code> permission on the IAM role by a permissions
     * policy.
     * </p>
     * </note>
     * <p>
     * For more information about roles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For more
     * information about instance profiles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param addRoleToInstanceProfileRequest
     * @return Result of the AddRoleToInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddRoleToInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AddRoleToInstanceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddRoleToInstanceProfileResult addRoleToInstanceProfile(AddRoleToInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeAddRoleToInstanceProfile(request);
    }

    @SdkInternalApi
    final AddRoleToInstanceProfileResult executeAddRoleToInstanceProfile(AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddRoleToInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddUserToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AddUserToGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddUserToGroupResult addUserToGroup(AddUserToGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAddUserToGroup(request);
    }

    @SdkInternalApi
    final AddUserToGroupResult executeAddUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddUserToGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachGroupPolicyRequest
     * @return Result of the AttachGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyNotAttachableException
     *         The request failed because AWS service role policies can only be attached to the service-linked role for
     *         that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AttachGroupPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachGroupPolicyResult attachGroupPolicy(AttachGroupPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachGroupPolicy(request);
    }

    @SdkInternalApi
    final AttachGroupPolicyResult executeAttachGroupPolicy(AttachGroupPolicyRequest attachGroupPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachGroupPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the
     * managed policy becomes part of the role's permission (access) policy.
     * </p>
     * <note>
     * <p>
     * You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time
     * as the role, using <a>CreateRole</a>. You can update a role's trust policy using <a>UpdateAssumeRolePolicy</a>.
     * </p>
     * </note>
     * <p>
     * Use this API to attach a <i>managed</i> policy to a role. To embed an inline policy in a role, use
     * <a>PutRolePolicy</a>. For more information about policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachRolePolicyRequest
     * @return Result of the AttachRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws PolicyNotAttachableException
     *         The request failed because AWS service role policies can only be attached to the service-linked role for
     *         that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachRolePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AttachRolePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachRolePolicyResult attachRolePolicy(AttachRolePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachRolePolicy(request);
    }

    @SdkInternalApi
    final AttachRolePolicyResult executeAttachRolePolicy(AttachRolePolicyRequest attachRolePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachRolePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachUserPolicyRequest
     * @return Result of the AttachUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyNotAttachableException
     *         The request failed because AWS service role policies can only be attached to the service-linked role for
     *         that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachUserPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AttachUserPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachUserPolicyResult attachUserPolicy(AttachUserPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAttachUserPolicy(request);
    }

    @SdkInternalApi
    final AttachUserPolicyResult executeAttachUserPolicy(AttachUserPolicyRequest attachUserPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachUserPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not
     * affected by this operation.
     * </p>
     * <p>
     * To change the password for a different user, see <a>UpdateLoginProfile</a>. For more information about modifying
     * passwords, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing
     * Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param changePasswordRequest
     * @return Result of the ChangePassword operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ChangePassword" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest request) {
        request = beforeClientExecution(request);
        return executeChangePassword(request);
    }

    @SdkInternalApi
    final ChangePasswordResult executeChangePassword(ChangePasswordRequest changePasswordRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChangePassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
     * to manage AWS account root user credentials. This is true even if the AWS account has no associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateAccessKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessKey(request);
    }

    @SdkInternalApi
    final CreateAccessKeyResult executeCreateAccessKey(CreateAccessKeyRequest createAccessKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateAccountAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAccountAliasResult createAccountAlias(CreateAccountAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccountAlias(request);
    }

    @SdkInternalApi
    final CreateAccountAliasResult executeCreateAccountAlias(CreateAccountAliasRequest createAccountAliasRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccountAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * For information about the number of instance profiles you can create, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateInstanceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstanceProfile(request);
    }

    @SdkInternalApi
    final CreateInstanceProfileResult executeCreateInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing Passwords</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createLoginProfileRequest
     * @return Result of the CreateLoginProfile operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateLoginProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateLoginProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoginProfile(request);
    }

    @SdkInternalApi
    final CreateLoginProfileResult executeCreateLoginProfile(CreateLoginProfileRequest createLoginProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoginProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a
     * policy establishes a trust relationship between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The URL of the OIDC identity provider (IdP) to trust
     * </p>
     * </li>
     * <li>
     * <p>
     * A list of client IDs (also known as audiences) that identify the application or applications that are allowed to
     * authenticate using the OIDC provider
     * </p>
     * </li>
     * <li>
     * <p>
     * A list of thumbprints of the server certificate(s) that the IdP uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You get all of this information from the OIDC IdP that you want to use to access AWS.
     * </p>
     * <note>
     * <p>
     * Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to
     * limit access to the <a>CreateOpenIDConnectProvider</a> operation to highly privileged users.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateOpenIDConnectProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOpenIDConnectProviderResult createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOpenIDConnectProvider(request);
    }

    @SdkInternalApi
    final CreateOpenIDConnectProviderResult executeCreateOpenIDConnectProvider(CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOpenIDConnectProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policies in general, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicy(request);
    }

    @SdkInternalApi
    final CreatePolicyResult executeCreatePolicy(CreatePolicyRequest createPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyVersionRequest
     * @return Result of the CreatePolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreatePolicyVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicyVersion(request);
    }

    @SdkInternalApi
    final CreatePolicyVersionResult executeCreatePolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">IAM Roles</a>. For information
     * about limitations on role names and the number of roles you can create, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createRoleRequest
     * @return Result of the CreateRole operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRoleResult createRole(CreateRoleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRole(request);
    }

    @SdkInternalApi
    final CreateRoleResult executeCreateRole(CreateRoleRequest createRoleRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can
     * create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that
     * supports API access to AWS.
     * </p>
     * <p>
     * When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That
     * document includes the issuer's name, expiration information, and keys that can be used to validate the SAML
     * authentication response (assertions) that the IdP sends. You must generate the metadata document using the
     * identity management software that is used as your organization's IdP.
     * </p>
     * <note>
     * <p>
     * This operation requires <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html">Enabling SAML
     * 2.0 Federated Users to Access the AWS Management Console</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateSAMLProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSAMLProviderResult createSAMLProvider(CreateSAMLProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSAMLProvider(request);
    }

    @SdkInternalApi
    final CreateSAMLProviderResult executeCreateSAMLProvider(CreateSAMLProviderRequest createSAMLProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSAMLProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when
     * the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted
     * role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps
     * improve service stability and proper cleanup when a service and its role are no longer needed. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">Using
     * Service-Linked Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * To attach a policy to this service-linked role, you must make the request using the AWS service that depends on
     * this role.
     * </p>
     * 
     * @param createServiceLinkedRoleRequest
     * @return Result of the CreateServiceLinkedRole operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateServiceLinkedRole" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateServiceLinkedRoleResult createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceLinkedRole(request);
    }

    @SdkInternalApi
    final CreateServiceLinkedRoleResult executeCreateServiceLinkedRole(CreateServiceLinkedRoleRequest createServiceLinkedRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceLinkedRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceLinkedRoleRequest> request = null;
        Response<CreateServiceLinkedRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceLinkedRoleRequestMarshaller().marshall(super.beforeMarshalling(createServiceLinkedRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceLinkedRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateServiceLinkedRoleResult> responseHandler = new StaxResponseHandler<CreateServiceLinkedRoleResult>(
                    new CreateServiceLinkedRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a set of credentials consisting of a user name and password that can be used to access the service
     * specified in the request. These credentials are generated by IAM, and can be used only for the specified service.
     * </p>
     * <p>
     * You can have a maximum of two sets of service-specific credentials for each supported service per user.
     * </p>
     * <p>
     * The only supported service at this time is AWS CodeCommit.
     * </p>
     * <p>
     * You can reset the password to a new service-generated value by calling <a>ResetServiceSpecificCredential</a>.
     * </p>
     * <p>
     * For more information about service-specific credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html">Using IAM with AWS
     * CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createServiceSpecificCredentialRequest
     * @return Result of the CreateServiceSpecificCredential operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceNotSupportedException
     *         The specified service does not support service-specific credentials.
     * @sample AmazonIdentityManagement.CreateServiceSpecificCredential
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateServiceSpecificCredential"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceSpecificCredentialResult createServiceSpecificCredential(CreateServiceSpecificCredentialRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceSpecificCredential(request);
    }

    @SdkInternalApi
    final CreateServiceSpecificCredentialResult executeCreateServiceSpecificCredential(
            CreateServiceSpecificCredentialRequest createServiceSpecificCredentialRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceSpecificCredentialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceSpecificCredentialRequest> request = null;
        Response<CreateServiceSpecificCredentialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceSpecificCredentialRequestMarshaller().marshall(super.beforeMarshalling(createServiceSpecificCredentialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceSpecificCredential");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateServiceSpecificCredentialResult> responseHandler = new StaxResponseHandler<CreateServiceSpecificCredentialResult>(
                    new CreateServiceSpecificCredentialResultStaxUnmarshaller());
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * devices, go to <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual
     * MFA Device</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can create, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on Entities</a> in
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateVirtualMFADevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVirtualMFADeviceResult createVirtualMFADevice(CreateVirtualMFADeviceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVirtualMFADevice(request);
    }

    @SdkInternalApi
    final CreateVirtualMFADeviceResult executeCreateVirtualMFADevice(CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVirtualMFADevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Enabling a Virtual Multi-factor
     * Authentication (MFA) Device</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deactivateMFADeviceRequest
     * @return Result of the DeactivateMFADevice operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeactivateMFADevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeactivateMFADevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeactivateMFADeviceResult deactivateMFADevice(DeactivateMFADeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeactivateMFADevice(request);
    }

    @SdkInternalApi
    final DeactivateMFADeviceResult executeDeactivateMFADevice(DeactivateMFADeviceRequest deactivateMFADeviceRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeactivateMFADevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
     * to manage AWS account root user credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param deleteAccessKeyRequest
     * @return Result of the DeleteAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteAccessKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAccessKeyResult deleteAccessKey(DeleteAccessKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessKey(request);
    }

    @SdkInternalApi
    final DeleteAccessKeyResult executeDeleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
     * ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @return Result of the DeleteAccountAlias operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteAccountAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountAlias(request);
    }

    @SdkInternalApi
    final DeleteAccountAliasResult executeDeleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccountPasswordPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteAccountPasswordPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountPasswordPolicy(request);
    }

    @SdkInternalApi
    final DeleteAccountPasswordPolicyResult executeDeleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountPasswordPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteGroupPolicyRequest
     * @return Result of the DeleteGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteGroupPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupPolicyResult deleteGroupPolicy(DeleteGroupPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroupPolicy(request);
    }

    @SdkInternalApi
    final DeleteGroupPolicyResult executeDeleteGroupPolicy(DeleteGroupPolicyRequest deleteGroupPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroupPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to
     * delete. Deleting a role or instance profile that is associated with a running instance will break any
     * applications running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about instance profiles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @return Result of the DeleteInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteInstanceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceProfile(request);
    }

    @SdkInternalApi
    final DeleteInstanceProfileResult executeDeleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * API. To prevent all user access, you must also either make any access keys inactive or delete them. For more
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteLoginProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteLoginProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLoginProfileResult deleteLoginProfile(DeleteLoginProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoginProfile(request);
    }

    @SdkInternalApi
    final DeleteLoginProfileResult executeDeleteLoginProfile(DeleteLoginProfileRequest deleteLoginProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoginProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * This operation is idempotent; it does not fail or return an error if you call the operation for a provider that
     * does not exist.
     * </p>
     * 
     * @param deleteOpenIDConnectProviderRequest
     * @return Result of the DeleteOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteOpenIDConnectProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteOpenIDConnectProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOpenIDConnectProviderResult deleteOpenIDConnectProvider(DeleteOpenIDConnectProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOpenIDConnectProvider(request);
    }

    @SdkInternalApi
    final DeleteOpenIDConnectProviderResult executeDeleteOpenIDConnectProvider(DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOpenIDConnectProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * it is attached to. In addition, you must delete all the policy's versions. The following steps describe the
     * process for deleting a managed policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Detach the policy from all users, groups, and roles that the policy is attached to, using the
     * <a>DetachUserPolicy</a>, <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a> API operations. To list all the
     * users, groups, and roles that a policy is attached to, use <a>ListEntitiesForPolicy</a>.
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicy(request);
    }

    @SdkInternalApi
    final DeletePolicyResult executeDeletePolicy(DeletePolicyRequest deletePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     * @return Result of the DeletePolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeletePolicyVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePolicyVersionResult deletePolicyVersion(DeletePolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicyVersion(request);
    }

    @SdkInternalApi
    final DeletePolicyVersionResult executeDeletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <important>
     * <p>
     * Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a
     * role or instance profile that is associated with a running instance will break any applications running on the
     * instance.
     * </p>
     * </important>
     * 
     * @param deleteRoleRequest
     * @return Result of the DeleteRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRoleResult deleteRole(DeleteRoleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRole(request);
    }

    @SdkInternalApi
    final DeleteRoleResult executeDeleteRole(DeleteRoleRequest deleteRoleRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes the permissions boundary for the specified IAM role.
     * </p>
     * <important>
     * <p>
     * Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the
     * role to perform all the actions granted in its permissions policies.
     * </p>
     * </important>
     * 
     * @param deleteRolePermissionsBoundaryRequest
     * @return Result of the DeleteRolePermissionsBoundary operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRolePermissionsBoundary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteRolePermissionsBoundary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRolePermissionsBoundaryResult deleteRolePermissionsBoundary(DeleteRolePermissionsBoundaryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRolePermissionsBoundary(request);
    }

    @SdkInternalApi
    final DeleteRolePermissionsBoundaryResult executeDeleteRolePermissionsBoundary(DeleteRolePermissionsBoundaryRequest deleteRolePermissionsBoundaryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRolePermissionsBoundaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRolePermissionsBoundaryRequest> request = null;
        Response<DeleteRolePermissionsBoundaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRolePermissionsBoundaryRequestMarshaller().marshall(super.beforeMarshalling(deleteRolePermissionsBoundaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRolePermissionsBoundary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteRolePermissionsBoundaryResult> responseHandler = new StaxResponseHandler<DeleteRolePermissionsBoundaryResult>(
                    new DeleteRolePermissionsBoundaryResultStaxUnmarshaller());
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteRolePolicyRequest
     * @return Result of the DeleteRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRolePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteRolePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRolePolicyResult deleteRolePolicy(DeleteRolePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRolePolicy(request);
    }

    @SdkInternalApi
    final DeleteRolePolicyResult executeDeleteRolePolicy(DeleteRolePolicyRequest deleteRolePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRolePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * This operation requires <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteSAMLProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteSAMLProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSAMLProviderResult deleteSAMLProvider(DeleteSAMLProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSAMLProvider(request);
    }

    @SdkInternalApi
    final DeleteSAMLProviderResult executeDeleteSAMLProvider(DeleteSAMLProviderRequest deleteSAMLProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSAMLProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param deleteSSHPublicKeyRequest
     * @return Result of the DeleteSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.DeleteSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteSSHPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSSHPublicKeyResult deleteSSHPublicKey(DeleteSSHPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSSHPublicKey(request);
    }

    @SdkInternalApi
    final DeleteSSHPublicKeyResult executeDeleteSSHPublicKey(DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSSHPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For more information about working with server certificates, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of AWS services that can use the
     * server certificates that you manage with IAM.
     * </p>
     * <important>
     * <p>
     * If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have
     * implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates,
     * it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We
     * recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command
     * to delete the certificate. For more information, go to <a href=
     * "https://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html"
     * >DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API Reference</i>.
     * </p>
     * </important>
     * 
     * @param deleteServerCertificateRequest
     * @return Result of the DeleteServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteServerCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteServerCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteServerCertificateResult deleteServerCertificate(DeleteServerCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServerCertificate(request);
    }

    @SdkInternalApi
    final DeleteServerCertificateResult executeDeleteServerCertificate(DeleteServerCertificateRequest deleteServerCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServerCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Submits a service-linked role deletion request and returns a <code>DeletionTaskId</code>, which you can use to
     * check the status of the deletion. Before you call this operation, confirm that the role has no active sessions
     * and that any resources used by the role in the linked service are deleted. If you call this operation more than
     * once for the same service-linked role and an earlier deletion task is not complete, then the
     * <code>DeletionTaskId</code> of the earlier request is returned.
     * </p>
     * <p>
     * If you submit a deletion request for a service-linked role whose linked service is still accessing a resource,
     * then the deletion task fails. If it fails, the <a>GetServiceLinkedRoleDeletionStatus</a> API operation returns
     * the reason for the failure, usually including the resources that must be deleted. To delete the service-linked
     * role, you must first remove those resources from the linked service and then submit the deletion request again.
     * Resources are specific to the service that is linked to the role. For more information about removing resources
     * from a service, see the <a href="http://docs.aws.amazon.com/">AWS documentation</a> for your service.
     * </p>
     * <p>
     * For more information about service-linked roles, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role"
     * >Roles Terms and Concepts: AWS Service-Linked Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteServiceLinkedRoleRequest
     * @return Result of the DeleteServiceLinkedRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteServiceLinkedRole" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteServiceLinkedRoleResult deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceLinkedRole(request);
    }

    @SdkInternalApi
    final DeleteServiceLinkedRoleResult executeDeleteServiceLinkedRole(DeleteServiceLinkedRoleRequest deleteServiceLinkedRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceLinkedRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceLinkedRoleRequest> request = null;
        Response<DeleteServiceLinkedRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceLinkedRoleRequestMarshaller().marshall(super.beforeMarshalling(deleteServiceLinkedRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceLinkedRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteServiceLinkedRoleResult> responseHandler = new StaxResponseHandler<DeleteServiceLinkedRoleResult>(
                    new DeleteServiceLinkedRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified service-specific credential.
     * </p>
     * 
     * @param deleteServiceSpecificCredentialRequest
     * @return Result of the DeleteServiceSpecificCredential operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.DeleteServiceSpecificCredential
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteServiceSpecificCredential"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceSpecificCredentialResult deleteServiceSpecificCredential(DeleteServiceSpecificCredentialRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceSpecificCredential(request);
    }

    @SdkInternalApi
    final DeleteServiceSpecificCredentialResult executeDeleteServiceSpecificCredential(
            DeleteServiceSpecificCredentialRequest deleteServiceSpecificCredentialRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceSpecificCredentialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceSpecificCredentialRequest> request = null;
        Response<DeleteServiceSpecificCredentialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceSpecificCredentialRequestMarshaller().marshall(super.beforeMarshalling(deleteServiceSpecificCredentialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceSpecificCredential");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteServiceSpecificCredentialResult> responseHandler = new StaxResponseHandler<DeleteServiceSpecificCredentialResult>(
                    new DeleteServiceSpecificCredentialResultStaxUnmarshaller());
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
     * the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
     * to manage AWS account root user credentials even if the AWS account has no associated IAM users.
     * </p>
     * 
     * @param deleteSigningCertificateRequest
     * @return Result of the DeleteSigningCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteSigningCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSigningCertificateResult deleteSigningCertificate(DeleteSigningCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSigningCertificate(request);
    }

    @SdkInternalApi
    final DeleteSigningCertificateResult executeDeleteSigningCertificate(DeleteSigningCertificateRequest deleteSigningCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSigningCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * certificates, MFA devices enabled for AWS, or attached policies.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Deletes the permissions boundary for the specified IAM user.
     * </p>
     * <important>
     * <p>
     * Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all
     * the actions granted in its permissions policies.
     * </p>
     * </important>
     * 
     * @param deleteUserPermissionsBoundaryRequest
     * @return Result of the DeleteUserPermissionsBoundary operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUserPermissionsBoundary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteUserPermissionsBoundary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserPermissionsBoundaryResult deleteUserPermissionsBoundary(DeleteUserPermissionsBoundaryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserPermissionsBoundary(request);
    }

    @SdkInternalApi
    final DeleteUserPermissionsBoundaryResult executeDeleteUserPermissionsBoundary(DeleteUserPermissionsBoundaryRequest deleteUserPermissionsBoundaryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserPermissionsBoundaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPermissionsBoundaryRequest> request = null;
        Response<DeleteUserPermissionsBoundaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPermissionsBoundaryRequestMarshaller().marshall(super.beforeMarshalling(deleteUserPermissionsBoundaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserPermissionsBoundary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteUserPermissionsBoundaryResult> responseHandler = new StaxResponseHandler<DeleteUserPermissionsBoundaryResult>(
                    new DeleteUserPermissionsBoundaryResultStaxUnmarshaller());
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteUserPolicyRequest
     * @return Result of the DeleteUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUserPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteUserPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserPolicyResult deleteUserPolicy(DeleteUserPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserPolicy(request);
    }

    @SdkInternalApi
    final DeleteUserPolicyResult executeDeleteUserPolicy(DeleteUserPolicyRequest deleteUserPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteVirtualMFADevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteVirtualMFADevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVirtualMFADeviceResult deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVirtualMFADevice(request);
    }

    @SdkInternalApi
    final DeleteVirtualMFADeviceResult executeDeleteVirtualMFADevice(DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVirtualMFADevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachGroupPolicyRequest
     * @return Result of the DetachGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DetachGroupPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachGroupPolicyResult detachGroupPolicy(DetachGroupPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachGroupPolicy(request);
    }

    @SdkInternalApi
    final DetachGroupPolicyResult executeDetachGroupPolicy(DetachGroupPolicyRequest detachGroupPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachGroupPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachRolePolicyRequest
     * @return Result of the DetachRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachRolePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DetachRolePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachRolePolicyResult detachRolePolicy(DetachRolePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachRolePolicy(request);
    }

    @SdkInternalApi
    final DetachRolePolicyResult executeDetachRolePolicy(DetachRolePolicyRequest detachRolePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachRolePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachUserPolicyRequest
     * @return Result of the DetachUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachUserPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DetachUserPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachUserPolicyResult detachUserPolicy(DetachUserPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDetachUserPolicy(request);
    }

    @SdkInternalApi
    final DetachUserPolicyResult executeDetachUserPolicy(DetachUserPolicyRequest detachUserPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachUserPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.EnableMFADevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/EnableMFADevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableMFADeviceResult enableMFADevice(EnableMFADeviceRequest request) {
        request = beforeClientExecution(request);
        return executeEnableMFADevice(request);
    }

    @SdkInternalApi
    final EnableMFADeviceResult executeEnableMFADevice(EnableMFADeviceRequest enableMFADeviceRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableMFADevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GenerateCredentialReport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GenerateCredentialReportResult generateCredentialReport(GenerateCredentialReportRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateCredentialReport(request);
    }

    @SdkInternalApi
    final GenerateCredentialReportResult executeGenerateCredentialReport(GenerateCredentialReportRequest generateCredentialReportRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateCredentialReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Generates a request for a report that includes details about when an IAM resource (user, group, role, or policy)
     * was last used in an attempt to access AWS services. Recent activity usually appears within four hours. IAM
     * reports activity for the last 365 days, or less if your region began supporting this feature within the last
     * year. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a>.
     * </p>
     * <important>
     * <p>
     * The service last accessed data includes all attempts to access an AWS API, not just the successful ones. This
     * includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or
     * any of the command line tools. An unexpected entry in the service last accessed data does not mean that your
     * account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the
     * authoritative source for information about all API calls and whether they were successful or denied access. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html">Logging IAM Events with
     * CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important>
     * <p>
     * The <code>GenerateServiceLastAccessedDetails</code> operation returns a <code>JobId</code>. Use this parameter in
     * the following operations to retrieve the following details from your report:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetServiceLastAccessedDetails</a> – Use this operation for users, groups, roles, or policies to list every AWS
     * service that the resource could access using permissions policies. For each service, the response includes
     * information about the most recent access attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetServiceLastAccessedDetailsWithEntities</a> – Use this operation for groups and policies to list information
     * about the associated entities (users or roles) that attempted to access a specific AWS service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To check the status of the <code>GenerateServiceLastAccessedDetails</code> request, use the <code>JobId</code>
     * parameter in the same operations and test the <code>JobStatus</code> response parameter.
     * </p>
     * <p>
     * For additional information about the permissions policies that allow an identity (user, group, or role) to access
     * specific services, use the <a>ListPoliciesGrantingServiceAccess</a> operation.
     * </p>
     * <note>
     * <p>
     * Service last accessed data does not use other policy types when determining whether a resource could access a
     * service. These other policy types include resource-based policies, access control lists, AWS Organizations
     * policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic.
     * For more about the evaluation of policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For more information about service last accessed data, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html">Reducing Policy Scope
     * by Viewing User Activity</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param generateServiceLastAccessedDetailsRequest
     * @return Result of the GenerateServiceLastAccessedDetails operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GenerateServiceLastAccessedDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GenerateServiceLastAccessedDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GenerateServiceLastAccessedDetailsResult generateServiceLastAccessedDetails(GenerateServiceLastAccessedDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateServiceLastAccessedDetails(request);
    }

    @SdkInternalApi
    final GenerateServiceLastAccessedDetailsResult executeGenerateServiceLastAccessedDetails(
            GenerateServiceLastAccessedDetailsRequest generateServiceLastAccessedDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(generateServiceLastAccessedDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateServiceLastAccessedDetailsRequest> request = null;
        Response<GenerateServiceLastAccessedDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateServiceLastAccessedDetailsRequestMarshaller()
                        .marshall(super.beforeMarshalling(generateServiceLastAccessedDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateServiceLastAccessedDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GenerateServiceLastAccessedDetailsResult> responseHandler = new StaxResponseHandler<GenerateServiceLastAccessedDetailsResult>(
                    new GenerateServiceLastAccessedDetailsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.GetAccessKeyLastUsed
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccessKeyLastUsed" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccessKeyLastUsedResult getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessKeyLastUsed(request);
    }

    @SdkInternalApi
    final GetAccessKeyLastUsedResult executeGetAccessKeyLastUsed(GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessKeyLastUsed");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccountAuthorizationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountAuthorizationDetails(request);
    }

    @SdkInternalApi
    final GetAccountAuthorizationDetailsResult executeGetAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountAuthorizationDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html">Managing an IAM
     * Password Policy</a>.
     * </p>
     * 
     * @param getAccountPasswordPolicyRequest
     * @return Result of the GetAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountPasswordPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccountPasswordPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy(GetAccountPasswordPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountPasswordPolicy(request);
    }

    @SdkInternalApi
    final GetAccountPasswordPolicyResult executeGetAccountPasswordPolicy(GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountPasswordPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getAccountSummaryRequest
     * @return Result of the GetAccountSummary operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccountSummary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSummary(request);
    }

    @SdkInternalApi
    final GetAccountSummaryResult executeGetAccountSummary(GetAccountSummaryRequest getAccountSummaryRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use
     * <code>GetContextKeysForCustomPolicy</code> to understand what key names and values you must supply when you call
     * <a>SimulateCustomPolicy</a>. Note that all parameters are shown in unencoded form here for clarity but must be
     * URL encoded to be included as a part of a real HTML request.
     * </p>
     * 
     * @param getContextKeysForCustomPolicyRequest
     * @return Result of the GetContextKeysForCustomPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetContextKeysForCustomPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetContextKeysForCustomPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetContextKeysForCustomPolicy(request);
    }

    @SdkInternalApi
    final GetContextKeysForCustomPolicyResult executeGetContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContextKeysForCustomPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM
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
     * query request. Context keys can be evaluated by testing against a value in an IAM policy. Use
     * <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call
     * <a>SimulatePrincipalPolicy</a>.
     * </p>
     * 
     * @param getContextKeysForPrincipalPolicyRequest
     * @return Result of the GetContextKeysForPrincipalPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetContextKeysForPrincipalPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetContextKeysForPrincipalPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(GetContextKeysForPrincipalPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetContextKeysForPrincipalPolicy(request);
    }

    @SdkInternalApi
    final GetContextKeysForPrincipalPolicyResult executeGetContextKeysForPrincipalPolicy(
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContextKeysForPrincipalPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in
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
     *         expiration, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential
     *         Reports</a> in the <i>IAM User Guide</i>.
     * @throws CredentialReportNotReadyException
     *         The request was rejected because the credential report is still being generated.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetCredentialReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetCredentialReport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCredentialReportResult getCredentialReport(GetCredentialReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetCredentialReport(request);
    }

    @SdkInternalApi
    final GetCredentialReportResult executeGetCredentialReport(GetCredentialReportRequest getCredentialReportRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCredentialReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroup(request);
    }

    @SdkInternalApi
    final GetGroupResult executeGetGroup(GetGroupRequest getGroupRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getGroupPolicyRequest
     * @return Result of the GetGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetGroupPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroupPolicy(request);
    }

    @SdkInternalApi
    final GetGroupPolicyResult executeGetGroupPolicy(GetGroupPolicyRequest getGroupPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroupPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return Result of the GetInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetInstanceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceProfile(request);
    }

    @SdkInternalApi
    final GetInstanceProfileResult executeGetInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * a password, the operation returns a 404 (<code>NoSuchEntity</code>) error.
     * </p>
     * 
     * @param getLoginProfileRequest
     * @return Result of the GetLoginProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetLoginProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetLoginProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLoginProfileResult getLoginProfile(GetLoginProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetLoginProfile(request);
    }

    @SdkInternalApi
    final GetLoginProfileResult executeGetLoginProfile(GetLoginProfileRequest getLoginProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLoginProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetOpenIDConnectProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetOpenIDConnectProvider" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetOpenIDConnectProviderResult getOpenIDConnectProvider(GetOpenIDConnectProviderRequest request) {
        request = beforeClientExecution(request);
        return executeGetOpenIDConnectProvider(request);
    }

    @SdkInternalApi
    final GetOpenIDConnectProviderResult executeGetOpenIDConnectProvider(GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOpenIDConnectProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetPolicy" target="_top">AWS API
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
                request = new GetPolicyRequestMarshaller().marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyVersionRequest
     * @return Result of the GetPolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetPolicyVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicyVersion(request);
    }

    @SdkInternalApi
    final GetPolicyVersionResult executeGetPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRoleResult getRole(GetRoleRequest request) {
        request = beforeClientExecution(request);
        return executeGetRole(request);
    }

    @SdkInternalApi
    final GetRoleResult executeGetRole(GetRoleRequest getRoleRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * 
     * @param getRolePolicyRequest
     * @return Result of the GetRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetRolePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetRolePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRolePolicyResult getRolePolicy(GetRolePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetRolePolicy(request);
    }

    @SdkInternalApi
    final GetRolePolicyResult executeGetRolePolicy(GetRolePolicyRequest getRolePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRolePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * This operation requires <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param getSAMLProviderRequest
     * @return Result of the GetSAMLProvider operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetSAMLProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetSAMLProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest request) {
        request = beforeClientExecution(request);
        return executeGetSAMLProvider(request);
    }

    @SdkInternalApi
    final GetSAMLProviderResult executeGetSAMLProvider(GetSAMLProviderRequest getSAMLProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSAMLProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param getSSHPublicKeyRequest
     * @return Result of the GetSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws UnrecognizedPublicKeyEncodingException
     *         The request was rejected because the public key encoding format is unsupported or unrecognized.
     * @sample AmazonIdentityManagement.GetSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetSSHPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetSSHPublicKey(request);
    }

    @SdkInternalApi
    final GetSSHPublicKeyResult executeGetSSHPublicKey(GetSSHPublicKeyRequest getSSHPublicKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSSHPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For more information about working with server certificates, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>. This topic includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * 
     * @param getServerCertificateRequest
     * @return Result of the GetServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetServerCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServerCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServerCertificateResult getServerCertificate(GetServerCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetServerCertificate(request);
    }

    @SdkInternalApi
    final GetServerCertificateResult executeGetServerCertificate(GetServerCertificateRequest getServerCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServerCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * After you generate a user, group, role, or policy report using the
     * <code>GenerateServiceLastAccessedDetails</code> operation, you can use the <code>JobId</code> parameter in
     * <code>GetServiceLastAccessedDetails</code>. This operation retrieves the status of your report job and a list of
     * AWS services that the resource (user, group, role, or managed policy) can access.
     * </p>
     * <note>
     * <p>
     * Service last accessed data does not use other policy types when determining whether a resource could access a
     * service. These other policy types include resource-based policies, access control lists, AWS Organizations
     * policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic.
     * For more about the evaluation of policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For each service that the resource could access using permissions policies, the operation returns details about
     * the most recent access attempt. If there was no attempt, the service is listed without details about the most
     * recent attempt to access the service. If the operation fails, the <code>GetServiceLastAccessedDetails</code>
     * operation returns the reason that it failed.
     * </p>
     * <p>
     * The <code>GetServiceLastAccessedDetails</code> operation returns a list of services that includes the number of
     * entities that have attempted to access the service and the date and time of the last attempt. It also returns the
     * ARN of the following entity, depending on the resource ARN that you used to generate the report:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>User</b> – Returns the user ARN that you used to generate the report
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Group</b> – Returns the ARN of the group member (user) that last attempted to access the service
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Role</b> – Returns the role ARN that you used to generate the report
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Policy</b> – Returns the ARN of the user or role that last used the policy to attempt to access the service
     * </p>
     * </li>
     * </ul>
     * <p>
     * By default, the list is sorted by service namespace.
     * </p>
     * 
     * @param getServiceLastAccessedDetailsRequest
     * @return Result of the GetServiceLastAccessedDetails operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetServiceLastAccessedDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLastAccessedDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceLastAccessedDetailsResult getServiceLastAccessedDetails(GetServiceLastAccessedDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceLastAccessedDetails(request);
    }

    @SdkInternalApi
    final GetServiceLastAccessedDetailsResult executeGetServiceLastAccessedDetails(GetServiceLastAccessedDetailsRequest getServiceLastAccessedDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceLastAccessedDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceLastAccessedDetailsRequest> request = null;
        Response<GetServiceLastAccessedDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceLastAccessedDetailsRequestMarshaller().marshall(super.beforeMarshalling(getServiceLastAccessedDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceLastAccessedDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetServiceLastAccessedDetailsResult> responseHandler = new StaxResponseHandler<GetServiceLastAccessedDetailsResult>(
                    new GetServiceLastAccessedDetailsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * After you generate a group or policy report using the <code>GenerateServiceLastAccessedDetails</code> operation,
     * you can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetailsWithEntities</code>. This
     * operation retrieves the status of your report job and a list of entities that could have used group or policy
     * permissions to access the specified service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Group</b> – For a group report, this operation returns a list of users in the group that could have used the
     * group’s policies in an attempt to access the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Policy</b> – For a policy report, this operation returns a list of entities (users or roles) that could have
     * used the policy in an attempt to access the service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use this operation for user or role reports to retrieve details about those entities.
     * </p>
     * <p>
     * If the operation fails, the <code>GetServiceLastAccessedDetailsWithEntities</code> operation returns the reason
     * that it failed.
     * </p>
     * <p>
     * By default, the list of associated entities is sorted by date, with the most recent access listed first.
     * </p>
     * 
     * @param getServiceLastAccessedDetailsWithEntitiesRequest
     * @return Result of the GetServiceLastAccessedDetailsWithEntities operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetServiceLastAccessedDetailsWithEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLastAccessedDetailsWithEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceLastAccessedDetailsWithEntitiesResult getServiceLastAccessedDetailsWithEntities(GetServiceLastAccessedDetailsWithEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceLastAccessedDetailsWithEntities(request);
    }

    @SdkInternalApi
    final GetServiceLastAccessedDetailsWithEntitiesResult executeGetServiceLastAccessedDetailsWithEntities(
            GetServiceLastAccessedDetailsWithEntitiesRequest getServiceLastAccessedDetailsWithEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceLastAccessedDetailsWithEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceLastAccessedDetailsWithEntitiesRequest> request = null;
        Response<GetServiceLastAccessedDetailsWithEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceLastAccessedDetailsWithEntitiesRequestMarshaller().marshall(super
                        .beforeMarshalling(getServiceLastAccessedDetailsWithEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceLastAccessedDetailsWithEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetServiceLastAccessedDetailsWithEntitiesResult> responseHandler = new StaxResponseHandler<GetServiceLastAccessedDetailsWithEntitiesResult>(
                    new GetServiceLastAccessedDetailsWithEntitiesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status of your service-linked role deletion. After you use the <a>DeleteServiceLinkedRole</a> API
     * operation to submit a service-linked role for deletion, you can use the <code>DeletionTaskId</code> parameter in
     * <code>GetServiceLinkedRoleDeletionStatus</code> to check the status of the deletion. If the deletion fails, this
     * operation returns the reason that it failed, if that information is returned by the service.
     * </p>
     * 
     * @param getServiceLinkedRoleDeletionStatusRequest
     * @return Result of the GetServiceLinkedRoleDeletionStatus operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetServiceLinkedRoleDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetServiceLinkedRoleDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceLinkedRoleDeletionStatusResult getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceLinkedRoleDeletionStatus(request);
    }

    @SdkInternalApi
    final GetServiceLinkedRoleDeletionStatusResult executeGetServiceLinkedRoleDeletionStatus(
            GetServiceLinkedRoleDeletionStatusRequest getServiceLinkedRoleDeletionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceLinkedRoleDeletionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceLinkedRoleDeletionStatusRequest> request = null;
        Response<GetServiceLinkedRoleDeletionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceLinkedRoleDeletionStatusRequestMarshaller()
                        .marshall(super.beforeMarshalling(getServiceLinkedRoleDeletionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceLinkedRoleDeletionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetServiceLinkedRoleDeletionStatusResult> responseHandler = new StaxResponseHandler<GetServiceLinkedRoleDeletionStatusResult>(
                    new GetServiceLinkedRoleDeletionStatusResultStaxUnmarshaller());
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserResult getUser(GetUserRequest request) {
        request = beforeClientExecution(request);
        return executeGetUser(request);
    }

    @SdkInternalApi
    final GetUserResult executeGetUser(GetUserRequest getUserRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getUserPolicyRequest
     * @return Result of the GetUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetUserPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetUserPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserPolicyResult getUserPolicy(GetUserPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserPolicy(request);
    }

    @SdkInternalApi
    final GetUserPolicyResult executeGetUserPolicy(GetUserPolicyRequest getUserPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns information about the access key IDs associated with the specified IAM user. If there is none, the
     * operation returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS
     * access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
     * you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
     * users.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAccessKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListAccessKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccessKeysResult listAccessKeys(ListAccessKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessKeys(request);
    }

    @SdkInternalApi
    final ListAccessKeysResult executeListAccessKeys(ListAccessKeysRequest listAccessKeysRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * using an AWS account alias, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
     * ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listAccountAliasesRequest
     * @return Result of the ListAccountAliases operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAccountAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListAccountAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountAliases(request);
    }

    @SdkInternalApi
    final ListAccountAliasesResult executeListAccountAliases(ListAccountAliasesRequest listAccountAliasesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified group (or none that match the specified path prefix), the
     * operation returns an empty list.
     * </p>
     * 
     * @param listAttachedGroupPoliciesRequest
     * @return Result of the ListAttachedGroupPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedGroupPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListAttachedGroupPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAttachedGroupPoliciesResult listAttachedGroupPolicies(ListAttachedGroupPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachedGroupPolicies(request);
    }

    @SdkInternalApi
    final ListAttachedGroupPoliciesResult executeListAttachedGroupPolicies(ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachedGroupPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified role (or none that match the specified path prefix), the
     * operation returns an empty list.
     * </p>
     * 
     * @param listAttachedRolePoliciesRequest
     * @return Result of the ListAttachedRolePolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedRolePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListAttachedRolePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAttachedRolePoliciesResult listAttachedRolePolicies(ListAttachedRolePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachedRolePolicies(request);
    }

    @SdkInternalApi
    final ListAttachedRolePoliciesResult executeListAttachedRolePolicies(ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachedRolePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified group (or none that match the specified path prefix), the
     * operation returns an empty list.
     * </p>
     * 
     * @param listAttachedUserPoliciesRequest
     * @return Result of the ListAttachedUserPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedUserPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListAttachedUserPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAttachedUserPoliciesResult listAttachedUserPolicies(ListAttachedUserPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachedUserPolicies(request);
    }

    @SdkInternalApi
    final ListAttachedUserPoliciesResult executeListAttachedUserPolicies(ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachedUserPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListEntitiesForPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListEntitiesForPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEntitiesForPolicyResult listEntitiesForPolicy(ListEntitiesForPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeListEntitiesForPolicy(request);
    }

    @SdkInternalApi
    final ListEntitiesForPolicyResult executeListEntitiesForPolicy(ListEntitiesForPolicyRequest listEntitiesForPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEntitiesForPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified group, the operation returns an empty list.
     * </p>
     * 
     * @param listGroupPoliciesRequest
     * @return Result of the ListGroupPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroupPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListGroupPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupPolicies(request);
    }

    @SdkInternalApi
    final ListGroupPoliciesResult executeListGroupPolicies(ListGroupPoliciesRequest listGroupPoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroupsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListGroupsForUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupsForUser(request);
    }

    @SdkInternalApi
    final ListGroupsForUserResult executeListGroupsForUser(ListGroupsForUserRequest listGroupsForUserRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupsForUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an
     * empty list. For more information about instance profiles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListInstanceProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceProfiles(request);
    }

    @SdkInternalApi
    final ListInstanceProfilesResult executeListInstanceProfiles(ListInstanceProfilesRequest listInstanceProfilesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns
     * an empty list. For more information about instance profiles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesForRoleRequest
     * @return Result of the ListInstanceProfilesForRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListInstanceProfilesForRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListInstanceProfilesForRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstanceProfilesForRoleResult listInstanceProfilesForRole(ListInstanceProfilesForRoleRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceProfilesForRole(request);
    }

    @SdkInternalApi
    final ListInstanceProfilesForRoleResult executeListInstanceProfilesForRole(ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceProfilesForRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListMFADevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListMFADevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMFADevicesResult listMFADevices(ListMFADevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListMFADevices(request);
    }

    @SdkInternalApi
    final ListMFADevicesResult executeListMFADevices(ListMFADevicesRequest listMFADevicesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMFADevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListOpenIDConnectProviders" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders(ListOpenIDConnectProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListOpenIDConnectProviders(request);
    }

    @SdkInternalApi
    final ListOpenIDConnectProvidersResult executeListOpenIDConnectProviders(ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOpenIDConnectProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicies(request);
    }

    @SdkInternalApi
    final ListPoliciesResult executeListPolicies(ListPoliciesRequest listPoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified
     * service.
     * </p>
     * <note>
     * <p>
     * This operation does not use other policy types when determining whether a resource could access a service. These
     * other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM
     * permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more
     * about the evaluation of policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * The list of policies returned by the operation depends on the ARN of the identity that you provide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>User</b> – The list of policies includes the managed and inline policies that are attached to the user
     * directly. The list also includes any additional managed and inline policies that are attached to the group to
     * which the user belongs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Group</b> – The list of policies includes only the managed and inline policies that are attached to the group
     * directly. Policies that are attached to the group’s user are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Role</b> – The list of policies includes only the managed and inline policies that are attached to the role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the
     * policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information
     * about these policy types, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed
     * policy is currently used to set the permissions boundary for a user or role, use the <a>GetUser</a> or
     * <a>GetRole</a> operations.
     * </p>
     * 
     * @param listPoliciesGrantingServiceAccessRequest
     * @return Result of the ListPoliciesGrantingServiceAccess operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.ListPoliciesGrantingServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListPoliciesGrantingServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPoliciesGrantingServiceAccessResult listPoliciesGrantingServiceAccess(ListPoliciesGrantingServiceAccessRequest request) {
        request = beforeClientExecution(request);
        return executeListPoliciesGrantingServiceAccess(request);
    }

    @SdkInternalApi
    final ListPoliciesGrantingServiceAccessResult executeListPoliciesGrantingServiceAccess(
            ListPoliciesGrantingServiceAccessRequest listPoliciesGrantingServiceAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoliciesGrantingServiceAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesGrantingServiceAccessRequest> request = null;
        Response<ListPoliciesGrantingServiceAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesGrantingServiceAccessRequestMarshaller().marshall(super.beforeMarshalling(listPoliciesGrantingServiceAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPoliciesGrantingServiceAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPoliciesGrantingServiceAccessResult> responseHandler = new StaxResponseHandler<ListPoliciesGrantingServiceAccessResult>(
                    new ListPoliciesGrantingServiceAccessResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about the versions of the specified managed policy, including the version that is currently set
     * as the policy's default version.
     * </p>
     * <p>
     * For more information about managed policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     * @return Result of the ListPolicyVersions operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListPolicyVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicyVersions(request);
    }

    @SdkInternalApi
    final ListPolicyVersionsResult executeListPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicyVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified role, the operation returns an empty list.
     * </p>
     * 
     * @param listRolePoliciesRequest
     * @return Result of the ListRolePolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListRolePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListRolePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListRolePolicies(request);
    }

    @SdkInternalApi
    final ListRolePoliciesResult executeListRolePolicies(ListRolePoliciesRequest listRolePoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRolePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more
     * information about tagging, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging
     * IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listRoleTagsRequest
     * @return Result of the ListRoleTags operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListRoleTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListRoleTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRoleTagsResult listRoleTags(ListRoleTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListRoleTags(request);
    }

    @SdkInternalApi
    final ListRoleTagsResult executeListRoleTags(ListRoleTagsRequest listRoleTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoleTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoleTagsRequest> request = null;
        Response<ListRoleTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoleTagsRequestMarshaller().marshall(super.beforeMarshalling(listRoleTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoleTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListRoleTagsResult> responseHandler = new StaxResponseHandler<ListRoleTagsResult>(new ListRoleTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list.
     * For more information about roles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListRoles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRolesResult listRoles(ListRolesRequest request) {
        request = beforeClientExecution(request);
        return executeListRoles(request);
    }

    @SdkInternalApi
    final ListRolesResult executeListRoles(ListRolesRequest listRolesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * This operation requires <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param listSAMLProvidersRequest
     * @return Result of the ListSAMLProviders operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListSAMLProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListSAMLProviders" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSAMLProvidersResult listSAMLProviders(ListSAMLProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListSAMLProviders(request);
    }

    @SdkInternalApi
    final ListSAMLProvidersResult executeListSAMLProviders(ListSAMLProvidersRequest listSAMLProvidersRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSAMLProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns information about the SSH public keys associated with the specified IAM user. If there none exists, the
     * operation returns an empty list.
     * </p>
     * <p>
     * The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.ListSSHPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListSSHPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys(ListSSHPublicKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListSSHPublicKeys(request);
    }

    @SdkInternalApi
    final ListSSHPublicKeysResult executeListSSHPublicKeys(ListSSHPublicKeysRequest listSSHPublicKeysRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSSHPublicKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation
     * returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of AWS services that can use the
     * server certificates that you manage with IAM.
     * </p>
     * 
     * @param listServerCertificatesRequest
     * @return Result of the ListServerCertificates operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListServerCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListServerCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListServerCertificatesResult listServerCertificates(ListServerCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListServerCertificates(request);
    }

    @SdkInternalApi
    final ListServerCertificatesResult executeListServerCertificates(ListServerCertificatesRequest listServerCertificatesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServerCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Returns information about the service-specific credentials associated with the specified IAM user. If none
     * exists, the operation returns an empty list. The service-specific credentials returned by this operation are used
     * only for authenticating the IAM user to a specific service. For more information about using service-specific
     * credentials to authenticate to an AWS service, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html">Set Up service-specific
     * credentials</a> in the AWS CodeCommit User Guide.
     * </p>
     * 
     * @param listServiceSpecificCredentialsRequest
     * @return Result of the ListServiceSpecificCredentials operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceNotSupportedException
     *         The specified service does not support service-specific credentials.
     * @sample AmazonIdentityManagement.ListServiceSpecificCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListServiceSpecificCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceSpecificCredentialsResult listServiceSpecificCredentials(ListServiceSpecificCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceSpecificCredentials(request);
    }

    @SdkInternalApi
    final ListServiceSpecificCredentialsResult executeListServiceSpecificCredentials(ListServiceSpecificCredentialsRequest listServiceSpecificCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceSpecificCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceSpecificCredentialsRequest> request = null;
        Response<ListServiceSpecificCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceSpecificCredentialsRequestMarshaller().marshall(super.beforeMarshalling(listServiceSpecificCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceSpecificCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListServiceSpecificCredentialsResult> responseHandler = new StaxResponseHandler<ListServiceSpecificCredentialsResult>(
                    new ListServiceSpecificCredentialsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the signing certificates associated with the specified IAM user. If there none exists,
     * the operation returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing certificates, you can still paginate the results using
     * the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS
     * access key ID used to sign the request for this API. This operation works for access keys under the AWS account.
     * Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has
     * no associated users.
     * </p>
     * 
     * @param listSigningCertificatesRequest
     * @return Result of the ListSigningCertificates operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListSigningCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListSigningCertificates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSigningCertificatesResult listSigningCertificates(ListSigningCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListSigningCertificates(request);
    }

    @SdkInternalApi
    final ListSigningCertificatesResult executeListSigningCertificates(ListSigningCertificatesRequest listSigningCertificatesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSigningCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified user, the operation returns an empty list.
     * </p>
     * 
     * @param listUserPoliciesRequest
     * @return Result of the ListUserPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListUserPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListUserPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListUserPolicies(request);
    }

    @SdkInternalApi
    final ListUserPoliciesResult executeListUserPolicies(ListUserPoliciesRequest listUserPoliciesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more
     * information about tagging, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging
     * IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listUserTagsRequest
     * @return Result of the ListUserTags operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListUserTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListUserTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUserTagsResult listUserTags(ListUserTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserTags(request);
    }

    @SdkInternalApi
    final ListUserTagsResult executeListUserTags(ListUserTagsRequest listUserTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserTagsRequest> request = null;
        Response<ListUserTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserTagsRequestMarshaller().marshall(super.beforeMarshalling(listUserTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListUserTagsResult> responseHandler = new StaxResponseHandler<ListUserTagsResult>(new ListUserTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns
     * all users in the AWS account. If there are none, the operation returns an empty list.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListUsers(request);
    }

    @SdkInternalApi
    final ListUsersResult executeListUsers(ListUsersRequest listUsersRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listVirtualMFADevicesRequest
     * @return Result of the ListVirtualMFADevices operation returned by the service.
     * @sample AmazonIdentityManagement.ListVirtualMFADevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListVirtualMFADevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices(ListVirtualMFADevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListVirtualMFADevices(request);
    }

    @SdkInternalApi
    final ListVirtualMFADevicesResult executeListVirtualMFADevices(ListVirtualMFADevicesRequest listVirtualMFADevicesRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVirtualMFADevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed
     * Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed in a group, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutGroupPolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutGroupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutGroupPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutGroupPolicyResult putGroupPolicy(PutGroupPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutGroupPolicy(request);
    }

    @SdkInternalApi
    final PutGroupPolicyResult executePutGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutGroupPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed
     * policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum
     * permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the
     * permissions for the role.
     * </p>
     * <p>
     * You cannot set the boundary for a service-linked role.
     * </p>
     * <important>
     * <p>
     * Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to
     * the role. To learn how the effective permissions for a role are evaluated, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html">IAM JSON Policy
     * Evaluation Logic</a> in the IAM User Guide.
     * </p>
     * </important>
     * 
     * @param putRolePermissionsBoundaryRequest
     * @return Result of the PutRolePermissionsBoundary operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws PolicyNotAttachableException
     *         The request failed because AWS service role policies can only be attached to the service-linked role for
     *         that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutRolePermissionsBoundary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutRolePermissionsBoundary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutRolePermissionsBoundaryResult putRolePermissionsBoundary(PutRolePermissionsBoundaryRequest request) {
        request = beforeClientExecution(request);
        return executePutRolePermissionsBoundary(request);
    }

    @SdkInternalApi
    final PutRolePermissionsBoundaryResult executePutRolePermissionsBoundary(PutRolePermissionsBoundaryRequest putRolePermissionsBoundaryRequest) {

        ExecutionContext executionContext = createExecutionContext(putRolePermissionsBoundaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRolePermissionsBoundaryRequest> request = null;
        Response<PutRolePermissionsBoundaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRolePermissionsBoundaryRequestMarshaller().marshall(super.beforeMarshalling(putRolePermissionsBoundaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRolePermissionsBoundary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutRolePermissionsBoundaryResult> responseHandler = new StaxResponseHandler<PutRolePermissionsBoundaryResult>(
                    new PutRolePermissionsBoundaryResultStaxUnmarshaller());
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a managed policy to a role, use
     * <a>AttachRolePolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about policies,
     * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed with a role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutRolePolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutRolePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutRolePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRolePolicyResult putRolePolicy(PutRolePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutRolePolicy(request);
    }

    @SdkInternalApi
    final PutRolePolicyResult executePutRolePolicy(PutRolePolicyRequest putRolePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRolePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed
     * policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum
     * permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the
     * permissions for the user.
     * </p>
     * <important>
     * <p>
     * Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions
     * policy to the user. To learn how the effective permissions for a user are evaluated, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html">IAM JSON Policy
     * Evaluation Logic</a> in the IAM User Guide.
     * </p>
     * </important>
     * 
     * @param putUserPermissionsBoundaryRequest
     * @return Result of the PutUserPermissionsBoundary operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyNotAttachableException
     *         The request failed because AWS service role policies can only be attached to the service-linked role for
     *         that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutUserPermissionsBoundary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutUserPermissionsBoundary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutUserPermissionsBoundaryResult putUserPermissionsBoundary(PutUserPermissionsBoundaryRequest request) {
        request = beforeClientExecution(request);
        return executePutUserPermissionsBoundary(request);
    }

    @SdkInternalApi
    final PutUserPermissionsBoundaryResult executePutUserPermissionsBoundary(PutUserPermissionsBoundaryRequest putUserPermissionsBoundaryRequest) {

        ExecutionContext executionContext = createExecutionContext(putUserPermissionsBoundaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutUserPermissionsBoundaryRequest> request = null;
        Response<PutUserPermissionsBoundaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutUserPermissionsBoundaryRequestMarshaller().marshall(super.beforeMarshalling(putUserPermissionsBoundaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutUserPermissionsBoundary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutUserPermissionsBoundaryResult> responseHandler = new StaxResponseHandler<PutUserPermissionsBoundaryResult>(
                    new PutUserPermissionsBoundaryResultStaxUnmarshaller());
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
     * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed in a user, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM
     * Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutUserPolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutUserPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutUserPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutUserPolicyResult putUserPolicy(PutUserPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutUserPolicy(request);
    }

    @SdkInternalApi
    final PutUserPolicyResult executePutUserPolicy(PutUserPolicyRequest putUserPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutUserPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not
     * exist.
     * </p>
     * 
     * @param removeClientIDFromOpenIDConnectProviderRequest
     * @return Result of the RemoveClientIDFromOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveClientIDFromOpenIDConnectProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/RemoveClientIDFromOpenIDConnectProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveClientIDFromOpenIDConnectProviderResult removeClientIDFromOpenIDConnectProvider(RemoveClientIDFromOpenIDConnectProviderRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveClientIDFromOpenIDConnectProvider(request);
    }

    @SdkInternalApi
    final RemoveClientIDFromOpenIDConnectProviderResult executeRemoveClientIDFromOpenIDConnectProvider(
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveClientIDFromOpenIDConnectProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the
     * instance profile. Removing a role from an instance profile that is associated with a running instance might break
     * any applications running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about IAM roles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For more
     * information about instance profiles, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param removeRoleFromInstanceProfileRequest
     * @return Result of the RemoveRoleFromInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveRoleFromInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/RemoveRoleFromInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveRoleFromInstanceProfileResult removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveRoleFromInstanceProfile(request);
    }

    @SdkInternalApi
    final RemoveRoleFromInstanceProfileResult executeRemoveRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveRoleFromInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveUserFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/RemoveUserFromGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveUserFromGroupResult removeUserFromGroup(RemoveUserFromGroupRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveUserFromGroup(request);
    }

    @SdkInternalApi
    final RemoveUserFromGroupResult executeRemoveUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveUserFromGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically
     * strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password
     * associated with this user.
     * </p>
     * 
     * @param resetServiceSpecificCredentialRequest
     * @return Result of the ResetServiceSpecificCredential operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.ResetServiceSpecificCredential
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ResetServiceSpecificCredential"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetServiceSpecificCredentialResult resetServiceSpecificCredential(ResetServiceSpecificCredentialRequest request) {
        request = beforeClientExecution(request);
        return executeResetServiceSpecificCredential(request);
    }

    @SdkInternalApi
    final ResetServiceSpecificCredentialResult executeResetServiceSpecificCredential(ResetServiceSpecificCredentialRequest resetServiceSpecificCredentialRequest) {

        ExecutionContext executionContext = createExecutionContext(resetServiceSpecificCredentialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetServiceSpecificCredentialRequest> request = null;
        Response<ResetServiceSpecificCredentialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetServiceSpecificCredentialRequestMarshaller().marshall(super.beforeMarshalling(resetServiceSpecificCredentialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetServiceSpecificCredential");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResetServiceSpecificCredentialResult> responseHandler = new StaxResponseHandler<ResetServiceSpecificCredentialResult>(
                    new ResetServiceSpecificCredentialResultStaxUnmarshaller());
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual MFA Device</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param resyncMFADeviceRequest
     * @return Result of the ResyncMFADevice operation returned by the service.
     * @throws InvalidAuthenticationCodeException
     *         The request was rejected because the authentication code was not recognized. The error message describes
     *         the specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ResyncMFADevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ResyncMFADevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResyncMFADeviceResult resyncMFADevice(ResyncMFADeviceRequest request) {
        request = beforeClientExecution(request);
        return executeResyncMFADevice(request);
    }

    @SdkInternalApi
    final ResyncMFADeviceResult executeResyncMFADevice(ResyncMFADeviceRequest resyncMFADeviceRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResyncMFADevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups,
     * and roles that the policy is attached to, use the <a>ListEntitiesForPolicy</a> API.
     * </p>
     * <p>
     * For information about managed policies, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     * @return Result of the SetDefaultPolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.SetDefaultPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SetDefaultPolicyVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetDefaultPolicyVersionResult setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeSetDefaultPolicyVersion(request);
    }

    @SdkInternalApi
    final SetDefaultPolicyVersionResult executeSetDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDefaultPolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and
     * AWS resources to determine the policies' effective permissions. The policies are provided as strings.
     * </p>
     * <p>
     * The simulation does not perform the API operations; it only checks the authorization to determine if the
     * simulated policies allow or deny the operations.
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
     *         The request failed because a provided policy could not be successfully evaluated. An additional detailed
     *         message indicates the source of the failure.
     * @sample AmazonIdentityManagement.SimulateCustomPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SimulateCustomPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SimulateCustomPolicyResult simulateCustomPolicy(SimulateCustomPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeSimulateCustomPolicy(request);
    }

    @SdkInternalApi
    final SimulateCustomPolicyResult executeSimulateCustomPolicy(SimulateCustomPolicyRequest simulateCustomPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SimulateCustomPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS
     * resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you
     * specify a user, then the simulation also includes all of the policies that are attached to groups that the user
     * belongs to.
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
     * The simulation does not perform the API operations, it only checks the authorization to determine if the
     * simulated policies allow or deny the operations.
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyEvaluationException
     *         The request failed because a provided policy could not be successfully evaluated. An additional detailed
     *         message indicates the source of the failure.
     * @sample AmazonIdentityManagement.SimulatePrincipalPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SimulatePrincipalPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SimulatePrincipalPolicyResult simulatePrincipalPolicy(SimulatePrincipalPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeSimulatePrincipalPolicy(request);
    }

    @SdkInternalApi
    final SimulatePrincipalPolicyResult executeSimulatePrincipalPolicy(SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SimulatePrincipalPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the
     * same key name already exists, then that tag is overwritten with the new value.
     * </p>
     * <p>
     * A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For
     * example, you could search for all resources with the key name <i>Project</i> and the value
     * <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value
     * <i>41200</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Access control</b> - Reference tags in IAM user-based and resource-based policies. You can use tags to
     * restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to
     * only those resources that have a certain tag attached. For examples of policies that show how to use tags to
     * control access, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Control Access
     * Using IAM Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which AWS resources.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either
     * case, the entire request fails and <i>no</i> tags are added to the role.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store
     * comma-separated values in the string. However, you must interpret the value in your code.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param tagRoleRequest
     * @return Result of the TagRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.TagRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/TagRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagRoleResult tagRole(TagRoleRequest request) {
        request = beforeClientExecution(request);
        return executeTagRole(request);
    }

    @SdkInternalApi
    final TagRoleResult executeTagRole(TagRoleRequest tagRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(tagRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagRoleRequest> request = null;
        Response<TagRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagRoleRequestMarshaller().marshall(super.beforeMarshalling(tagRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TagRoleResult> responseHandler = new StaxResponseHandler<TagRoleResult>(new TagRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is
     * overwritten with the new value.
     * </p>
     * <p>
     * A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For
     * example, you could search for all resources with the key name <i>Project</i> and the value
     * <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value
     * <i>41200</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Access control</b> - Reference tags in IAM user-based and resource-based policies. You can use tags to
     * restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also
     * restrict access to only those resources that have a certain tag attached. For examples of policies that show how
     * to use tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Control Access Using IAM Tags</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Cost allocation</b> - Use tags to help track which individuals and teams are using which AWS resources.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either
     * case, the entire request fails and <i>no</i> tags are added to the role.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store
     * comma-separated values in the string. However, you must interpret the value in your code.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param tagUserRequest
     * @return Result of the TagUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.TagUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/TagUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagUserResult tagUser(TagUserRequest request) {
        request = beforeClientExecution(request);
        return executeTagUser(request);
    }

    @SdkInternalApi
    final TagUserResult executeTagUser(TagUserRequest tagUserRequest) {

        ExecutionContext executionContext = createExecutionContext(tagUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagUserRequest> request = null;
        Response<TagUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagUserRequestMarshaller().marshall(super.beforeMarshalling(tagUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TagUserResult> responseHandler = new StaxResponseHandler<TagUserResult>(new TagUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the role. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param untagRoleRequest
     * @return Result of the UntagRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UntagRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UntagRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagRoleResult untagRole(UntagRoleRequest request) {
        request = beforeClientExecution(request);
        return executeUntagRole(request);
    }

    @SdkInternalApi
    final UntagRoleResult executeUntagRole(UntagRoleRequest untagRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(untagRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagRoleRequest> request = null;
        Response<UntagRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagRoleRequestMarshaller().marshall(super.beforeMarshalling(untagRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UntagRoleResult> responseHandler = new StaxResponseHandler<UntagRoleResult>(new UntagRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the user. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param untagUserRequest
     * @return Result of the UntagUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UntagUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UntagUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagUserResult untagUser(UntagUserRequest request) {
        request = beforeClientExecution(request);
        return executeUntagUser(request);
    }

    @SdkInternalApi
    final UntagUserResult executeUntagUser(UntagUserRequest untagUserRequest) {

        ExecutionContext executionContext = createExecutionContext(untagUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagUserRequest> request = null;
        Response<UntagUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagUserRequestMarshaller().marshall(super.beforeMarshalling(untagUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UntagUserResult> responseHandler = new StaxResponseHandler<UntagUserResult>(new UntagUserResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used
     * to disable a user's key as part of a key rotation workflow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS
     * access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
     * you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
     * users.
     * </p>
     * <p>
     * For information about rotating keys, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html">Managing Keys and
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccessKeyRequest
     * @return Result of the UpdateAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateAccessKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAccessKeyResult updateAccessKey(UpdateAccessKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccessKey(request);
    }

    @SdkInternalApi
    final UpdateAccessKeyResult executeUpdateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccessKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <ul>
     * <li>
     * <p>
     * This operation does not support partial updates. No parameters are required, but if you do not specify a
     * parameter, that parameter's value reverts to its default value. See the <b>Request Parameters</b> section for
     * each parameter's default value. Also note that some parameters do not allow the default parameter to be
     * explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the
     * operation.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about using a password policy, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html">Managing an IAM
     * Password Policy</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccountPasswordPolicyRequest
     * @return Result of the UpdateAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAccountPasswordPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateAccountPasswordPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountPasswordPolicyResult updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountPasswordPolicy(request);
    }

    @SdkInternalApi
    final UpdateAccountPasswordPolicyResult executeUpdateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountPasswordPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * 
     * @param updateAssumeRolePolicyRequest
     * @return Result of the UpdateAssumeRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAssumeRolePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateAssumeRolePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAssumeRolePolicyResult updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssumeRolePolicy(request);
    }

    @SdkInternalApi
    final UpdateAssumeRolePolicyResult executeUpdateAssumeRolePolicy(UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssumeRolePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html">Renaming Users and
     * Groups</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * The person making the request (the principal), must have permission to change the role group with the old name
     * and the new name. For example, to change the group named <code>Managers</code> to <code>MGRs</code>, the
     * principal must have a policy that allows them to update both groups. If the principal has permission to update
     * the <code>Managers</code> group, but not the <code>MGRs</code> group, then the update fails. For more information
     * about permissions, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     * Management</a>.
     * </p>
     * </note>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroup(request);
    }

    @SdkInternalApi
    final UpdateGroupResult executeUpdateGroup(UpdateGroupRequest updateGroupRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * passwords, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateLoginProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateLoginProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLoginProfileResult updateLoginProfile(UpdateLoginProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLoginProfile(request);
    }

    @SdkInternalApi
    final UpdateLoginProfileResult executeUpdateLoginProfile(UpdateLoginProfileRequest updateLoginProfileRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLoginProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are
     * not merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs
     * rarely. However, if the provider's certificate <i>does</i> change, any attempt to assume an IAM role that
     * specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.
     * </p>
     * <note>
     * <p>
     * Trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint.
     * Therefore, it is best to limit access to the <code>UpdateOpenIDConnectProviderThumbprint</code> operation to
     * highly privileged users.
     * </p>
     * </note>
     * 
     * @param updateOpenIDConnectProviderThumbprintRequest
     * @return Result of the UpdateOpenIDConnectProviderThumbprint operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateOpenIDConnectProviderThumbprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateOpenIDConnectProviderThumbprint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOpenIDConnectProviderThumbprintResult updateOpenIDConnectProviderThumbprint(UpdateOpenIDConnectProviderThumbprintRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOpenIDConnectProviderThumbprint(request);
    }

    @SdkInternalApi
    final UpdateOpenIDConnectProviderThumbprintResult executeUpdateOpenIDConnectProviderThumbprint(
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOpenIDConnectProviderThumbprint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Updates the description or maximum session duration setting of a role.
     * </p>
     * 
     * @param updateRoleRequest
     * @return Result of the UpdateRole operation returned by the service.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRoleResult updateRole(UpdateRoleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRole(request);
    }

    @SdkInternalApi
    final UpdateRoleResult executeUpdateRole(UpdateRoleRequest updateRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoleRequest> request = null;
        Response<UpdateRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoleRequestMarshaller().marshall(super.beforeMarshalling(updateRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateRoleResult> responseHandler = new StaxResponseHandler<UpdateRoleResult>(new UpdateRoleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use <a>UpdateRole</a> instead.
     * </p>
     * <p>
     * Modifies only the description of a role. This operation performs the same function as the
     * <code>Description</code> parameter in the <code>UpdateRole</code> operation.
     * </p>
     * 
     * @param updateRoleDescriptionRequest
     * @return Result of the UpdateRoleDescription operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws UnmodifiableEntityException
     *         The request was rejected because only the service that depends on the service-linked role can modify or
     *         delete the role on your behalf. The error message includes the name of the service that depends on this
     *         service-linked role. You must request the change through that service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateRoleDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateRoleDescription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRoleDescriptionResult updateRoleDescription(UpdateRoleDescriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoleDescription(request);
    }

    @SdkInternalApi
    final UpdateRoleDescriptionResult executeUpdateRoleDescription(UpdateRoleDescriptionRequest updateRoleDescriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoleDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoleDescriptionRequest> request = null;
        Response<UpdateRoleDescriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoleDescriptionRequestMarshaller().marshall(super.beforeMarshalling(updateRoleDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoleDescription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateRoleDescriptionResult> responseHandler = new StaxResponseHandler<UpdateRoleDescriptionResult>(
                    new UpdateRoleDescriptionResultStaxUnmarshaller());
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
     * This operation requires <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param updateSAMLProviderRequest
     * @return Result of the UpdateSAMLProvider operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateSAMLProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateSAMLProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSAMLProviderResult updateSAMLProvider(UpdateSAMLProviderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSAMLProvider(request);
    }

    @SdkInternalApi
    final UpdateSAMLProviderResult executeUpdateSAMLProvider(UpdateSAMLProviderRequest updateSAMLProviderRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSAMLProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * be used for authentication. This operation can be used to disable a user's SSH public key as part of a key
     * rotation work flow.
     * </p>
     * <p>
     * The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param updateSSHPublicKeyRequest
     * @return Result of the UpdateSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.UpdateSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateSSHPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSSHPublicKeyResult updateSSHPublicKey(UpdateSSHPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSSHPublicKey(request);
    }

    @SdkInternalApi
    final UpdateSSHPublicKeyResult executeUpdateSSHPublicKey(UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSSHPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * For more information about working with server certificates, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of AWS services that can use the
     * server certificates that you manage with IAM.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a server certificate's path or name. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
     * >Renaming a Server Certificate</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * The person making the request (the principal), must have permission to change the server certificate with the old
     * name and the new name. For example, to change the certificate named <code>ProductionCert</code> to
     * <code>ProdCert</code>, the principal must have a policy that allows them to update both certificates. If the
     * principal has permission to update the <code>ProductionCert</code> group, but not the <code>ProdCert</code>
     * certificate, then the update fails. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access Management</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServerCertificateRequest
     * @return Result of the UpdateServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateServerCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateServerCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateServerCertificateResult updateServerCertificate(UpdateServerCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServerCertificate(request);
    }

    @SdkInternalApi
    final UpdateServerCertificateResult executeUpdateServerCertificate(UpdateServerCertificateRequest updateServerCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServerCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Sets the status of a service-specific credential to <code>Active</code> or <code>Inactive</code>.
     * Service-specific credentials that are inactive cannot be used for authentication to the service. This operation
     * can be used to disable a user's service-specific credential as part of a credential rotation work flow.
     * </p>
     * 
     * @param updateServiceSpecificCredentialRequest
     * @return Result of the UpdateServiceSpecificCredential operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @sample AmazonIdentityManagement.UpdateServiceSpecificCredential
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateServiceSpecificCredential"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceSpecificCredentialResult updateServiceSpecificCredential(UpdateServiceSpecificCredentialRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceSpecificCredential(request);
    }

    @SdkInternalApi
    final UpdateServiceSpecificCredentialResult executeUpdateServiceSpecificCredential(
            UpdateServiceSpecificCredentialRequest updateServiceSpecificCredentialRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceSpecificCredentialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceSpecificCredentialRequest> request = null;
        Response<UpdateServiceSpecificCredentialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceSpecificCredentialRequestMarshaller().marshall(super.beforeMarshalling(updateServiceSpecificCredentialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceSpecificCredential");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateServiceSpecificCredentialResult> responseHandler = new StaxResponseHandler<UpdateServiceSpecificCredentialResult>(
                    new UpdateServiceSpecificCredentialResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This
     * operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS
     * access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
     * you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
     * users.
     * </p>
     * 
     * @param updateSigningCertificateRequest
     * @return Result of the UpdateSigningCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateSigningCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSigningCertificateResult updateSigningCertificate(UpdateSigningCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSigningCertificate(request);
    }

    @SdkInternalApi
    final UpdateSigningCertificateResult executeUpdateSigningCertificate(UpdateSigningCertificateRequest updateSigningCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSigningCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming">Renaming an IAM
     * User</a> and <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html">Renaming an
     * IAM Group</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change a user name, the requester must have appropriate permissions on both the source object and the target
     * object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and
     * Robert, or must have permission on all (*). For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html">Permissions and Policies</a>.
     * </p>
     * </note>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws ConcurrentModificationException
     *         The request was rejected because multiple requests to change this object were submitted simultaneously.
     *         Wait a few minutes and submit your request again.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an
     * AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param uploadSSHPublicKeyRequest
     * @return Result of the UploadSSHPublicKey operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws InvalidPublicKeyException
     *         The request was rejected because the public key is malformed or otherwise invalid.
     * @throws DuplicateSSHPublicKeyException
     *         The request was rejected because the SSH public key is already associated with the specified IAM user.
     * @throws UnrecognizedPublicKeyEncodingException
     *         The request was rejected because the public key encoding format is unsupported or unrecognized.
     * @sample AmazonIdentityManagement.UploadSSHPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadSSHPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UploadSSHPublicKeyResult uploadSSHPublicKey(UploadSSHPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUploadSSHPublicKey(request);
    }

    @SdkInternalApi
    final UploadSSHPublicKeyResult executeUploadSSHPublicKey(UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadSSHPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * We recommend that you use <a href="https://docs.aws.amazon.com/certificate-manager/">AWS Certificate Manager</a>
     * to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to
     * AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more
     * information about using ACM, see the <a href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate
     * Manager User Guide</a>.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>. This topic includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * <p>
     * For information about the number of server certificates you can upload, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html">Limitations on IAM Entities and
     * Objects</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because the body of the public key certificate, private key, and the certificate chain can be large, you should
     * use POST rather than GET when calling <code>UploadServerCertificate</code>. For information about setting up
     * signatures and authorization through the API, go to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a>
     * in the <i>AWS General Reference</i>. For general information about using the Query API with IAM, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html">Calling the API by Making HTTP Query
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadServerCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UploadServerCertificateResult uploadServerCertificate(UploadServerCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUploadServerCertificate(request);
    }

    @SdkInternalApi
    final UploadServerCertificateResult executeUploadServerCertificate(UploadServerCertificateRequest uploadServerCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadServerCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
     * you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
     * users.
     * </p>
     * <note>
     * <p>
     * Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling
     * <code>UploadSigningCertificate</code>. For information about setting up signatures and authorization through the
     * API, go to <a href="https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API
     * Requests</a> in the <i>AWS General Reference</i>. For general information about using the Query API with IAM, go
     * to <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in
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
     *         The request was rejected because it referenced a resource entity that does not exist. The error message
     *         describes the resource.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UploadSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadSigningCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UploadSigningCertificateResult uploadSigningCertificate(UploadSigningCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeUploadSigningCertificate(request);
    }

    @SdkInternalApi
    final UploadSigningCertificateResult executeUploadSigningCertificate(UploadSigningCertificateRequest uploadSigningCertificateRequest) {

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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UploadSigningCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
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

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
