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
package com.amazonaws.services.cognitoidp;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Cognito Identity Provider asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Using the Amazon Cognito User Pools API, you can create a user pool to manage directories and users. You can
 * authenticate a user to obtain tokens related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCognitoIdentityProviderAsyncClient extends AWSCognitoIdentityProviderClient implements AWSCognitoIdentityProviderAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity Provider
     *        (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * provided AWS account credentials provider and client configuration options.
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
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCognitoIdentityProviderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCognitoIdentityProviderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCognitoIdentityProviderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSCognitoIdentityProviderAsyncClientBuilder asyncBuilder() {
        return AWSCognitoIdentityProviderAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity Provider using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCognitoIdentityProviderAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(AddCustomAttributesRequest request) {

        return addCustomAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(final AddCustomAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddCustomAttributesRequest, AddCustomAttributesResult> asyncHandler) {
        final AddCustomAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddCustomAttributesResult>() {
            @Override
            public AddCustomAttributesResult call() throws Exception {
                AddCustomAttributesResult result = null;

                try {
                    result = executeAddCustomAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminAddUserToGroupResult> adminAddUserToGroupAsync(AdminAddUserToGroupRequest request) {

        return adminAddUserToGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminAddUserToGroupResult> adminAddUserToGroupAsync(final AdminAddUserToGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminAddUserToGroupRequest, AdminAddUserToGroupResult> asyncHandler) {
        final AdminAddUserToGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminAddUserToGroupResult>() {
            @Override
            public AdminAddUserToGroupResult call() throws Exception {
                AdminAddUserToGroupResult result = null;

                try {
                    result = executeAdminAddUserToGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(AdminConfirmSignUpRequest request) {

        return adminConfirmSignUpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(final AdminConfirmSignUpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminConfirmSignUpRequest, AdminConfirmSignUpResult> asyncHandler) {
        final AdminConfirmSignUpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminConfirmSignUpResult>() {
            @Override
            public AdminConfirmSignUpResult call() throws Exception {
                AdminConfirmSignUpResult result = null;

                try {
                    result = executeAdminConfirmSignUp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminCreateUserResult> adminCreateUserAsync(AdminCreateUserRequest request) {

        return adminCreateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminCreateUserResult> adminCreateUserAsync(final AdminCreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminCreateUserRequest, AdminCreateUserResult> asyncHandler) {
        final AdminCreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminCreateUserResult>() {
            @Override
            public AdminCreateUserResult call() throws Exception {
                AdminCreateUserResult result = null;

                try {
                    result = executeAdminCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(AdminDeleteUserRequest request) {

        return adminDeleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(final AdminDeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminDeleteUserRequest, AdminDeleteUserResult> asyncHandler) {
        final AdminDeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminDeleteUserResult>() {
            @Override
            public AdminDeleteUserResult call() throws Exception {
                AdminDeleteUserResult result = null;

                try {
                    result = executeAdminDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(AdminDeleteUserAttributesRequest request) {

        return adminDeleteUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(final AdminDeleteUserAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminDeleteUserAttributesRequest, AdminDeleteUserAttributesResult> asyncHandler) {
        final AdminDeleteUserAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminDeleteUserAttributesResult>() {
            @Override
            public AdminDeleteUserAttributesResult call() throws Exception {
                AdminDeleteUserAttributesResult result = null;

                try {
                    result = executeAdminDeleteUserAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminDisableProviderForUserResult> adminDisableProviderForUserAsync(AdminDisableProviderForUserRequest request) {

        return adminDisableProviderForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDisableProviderForUserResult> adminDisableProviderForUserAsync(final AdminDisableProviderForUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminDisableProviderForUserRequest, AdminDisableProviderForUserResult> asyncHandler) {
        final AdminDisableProviderForUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminDisableProviderForUserResult>() {
            @Override
            public AdminDisableProviderForUserResult call() throws Exception {
                AdminDisableProviderForUserResult result = null;

                try {
                    result = executeAdminDisableProviderForUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(AdminDisableUserRequest request) {

        return adminDisableUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(final AdminDisableUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminDisableUserRequest, AdminDisableUserResult> asyncHandler) {
        final AdminDisableUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminDisableUserResult>() {
            @Override
            public AdminDisableUserResult call() throws Exception {
                AdminDisableUserResult result = null;

                try {
                    result = executeAdminDisableUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(AdminEnableUserRequest request) {

        return adminEnableUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(final AdminEnableUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminEnableUserRequest, AdminEnableUserResult> asyncHandler) {
        final AdminEnableUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminEnableUserResult>() {
            @Override
            public AdminEnableUserResult call() throws Exception {
                AdminEnableUserResult result = null;

                try {
                    result = executeAdminEnableUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminForgetDeviceResult> adminForgetDeviceAsync(AdminForgetDeviceRequest request) {

        return adminForgetDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminForgetDeviceResult> adminForgetDeviceAsync(final AdminForgetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminForgetDeviceRequest, AdminForgetDeviceResult> asyncHandler) {
        final AdminForgetDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminForgetDeviceResult>() {
            @Override
            public AdminForgetDeviceResult call() throws Exception {
                AdminForgetDeviceResult result = null;

                try {
                    result = executeAdminForgetDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminGetDeviceResult> adminGetDeviceAsync(AdminGetDeviceRequest request) {

        return adminGetDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminGetDeviceResult> adminGetDeviceAsync(final AdminGetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminGetDeviceRequest, AdminGetDeviceResult> asyncHandler) {
        final AdminGetDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminGetDeviceResult>() {
            @Override
            public AdminGetDeviceResult call() throws Exception {
                AdminGetDeviceResult result = null;

                try {
                    result = executeAdminGetDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(AdminGetUserRequest request) {

        return adminGetUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(final AdminGetUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminGetUserRequest, AdminGetUserResult> asyncHandler) {
        final AdminGetUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminGetUserResult>() {
            @Override
            public AdminGetUserResult call() throws Exception {
                AdminGetUserResult result = null;

                try {
                    result = executeAdminGetUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminInitiateAuthResult> adminInitiateAuthAsync(AdminInitiateAuthRequest request) {

        return adminInitiateAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminInitiateAuthResult> adminInitiateAuthAsync(final AdminInitiateAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminInitiateAuthRequest, AdminInitiateAuthResult> asyncHandler) {
        final AdminInitiateAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminInitiateAuthResult>() {
            @Override
            public AdminInitiateAuthResult call() throws Exception {
                AdminInitiateAuthResult result = null;

                try {
                    result = executeAdminInitiateAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminLinkProviderForUserResult> adminLinkProviderForUserAsync(AdminLinkProviderForUserRequest request) {

        return adminLinkProviderForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminLinkProviderForUserResult> adminLinkProviderForUserAsync(final AdminLinkProviderForUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminLinkProviderForUserRequest, AdminLinkProviderForUserResult> asyncHandler) {
        final AdminLinkProviderForUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminLinkProviderForUserResult>() {
            @Override
            public AdminLinkProviderForUserResult call() throws Exception {
                AdminLinkProviderForUserResult result = null;

                try {
                    result = executeAdminLinkProviderForUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminListDevicesResult> adminListDevicesAsync(AdminListDevicesRequest request) {

        return adminListDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminListDevicesResult> adminListDevicesAsync(final AdminListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminListDevicesRequest, AdminListDevicesResult> asyncHandler) {
        final AdminListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminListDevicesResult>() {
            @Override
            public AdminListDevicesResult call() throws Exception {
                AdminListDevicesResult result = null;

                try {
                    result = executeAdminListDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminListGroupsForUserResult> adminListGroupsForUserAsync(AdminListGroupsForUserRequest request) {

        return adminListGroupsForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminListGroupsForUserResult> adminListGroupsForUserAsync(final AdminListGroupsForUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminListGroupsForUserRequest, AdminListGroupsForUserResult> asyncHandler) {
        final AdminListGroupsForUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminListGroupsForUserResult>() {
            @Override
            public AdminListGroupsForUserResult call() throws Exception {
                AdminListGroupsForUserResult result = null;

                try {
                    result = executeAdminListGroupsForUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminListUserAuthEventsResult> adminListUserAuthEventsAsync(AdminListUserAuthEventsRequest request) {

        return adminListUserAuthEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminListUserAuthEventsResult> adminListUserAuthEventsAsync(final AdminListUserAuthEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminListUserAuthEventsRequest, AdminListUserAuthEventsResult> asyncHandler) {
        final AdminListUserAuthEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminListUserAuthEventsResult>() {
            @Override
            public AdminListUserAuthEventsResult call() throws Exception {
                AdminListUserAuthEventsResult result = null;

                try {
                    result = executeAdminListUserAuthEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminRemoveUserFromGroupResult> adminRemoveUserFromGroupAsync(AdminRemoveUserFromGroupRequest request) {

        return adminRemoveUserFromGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminRemoveUserFromGroupResult> adminRemoveUserFromGroupAsync(final AdminRemoveUserFromGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminRemoveUserFromGroupRequest, AdminRemoveUserFromGroupResult> asyncHandler) {
        final AdminRemoveUserFromGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminRemoveUserFromGroupResult>() {
            @Override
            public AdminRemoveUserFromGroupResult call() throws Exception {
                AdminRemoveUserFromGroupResult result = null;

                try {
                    result = executeAdminRemoveUserFromGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(AdminResetUserPasswordRequest request) {

        return adminResetUserPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(final AdminResetUserPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminResetUserPasswordRequest, AdminResetUserPasswordResult> asyncHandler) {
        final AdminResetUserPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminResetUserPasswordResult>() {
            @Override
            public AdminResetUserPasswordResult call() throws Exception {
                AdminResetUserPasswordResult result = null;

                try {
                    result = executeAdminResetUserPassword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminRespondToAuthChallengeResult> adminRespondToAuthChallengeAsync(AdminRespondToAuthChallengeRequest request) {

        return adminRespondToAuthChallengeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminRespondToAuthChallengeResult> adminRespondToAuthChallengeAsync(final AdminRespondToAuthChallengeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminRespondToAuthChallengeRequest, AdminRespondToAuthChallengeResult> asyncHandler) {
        final AdminRespondToAuthChallengeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminRespondToAuthChallengeResult>() {
            @Override
            public AdminRespondToAuthChallengeResult call() throws Exception {
                AdminRespondToAuthChallengeResult result = null;

                try {
                    result = executeAdminRespondToAuthChallenge(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminSetUserMFAPreferenceResult> adminSetUserMFAPreferenceAsync(AdminSetUserMFAPreferenceRequest request) {

        return adminSetUserMFAPreferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminSetUserMFAPreferenceResult> adminSetUserMFAPreferenceAsync(final AdminSetUserMFAPreferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminSetUserMFAPreferenceRequest, AdminSetUserMFAPreferenceResult> asyncHandler) {
        final AdminSetUserMFAPreferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminSetUserMFAPreferenceResult>() {
            @Override
            public AdminSetUserMFAPreferenceResult call() throws Exception {
                AdminSetUserMFAPreferenceResult result = null;

                try {
                    result = executeAdminSetUserMFAPreference(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(AdminSetUserSettingsRequest request) {

        return adminSetUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(final AdminSetUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminSetUserSettingsRequest, AdminSetUserSettingsResult> asyncHandler) {
        final AdminSetUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminSetUserSettingsResult>() {
            @Override
            public AdminSetUserSettingsResult call() throws Exception {
                AdminSetUserSettingsResult result = null;

                try {
                    result = executeAdminSetUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateAuthEventFeedbackResult> adminUpdateAuthEventFeedbackAsync(AdminUpdateAuthEventFeedbackRequest request) {

        return adminUpdateAuthEventFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateAuthEventFeedbackResult> adminUpdateAuthEventFeedbackAsync(final AdminUpdateAuthEventFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminUpdateAuthEventFeedbackRequest, AdminUpdateAuthEventFeedbackResult> asyncHandler) {
        final AdminUpdateAuthEventFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminUpdateAuthEventFeedbackResult>() {
            @Override
            public AdminUpdateAuthEventFeedbackResult call() throws Exception {
                AdminUpdateAuthEventFeedbackResult result = null;

                try {
                    result = executeAdminUpdateAuthEventFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateDeviceStatusResult> adminUpdateDeviceStatusAsync(AdminUpdateDeviceStatusRequest request) {

        return adminUpdateDeviceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateDeviceStatusResult> adminUpdateDeviceStatusAsync(final AdminUpdateDeviceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminUpdateDeviceStatusRequest, AdminUpdateDeviceStatusResult> asyncHandler) {
        final AdminUpdateDeviceStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminUpdateDeviceStatusResult>() {
            @Override
            public AdminUpdateDeviceStatusResult call() throws Exception {
                AdminUpdateDeviceStatusResult result = null;

                try {
                    result = executeAdminUpdateDeviceStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(AdminUpdateUserAttributesRequest request) {

        return adminUpdateUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(final AdminUpdateUserAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminUpdateUserAttributesRequest, AdminUpdateUserAttributesResult> asyncHandler) {
        final AdminUpdateUserAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminUpdateUserAttributesResult>() {
            @Override
            public AdminUpdateUserAttributesResult call() throws Exception {
                AdminUpdateUserAttributesResult result = null;

                try {
                    result = executeAdminUpdateUserAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AdminUserGlobalSignOutResult> adminUserGlobalSignOutAsync(AdminUserGlobalSignOutRequest request) {

        return adminUserGlobalSignOutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminUserGlobalSignOutResult> adminUserGlobalSignOutAsync(final AdminUserGlobalSignOutRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdminUserGlobalSignOutRequest, AdminUserGlobalSignOutResult> asyncHandler) {
        final AdminUserGlobalSignOutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdminUserGlobalSignOutResult>() {
            @Override
            public AdminUserGlobalSignOutResult call() throws Exception {
                AdminUserGlobalSignOutResult result = null;

                try {
                    result = executeAdminUserGlobalSignOut(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateSoftwareTokenResult> associateSoftwareTokenAsync(AssociateSoftwareTokenRequest request) {

        return associateSoftwareTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSoftwareTokenResult> associateSoftwareTokenAsync(final AssociateSoftwareTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSoftwareTokenRequest, AssociateSoftwareTokenResult> asyncHandler) {
        final AssociateSoftwareTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSoftwareTokenResult>() {
            @Override
            public AssociateSoftwareTokenResult call() throws Exception {
                AssociateSoftwareTokenResult result = null;

                try {
                    result = executeAssociateSoftwareToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ChangePasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangePasswordResult>() {
            @Override
            public ChangePasswordResult call() throws Exception {
                ChangePasswordResult result = null;

                try {
                    result = executeChangePassword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ConfirmDeviceResult> confirmDeviceAsync(ConfirmDeviceRequest request) {

        return confirmDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmDeviceResult> confirmDeviceAsync(final ConfirmDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmDeviceRequest, ConfirmDeviceResult> asyncHandler) {
        final ConfirmDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmDeviceResult>() {
            @Override
            public ConfirmDeviceResult call() throws Exception {
                ConfirmDeviceResult result = null;

                try {
                    result = executeConfirmDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(ConfirmForgotPasswordRequest request) {

        return confirmForgotPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(final ConfirmForgotPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmForgotPasswordRequest, ConfirmForgotPasswordResult> asyncHandler) {
        final ConfirmForgotPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmForgotPasswordResult>() {
            @Override
            public ConfirmForgotPasswordResult call() throws Exception {
                ConfirmForgotPasswordResult result = null;

                try {
                    result = executeConfirmForgotPassword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(ConfirmSignUpRequest request) {

        return confirmSignUpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(final ConfirmSignUpRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmSignUpRequest, ConfirmSignUpResult> asyncHandler) {
        final ConfirmSignUpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmSignUpResult>() {
            @Override
            public ConfirmSignUpResult call() throws Exception {
                ConfirmSignUpResult result = null;

                try {
                    result = executeConfirmSignUp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(CreateIdentityProviderRequest request) {

        return createIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(final CreateIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdentityProviderRequest, CreateIdentityProviderResult> asyncHandler) {
        final CreateIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIdentityProviderResult>() {
            @Override
            public CreateIdentityProviderResult call() throws Exception {
                CreateIdentityProviderResult result = null;

                try {
                    result = executeCreateIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResourceServerResult> createResourceServerAsync(CreateResourceServerRequest request) {

        return createResourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceServerResult> createResourceServerAsync(final CreateResourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceServerRequest, CreateResourceServerResult> asyncHandler) {
        final CreateResourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceServerResult>() {
            @Override
            public CreateResourceServerResult call() throws Exception {
                CreateResourceServerResult result = null;

                try {
                    result = executeCreateResourceServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserImportJobResult> createUserImportJobAsync(CreateUserImportJobRequest request) {

        return createUserImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserImportJobResult> createUserImportJobAsync(final CreateUserImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserImportJobRequest, CreateUserImportJobResult> asyncHandler) {
        final CreateUserImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserImportJobResult>() {
            @Override
            public CreateUserImportJobResult call() throws Exception {
                CreateUserImportJobResult result = null;

                try {
                    result = executeCreateUserImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolResult> createUserPoolAsync(CreateUserPoolRequest request) {

        return createUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolResult> createUserPoolAsync(final CreateUserPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserPoolRequest, CreateUserPoolResult> asyncHandler) {
        final CreateUserPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserPoolResult>() {
            @Override
            public CreateUserPoolResult call() throws Exception {
                CreateUserPoolResult result = null;

                try {
                    result = executeCreateUserPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(CreateUserPoolClientRequest request) {

        return createUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(final CreateUserPoolClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserPoolClientRequest, CreateUserPoolClientResult> asyncHandler) {
        final CreateUserPoolClientRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserPoolClientResult>() {
            @Override
            public CreateUserPoolClientResult call() throws Exception {
                CreateUserPoolClientResult result = null;

                try {
                    result = executeCreateUserPoolClient(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolDomainResult> createUserPoolDomainAsync(CreateUserPoolDomainRequest request) {

        return createUserPoolDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolDomainResult> createUserPoolDomainAsync(final CreateUserPoolDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserPoolDomainRequest, CreateUserPoolDomainResult> asyncHandler) {
        final CreateUserPoolDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserPoolDomainResult>() {
            @Override
            public CreateUserPoolDomainResult call() throws Exception {
                CreateUserPoolDomainResult result = null;

                try {
                    result = executeCreateUserPoolDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(DeleteIdentityProviderRequest request) {

        return deleteIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(final DeleteIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityProviderRequest, DeleteIdentityProviderResult> asyncHandler) {
        final DeleteIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityProviderResult>() {
            @Override
            public DeleteIdentityProviderResult call() throws Exception {
                DeleteIdentityProviderResult result = null;

                try {
                    result = executeDeleteIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceServerResult> deleteResourceServerAsync(DeleteResourceServerRequest request) {

        return deleteResourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceServerResult> deleteResourceServerAsync(final DeleteResourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceServerRequest, DeleteResourceServerResult> asyncHandler) {
        final DeleteResourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceServerResult>() {
            @Override
            public DeleteResourceServerResult call() throws Exception {
                DeleteResourceServerResult result = null;

                try {
                    result = executeDeleteResourceServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAttributesResult> deleteUserAttributesAsync(DeleteUserAttributesRequest request) {

        return deleteUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAttributesResult> deleteUserAttributesAsync(final DeleteUserAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserAttributesRequest, DeleteUserAttributesResult> asyncHandler) {
        final DeleteUserAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserAttributesResult>() {
            @Override
            public DeleteUserAttributesResult call() throws Exception {
                DeleteUserAttributesResult result = null;

                try {
                    result = executeDeleteUserAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolResult> deleteUserPoolAsync(DeleteUserPoolRequest request) {

        return deleteUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolResult> deleteUserPoolAsync(final DeleteUserPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserPoolRequest, DeleteUserPoolResult> asyncHandler) {
        final DeleteUserPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserPoolResult>() {
            @Override
            public DeleteUserPoolResult call() throws Exception {
                DeleteUserPoolResult result = null;

                try {
                    result = executeDeleteUserPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(DeleteUserPoolClientRequest request) {

        return deleteUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(final DeleteUserPoolClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserPoolClientRequest, DeleteUserPoolClientResult> asyncHandler) {
        final DeleteUserPoolClientRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserPoolClientResult>() {
            @Override
            public DeleteUserPoolClientResult call() throws Exception {
                DeleteUserPoolClientResult result = null;

                try {
                    result = executeDeleteUserPoolClient(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolDomainResult> deleteUserPoolDomainAsync(DeleteUserPoolDomainRequest request) {

        return deleteUserPoolDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolDomainResult> deleteUserPoolDomainAsync(final DeleteUserPoolDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserPoolDomainRequest, DeleteUserPoolDomainResult> asyncHandler) {
        final DeleteUserPoolDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserPoolDomainResult>() {
            @Override
            public DeleteUserPoolDomainResult call() throws Exception {
                DeleteUserPoolDomainResult result = null;

                try {
                    result = executeDeleteUserPoolDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityProviderResult> describeIdentityProviderAsync(DescribeIdentityProviderRequest request) {

        return describeIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityProviderResult> describeIdentityProviderAsync(final DescribeIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityProviderRequest, DescribeIdentityProviderResult> asyncHandler) {
        final DescribeIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityProviderResult>() {
            @Override
            public DescribeIdentityProviderResult call() throws Exception {
                DescribeIdentityProviderResult result = null;

                try {
                    result = executeDescribeIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceServerResult> describeResourceServerAsync(DescribeResourceServerRequest request) {

        return describeResourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceServerResult> describeResourceServerAsync(final DescribeResourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceServerRequest, DescribeResourceServerResult> asyncHandler) {
        final DescribeResourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceServerResult>() {
            @Override
            public DescribeResourceServerResult call() throws Exception {
                DescribeResourceServerResult result = null;

                try {
                    result = executeDescribeResourceServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRiskConfigurationResult> describeRiskConfigurationAsync(DescribeRiskConfigurationRequest request) {

        return describeRiskConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRiskConfigurationResult> describeRiskConfigurationAsync(final DescribeRiskConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRiskConfigurationRequest, DescribeRiskConfigurationResult> asyncHandler) {
        final DescribeRiskConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRiskConfigurationResult>() {
            @Override
            public DescribeRiskConfigurationResult call() throws Exception {
                DescribeRiskConfigurationResult result = null;

                try {
                    result = executeDescribeRiskConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserImportJobResult> describeUserImportJobAsync(DescribeUserImportJobRequest request) {

        return describeUserImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserImportJobResult> describeUserImportJobAsync(final DescribeUserImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserImportJobRequest, DescribeUserImportJobResult> asyncHandler) {
        final DescribeUserImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserImportJobResult>() {
            @Override
            public DescribeUserImportJobResult call() throws Exception {
                DescribeUserImportJobResult result = null;

                try {
                    result = executeDescribeUserImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(DescribeUserPoolRequest request) {

        return describeUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(final DescribeUserPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserPoolRequest, DescribeUserPoolResult> asyncHandler) {
        final DescribeUserPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserPoolResult>() {
            @Override
            public DescribeUserPoolResult call() throws Exception {
                DescribeUserPoolResult result = null;

                try {
                    result = executeDescribeUserPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(DescribeUserPoolClientRequest request) {

        return describeUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(final DescribeUserPoolClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserPoolClientRequest, DescribeUserPoolClientResult> asyncHandler) {
        final DescribeUserPoolClientRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserPoolClientResult>() {
            @Override
            public DescribeUserPoolClientResult call() throws Exception {
                DescribeUserPoolClientResult result = null;

                try {
                    result = executeDescribeUserPoolClient(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolDomainResult> describeUserPoolDomainAsync(DescribeUserPoolDomainRequest request) {

        return describeUserPoolDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolDomainResult> describeUserPoolDomainAsync(final DescribeUserPoolDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserPoolDomainRequest, DescribeUserPoolDomainResult> asyncHandler) {
        final DescribeUserPoolDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserPoolDomainResult>() {
            @Override
            public DescribeUserPoolDomainResult call() throws Exception {
                DescribeUserPoolDomainResult result = null;

                try {
                    result = executeDescribeUserPoolDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ForgetDeviceResult> forgetDeviceAsync(ForgetDeviceRequest request) {

        return forgetDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ForgetDeviceResult> forgetDeviceAsync(final ForgetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ForgetDeviceRequest, ForgetDeviceResult> asyncHandler) {
        final ForgetDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ForgetDeviceResult>() {
            @Override
            public ForgetDeviceResult call() throws Exception {
                ForgetDeviceResult result = null;

                try {
                    result = executeForgetDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(ForgotPasswordRequest request) {

        return forgotPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(final ForgotPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<ForgotPasswordRequest, ForgotPasswordResult> asyncHandler) {
        final ForgotPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ForgotPasswordResult>() {
            @Override
            public ForgotPasswordResult call() throws Exception {
                ForgotPasswordResult result = null;

                try {
                    result = executeForgotPassword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCSVHeaderResult> getCSVHeaderAsync(GetCSVHeaderRequest request) {

        return getCSVHeaderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCSVHeaderResult> getCSVHeaderAsync(final GetCSVHeaderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCSVHeaderRequest, GetCSVHeaderResult> asyncHandler) {
        final GetCSVHeaderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCSVHeaderResult>() {
            @Override
            public GetCSVHeaderResult call() throws Exception {
                GetCSVHeaderResult result = null;

                try {
                    result = executeGetCSVHeader(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request) {

        return getDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(final GetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {
        final GetDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceResult>() {
            @Override
            public GetDeviceResult call() throws Exception {
                GetDeviceResult result = null;

                try {
                    result = executeGetDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(final GetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {
        final GetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupResult>() {
            @Override
            public GetGroupResult call() throws Exception {
                GetGroupResult result = null;

                try {
                    result = executeGetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderByIdentifierResult> getIdentityProviderByIdentifierAsync(
            GetIdentityProviderByIdentifierRequest request) {

        return getIdentityProviderByIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderByIdentifierResult> getIdentityProviderByIdentifierAsync(
            final GetIdentityProviderByIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityProviderByIdentifierRequest, GetIdentityProviderByIdentifierResult> asyncHandler) {
        final GetIdentityProviderByIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityProviderByIdentifierResult>() {
            @Override
            public GetIdentityProviderByIdentifierResult call() throws Exception {
                GetIdentityProviderByIdentifierResult result = null;

                try {
                    result = executeGetIdentityProviderByIdentifier(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSigningCertificateResult> getSigningCertificateAsync(GetSigningCertificateRequest request) {

        return getSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSigningCertificateResult> getSigningCertificateAsync(final GetSigningCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSigningCertificateRequest, GetSigningCertificateResult> asyncHandler) {
        final GetSigningCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSigningCertificateResult>() {
            @Override
            public GetSigningCertificateResult call() throws Exception {
                GetSigningCertificateResult result = null;

                try {
                    result = executeGetSigningCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUICustomizationResult> getUICustomizationAsync(GetUICustomizationRequest request) {

        return getUICustomizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUICustomizationResult> getUICustomizationAsync(final GetUICustomizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUICustomizationRequest, GetUICustomizationResult> asyncHandler) {
        final GetUICustomizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUICustomizationResult>() {
            @Override
            public GetUICustomizationResult call() throws Exception {
                GetUICustomizationResult result = null;

                try {
                    result = executeGetUICustomization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserResult>() {
            @Override
            public GetUserResult call() throws Exception {
                GetUserResult result = null;

                try {
                    result = executeGetUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            GetUserAttributeVerificationCodeRequest request) {

        return getUserAttributeVerificationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            final GetUserAttributeVerificationCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserAttributeVerificationCodeRequest, GetUserAttributeVerificationCodeResult> asyncHandler) {
        final GetUserAttributeVerificationCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserAttributeVerificationCodeResult>() {
            @Override
            public GetUserAttributeVerificationCodeResult call() throws Exception {
                GetUserAttributeVerificationCodeResult result = null;

                try {
                    result = executeGetUserAttributeVerificationCode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserPoolMfaConfigResult> getUserPoolMfaConfigAsync(GetUserPoolMfaConfigRequest request) {

        return getUserPoolMfaConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserPoolMfaConfigResult> getUserPoolMfaConfigAsync(final GetUserPoolMfaConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserPoolMfaConfigRequest, GetUserPoolMfaConfigResult> asyncHandler) {
        final GetUserPoolMfaConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserPoolMfaConfigResult>() {
            @Override
            public GetUserPoolMfaConfigResult call() throws Exception {
                GetUserPoolMfaConfigResult result = null;

                try {
                    result = executeGetUserPoolMfaConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GlobalSignOutResult> globalSignOutAsync(GlobalSignOutRequest request) {

        return globalSignOutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GlobalSignOutResult> globalSignOutAsync(final GlobalSignOutRequest request,
            final com.amazonaws.handlers.AsyncHandler<GlobalSignOutRequest, GlobalSignOutResult> asyncHandler) {
        final GlobalSignOutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GlobalSignOutResult>() {
            @Override
            public GlobalSignOutResult call() throws Exception {
                GlobalSignOutResult result = null;

                try {
                    result = executeGlobalSignOut(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InitiateAuthResult> initiateAuthAsync(InitiateAuthRequest request) {

        return initiateAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateAuthResult> initiateAuthAsync(final InitiateAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateAuthRequest, InitiateAuthResult> asyncHandler) {
        final InitiateAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InitiateAuthResult>() {
            @Override
            public InitiateAuthResult call() throws Exception {
                InitiateAuthResult result = null;

                try {
                    result = executeInitiateAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {
        final ListDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result = null;

                try {
                    result = executeListDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest request) {

        return listIdentityProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(final ListIdentityProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler) {
        final ListIdentityProvidersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityProvidersResult>() {
            @Override
            public ListIdentityProvidersResult call() throws Exception {
                ListIdentityProvidersResult result = null;

                try {
                    result = executeListIdentityProviders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourceServersResult> listResourceServersAsync(ListResourceServersRequest request) {

        return listResourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceServersResult> listResourceServersAsync(final ListResourceServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceServersRequest, ListResourceServersResult> asyncHandler) {
        final ListResourceServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceServersResult>() {
            @Override
            public ListResourceServersResult call() throws Exception {
                ListResourceServersResult result = null;

                try {
                    result = executeListResourceServers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserImportJobsResult> listUserImportJobsAsync(ListUserImportJobsRequest request) {

        return listUserImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserImportJobsResult> listUserImportJobsAsync(final ListUserImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserImportJobsRequest, ListUserImportJobsResult> asyncHandler) {
        final ListUserImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserImportJobsResult>() {
            @Override
            public ListUserImportJobsResult call() throws Exception {
                ListUserImportJobsResult result = null;

                try {
                    result = executeListUserImportJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolClientsResult> listUserPoolClientsAsync(ListUserPoolClientsRequest request) {

        return listUserPoolClientsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolClientsResult> listUserPoolClientsAsync(final ListUserPoolClientsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserPoolClientsRequest, ListUserPoolClientsResult> asyncHandler) {
        final ListUserPoolClientsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserPoolClientsResult>() {
            @Override
            public ListUserPoolClientsResult call() throws Exception {
                ListUserPoolClientsResult result = null;

                try {
                    result = executeListUserPoolClients(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolsResult> listUserPoolsAsync(ListUserPoolsRequest request) {

        return listUserPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolsResult> listUserPoolsAsync(final ListUserPoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserPoolsRequest, ListUserPoolsResult> asyncHandler) {
        final ListUserPoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserPoolsResult>() {
            @Override
            public ListUserPoolsResult call() throws Exception {
                ListUserPoolsResult result = null;

                try {
                    result = executeListUserPools(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUsersInGroupResult> listUsersInGroupAsync(ListUsersInGroupRequest request) {

        return listUsersInGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersInGroupResult> listUsersInGroupAsync(final ListUsersInGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersInGroupRequest, ListUsersInGroupResult> asyncHandler) {
        final ListUsersInGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersInGroupResult>() {
            @Override
            public ListUsersInGroupResult call() throws Exception {
                ListUsersInGroupResult result = null;

                try {
                    result = executeListUsersInGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResendConfirmationCodeResult> resendConfirmationCodeAsync(ResendConfirmationCodeRequest request) {

        return resendConfirmationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResendConfirmationCodeResult> resendConfirmationCodeAsync(final ResendConfirmationCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResendConfirmationCodeRequest, ResendConfirmationCodeResult> asyncHandler) {
        final ResendConfirmationCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResendConfirmationCodeResult>() {
            @Override
            public ResendConfirmationCodeResult call() throws Exception {
                ResendConfirmationCodeResult result = null;

                try {
                    result = executeResendConfirmationCode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RespondToAuthChallengeResult> respondToAuthChallengeAsync(RespondToAuthChallengeRequest request) {

        return respondToAuthChallengeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RespondToAuthChallengeResult> respondToAuthChallengeAsync(final RespondToAuthChallengeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RespondToAuthChallengeRequest, RespondToAuthChallengeResult> asyncHandler) {
        final RespondToAuthChallengeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RespondToAuthChallengeResult>() {
            @Override
            public RespondToAuthChallengeResult call() throws Exception {
                RespondToAuthChallengeResult result = null;

                try {
                    result = executeRespondToAuthChallenge(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetRiskConfigurationResult> setRiskConfigurationAsync(SetRiskConfigurationRequest request) {

        return setRiskConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetRiskConfigurationResult> setRiskConfigurationAsync(final SetRiskConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetRiskConfigurationRequest, SetRiskConfigurationResult> asyncHandler) {
        final SetRiskConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetRiskConfigurationResult>() {
            @Override
            public SetRiskConfigurationResult call() throws Exception {
                SetRiskConfigurationResult result = null;

                try {
                    result = executeSetRiskConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetUICustomizationResult> setUICustomizationAsync(SetUICustomizationRequest request) {

        return setUICustomizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetUICustomizationResult> setUICustomizationAsync(final SetUICustomizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetUICustomizationRequest, SetUICustomizationResult> asyncHandler) {
        final SetUICustomizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetUICustomizationResult>() {
            @Override
            public SetUICustomizationResult call() throws Exception {
                SetUICustomizationResult result = null;

                try {
                    result = executeSetUICustomization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetUserMFAPreferenceResult> setUserMFAPreferenceAsync(SetUserMFAPreferenceRequest request) {

        return setUserMFAPreferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetUserMFAPreferenceResult> setUserMFAPreferenceAsync(final SetUserMFAPreferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetUserMFAPreferenceRequest, SetUserMFAPreferenceResult> asyncHandler) {
        final SetUserMFAPreferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetUserMFAPreferenceResult>() {
            @Override
            public SetUserMFAPreferenceResult call() throws Exception {
                SetUserMFAPreferenceResult result = null;

                try {
                    result = executeSetUserMFAPreference(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetUserPoolMfaConfigResult> setUserPoolMfaConfigAsync(SetUserPoolMfaConfigRequest request) {

        return setUserPoolMfaConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetUserPoolMfaConfigResult> setUserPoolMfaConfigAsync(final SetUserPoolMfaConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetUserPoolMfaConfigRequest, SetUserPoolMfaConfigResult> asyncHandler) {
        final SetUserPoolMfaConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetUserPoolMfaConfigResult>() {
            @Override
            public SetUserPoolMfaConfigResult call() throws Exception {
                SetUserPoolMfaConfigResult result = null;

                try {
                    result = executeSetUserPoolMfaConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetUserSettingsResult> setUserSettingsAsync(SetUserSettingsRequest request) {

        return setUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetUserSettingsResult> setUserSettingsAsync(final SetUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetUserSettingsRequest, SetUserSettingsResult> asyncHandler) {
        final SetUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetUserSettingsResult>() {
            @Override
            public SetUserSettingsResult call() throws Exception {
                SetUserSettingsResult result = null;

                try {
                    result = executeSetUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SignUpResult> signUpAsync(SignUpRequest request) {

        return signUpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignUpResult> signUpAsync(final SignUpRequest request,
            final com.amazonaws.handlers.AsyncHandler<SignUpRequest, SignUpResult> asyncHandler) {
        final SignUpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SignUpResult>() {
            @Override
            public SignUpResult call() throws Exception {
                SignUpResult result = null;

                try {
                    result = executeSignUp(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartUserImportJobResult> startUserImportJobAsync(StartUserImportJobRequest request) {

        return startUserImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartUserImportJobResult> startUserImportJobAsync(final StartUserImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartUserImportJobRequest, StartUserImportJobResult> asyncHandler) {
        final StartUserImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartUserImportJobResult>() {
            @Override
            public StartUserImportJobResult call() throws Exception {
                StartUserImportJobResult result = null;

                try {
                    result = executeStartUserImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopUserImportJobResult> stopUserImportJobAsync(StopUserImportJobRequest request) {

        return stopUserImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopUserImportJobResult> stopUserImportJobAsync(final StopUserImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopUserImportJobRequest, StopUserImportJobResult> asyncHandler) {
        final StopUserImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopUserImportJobResult>() {
            @Override
            public StopUserImportJobResult call() throws Exception {
                StopUserImportJobResult result = null;

                try {
                    result = executeStopUserImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthEventFeedbackResult> updateAuthEventFeedbackAsync(UpdateAuthEventFeedbackRequest request) {

        return updateAuthEventFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthEventFeedbackResult> updateAuthEventFeedbackAsync(final UpdateAuthEventFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAuthEventFeedbackRequest, UpdateAuthEventFeedbackResult> asyncHandler) {
        final UpdateAuthEventFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAuthEventFeedbackResult>() {
            @Override
            public UpdateAuthEventFeedbackResult call() throws Exception {
                UpdateAuthEventFeedbackResult result = null;

                try {
                    result = executeUpdateAuthEventFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceStatusResult> updateDeviceStatusAsync(UpdateDeviceStatusRequest request) {

        return updateDeviceStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceStatusResult> updateDeviceStatusAsync(final UpdateDeviceStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceStatusRequest, UpdateDeviceStatusResult> asyncHandler) {
        final UpdateDeviceStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceStatusResult>() {
            @Override
            public UpdateDeviceStatusResult call() throws Exception {
                UpdateDeviceStatusResult result = null;

                try {
                    result = executeUpdateDeviceStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result = null;

                try {
                    result = executeUpdateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(UpdateIdentityProviderRequest request) {

        return updateIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(final UpdateIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderRequest, UpdateIdentityProviderResult> asyncHandler) {
        final UpdateIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdentityProviderResult>() {
            @Override
            public UpdateIdentityProviderResult call() throws Exception {
                UpdateIdentityProviderResult result = null;

                try {
                    result = executeUpdateIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceServerResult> updateResourceServerAsync(UpdateResourceServerRequest request) {

        return updateResourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceServerResult> updateResourceServerAsync(final UpdateResourceServerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceServerRequest, UpdateResourceServerResult> asyncHandler) {
        final UpdateResourceServerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceServerResult>() {
            @Override
            public UpdateResourceServerResult call() throws Exception {
                UpdateResourceServerResult result = null;

                try {
                    result = executeUpdateResourceServer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(UpdateUserAttributesRequest request) {

        return updateUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(final UpdateUserAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserAttributesRequest, UpdateUserAttributesResult> asyncHandler) {
        final UpdateUserAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserAttributesResult>() {
            @Override
            public UpdateUserAttributesResult call() throws Exception {
                UpdateUserAttributesResult result = null;

                try {
                    result = executeUpdateUserAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(UpdateUserPoolRequest request) {

        return updateUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(final UpdateUserPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserPoolRequest, UpdateUserPoolResult> asyncHandler) {
        final UpdateUserPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserPoolResult>() {
            @Override
            public UpdateUserPoolResult call() throws Exception {
                UpdateUserPoolResult result = null;

                try {
                    result = executeUpdateUserPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(UpdateUserPoolClientRequest request) {

        return updateUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(final UpdateUserPoolClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserPoolClientRequest, UpdateUserPoolClientResult> asyncHandler) {
        final UpdateUserPoolClientRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserPoolClientResult>() {
            @Override
            public UpdateUserPoolClientResult call() throws Exception {
                UpdateUserPoolClientResult result = null;

                try {
                    result = executeUpdateUserPoolClient(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolDomainResult> updateUserPoolDomainAsync(UpdateUserPoolDomainRequest request) {

        return updateUserPoolDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolDomainResult> updateUserPoolDomainAsync(final UpdateUserPoolDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserPoolDomainRequest, UpdateUserPoolDomainResult> asyncHandler) {
        final UpdateUserPoolDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserPoolDomainResult>() {
            @Override
            public UpdateUserPoolDomainResult call() throws Exception {
                UpdateUserPoolDomainResult result = null;

                try {
                    result = executeUpdateUserPoolDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifySoftwareTokenResult> verifySoftwareTokenAsync(VerifySoftwareTokenRequest request) {

        return verifySoftwareTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifySoftwareTokenResult> verifySoftwareTokenAsync(final VerifySoftwareTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifySoftwareTokenRequest, VerifySoftwareTokenResult> asyncHandler) {
        final VerifySoftwareTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifySoftwareTokenResult>() {
            @Override
            public VerifySoftwareTokenResult call() throws Exception {
                VerifySoftwareTokenResult result = null;

                try {
                    result = executeVerifySoftwareToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(VerifyUserAttributeRequest request) {

        return verifyUserAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(final VerifyUserAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyUserAttributeRequest, VerifyUserAttributeResult> asyncHandler) {
        final VerifyUserAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyUserAttributeResult>() {
            @Override
            public VerifyUserAttributeResult call() throws Exception {
                VerifyUserAttributeResult result = null;

                try {
                    result = executeVerifyUserAttribute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
