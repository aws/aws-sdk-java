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
package com.amazonaws.services.devicefarm;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing AWS Device Farm asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
@ThreadSafe
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
     */
    public AWSDeviceFarmAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Device Farm using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSDeviceFarmAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(CreateDevicePoolRequest request) {

        return createDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(final CreateDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDevicePoolResult>() {
            @Override
            public CreateDevicePoolResult call() throws Exception {
                CreateDevicePoolResult result;

                try {
                    result = createDevicePool(request);
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
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(final CreateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectResult>() {
            @Override
            public CreateProjectResult call() throws Exception {
                CreateProjectResult result;

                try {
                    result = createProject(request);
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
    public java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(CreateRemoteAccessSessionRequest request) {

        return createRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRemoteAccessSessionResult> createRemoteAccessSessionAsync(final CreateRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRemoteAccessSessionRequest, CreateRemoteAccessSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateRemoteAccessSessionResult>() {
            @Override
            public CreateRemoteAccessSessionResult call() throws Exception {
                CreateRemoteAccessSessionResult result;

                try {
                    result = createRemoteAccessSession(request);
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
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(CreateUploadRequest request) {

        return createUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(final CreateUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateUploadResult>() {
            @Override
            public CreateUploadResult call() throws Exception {
                CreateUploadResult result;

                try {
                    result = createUpload(request);
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
    public java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(DeleteDevicePoolRequest request) {

        return deleteDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDevicePoolResult> deleteDevicePoolAsync(final DeleteDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDevicePoolRequest, DeleteDevicePoolResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDevicePoolResult>() {
            @Override
            public DeleteDevicePoolResult call() throws Exception {
                DeleteDevicePoolResult result;

                try {
                    result = deleteDevicePool(request);
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
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(final DeleteProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectResult>() {
            @Override
            public DeleteProjectResult call() throws Exception {
                DeleteProjectResult result;

                try {
                    result = deleteProject(request);
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
    public java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(DeleteRemoteAccessSessionRequest request) {

        return deleteRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemoteAccessSessionResult> deleteRemoteAccessSessionAsync(final DeleteRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRemoteAccessSessionRequest, DeleteRemoteAccessSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRemoteAccessSessionResult>() {
            @Override
            public DeleteRemoteAccessSessionResult call() throws Exception {
                DeleteRemoteAccessSessionResult result;

                try {
                    result = deleteRemoteAccessSession(request);
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
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(final DeleteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRunResult>() {
            @Override
            public DeleteRunResult call() throws Exception {
                DeleteRunResult result;

                try {
                    result = deleteRun(request);
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
    public java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(DeleteUploadRequest request) {

        return deleteUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadResult> deleteUploadAsync(final DeleteUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUploadRequest, DeleteUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteUploadResult>() {
            @Override
            public DeleteUploadResult call() throws Exception {
                DeleteUploadResult result;

                try {
                    result = deleteUpload(request);
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
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result;

                try {
                    result = getAccountSettings(request);
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
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request) {

        return getDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(final GetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceResult>() {
            @Override
            public GetDeviceResult call() throws Exception {
                GetDeviceResult result;

                try {
                    result = getDevice(request);
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
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(GetDevicePoolRequest request) {

        return getDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(final GetDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePoolRequest, GetDevicePoolResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDevicePoolResult>() {
            @Override
            public GetDevicePoolResult call() throws Exception {
                GetDevicePoolResult result;

                try {
                    result = getDevicePool(request);
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
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(GetDevicePoolCompatibilityRequest request) {

        return getDevicePoolCompatibilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(final GetDevicePoolCompatibilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePoolCompatibilityRequest, GetDevicePoolCompatibilityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDevicePoolCompatibilityResult>() {
            @Override
            public GetDevicePoolCompatibilityResult call() throws Exception {
                GetDevicePoolCompatibilityResult result;

                try {
                    result = getDevicePoolCompatibility(request);
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
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(final GetJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetJobResult>() {
            @Override
            public GetJobResult call() throws Exception {
                GetJobResult result;

                try {
                    result = getJob(request);
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
    public java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(GetOfferingStatusRequest request) {

        return getOfferingStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOfferingStatusResult> getOfferingStatusAsync(final GetOfferingStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOfferingStatusRequest, GetOfferingStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetOfferingStatusResult>() {
            @Override
            public GetOfferingStatusResult call() throws Exception {
                GetOfferingStatusResult result;

                try {
                    result = getOfferingStatus(request);
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
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(GetProjectRequest request) {

        return getProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(final GetProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetProjectResult>() {
            @Override
            public GetProjectResult call() throws Exception {
                GetProjectResult result;

                try {
                    result = getProject(request);
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
    public java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(GetRemoteAccessSessionRequest request) {

        return getRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRemoteAccessSessionResult> getRemoteAccessSessionAsync(final GetRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRemoteAccessSessionRequest, GetRemoteAccessSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRemoteAccessSessionResult>() {
            @Override
            public GetRemoteAccessSessionResult call() throws Exception {
                GetRemoteAccessSessionResult result;

                try {
                    result = getRemoteAccessSession(request);
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
    public java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest request) {

        return getRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(final GetRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRunResult>() {
            @Override
            public GetRunResult call() throws Exception {
                GetRunResult result;

                try {
                    result = getRun(request);
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
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(GetSuiteRequest request) {

        return getSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(final GetSuiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSuiteRequest, GetSuiteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSuiteResult>() {
            @Override
            public GetSuiteResult call() throws Exception {
                GetSuiteResult result;

                try {
                    result = getSuite(request);
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
    public java.util.concurrent.Future<GetTestResult> getTestAsync(GetTestRequest request) {

        return getTestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestResult> getTestAsync(final GetTestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestRequest, GetTestResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetTestResult>() {
            @Override
            public GetTestResult call() throws Exception {
                GetTestResult result;

                try {
                    result = getTest(request);
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
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(GetUploadRequest request) {

        return getUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(final GetUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetUploadResult>() {
            @Override
            public GetUploadResult call() throws Exception {
                GetUploadResult result;

                try {
                    result = getUpload(request);
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
    public java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(InstallToRemoteAccessSessionRequest request) {

        return installToRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InstallToRemoteAccessSessionResult> installToRemoteAccessSessionAsync(final InstallToRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<InstallToRemoteAccessSessionRequest, InstallToRemoteAccessSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InstallToRemoteAccessSessionResult>() {
            @Override
            public InstallToRemoteAccessSessionResult call() throws Exception {
                InstallToRemoteAccessSessionResult result;

                try {
                    result = installToRemoteAccessSession(request);
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
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest request) {

        return listArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(final ListArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListArtifactsResult>() {
            @Override
            public ListArtifactsResult call() throws Exception {
                ListArtifactsResult result;

                try {
                    result = listArtifacts(request);
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
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(ListDevicePoolsRequest request) {

        return listDevicePoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(final ListDevicePoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicePoolsRequest, ListDevicePoolsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDevicePoolsResult>() {
            @Override
            public ListDevicePoolsResult call() throws Exception {
                ListDevicePoolsResult result;

                try {
                    result = listDevicePools(request);
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
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest request) {

        return listDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(final ListDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDevicesResult>() {
            @Override
            public ListDevicesResult call() throws Exception {
                ListDevicesResult result;

                try {
                    result = listDevices(request);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result;

                try {
                    result = listJobs(request);
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
    public java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(ListOfferingTransactionsRequest request) {

        return listOfferingTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingTransactionsResult> listOfferingTransactionsAsync(final ListOfferingTransactionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingTransactionsRequest, ListOfferingTransactionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingTransactionsResult>() {
            @Override
            public ListOfferingTransactionsResult call() throws Exception {
                ListOfferingTransactionsResult result;

                try {
                    result = listOfferingTransactions(request);
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
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest request) {

        return listOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(final ListOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingsResult>() {
            @Override
            public ListOfferingsResult call() throws Exception {
                ListOfferingsResult result;

                try {
                    result = listOfferings(request);
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
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(final ListProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListProjectsResult>() {
            @Override
            public ListProjectsResult call() throws Exception {
                ListProjectsResult result;

                try {
                    result = listProjects(request);
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
    public java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(ListRemoteAccessSessionsRequest request) {

        return listRemoteAccessSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRemoteAccessSessionsResult> listRemoteAccessSessionsAsync(final ListRemoteAccessSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRemoteAccessSessionsRequest, ListRemoteAccessSessionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRemoteAccessSessionsResult>() {
            @Override
            public ListRemoteAccessSessionsResult call() throws Exception {
                ListRemoteAccessSessionsResult result;

                try {
                    result = listRemoteAccessSessions(request);
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
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(final ListRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRunsResult>() {
            @Override
            public ListRunsResult call() throws Exception {
                ListRunsResult result;

                try {
                    result = listRuns(request);
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
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(ListSamplesRequest request) {

        return listSamplesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(final ListSamplesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSamplesResult>() {
            @Override
            public ListSamplesResult call() throws Exception {
                ListSamplesResult result;

                try {
                    result = listSamples(request);
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
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(ListSuitesRequest request) {

        return listSuitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(final ListSuitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSuitesResult>() {
            @Override
            public ListSuitesResult call() throws Exception {
                ListSuitesResult result;

                try {
                    result = listSuites(request);
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
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(ListTestsRequest request) {

        return listTestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(final ListTestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestsRequest, ListTestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTestsResult>() {
            @Override
            public ListTestsResult call() throws Exception {
                ListTestsResult result;

                try {
                    result = listTests(request);
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
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(ListUniqueProblemsRequest request) {

        return listUniqueProblemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(final ListUniqueProblemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUniqueProblemsRequest, ListUniqueProblemsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListUniqueProblemsResult>() {
            @Override
            public ListUniqueProblemsResult call() throws Exception {
                ListUniqueProblemsResult result;

                try {
                    result = listUniqueProblems(request);
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
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(ListUploadsRequest request) {

        return listUploadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(final ListUploadsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListUploadsResult>() {
            @Override
            public ListUploadsResult call() throws Exception {
                ListUploadsResult result;

                try {
                    result = listUploads(request);
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
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest request) {

        return purchaseOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(final PurchaseOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PurchaseOfferingResult>() {
            @Override
            public PurchaseOfferingResult call() throws Exception {
                PurchaseOfferingResult result;

                try {
                    result = purchaseOffering(request);
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
    public java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(RenewOfferingRequest request) {

        return renewOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RenewOfferingResult> renewOfferingAsync(final RenewOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<RenewOfferingRequest, RenewOfferingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RenewOfferingResult>() {
            @Override
            public RenewOfferingResult call() throws Exception {
                RenewOfferingResult result;

                try {
                    result = renewOffering(request);
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
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(ScheduleRunRequest request) {

        return scheduleRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(final ScheduleRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ScheduleRunResult>() {
            @Override
            public ScheduleRunResult call() throws Exception {
                ScheduleRunResult result;

                try {
                    result = scheduleRun(request);
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
    public java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(StopRemoteAccessSessionRequest request) {

        return stopRemoteAccessSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRemoteAccessSessionResult> stopRemoteAccessSessionAsync(final StopRemoteAccessSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopRemoteAccessSessionRequest, StopRemoteAccessSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopRemoteAccessSessionResult>() {
            @Override
            public StopRemoteAccessSessionResult call() throws Exception {
                StopRemoteAccessSessionResult result;

                try {
                    result = stopRemoteAccessSession(request);
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
    public java.util.concurrent.Future<StopRunResult> stopRunAsync(StopRunRequest request) {

        return stopRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRunResult> stopRunAsync(final StopRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopRunRequest, StopRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopRunResult>() {
            @Override
            public StopRunResult call() throws Exception {
                StopRunResult result;

                try {
                    result = stopRun(request);
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
    public java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(UpdateDevicePoolRequest request) {

        return updateDevicePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDevicePoolResult> updateDevicePoolAsync(final UpdateDevicePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDevicePoolRequest, UpdateDevicePoolResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateDevicePoolResult>() {
            @Override
            public UpdateDevicePoolResult call() throws Exception {
                UpdateDevicePoolResult result;

                try {
                    result = updateDevicePool(request);
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
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(final UpdateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateProjectResult>() {
            @Override
            public UpdateProjectResult call() throws Exception {
                UpdateProjectResult result;

                try {
                    result = updateProject(request);
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
