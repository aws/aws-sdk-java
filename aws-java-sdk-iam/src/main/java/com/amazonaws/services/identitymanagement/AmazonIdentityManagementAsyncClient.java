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

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing IAM asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
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
public class AmazonIdentityManagementAsyncClient extends AmazonIdentityManagementClient implements AmazonIdentityManagementAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonIdentityManagementAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to IAM (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the provided AWS account credentials
     * provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonIdentityManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IAM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonIdentityManagementAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddClientIDToOpenIDConnectProviderResult> addClientIDToOpenIDConnectProviderAsync(
            AddClientIDToOpenIDConnectProviderRequest request) {

        return addClientIDToOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddClientIDToOpenIDConnectProviderResult> addClientIDToOpenIDConnectProviderAsync(
            final AddClientIDToOpenIDConnectProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddClientIDToOpenIDConnectProviderRequest, AddClientIDToOpenIDConnectProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddClientIDToOpenIDConnectProviderResult>() {
            @Override
            public AddClientIDToOpenIDConnectProviderResult call() throws Exception {
                AddClientIDToOpenIDConnectProviderResult result;

                try {
                    result = addClientIDToOpenIDConnectProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddRoleToInstanceProfileResult> addRoleToInstanceProfileAsync(AddRoleToInstanceProfileRequest request) {

        return addRoleToInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddRoleToInstanceProfileResult> addRoleToInstanceProfileAsync(final AddRoleToInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddRoleToInstanceProfileRequest, AddRoleToInstanceProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddRoleToInstanceProfileResult>() {
            @Override
            public AddRoleToInstanceProfileResult call() throws Exception {
                AddRoleToInstanceProfileResult result;

                try {
                    result = addRoleToInstanceProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddUserToGroupResult> addUserToGroupAsync(AddUserToGroupRequest request) {

        return addUserToGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddUserToGroupResult> addUserToGroupAsync(final AddUserToGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddUserToGroupRequest, AddUserToGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddUserToGroupResult>() {
            @Override
            public AddUserToGroupResult call() throws Exception {
                AddUserToGroupResult result;

                try {
                    result = addUserToGroup(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AttachGroupPolicyResult> attachGroupPolicyAsync(AttachGroupPolicyRequest request) {

        return attachGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachGroupPolicyResult> attachGroupPolicyAsync(final AttachGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachGroupPolicyRequest, AttachGroupPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachGroupPolicyResult>() {
            @Override
            public AttachGroupPolicyResult call() throws Exception {
                AttachGroupPolicyResult result;

                try {
                    result = attachGroupPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AttachRolePolicyResult> attachRolePolicyAsync(AttachRolePolicyRequest request) {

        return attachRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachRolePolicyResult> attachRolePolicyAsync(final AttachRolePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachRolePolicyRequest, AttachRolePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachRolePolicyResult>() {
            @Override
            public AttachRolePolicyResult call() throws Exception {
                AttachRolePolicyResult result;

                try {
                    result = attachRolePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AttachUserPolicyResult> attachUserPolicyAsync(AttachUserPolicyRequest request) {

        return attachUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachUserPolicyResult> attachUserPolicyAsync(final AttachUserPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachUserPolicyRequest, AttachUserPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachUserPolicyResult>() {
            @Override
            public AttachUserPolicyResult call() throws Exception {
                AttachUserPolicyResult result;

                try {
                    result = attachUserPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(ChangePasswordRequest request) {

        return changePasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(final ChangePasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangePasswordRequest, ChangePasswordResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ChangePasswordResult>() {
            @Override
            public ChangePasswordResult call() throws Exception {
                ChangePasswordResult result;

                try {
                    result = changePassword(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(CreateAccessKeyRequest request) {

        return createAccessKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(final CreateAccessKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessKeyRequest, CreateAccessKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessKeyResult>() {
            @Override
            public CreateAccessKeyResult call() throws Exception {
                CreateAccessKeyResult result;

                try {
                    result = createAccessKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the CreateAccessKey operation.
     *
     * @see #createAccessKeyAsync(CreateAccessKeyRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync() {

        return createAccessKeyAsync(new CreateAccessKeyRequest());
    }

    /**
     * Simplified method form for invoking the CreateAccessKey operation with an AsyncHandler.
     *
     * @see #createAccessKeyAsync(CreateAccessKeyRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            com.amazonaws.handlers.AsyncHandler<CreateAccessKeyRequest, CreateAccessKeyResult> asyncHandler) {

        return createAccessKeyAsync(new CreateAccessKeyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountAliasResult> createAccountAliasAsync(CreateAccountAliasRequest request) {

        return createAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountAliasResult> createAccountAliasAsync(final CreateAccountAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccountAliasRequest, CreateAccountAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAccountAliasResult>() {
            @Override
            public CreateAccountAliasResult call() throws Exception {
                CreateAccountAliasResult result;

                try {
                    result = createAccountAlias(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result;

                try {
                    result = createGroup(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(CreateInstanceProfileRequest request) {

        return createInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(final CreateInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceProfileRequest, CreateInstanceProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceProfileResult>() {
            @Override
            public CreateInstanceProfileResult call() throws Exception {
                CreateInstanceProfileResult result;

                try {
                    result = createInstanceProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLoginProfileResult> createLoginProfileAsync(CreateLoginProfileRequest request) {

        return createLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoginProfileResult> createLoginProfileAsync(final CreateLoginProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoginProfileRequest, CreateLoginProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateLoginProfileResult>() {
            @Override
            public CreateLoginProfileResult call() throws Exception {
                CreateLoginProfileResult result;

                try {
                    result = createLoginProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOpenIDConnectProviderResult> createOpenIDConnectProviderAsync(CreateOpenIDConnectProviderRequest request) {

        return createOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOpenIDConnectProviderResult> createOpenIDConnectProviderAsync(final CreateOpenIDConnectProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOpenIDConnectProviderRequest, CreateOpenIDConnectProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateOpenIDConnectProviderResult>() {
            @Override
            public CreateOpenIDConnectProviderResult call() throws Exception {
                CreateOpenIDConnectProviderResult result;

                try {
                    result = createOpenIDConnectProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(final CreatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyResult>() {
            @Override
            public CreatePolicyResult call() throws Exception {
                CreatePolicyResult result;

                try {
                    result = createPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(CreatePolicyVersionRequest request) {

        return createPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(final CreatePolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyVersionResult>() {
            @Override
            public CreatePolicyVersionResult call() throws Exception {
                CreatePolicyVersionResult result;

                try {
                    result = createPolicyVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRoleResult> createRoleAsync(CreateRoleRequest request) {

        return createRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoleResult> createRoleAsync(final CreateRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoleRequest, CreateRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateRoleResult>() {
            @Override
            public CreateRoleResult call() throws Exception {
                CreateRoleResult result;

                try {
                    result = createRole(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSAMLProviderResult> createSAMLProviderAsync(CreateSAMLProviderRequest request) {

        return createSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSAMLProviderResult> createSAMLProviderAsync(final CreateSAMLProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSAMLProviderRequest, CreateSAMLProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSAMLProviderResult>() {
            @Override
            public CreateSAMLProviderResult call() throws Exception {
                CreateSAMLProviderResult result;

                try {
                    result = createSAMLProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result;

                try {
                    result = createUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualMFADeviceResult> createVirtualMFADeviceAsync(CreateVirtualMFADeviceRequest request) {

        return createVirtualMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualMFADeviceResult> createVirtualMFADeviceAsync(final CreateVirtualMFADeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVirtualMFADeviceRequest, CreateVirtualMFADeviceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVirtualMFADeviceResult>() {
            @Override
            public CreateVirtualMFADeviceResult call() throws Exception {
                CreateVirtualMFADeviceResult result;

                try {
                    result = createVirtualMFADevice(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeactivateMFADeviceResult> deactivateMFADeviceAsync(DeactivateMFADeviceRequest request) {

        return deactivateMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateMFADeviceResult> deactivateMFADeviceAsync(final DeactivateMFADeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateMFADeviceRequest, DeactivateMFADeviceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeactivateMFADeviceResult>() {
            @Override
            public DeactivateMFADeviceResult call() throws Exception {
                DeactivateMFADeviceResult result;

                try {
                    result = deactivateMFADevice(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessKeyResult> deleteAccessKeyAsync(DeleteAccessKeyRequest request) {

        return deleteAccessKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessKeyResult> deleteAccessKeyAsync(final DeleteAccessKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessKeyRequest, DeleteAccessKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessKeyResult>() {
            @Override
            public DeleteAccessKeyResult call() throws Exception {
                DeleteAccessKeyResult result;

                try {
                    result = deleteAccessKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(DeleteAccountAliasRequest request) {

        return deleteAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(final DeleteAccountAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountAliasRequest, DeleteAccountAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountAliasResult>() {
            @Override
            public DeleteAccountAliasResult call() throws Exception {
                DeleteAccountAliasResult result;

                try {
                    result = deleteAccountAlias(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountPasswordPolicyResult> deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest request) {

        return deleteAccountPasswordPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountPasswordPolicyResult> deleteAccountPasswordPolicyAsync(final DeleteAccountPasswordPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountPasswordPolicyRequest, DeleteAccountPasswordPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountPasswordPolicyResult>() {
            @Override
            public DeleteAccountPasswordPolicyResult call() throws Exception {
                DeleteAccountPasswordPolicyResult result;

                try {
                    result = deleteAccountPasswordPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy operation.
     *
     * @see #deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteAccountPasswordPolicyResult> deleteAccountPasswordPolicyAsync() {

        return deleteAccountPasswordPolicyAsync(new DeleteAccountPasswordPolicyRequest());
    }

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy operation with an AsyncHandler.
     *
     * @see #deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DeleteAccountPasswordPolicyResult> deleteAccountPasswordPolicyAsync(
            com.amazonaws.handlers.AsyncHandler<DeleteAccountPasswordPolicyRequest, DeleteAccountPasswordPolicyResult> asyncHandler) {

        return deleteAccountPasswordPolicyAsync(new DeleteAccountPasswordPolicyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result;

                try {
                    result = deleteGroup(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupPolicyResult> deleteGroupPolicyAsync(DeleteGroupPolicyRequest request) {

        return deleteGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupPolicyResult> deleteGroupPolicyAsync(final DeleteGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupPolicyRequest, DeleteGroupPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupPolicyResult>() {
            @Override
            public DeleteGroupPolicyResult call() throws Exception {
                DeleteGroupPolicyResult result;

                try {
                    result = deleteGroupPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(DeleteInstanceProfileRequest request) {

        return deleteInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(final DeleteInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceProfileRequest, DeleteInstanceProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceProfileResult>() {
            @Override
            public DeleteInstanceProfileResult call() throws Exception {
                DeleteInstanceProfileResult result;

                try {
                    result = deleteInstanceProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLoginProfileResult> deleteLoginProfileAsync(DeleteLoginProfileRequest request) {

        return deleteLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoginProfileResult> deleteLoginProfileAsync(final DeleteLoginProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoginProfileRequest, DeleteLoginProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoginProfileResult>() {
            @Override
            public DeleteLoginProfileResult call() throws Exception {
                DeleteLoginProfileResult result;

                try {
                    result = deleteLoginProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOpenIDConnectProviderResult> deleteOpenIDConnectProviderAsync(DeleteOpenIDConnectProviderRequest request) {

        return deleteOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOpenIDConnectProviderResult> deleteOpenIDConnectProviderAsync(final DeleteOpenIDConnectProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOpenIDConnectProviderRequest, DeleteOpenIDConnectProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteOpenIDConnectProviderResult>() {
            @Override
            public DeleteOpenIDConnectProviderResult call() throws Exception {
                DeleteOpenIDConnectProviderResult result;

                try {
                    result = deleteOpenIDConnectProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyResult>() {
            @Override
            public DeletePolicyResult call() throws Exception {
                DeletePolicyResult result;

                try {
                    result = deletePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyVersionResult> deletePolicyVersionAsync(DeletePolicyVersionRequest request) {

        return deletePolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyVersionResult> deletePolicyVersionAsync(final DeletePolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, DeletePolicyVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyVersionResult>() {
            @Override
            public DeletePolicyVersionResult call() throws Exception {
                DeletePolicyVersionResult result;

                try {
                    result = deletePolicyVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRoleResult> deleteRoleAsync(DeleteRoleRequest request) {

        return deleteRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoleResult> deleteRoleAsync(final DeleteRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoleRequest, DeleteRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoleResult>() {
            @Override
            public DeleteRoleResult call() throws Exception {
                DeleteRoleResult result;

                try {
                    result = deleteRole(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRolePolicyResult> deleteRolePolicyAsync(DeleteRolePolicyRequest request) {

        return deleteRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRolePolicyResult> deleteRolePolicyAsync(final DeleteRolePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRolePolicyRequest, DeleteRolePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRolePolicyResult>() {
            @Override
            public DeleteRolePolicyResult call() throws Exception {
                DeleteRolePolicyResult result;

                try {
                    result = deleteRolePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSAMLProviderResult> deleteSAMLProviderAsync(DeleteSAMLProviderRequest request) {

        return deleteSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSAMLProviderResult> deleteSAMLProviderAsync(final DeleteSAMLProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSAMLProviderRequest, DeleteSAMLProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSAMLProviderResult>() {
            @Override
            public DeleteSAMLProviderResult call() throws Exception {
                DeleteSAMLProviderResult result;

                try {
                    result = deleteSAMLProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSSHPublicKeyResult> deleteSSHPublicKeyAsync(DeleteSSHPublicKeyRequest request) {

        return deleteSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSSHPublicKeyResult> deleteSSHPublicKeyAsync(final DeleteSSHPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSSHPublicKeyRequest, DeleteSSHPublicKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSSHPublicKeyResult>() {
            @Override
            public DeleteSSHPublicKeyResult call() throws Exception {
                DeleteSSHPublicKeyResult result;

                try {
                    result = deleteSSHPublicKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteServerCertificateResult> deleteServerCertificateAsync(DeleteServerCertificateRequest request) {

        return deleteServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerCertificateResult> deleteServerCertificateAsync(final DeleteServerCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServerCertificateRequest, DeleteServerCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteServerCertificateResult>() {
            @Override
            public DeleteServerCertificateResult call() throws Exception {
                DeleteServerCertificateResult result;

                try {
                    result = deleteServerCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSigningCertificateResult> deleteSigningCertificateAsync(DeleteSigningCertificateRequest request) {

        return deleteSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSigningCertificateResult> deleteSigningCertificateAsync(final DeleteSigningCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSigningCertificateRequest, DeleteSigningCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSigningCertificateResult>() {
            @Override
            public DeleteSigningCertificateResult call() throws Exception {
                DeleteSigningCertificateResult result;

                try {
                    result = deleteSigningCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result;

                try {
                    result = deleteUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPolicyResult> deleteUserPolicyAsync(DeleteUserPolicyRequest request) {

        return deleteUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPolicyResult> deleteUserPolicyAsync(final DeleteUserPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserPolicyRequest, DeleteUserPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserPolicyResult>() {
            @Override
            public DeleteUserPolicyResult call() throws Exception {
                DeleteUserPolicyResult result;

                try {
                    result = deleteUserPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualMFADeviceResult> deleteVirtualMFADeviceAsync(DeleteVirtualMFADeviceRequest request) {

        return deleteVirtualMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualMFADeviceResult> deleteVirtualMFADeviceAsync(final DeleteVirtualMFADeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualMFADeviceRequest, DeleteVirtualMFADeviceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVirtualMFADeviceResult>() {
            @Override
            public DeleteVirtualMFADeviceResult call() throws Exception {
                DeleteVirtualMFADeviceResult result;

                try {
                    result = deleteVirtualMFADevice(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DetachGroupPolicyResult> detachGroupPolicyAsync(DetachGroupPolicyRequest request) {

        return detachGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachGroupPolicyResult> detachGroupPolicyAsync(final DetachGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachGroupPolicyRequest, DetachGroupPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachGroupPolicyResult>() {
            @Override
            public DetachGroupPolicyResult call() throws Exception {
                DetachGroupPolicyResult result;

                try {
                    result = detachGroupPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DetachRolePolicyResult> detachRolePolicyAsync(DetachRolePolicyRequest request) {

        return detachRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachRolePolicyResult> detachRolePolicyAsync(final DetachRolePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachRolePolicyRequest, DetachRolePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachRolePolicyResult>() {
            @Override
            public DetachRolePolicyResult call() throws Exception {
                DetachRolePolicyResult result;

                try {
                    result = detachRolePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DetachUserPolicyResult> detachUserPolicyAsync(DetachUserPolicyRequest request) {

        return detachUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachUserPolicyResult> detachUserPolicyAsync(final DetachUserPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachUserPolicyRequest, DetachUserPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachUserPolicyResult>() {
            @Override
            public DetachUserPolicyResult call() throws Exception {
                DetachUserPolicyResult result;

                try {
                    result = detachUserPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableMFADeviceResult> enableMFADeviceAsync(EnableMFADeviceRequest request) {

        return enableMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableMFADeviceResult> enableMFADeviceAsync(final EnableMFADeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableMFADeviceRequest, EnableMFADeviceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableMFADeviceResult>() {
            @Override
            public EnableMFADeviceResult call() throws Exception {
                EnableMFADeviceResult result;

                try {
                    result = enableMFADevice(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(GenerateCredentialReportRequest request) {

        return generateCredentialReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(final GenerateCredentialReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateCredentialReportRequest, GenerateCredentialReportResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GenerateCredentialReportResult>() {
            @Override
            public GenerateCredentialReportResult call() throws Exception {
                GenerateCredentialReportResult result;

                try {
                    result = generateCredentialReport(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GenerateCredentialReport operation.
     *
     * @see #generateCredentialReportAsync(GenerateCredentialReportRequest)
     */
    @Override
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync() {

        return generateCredentialReportAsync(new GenerateCredentialReportRequest());
    }

    /**
     * Simplified method form for invoking the GenerateCredentialReport operation with an AsyncHandler.
     *
     * @see #generateCredentialReportAsync(GenerateCredentialReportRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateCredentialReportRequest, GenerateCredentialReportResult> asyncHandler) {

        return generateCredentialReportAsync(new GenerateCredentialReportRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetAccessKeyLastUsedResult> getAccessKeyLastUsedAsync(GetAccessKeyLastUsedRequest request) {

        return getAccessKeyLastUsedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessKeyLastUsedResult> getAccessKeyLastUsedAsync(final GetAccessKeyLastUsedRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessKeyLastUsedRequest, GetAccessKeyLastUsedResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAccessKeyLastUsedResult>() {
            @Override
            public GetAccessKeyLastUsedResult call() throws Exception {
                GetAccessKeyLastUsedResult result;

                try {
                    result = getAccessKeyLastUsed(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest request) {

        return getAccountAuthorizationDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            final GetAccountAuthorizationDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountAuthorizationDetailsRequest, GetAccountAuthorizationDetailsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAccountAuthorizationDetailsResult>() {
            @Override
            public GetAccountAuthorizationDetailsResult call() throws Exception {
                GetAccountAuthorizationDetailsResult result;

                try {
                    result = getAccountAuthorizationDetails(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails operation.
     *
     * @see #getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync() {

        return getAccountAuthorizationDetailsAsync(new GetAccountAuthorizationDetailsRequest());
    }

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails operation with an AsyncHandler.
     *
     * @see #getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountAuthorizationDetailsRequest, GetAccountAuthorizationDetailsResult> asyncHandler) {

        return getAccountAuthorizationDetailsAsync(new GetAccountAuthorizationDetailsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest request) {

        return getAccountPasswordPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(final GetAccountPasswordPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountPasswordPolicyRequest, GetAccountPasswordPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAccountPasswordPolicyResult>() {
            @Override
            public GetAccountPasswordPolicyResult call() throws Exception {
                GetAccountPasswordPolicyResult result;

                try {
                    result = getAccountPasswordPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy operation.
     *
     * @see #getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest)
     */
    @Override
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync() {

        return getAccountPasswordPolicyAsync(new GetAccountPasswordPolicyRequest());
    }

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy operation with an AsyncHandler.
     *
     * @see #getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountPasswordPolicyRequest, GetAccountPasswordPolicyResult> asyncHandler) {

        return getAccountPasswordPolicyAsync(new GetAccountPasswordPolicyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(GetAccountSummaryRequest request) {

        return getAccountSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(final GetAccountSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSummaryRequest, GetAccountSummaryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSummaryResult>() {
            @Override
            public GetAccountSummaryResult call() throws Exception {
                GetAccountSummaryResult result;

                try {
                    result = getAccountSummary(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetAccountSummary operation.
     *
     * @see #getAccountSummaryAsync(GetAccountSummaryRequest)
     */
    @Override
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync() {

        return getAccountSummaryAsync(new GetAccountSummaryRequest());
    }

    /**
     * Simplified method form for invoking the GetAccountSummary operation with an AsyncHandler.
     *
     * @see #getAccountSummaryAsync(GetAccountSummaryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountSummaryRequest, GetAccountSummaryResult> asyncHandler) {

        return getAccountSummaryAsync(new GetAccountSummaryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForCustomPolicyResult> getContextKeysForCustomPolicyAsync(GetContextKeysForCustomPolicyRequest request) {

        return getContextKeysForCustomPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForCustomPolicyResult> getContextKeysForCustomPolicyAsync(
            final GetContextKeysForCustomPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContextKeysForCustomPolicyRequest, GetContextKeysForCustomPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetContextKeysForCustomPolicyResult>() {
            @Override
            public GetContextKeysForCustomPolicyResult call() throws Exception {
                GetContextKeysForCustomPolicyResult result;

                try {
                    result = getContextKeysForCustomPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForPrincipalPolicyResult> getContextKeysForPrincipalPolicyAsync(
            GetContextKeysForPrincipalPolicyRequest request) {

        return getContextKeysForPrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForPrincipalPolicyResult> getContextKeysForPrincipalPolicyAsync(
            final GetContextKeysForPrincipalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContextKeysForPrincipalPolicyRequest, GetContextKeysForPrincipalPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetContextKeysForPrincipalPolicyResult>() {
            @Override
            public GetContextKeysForPrincipalPolicyResult call() throws Exception {
                GetContextKeysForPrincipalPolicyResult result;

                try {
                    result = getContextKeysForPrincipalPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(GetCredentialReportRequest request) {

        return getCredentialReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(final GetCredentialReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCredentialReportRequest, GetCredentialReportResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCredentialReportResult>() {
            @Override
            public GetCredentialReportResult call() throws Exception {
                GetCredentialReportResult result;

                try {
                    result = getCredentialReport(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetCredentialReport operation.
     *
     * @see #getCredentialReportAsync(GetCredentialReportRequest)
     */
    @Override
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync() {

        return getCredentialReportAsync(new GetCredentialReportRequest());
    }

    /**
     * Simplified method form for invoking the GetCredentialReport operation with an AsyncHandler.
     *
     * @see #getCredentialReportAsync(GetCredentialReportRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            com.amazonaws.handlers.AsyncHandler<GetCredentialReportRequest, GetCredentialReportResult> asyncHandler) {

        return getCredentialReportAsync(new GetCredentialReportRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(final GetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetGroupResult>() {
            @Override
            public GetGroupResult call() throws Exception {
                GetGroupResult result;

                try {
                    result = getGroup(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupPolicyResult> getGroupPolicyAsync(GetGroupPolicyRequest request) {

        return getGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupPolicyResult> getGroupPolicyAsync(final GetGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupPolicyRequest, GetGroupPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetGroupPolicyResult>() {
            @Override
            public GetGroupPolicyResult call() throws Exception {
                GetGroupPolicyResult result;

                try {
                    result = getGroupPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(GetInstanceProfileRequest request) {

        return getInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(final GetInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceProfileRequest, GetInstanceProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceProfileResult>() {
            @Override
            public GetInstanceProfileResult call() throws Exception {
                GetInstanceProfileResult result;

                try {
                    result = getInstanceProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLoginProfileResult> getLoginProfileAsync(GetLoginProfileRequest request) {

        return getLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoginProfileResult> getLoginProfileAsync(final GetLoginProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoginProfileRequest, GetLoginProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetLoginProfileResult>() {
            @Override
            public GetLoginProfileResult call() throws Exception {
                GetLoginProfileResult result;

                try {
                    result = getLoginProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOpenIDConnectProviderResult> getOpenIDConnectProviderAsync(GetOpenIDConnectProviderRequest request) {

        return getOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOpenIDConnectProviderResult> getOpenIDConnectProviderAsync(final GetOpenIDConnectProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOpenIDConnectProviderRequest, GetOpenIDConnectProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetOpenIDConnectProviderResult>() {
            @Override
            public GetOpenIDConnectProviderResult call() throws Exception {
                GetOpenIDConnectProviderResult result;

                try {
                    result = getOpenIDConnectProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result;

                try {
                    result = getPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(GetPolicyVersionRequest request) {

        return getPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(final GetPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyVersionResult>() {
            @Override
            public GetPolicyVersionResult call() throws Exception {
                GetPolicyVersionResult result;

                try {
                    result = getPolicyVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRoleResult> getRoleAsync(GetRoleRequest request) {

        return getRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoleResult> getRoleAsync(final GetRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoleRequest, GetRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRoleResult>() {
            @Override
            public GetRoleResult call() throws Exception {
                GetRoleResult result;

                try {
                    result = getRole(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRolePolicyResult> getRolePolicyAsync(GetRolePolicyRequest request) {

        return getRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRolePolicyResult> getRolePolicyAsync(final GetRolePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRolePolicyRequest, GetRolePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRolePolicyResult>() {
            @Override
            public GetRolePolicyResult call() throws Exception {
                GetRolePolicyResult result;

                try {
                    result = getRolePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSAMLProviderResult> getSAMLProviderAsync(GetSAMLProviderRequest request) {

        return getSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSAMLProviderResult> getSAMLProviderAsync(final GetSAMLProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSAMLProviderRequest, GetSAMLProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSAMLProviderResult>() {
            @Override
            public GetSAMLProviderResult call() throws Exception {
                GetSAMLProviderResult result;

                try {
                    result = getSAMLProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSSHPublicKeyResult> getSSHPublicKeyAsync(GetSSHPublicKeyRequest request) {

        return getSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSSHPublicKeyResult> getSSHPublicKeyAsync(final GetSSHPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSSHPublicKeyRequest, GetSSHPublicKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSSHPublicKeyResult>() {
            @Override
            public GetSSHPublicKeyResult call() throws Exception {
                GetSSHPublicKeyResult result;

                try {
                    result = getSSHPublicKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServerCertificateResult> getServerCertificateAsync(GetServerCertificateRequest request) {

        return getServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServerCertificateResult> getServerCertificateAsync(final GetServerCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServerCertificateRequest, GetServerCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetServerCertificateResult>() {
            @Override
            public GetServerCertificateResult call() throws Exception {
                GetServerCertificateResult result;

                try {
                    result = getServerCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest request) {

        return getUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(final GetUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetUserResult>() {
            @Override
            public GetUserResult call() throws Exception {
                GetUserResult result;

                try {
                    result = getUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetUser operation.
     *
     * @see #getUserAsync(GetUserRequest)
     */
    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync() {

        return getUserAsync(new GetUserRequest());
    }

    /**
     * Simplified method form for invoking the GetUser operation with an AsyncHandler.
     *
     * @see #getUserAsync(GetUserRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetUserResult> getUserAsync(com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {

        return getUserAsync(new GetUserRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetUserPolicyResult> getUserPolicyAsync(GetUserPolicyRequest request) {

        return getUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserPolicyResult> getUserPolicyAsync(final GetUserPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserPolicyRequest, GetUserPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetUserPolicyResult>() {
            @Override
            public GetUserPolicyResult call() throws Exception {
                GetUserPolicyResult result;

                try {
                    result = getUserPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(ListAccessKeysRequest request) {

        return listAccessKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(final ListAccessKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessKeysRequest, ListAccessKeysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAccessKeysResult>() {
            @Override
            public ListAccessKeysResult call() throws Exception {
                ListAccessKeysResult result;

                try {
                    result = listAccessKeys(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListAccessKeys operation.
     *
     * @see #listAccessKeysAsync(ListAccessKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync() {

        return listAccessKeysAsync(new ListAccessKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListAccessKeys operation with an AsyncHandler.
     *
     * @see #listAccessKeysAsync(ListAccessKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListAccessKeysRequest, ListAccessKeysResult> asyncHandler) {

        return listAccessKeysAsync(new ListAccessKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(ListAccountAliasesRequest request) {

        return listAccountAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(final ListAccountAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountAliasesRequest, ListAccountAliasesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAccountAliasesResult>() {
            @Override
            public ListAccountAliasesResult call() throws Exception {
                ListAccountAliasesResult result;

                try {
                    result = listAccountAliases(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListAccountAliases operation.
     *
     * @see #listAccountAliasesAsync(ListAccountAliasesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync() {

        return listAccountAliasesAsync(new ListAccountAliasesRequest());
    }

    /**
     * Simplified method form for invoking the ListAccountAliases operation with an AsyncHandler.
     *
     * @see #listAccountAliasesAsync(ListAccountAliasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAccountAliasesRequest, ListAccountAliasesResult> asyncHandler) {

        return listAccountAliasesAsync(new ListAccountAliasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedGroupPoliciesResult> listAttachedGroupPoliciesAsync(ListAttachedGroupPoliciesRequest request) {

        return listAttachedGroupPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedGroupPoliciesResult> listAttachedGroupPoliciesAsync(final ListAttachedGroupPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedGroupPoliciesRequest, ListAttachedGroupPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedGroupPoliciesResult>() {
            @Override
            public ListAttachedGroupPoliciesResult call() throws Exception {
                ListAttachedGroupPoliciesResult result;

                try {
                    result = listAttachedGroupPolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRolePoliciesResult> listAttachedRolePoliciesAsync(ListAttachedRolePoliciesRequest request) {

        return listAttachedRolePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRolePoliciesResult> listAttachedRolePoliciesAsync(final ListAttachedRolePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedRolePoliciesRequest, ListAttachedRolePoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedRolePoliciesResult>() {
            @Override
            public ListAttachedRolePoliciesResult call() throws Exception {
                ListAttachedRolePoliciesResult result;

                try {
                    result = listAttachedRolePolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAttachedUserPoliciesResult> listAttachedUserPoliciesAsync(ListAttachedUserPoliciesRequest request) {

        return listAttachedUserPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedUserPoliciesResult> listAttachedUserPoliciesAsync(final ListAttachedUserPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedUserPoliciesRequest, ListAttachedUserPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedUserPoliciesResult>() {
            @Override
            public ListAttachedUserPoliciesResult call() throws Exception {
                ListAttachedUserPoliciesResult result;

                try {
                    result = listAttachedUserPolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesForPolicyResult> listEntitiesForPolicyAsync(ListEntitiesForPolicyRequest request) {

        return listEntitiesForPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesForPolicyResult> listEntitiesForPolicyAsync(final ListEntitiesForPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListEntitiesForPolicyResult>() {
            @Override
            public ListEntitiesForPolicyResult call() throws Exception {
                ListEntitiesForPolicyResult result;

                try {
                    result = listEntitiesForPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupPoliciesResult> listGroupPoliciesAsync(ListGroupPoliciesRequest request) {

        return listGroupPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupPoliciesResult> listGroupPoliciesAsync(final ListGroupPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupPoliciesRequest, ListGroupPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListGroupPoliciesResult>() {
            @Override
            public ListGroupPoliciesResult call() throws Exception {
                ListGroupPoliciesResult result;

                try {
                    result = listGroupPolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result;

                try {
                    result = listGroups(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListGroups operation.
     *
     * @see #listGroupsAsync(ListGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync() {

        return listGroupsAsync(new ListGroupsRequest());
    }

    /**
     * Simplified method form for invoking the ListGroups operation with an AsyncHandler.
     *
     * @see #listGroupsAsync(ListGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

        return listGroupsAsync(new ListGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsForUserResult> listGroupsForUserAsync(ListGroupsForUserRequest request) {

        return listGroupsForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsForUserResult> listGroupsForUserAsync(final ListGroupsForUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsForUserRequest, ListGroupsForUserResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsForUserResult>() {
            @Override
            public ListGroupsForUserResult call() throws Exception {
                ListGroupsForUserResult result;

                try {
                    result = listGroupsForUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(ListInstanceProfilesRequest request) {

        return listInstanceProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(final ListInstanceProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceProfilesResult>() {
            @Override
            public ListInstanceProfilesResult call() throws Exception {
                ListInstanceProfilesResult result;

                try {
                    result = listInstanceProfiles(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation.
     *
     * @see #listInstanceProfilesAsync(ListInstanceProfilesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync() {

        return listInstanceProfilesAsync(new ListInstanceProfilesRequest());
    }

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation with an AsyncHandler.
     *
     * @see #listInstanceProfilesAsync(ListInstanceProfilesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler) {

        return listInstanceProfilesAsync(new ListInstanceProfilesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesForRoleResult> listInstanceProfilesForRoleAsync(ListInstanceProfilesForRoleRequest request) {

        return listInstanceProfilesForRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesForRoleResult> listInstanceProfilesForRoleAsync(final ListInstanceProfilesForRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesForRoleRequest, ListInstanceProfilesForRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceProfilesForRoleResult>() {
            @Override
            public ListInstanceProfilesForRoleResult call() throws Exception {
                ListInstanceProfilesForRoleResult result;

                try {
                    result = listInstanceProfilesForRole(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(ListMFADevicesRequest request) {

        return listMFADevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(final ListMFADevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMFADevicesRequest, ListMFADevicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListMFADevicesResult>() {
            @Override
            public ListMFADevicesResult call() throws Exception {
                ListMFADevicesResult result;

                try {
                    result = listMFADevices(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListMFADevices operation.
     *
     * @see #listMFADevicesAsync(ListMFADevicesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync() {

        return listMFADevicesAsync(new ListMFADevicesRequest());
    }

    /**
     * Simplified method form for invoking the ListMFADevices operation with an AsyncHandler.
     *
     * @see #listMFADevicesAsync(ListMFADevicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListMFADevicesRequest, ListMFADevicesResult> asyncHandler) {

        return listMFADevicesAsync(new ListMFADevicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest request) {

        return listOpenIDConnectProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(final ListOpenIDConnectProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOpenIDConnectProvidersRequest, ListOpenIDConnectProvidersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListOpenIDConnectProvidersResult>() {
            @Override
            public ListOpenIDConnectProvidersResult call() throws Exception {
                ListOpenIDConnectProvidersResult result;

                try {
                    result = listOpenIDConnectProviders(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders operation.
     *
     * @see #listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync() {

        return listOpenIDConnectProvidersAsync(new ListOpenIDConnectProvidersRequest());
    }

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders operation with an AsyncHandler.
     *
     * @see #listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            com.amazonaws.handlers.AsyncHandler<ListOpenIDConnectProvidersRequest, ListOpenIDConnectProvidersResult> asyncHandler) {

        return listOpenIDConnectProvidersAsync(new ListOpenIDConnectProvidersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(final ListPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListPoliciesResult>() {
            @Override
            public ListPoliciesResult call() throws Exception {
                ListPoliciesResult result;

                try {
                    result = listPolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListPolicies operation.
     *
     * @see #listPoliciesAsync(ListPoliciesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync() {

        return listPoliciesAsync(new ListPoliciesRequest());
    }

    /**
     * Simplified method form for invoking the ListPolicies operation with an AsyncHandler.
     *
     * @see #listPoliciesAsync(ListPoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        return listPoliciesAsync(new ListPoliciesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(ListPolicyVersionsRequest request) {

        return listPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(final ListPolicyVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyVersionsResult>() {
            @Override
            public ListPolicyVersionsResult call() throws Exception {
                ListPolicyVersionsResult result;

                try {
                    result = listPolicyVersions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRolePoliciesResult> listRolePoliciesAsync(ListRolePoliciesRequest request) {

        return listRolePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRolePoliciesResult> listRolePoliciesAsync(final ListRolePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRolePoliciesRequest, ListRolePoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRolePoliciesResult>() {
            @Override
            public ListRolePoliciesResult call() throws Exception {
                ListRolePoliciesResult result;

                try {
                    result = listRolePolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync(ListRolesRequest request) {

        return listRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync(final ListRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRolesRequest, ListRolesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRolesResult>() {
            @Override
            public ListRolesResult call() throws Exception {
                ListRolesResult result;

                try {
                    result = listRoles(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListRoles operation.
     *
     * @see #listRolesAsync(ListRolesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync() {

        return listRolesAsync(new ListRolesRequest());
    }

    /**
     * Simplified method form for invoking the ListRoles operation with an AsyncHandler.
     *
     * @see #listRolesAsync(ListRolesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync(com.amazonaws.handlers.AsyncHandler<ListRolesRequest, ListRolesResult> asyncHandler) {

        return listRolesAsync(new ListRolesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(ListSAMLProvidersRequest request) {

        return listSAMLProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(final ListSAMLProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSAMLProvidersRequest, ListSAMLProvidersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSAMLProvidersResult>() {
            @Override
            public ListSAMLProvidersResult call() throws Exception {
                ListSAMLProvidersResult result;

                try {
                    result = listSAMLProviders(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListSAMLProviders operation.
     *
     * @see #listSAMLProvidersAsync(ListSAMLProvidersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync() {

        return listSAMLProvidersAsync(new ListSAMLProvidersRequest());
    }

    /**
     * Simplified method form for invoking the ListSAMLProviders operation with an AsyncHandler.
     *
     * @see #listSAMLProvidersAsync(ListSAMLProvidersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            com.amazonaws.handlers.AsyncHandler<ListSAMLProvidersRequest, ListSAMLProvidersResult> asyncHandler) {

        return listSAMLProvidersAsync(new ListSAMLProvidersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(ListSSHPublicKeysRequest request) {

        return listSSHPublicKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(final ListSSHPublicKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSSHPublicKeysRequest, ListSSHPublicKeysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSSHPublicKeysResult>() {
            @Override
            public ListSSHPublicKeysResult call() throws Exception {
                ListSSHPublicKeysResult result;

                try {
                    result = listSSHPublicKeys(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation.
     *
     * @see #listSSHPublicKeysAsync(ListSSHPublicKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync() {

        return listSSHPublicKeysAsync(new ListSSHPublicKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation with an AsyncHandler.
     *
     * @see #listSSHPublicKeysAsync(ListSSHPublicKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListSSHPublicKeysRequest, ListSSHPublicKeysResult> asyncHandler) {

        return listSSHPublicKeysAsync(new ListSSHPublicKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(ListServerCertificatesRequest request) {

        return listServerCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(final ListServerCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServerCertificatesRequest, ListServerCertificatesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListServerCertificatesResult>() {
            @Override
            public ListServerCertificatesResult call() throws Exception {
                ListServerCertificatesResult result;

                try {
                    result = listServerCertificates(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListServerCertificates operation.
     *
     * @see #listServerCertificatesAsync(ListServerCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync() {

        return listServerCertificatesAsync(new ListServerCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the ListServerCertificates operation with an AsyncHandler.
     *
     * @see #listServerCertificatesAsync(ListServerCertificatesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<ListServerCertificatesRequest, ListServerCertificatesResult> asyncHandler) {

        return listServerCertificatesAsync(new ListServerCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(ListSigningCertificatesRequest request) {

        return listSigningCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(final ListSigningCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSigningCertificatesRequest, ListSigningCertificatesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSigningCertificatesResult>() {
            @Override
            public ListSigningCertificatesResult call() throws Exception {
                ListSigningCertificatesResult result;

                try {
                    result = listSigningCertificates(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListSigningCertificates operation.
     *
     * @see #listSigningCertificatesAsync(ListSigningCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync() {

        return listSigningCertificatesAsync(new ListSigningCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the ListSigningCertificates operation with an AsyncHandler.
     *
     * @see #listSigningCertificatesAsync(ListSigningCertificatesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<ListSigningCertificatesRequest, ListSigningCertificatesResult> asyncHandler) {

        return listSigningCertificatesAsync(new ListSigningCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoliciesResult> listUserPoliciesAsync(ListUserPoliciesRequest request) {

        return listUserPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoliciesResult> listUserPoliciesAsync(final ListUserPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserPoliciesRequest, ListUserPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListUserPoliciesResult>() {
            @Override
            public ListUserPoliciesResult call() throws Exception {
                ListUserPoliciesResult result;

                try {
                    result = listUserPolicies(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result;

                try {
                    result = listUsers(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListUsers operation.
     *
     * @see #listUsersAsync(ListUsersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync() {

        return listUsersAsync(new ListUsersRequest());
    }

    /**
     * Simplified method form for invoking the ListUsers operation with an AsyncHandler.
     *
     * @see #listUsersAsync(ListUsersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {

        return listUsersAsync(new ListUsersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest request) {

        return listVirtualMFADevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(final ListVirtualMFADevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVirtualMFADevicesRequest, ListVirtualMFADevicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVirtualMFADevicesResult>() {
            @Override
            public ListVirtualMFADevicesResult call() throws Exception {
                ListVirtualMFADevicesResult result;

                try {
                    result = listVirtualMFADevices(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation.
     *
     * @see #listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync() {

        return listVirtualMFADevicesAsync(new ListVirtualMFADevicesRequest());
    }

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation with an AsyncHandler.
     *
     * @see #listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVirtualMFADevicesRequest, ListVirtualMFADevicesResult> asyncHandler) {

        return listVirtualMFADevicesAsync(new ListVirtualMFADevicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutGroupPolicyResult> putGroupPolicyAsync(PutGroupPolicyRequest request) {

        return putGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutGroupPolicyResult> putGroupPolicyAsync(final PutGroupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutGroupPolicyRequest, PutGroupPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutGroupPolicyResult>() {
            @Override
            public PutGroupPolicyResult call() throws Exception {
                PutGroupPolicyResult result;

                try {
                    result = putGroupPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRolePolicyResult> putRolePolicyAsync(PutRolePolicyRequest request) {

        return putRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRolePolicyResult> putRolePolicyAsync(final PutRolePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRolePolicyRequest, PutRolePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutRolePolicyResult>() {
            @Override
            public PutRolePolicyResult call() throws Exception {
                PutRolePolicyResult result;

                try {
                    result = putRolePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutUserPolicyResult> putUserPolicyAsync(PutUserPolicyRequest request) {

        return putUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutUserPolicyResult> putUserPolicyAsync(final PutUserPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutUserPolicyRequest, PutUserPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutUserPolicyResult>() {
            @Override
            public PutUserPolicyResult call() throws Exception {
                PutUserPolicyResult result;

                try {
                    result = putUserPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveClientIDFromOpenIDConnectProviderResult> removeClientIDFromOpenIDConnectProviderAsync(
            RemoveClientIDFromOpenIDConnectProviderRequest request) {

        return removeClientIDFromOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveClientIDFromOpenIDConnectProviderResult> removeClientIDFromOpenIDConnectProviderAsync(
            final RemoveClientIDFromOpenIDConnectProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveClientIDFromOpenIDConnectProviderRequest, RemoveClientIDFromOpenIDConnectProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveClientIDFromOpenIDConnectProviderResult>() {
            @Override
            public RemoveClientIDFromOpenIDConnectProviderResult call() throws Exception {
                RemoveClientIDFromOpenIDConnectProviderResult result;

                try {
                    result = removeClientIDFromOpenIDConnectProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromInstanceProfileResult> removeRoleFromInstanceProfileAsync(RemoveRoleFromInstanceProfileRequest request) {

        return removeRoleFromInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromInstanceProfileResult> removeRoleFromInstanceProfileAsync(
            final RemoveRoleFromInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveRoleFromInstanceProfileRequest, RemoveRoleFromInstanceProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveRoleFromInstanceProfileResult>() {
            @Override
            public RemoveRoleFromInstanceProfileResult call() throws Exception {
                RemoveRoleFromInstanceProfileResult result;

                try {
                    result = removeRoleFromInstanceProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveUserFromGroupResult> removeUserFromGroupAsync(RemoveUserFromGroupRequest request) {

        return removeUserFromGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveUserFromGroupResult> removeUserFromGroupAsync(final RemoveUserFromGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveUserFromGroupRequest, RemoveUserFromGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveUserFromGroupResult>() {
            @Override
            public RemoveUserFromGroupResult call() throws Exception {
                RemoveUserFromGroupResult result;

                try {
                    result = removeUserFromGroup(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResyncMFADeviceResult> resyncMFADeviceAsync(ResyncMFADeviceRequest request) {

        return resyncMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResyncMFADeviceResult> resyncMFADeviceAsync(final ResyncMFADeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResyncMFADeviceRequest, ResyncMFADeviceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResyncMFADeviceResult>() {
            @Override
            public ResyncMFADeviceResult call() throws Exception {
                ResyncMFADeviceResult result;

                try {
                    result = resyncMFADevice(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetDefaultPolicyVersionResult> setDefaultPolicyVersionAsync(SetDefaultPolicyVersionRequest request) {

        return setDefaultPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultPolicyVersionResult> setDefaultPolicyVersionAsync(final SetDefaultPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, SetDefaultPolicyVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultPolicyVersionResult>() {
            @Override
            public SetDefaultPolicyVersionResult call() throws Exception {
                SetDefaultPolicyVersionResult result;

                try {
                    result = setDefaultPolicyVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SimulateCustomPolicyResult> simulateCustomPolicyAsync(SimulateCustomPolicyRequest request) {

        return simulateCustomPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SimulateCustomPolicyResult> simulateCustomPolicyAsync(final SimulateCustomPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SimulateCustomPolicyRequest, SimulateCustomPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SimulateCustomPolicyResult>() {
            @Override
            public SimulateCustomPolicyResult call() throws Exception {
                SimulateCustomPolicyResult result;

                try {
                    result = simulateCustomPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SimulatePrincipalPolicyResult> simulatePrincipalPolicyAsync(SimulatePrincipalPolicyRequest request) {

        return simulatePrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SimulatePrincipalPolicyResult> simulatePrincipalPolicyAsync(final SimulatePrincipalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SimulatePrincipalPolicyRequest, SimulatePrincipalPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SimulatePrincipalPolicyResult>() {
            @Override
            public SimulatePrincipalPolicyResult call() throws Exception {
                SimulatePrincipalPolicyResult result;

                try {
                    result = simulatePrincipalPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessKeyResult> updateAccessKeyAsync(UpdateAccessKeyRequest request) {

        return updateAccessKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessKeyResult> updateAccessKeyAsync(final UpdateAccessKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccessKeyRequest, UpdateAccessKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccessKeyResult>() {
            @Override
            public UpdateAccessKeyResult call() throws Exception {
                UpdateAccessKeyResult result;

                try {
                    result = updateAccessKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountPasswordPolicyResult> updateAccountPasswordPolicyAsync(UpdateAccountPasswordPolicyRequest request) {

        return updateAccountPasswordPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountPasswordPolicyResult> updateAccountPasswordPolicyAsync(final UpdateAccountPasswordPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountPasswordPolicyRequest, UpdateAccountPasswordPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountPasswordPolicyResult>() {
            @Override
            public UpdateAccountPasswordPolicyResult call() throws Exception {
                UpdateAccountPasswordPolicyResult result;

                try {
                    result = updateAccountPasswordPolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssumeRolePolicyResult> updateAssumeRolePolicyAsync(UpdateAssumeRolePolicyRequest request) {

        return updateAssumeRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssumeRolePolicyResult> updateAssumeRolePolicyAsync(final UpdateAssumeRolePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssumeRolePolicyRequest, UpdateAssumeRolePolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssumeRolePolicyResult>() {
            @Override
            public UpdateAssumeRolePolicyResult call() throws Exception {
                UpdateAssumeRolePolicyResult result;

                try {
                    result = updateAssumeRolePolicy(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(final UpdateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result;

                try {
                    result = updateGroup(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLoginProfileResult> updateLoginProfileAsync(UpdateLoginProfileRequest request) {

        return updateLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoginProfileResult> updateLoginProfileAsync(final UpdateLoginProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLoginProfileRequest, UpdateLoginProfileResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateLoginProfileResult>() {
            @Override
            public UpdateLoginProfileResult call() throws Exception {
                UpdateLoginProfileResult result;

                try {
                    result = updateLoginProfile(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateOpenIDConnectProviderThumbprintResult> updateOpenIDConnectProviderThumbprintAsync(
            UpdateOpenIDConnectProviderThumbprintRequest request) {

        return updateOpenIDConnectProviderThumbprintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOpenIDConnectProviderThumbprintResult> updateOpenIDConnectProviderThumbprintAsync(
            final UpdateOpenIDConnectProviderThumbprintRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOpenIDConnectProviderThumbprintRequest, UpdateOpenIDConnectProviderThumbprintResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateOpenIDConnectProviderThumbprintResult>() {
            @Override
            public UpdateOpenIDConnectProviderThumbprintResult call() throws Exception {
                UpdateOpenIDConnectProviderThumbprintResult result;

                try {
                    result = updateOpenIDConnectProviderThumbprint(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSAMLProviderResult> updateSAMLProviderAsync(UpdateSAMLProviderRequest request) {

        return updateSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSAMLProviderResult> updateSAMLProviderAsync(final UpdateSAMLProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSAMLProviderRequest, UpdateSAMLProviderResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSAMLProviderResult>() {
            @Override
            public UpdateSAMLProviderResult call() throws Exception {
                UpdateSAMLProviderResult result;

                try {
                    result = updateSAMLProvider(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSSHPublicKeyResult> updateSSHPublicKeyAsync(UpdateSSHPublicKeyRequest request) {

        return updateSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSSHPublicKeyResult> updateSSHPublicKeyAsync(final UpdateSSHPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSSHPublicKeyRequest, UpdateSSHPublicKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSSHPublicKeyResult>() {
            @Override
            public UpdateSSHPublicKeyResult call() throws Exception {
                UpdateSSHPublicKeyResult result;

                try {
                    result = updateSSHPublicKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateServerCertificateResult> updateServerCertificateAsync(UpdateServerCertificateRequest request) {

        return updateServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerCertificateResult> updateServerCertificateAsync(final UpdateServerCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServerCertificateRequest, UpdateServerCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateServerCertificateResult>() {
            @Override
            public UpdateServerCertificateResult call() throws Exception {
                UpdateServerCertificateResult result;

                try {
                    result = updateServerCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSigningCertificateResult> updateSigningCertificateAsync(UpdateSigningCertificateRequest request) {

        return updateSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSigningCertificateResult> updateSigningCertificateAsync(final UpdateSigningCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSigningCertificateRequest, UpdateSigningCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSigningCertificateResult>() {
            @Override
            public UpdateSigningCertificateResult call() throws Exception {
                UpdateSigningCertificateResult result;

                try {
                    result = updateSigningCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result;

                try {
                    result = updateUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UploadSSHPublicKeyResult> uploadSSHPublicKeyAsync(UploadSSHPublicKeyRequest request) {

        return uploadSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadSSHPublicKeyResult> uploadSSHPublicKeyAsync(final UploadSSHPublicKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadSSHPublicKeyRequest, UploadSSHPublicKeyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UploadSSHPublicKeyResult>() {
            @Override
            public UploadSSHPublicKeyResult call() throws Exception {
                UploadSSHPublicKeyResult result;

                try {
                    result = uploadSSHPublicKey(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UploadServerCertificateResult> uploadServerCertificateAsync(UploadServerCertificateRequest request) {

        return uploadServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadServerCertificateResult> uploadServerCertificateAsync(final UploadServerCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadServerCertificateRequest, UploadServerCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UploadServerCertificateResult>() {
            @Override
            public UploadServerCertificateResult call() throws Exception {
                UploadServerCertificateResult result;

                try {
                    result = uploadServerCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(UploadSigningCertificateRequest request) {

        return uploadSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(final UploadSigningCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadSigningCertificateRequest, UploadSigningCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UploadSigningCertificateResult>() {
            @Override
            public UploadSigningCertificateResult call() throws Exception {
                UploadSigningCertificateResult result;

                try {
                    result = uploadSigningCertificate(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
