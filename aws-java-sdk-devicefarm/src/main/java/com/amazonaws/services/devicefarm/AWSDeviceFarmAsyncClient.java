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
package com.amazonaws.services.devicefarm;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Device Farm asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDeviceFarmAsyncClient extends AWSDeviceFarmClient implements AWSDeviceFarmAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Device Farm (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the provided AWS account
     * credentials provider and client configuration options.
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
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDeviceFarmAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDeviceFarmAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDeviceFarmAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSDeviceFarmAsyncClientBuilder asyncBuilder() {
        return AWSDeviceFarmAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDeviceFarmAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest request) {

        return createDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(final CreateDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler) {
        final CreateDevicePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDevicePoolResult>() {
            @Override
            public CreateDevicePoolResult call() throws Exception {
                CreateDevicePoolResult result = null;

                try {
                    result = executeCreateDevicePool(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(CreateInstanceProfileRequest request) {

        return createInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(final CreateInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceProfileRequest, CreateInstanceProfileResult> asyncHandler) {
        final CreateInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceProfileResult>() {
            @Override
            public CreateInstanceProfileResult call() throws Exception {
                CreateInstanceProfileResult result = null;

                try {
                    result = executeCreateInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkProfileResult> createNetworkProfileAsync(CreateNetworkProfileRequest request) {

        return createNetworkProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkProfileResult> createNetworkProfileAsync(final CreateNetworkProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkProfileRequest, CreateNetworkProfileResult> asyncHandler) {
        final CreateNetworkProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkProfileResult>() {
            @Override
            public CreateNetworkProfileResult call() throws Exception {
                CreateNetworkProfileResult result = null;

                try {
                    result = executeCreateNetworkProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(final CreateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {
        final CreateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectResult>() {
            @Override
            public CreateProjectResult call() throws Exception {
                CreateProjectResult result = null;

                try {
                    result = executeCreateProject(finalRequest);
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
    public java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(CreateRemoteAccessSessionRequest request) {

        return createRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(final CreateRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRemoteAccessSessionRequest, CreateRemoteAccessSessionResult> asyncHandler) {
        final CreateRemoteAccessSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRemoteAccessSessionResult>() {
            @Override
            public CreateRemoteAccessSessionResult call() throws Exception {
                CreateRemoteAccessSessionResult result = null;

                try {
                    result = executeCreateRemoteAccessSession(finalRequest);
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
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest request) {

        return createUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(final CreateUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler) {
        final CreateUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUploadResult>() {
            @Override
            public CreateUploadResult call() throws Exception {
                CreateUploadResult result = null;

                try {
                    result = executeCreateUpload(finalRequest);
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
    public java.util.concurrent.Future<CreateVPCEConfigurationResult> createVPCEConfigurationAsync(CreateVPCEConfigurationRequest request) {

        return createVPCEConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVPCEConfigurationResult> createVPCEConfigurationAsync(final CreateVPCEConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVPCEConfigurationRequest, CreateVPCEConfigurationResult> asyncHandler) {
        final CreateVPCEConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVPCEConfigurationResult>() {
            @Override
            public CreateVPCEConfigurationResult call() throws Exception {
                CreateVPCEConfigurationResult result = null;

                try {
                    result = executeCreateVPCEConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest request) {

        return deleteDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(final DeleteDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDevicePoolRequest, DeleteDevicePoolResult> asyncHandler) {
        final DeleteDevicePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDevicePoolResult>() {
            @Override
            public DeleteDevicePoolResult call() throws Exception {
                DeleteDevicePoolResult result = null;

                try {
                    result = executeDeleteDevicePool(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(DeleteInstanceProfileRequest request) {

        return deleteInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(final DeleteInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceProfileRequest, DeleteInstanceProfileResult> asyncHandler) {
        final DeleteInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceProfileResult>() {
            @Override
            public DeleteInstanceProfileResult call() throws Exception {
                DeleteInstanceProfileResult result = null;

                try {
                    result = executeDeleteInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkProfileResult> deleteNetworkProfileAsync(DeleteNetworkProfileRequest request) {

        return deleteNetworkProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkProfileResult> deleteNetworkProfileAsync(final DeleteNetworkProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkProfileRequest, DeleteNetworkProfileResult> asyncHandler) {
        final DeleteNetworkProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkProfileResult>() {
            @Override
            public DeleteNetworkProfileResult call() throws Exception {
                DeleteNetworkProfileResult result = null;

                try {
                    result = executeDeleteNetworkProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(final DeleteProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {
        final DeleteProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectResult>() {
            @Override
            public DeleteProjectResult call() throws Exception {
                DeleteProjectResult result = null;

                try {
                    result = executeDeleteProject(finalRequest);
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
    public java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(DeleteRemoteAccessSessionRequest request) {

        return deleteRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(final DeleteRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRemoteAccessSessionRequest, DeleteRemoteAccessSessionResult> asyncHandler) {
        final DeleteRemoteAccessSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRemoteAccessSessionResult>() {
            @Override
            public DeleteRemoteAccessSessionResult call() throws Exception {
                DeleteRemoteAccessSessionResult result = null;

                try {
                    result = executeDeleteRemoteAccessSession(finalRequest);
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
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(final DeleteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {
        final DeleteRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRunResult>() {
            @Override
            public DeleteRunResult call() throws Exception {
                DeleteRunResult result = null;

                try {
                    result = executeDeleteRun(finalRequest);
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
    public java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest request) {

        return deleteUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(final DeleteUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUploadRequest, DeleteUploadResult> asyncHandler) {
        final DeleteUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUploadResult>() {
            @Override
            public DeleteUploadResult call() throws Exception {
                DeleteUploadResult result = null;

                try {
                    result = executeDeleteUpload(finalRequest);
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
    public java.util.concurrent.Future<DeleteVPCEConfigurationResult> deleteVPCEConfigurationAsync(DeleteVPCEConfigurationRequest request) {

        return deleteVPCEConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVPCEConfigurationResult> deleteVPCEConfigurationAsync(final DeleteVPCEConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVPCEConfigurationRequest, DeleteVPCEConfigurationResult> asyncHandler) {
        final DeleteVPCEConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVPCEConfigurationResult>() {
            @Override
            public DeleteVPCEConfigurationResult call() throws Exception {
                DeleteVPCEConfigurationResult result = null;

                try {
                    result = executeDeleteVPCEConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {
        final GetAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result = null;

                try {
                    result = executeGetAccountSettings(finalRequest);
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
    public java.util.concurrent.Future<GetDeviceInstanceResult> getDeviceInstanceAsync(GetDeviceInstanceRequest request) {

        return getDeviceInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceInstanceResult> getDeviceInstanceAsync(final GetDeviceInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceInstanceRequest, GetDeviceInstanceResult> asyncHandler) {
        final GetDeviceInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceInstanceResult>() {
            @Override
            public GetDeviceInstanceResult call() throws Exception {
                GetDeviceInstanceResult result = null;

                try {
                    result = executeGetDeviceInstance(finalRequest);
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
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(GetDevicePoolRequest request) {

        return getDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(final GetDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePoolRequest, GetDevicePoolResult> asyncHandler) {
        final GetDevicePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicePoolResult>() {
            @Override
            public GetDevicePoolResult call() throws Exception {
                GetDevicePoolResult result = null;

                try {
                    result = executeGetDevicePool(finalRequest);
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
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(GetDevicePoolCompatibilityRequest request) {

        return getDevicePoolCompatibilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(final GetDevicePoolCompatibilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePoolCompatibilityRequest, GetDevicePoolCompatibilityResult> asyncHandler) {
        final GetDevicePoolCompatibilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicePoolCompatibilityResult>() {
            @Override
            public GetDevicePoolCompatibilityResult call() throws Exception {
                GetDevicePoolCompatibilityResult result = null;

                try {
                    result = executeGetDevicePoolCompatibility(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(GetInstanceProfileRequest request) {

        return getInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(final GetInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceProfileRequest, GetInstanceProfileResult> asyncHandler) {
        final GetInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceProfileResult>() {
            @Override
            public GetInstanceProfileResult call() throws Exception {
                GetInstanceProfileResult result = null;

                try {
                    result = executeGetInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(final GetJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {
        final GetJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobResult>() {
            @Override
            public GetJobResult call() throws Exception {
                GetJobResult result = null;

                try {
                    result = executeGetJob(finalRequest);
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
    public java.util.concurrent.Future<GetNetworkProfileResult> getNetworkProfileAsync(GetNetworkProfileRequest request) {

        return getNetworkProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkProfileResult> getNetworkProfileAsync(final GetNetworkProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkProfileRequest, GetNetworkProfileResult> asyncHandler) {
        final GetNetworkProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkProfileResult>() {
            @Override
            public GetNetworkProfileResult call() throws Exception {
                GetNetworkProfileResult result = null;

                try {
                    result = executeGetNetworkProfile(finalRequest);
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
    public java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(GetOfferingStatusRequest request) {

        return getOfferingStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(final GetOfferingStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOfferingStatusRequest, GetOfferingStatusResult> asyncHandler) {
        final GetOfferingStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOfferingStatusResult>() {
            @Override
            public GetOfferingStatusResult call() throws Exception {
                GetOfferingStatusResult result = null;

                try {
                    result = executeGetOfferingStatus(finalRequest);
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
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest request) {

        return getProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(final GetProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler) {
        final GetProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProjectResult>() {
            @Override
            public GetProjectResult call() throws Exception {
                GetProjectResult result = null;

                try {
                    result = executeGetProject(finalRequest);
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
    public java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(GetRemoteAccessSessionRequest request) {

        return getRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(final GetRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRemoteAccessSessionRequest, GetRemoteAccessSessionResult> asyncHandler) {
        final GetRemoteAccessSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRemoteAccessSessionResult>() {
            @Override
            public GetRemoteAccessSessionResult call() throws Exception {
                GetRemoteAccessSessionResult result = null;

                try {
                    result = executeGetRemoteAccessSession(finalRequest);
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
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request) {

        return getRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(final GetRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler) {
        final GetRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRunResult>() {
            @Override
            public GetRunResult call() throws Exception {
                GetRunResult result = null;

                try {
                    result = executeGetRun(finalRequest);
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
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(GetSuiteRequest request) {

        return getSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(final GetSuiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSuiteRequest, GetSuiteResult> asyncHandler) {
        final GetSuiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSuiteResult>() {
            @Override
            public GetSuiteResult call() throws Exception {
                GetSuiteResult result = null;

                try {
                    result = executeGetSuite(finalRequest);
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
    public java.util.concurrent.Future<GetTestResult> getTestAsync(GetTestRequest request) {

        return getTestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestResult> getTestAsync(final GetTestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestRequest, GetTestResult> asyncHandler) {
        final GetTestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTestResult>() {
            @Override
            public GetTestResult call() throws Exception {
                GetTestResult result = null;

                try {
                    result = executeGetTest(finalRequest);
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
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest request) {

        return getUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(final GetUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler) {
        final GetUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUploadResult>() {
            @Override
            public GetUploadResult call() throws Exception {
                GetUploadResult result = null;

                try {
                    result = executeGetUpload(finalRequest);
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
    public java.util.concurrent.Future<GetVPCEConfigurationResult> getVPCEConfigurationAsync(GetVPCEConfigurationRequest request) {

        return getVPCEConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVPCEConfigurationResult> getVPCEConfigurationAsync(final GetVPCEConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVPCEConfigurationRequest, GetVPCEConfigurationResult> asyncHandler) {
        final GetVPCEConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVPCEConfigurationResult>() {
            @Override
            public GetVPCEConfigurationResult call() throws Exception {
                GetVPCEConfigurationResult result = null;

                try {
                    result = executeGetVPCEConfiguration(finalRequest);
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
    public java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(InstallToRemoteAccessSessionRequest request) {

        return installToRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(final InstallToRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<InstallToRemoteAccessSessionRequest, InstallToRemoteAccessSessionResult> asyncHandler) {
        final InstallToRemoteAccessSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InstallToRemoteAccessSessionResult>() {
            @Override
            public InstallToRemoteAccessSessionResult call() throws Exception {
                InstallToRemoteAccessSessionResult result = null;

                try {
                    result = executeInstallToRemoteAccessSession(finalRequest);
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
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest request) {

        return listArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(final ListArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler) {
        final ListArtifactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArtifactsResult>() {
            @Override
            public ListArtifactsResult call() throws Exception {
                ListArtifactsResult result = null;

                try {
                    result = executeListArtifacts(finalRequest);
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
    public java.util.concurrent.Future<ListDeviceInstancesResult> listDeviceInstancesAsync(ListDeviceInstancesRequest request) {

        return listDeviceInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceInstancesResult> listDeviceInstancesAsync(final ListDeviceInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceInstancesRequest, ListDeviceInstancesResult> asyncHandler) {
        final ListDeviceInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceInstancesResult>() {
            @Override
            public ListDeviceInstancesResult call() throws Exception {
                ListDeviceInstancesResult result = null;

                try {
                    result = executeListDeviceInstances(finalRequest);
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
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(ListDevicePoolsRequest request) {

        return listDevicePoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(final ListDevicePoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicePoolsRequest, ListDevicePoolsResult> asyncHandler) {
        final ListDevicePoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevicePoolsResult>() {
            @Override
            public ListDevicePoolsResult call() throws Exception {
                ListDevicePoolsResult result = null;

                try {
                    result = executeListDevicePools(finalRequest);
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
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(ListInstanceProfilesRequest request) {

        return listInstanceProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(final ListInstanceProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler) {
        final ListInstanceProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceProfilesResult>() {
            @Override
            public ListInstanceProfilesResult call() throws Exception {
                ListInstanceProfilesResult result = null;

                try {
                    result = executeListInstanceProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {
        final ListJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result = null;

                try {
                    result = executeListJobs(finalRequest);
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
    public java.util.concurrent.Future<ListNetworkProfilesResult> listNetworkProfilesAsync(ListNetworkProfilesRequest request) {

        return listNetworkProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkProfilesResult> listNetworkProfilesAsync(final ListNetworkProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNetworkProfilesRequest, ListNetworkProfilesResult> asyncHandler) {
        final ListNetworkProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNetworkProfilesResult>() {
            @Override
            public ListNetworkProfilesResult call() throws Exception {
                ListNetworkProfilesResult result = null;

                try {
                    result = executeListNetworkProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListOfferingPromotionsResult> listOfferingPromotionsAsync(ListOfferingPromotionsRequest request) {

        return listOfferingPromotionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingPromotionsResult> listOfferingPromotionsAsync(final ListOfferingPromotionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingPromotionsRequest, ListOfferingPromotionsResult> asyncHandler) {
        final ListOfferingPromotionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingPromotionsResult>() {
            @Override
            public ListOfferingPromotionsResult call() throws Exception {
                ListOfferingPromotionsResult result = null;

                try {
                    result = executeListOfferingPromotions(finalRequest);
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
    public java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(ListOfferingTransactionsRequest request) {

        return listOfferingTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(final ListOfferingTransactionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingTransactionsRequest, ListOfferingTransactionsResult> asyncHandler) {
        final ListOfferingTransactionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingTransactionsResult>() {
            @Override
            public ListOfferingTransactionsResult call() throws Exception {
                ListOfferingTransactionsResult result = null;

                try {
                    result = executeListOfferingTransactions(finalRequest);
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
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest request) {

        return listOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(final ListOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler) {
        final ListOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingsResult>() {
            @Override
            public ListOfferingsResult call() throws Exception {
                ListOfferingsResult result = null;

                try {
                    result = executeListOfferings(finalRequest);
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
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(final ListProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {
        final ListProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectsResult>() {
            @Override
            public ListProjectsResult call() throws Exception {
                ListProjectsResult result = null;

                try {
                    result = executeListProjects(finalRequest);
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
    public java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(ListRemoteAccessSessionsRequest request) {

        return listRemoteAccessSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(final ListRemoteAccessSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRemoteAccessSessionsRequest, ListRemoteAccessSessionsResult> asyncHandler) {
        final ListRemoteAccessSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRemoteAccessSessionsResult>() {
            @Override
            public ListRemoteAccessSessionsResult call() throws Exception {
                ListRemoteAccessSessionsResult result = null;

                try {
                    result = executeListRemoteAccessSessions(finalRequest);
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
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(final ListRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {
        final ListRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRunsResult>() {
            @Override
            public ListRunsResult call() throws Exception {
                ListRunsResult result = null;

                try {
                    result = executeListRuns(finalRequest);
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
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest request) {

        return listSamplesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(final ListSamplesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler) {
        final ListSamplesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSamplesResult>() {
            @Override
            public ListSamplesResult call() throws Exception {
                ListSamplesResult result = null;

                try {
                    result = executeListSamples(finalRequest);
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
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest request) {

        return listSuitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(final ListSuitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler) {
        final ListSuitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSuitesResult>() {
            @Override
            public ListSuitesResult call() throws Exception {
                ListSuitesResult result = null;

                try {
                    result = executeListSuites(finalRequest);
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
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest request) {

        return listTestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(final ListTestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestsRequest, ListTestsResult> asyncHandler) {
        final ListTestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestsResult>() {
            @Override
            public ListTestsResult call() throws Exception {
                ListTestsResult result = null;

                try {
                    result = executeListTests(finalRequest);
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
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(ListUniqueProblemsRequest request) {

        return listUniqueProblemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(final ListUniqueProblemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUniqueProblemsRequest, ListUniqueProblemsResult> asyncHandler) {
        final ListUniqueProblemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUniqueProblemsResult>() {
            @Override
            public ListUniqueProblemsResult call() throws Exception {
                ListUniqueProblemsResult result = null;

                try {
                    result = executeListUniqueProblems(finalRequest);
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
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest request) {

        return listUploadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(final ListUploadsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler) {
        final ListUploadsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUploadsResult>() {
            @Override
            public ListUploadsResult call() throws Exception {
                ListUploadsResult result = null;

                try {
                    result = executeListUploads(finalRequest);
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
    public java.util.concurrent.Future<ListVPCEConfigurationsResult> listVPCEConfigurationsAsync(ListVPCEConfigurationsRequest request) {

        return listVPCEConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVPCEConfigurationsResult> listVPCEConfigurationsAsync(final ListVPCEConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVPCEConfigurationsRequest, ListVPCEConfigurationsResult> asyncHandler) {
        final ListVPCEConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVPCEConfigurationsResult>() {
            @Override
            public ListVPCEConfigurationsResult call() throws Exception {
                ListVPCEConfigurationsResult result = null;

                try {
                    result = executeListVPCEConfigurations(finalRequest);
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
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest request) {

        return purchaseOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(final PurchaseOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler) {
        final PurchaseOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseOfferingResult>() {
            @Override
            public PurchaseOfferingResult call() throws Exception {
                PurchaseOfferingResult result = null;

                try {
                    result = executePurchaseOffering(finalRequest);
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
    public java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(RenewOfferingRequest request) {

        return renewOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(final RenewOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<RenewOfferingRequest, RenewOfferingResult> asyncHandler) {
        final RenewOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RenewOfferingResult>() {
            @Override
            public RenewOfferingResult call() throws Exception {
                RenewOfferingResult result = null;

                try {
                    result = executeRenewOffering(finalRequest);
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
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest request) {

        return scheduleRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(final ScheduleRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler) {
        final ScheduleRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ScheduleRunResult>() {
            @Override
            public ScheduleRunResult call() throws Exception {
                ScheduleRunResult result = null;

                try {
                    result = executeScheduleRun(finalRequest);
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
    public java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest request) {

        return stopJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopJobResult> stopJobAsync(final StopJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopJobRequest, StopJobResult> asyncHandler) {
        final StopJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopJobResult>() {
            @Override
            public StopJobResult call() throws Exception {
                StopJobResult result = null;

                try {
                    result = executeStopJob(finalRequest);
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
    public java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(StopRemoteAccessSessionRequest request) {

        return stopRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(final StopRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopRemoteAccessSessionRequest, StopRemoteAccessSessionResult> asyncHandler) {
        final StopRemoteAccessSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopRemoteAccessSessionResult>() {
            @Override
            public StopRemoteAccessSessionResult call() throws Exception {
                StopRemoteAccessSessionResult result = null;

                try {
                    result = executeStopRemoteAccessSession(finalRequest);
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
    public java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest request) {

        return stopRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRunResult> stopRunAsync(final StopRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopRunRequest, StopRunResult> asyncHandler) {
        final StopRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopRunResult>() {
            @Override
            public StopRunResult call() throws Exception {
                StopRunResult result = null;

                try {
                    result = executeStopRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateDeviceInstanceResult> updateDeviceInstanceAsync(UpdateDeviceInstanceRequest request) {

        return updateDeviceInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceInstanceResult> updateDeviceInstanceAsync(final UpdateDeviceInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceInstanceRequest, UpdateDeviceInstanceResult> asyncHandler) {
        final UpdateDeviceInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceInstanceResult>() {
            @Override
            public UpdateDeviceInstanceResult call() throws Exception {
                UpdateDeviceInstanceResult result = null;

                try {
                    result = executeUpdateDeviceInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest request) {

        return updateDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(final UpdateDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDevicePoolRequest, UpdateDevicePoolResult> asyncHandler) {
        final UpdateDevicePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDevicePoolResult>() {
            @Override
            public UpdateDevicePoolResult call() throws Exception {
                UpdateDevicePoolResult result = null;

                try {
                    result = executeUpdateDevicePool(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceProfileResult> updateInstanceProfileAsync(UpdateInstanceProfileRequest request) {

        return updateInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceProfileResult> updateInstanceProfileAsync(final UpdateInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceProfileRequest, UpdateInstanceProfileResult> asyncHandler) {
        final UpdateInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceProfileResult>() {
            @Override
            public UpdateInstanceProfileResult call() throws Exception {
                UpdateInstanceProfileResult result = null;

                try {
                    result = executeUpdateInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateNetworkProfileResult> updateNetworkProfileAsync(UpdateNetworkProfileRequest request) {

        return updateNetworkProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkProfileResult> updateNetworkProfileAsync(final UpdateNetworkProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNetworkProfileRequest, UpdateNetworkProfileResult> asyncHandler) {
        final UpdateNetworkProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNetworkProfileResult>() {
            @Override
            public UpdateNetworkProfileResult call() throws Exception {
                UpdateNetworkProfileResult result = null;

                try {
                    result = executeUpdateNetworkProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(final UpdateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {
        final UpdateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProjectResult>() {
            @Override
            public UpdateProjectResult call() throws Exception {
                UpdateProjectResult result = null;

                try {
                    result = executeUpdateProject(finalRequest);
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
    public java.util.concurrent.Future<UpdateUploadResult> updateUploadAsync(UpdateUploadRequest request) {

        return updateUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUploadResult> updateUploadAsync(final UpdateUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUploadRequest, UpdateUploadResult> asyncHandler) {
        final UpdateUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUploadResult>() {
            @Override
            public UpdateUploadResult call() throws Exception {
                UpdateUploadResult result = null;

                try {
                    result = executeUpdateUpload(finalRequest);
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
    public java.util.concurrent.Future<UpdateVPCEConfigurationResult> updateVPCEConfigurationAsync(UpdateVPCEConfigurationRequest request) {

        return updateVPCEConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVPCEConfigurationResult> updateVPCEConfigurationAsync(final UpdateVPCEConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVPCEConfigurationRequest, UpdateVPCEConfigurationResult> asyncHandler) {
        final UpdateVPCEConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVPCEConfigurationResult>() {
            @Override
            public UpdateVPCEConfigurationResult call() throws Exception {
                UpdateVPCEConfigurationResult result = null;

                try {
                    result = executeUpdateVPCEConfiguration(finalRequest);
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
