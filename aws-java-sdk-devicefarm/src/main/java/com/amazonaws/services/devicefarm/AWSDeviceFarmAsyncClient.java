/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.devicefarm;

import com.amazonaws.services.devicefarm.model.*;

/**
 * Interface for accessing AWS Device Farm asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test
 * Android and Fire OS apps on physical phones, tablets, and other devices in
 * the cloud.
 * </p>
 */
public class AWSDeviceFarmAsyncClient extends AWSDeviceFarmClient implements
        AWSDeviceFarmAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSDeviceFarmAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS Device Farm (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the specified AWS account credentials, executor
     * service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the specified AWS account credentials provider. Default
     * client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the provided AWS account credentials provider and
     * client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Device Farm using the specified AWS account credentials provider,
     * executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSDeviceFarmAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(
            final CreateDevicePoolRequest createDevicePoolRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDevicePoolResult>() {
                    @Override
                    public CreateDevicePoolResult call() {
                        return createDevicePool(createDevicePoolRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDevicePoolResult> createDevicePoolAsync(
            final CreateDevicePoolRequest createDevicePoolRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateDevicePoolRequest, CreateDevicePoolResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDevicePoolResult>() {
                    @Override
                    public CreateDevicePoolResult call() throws Exception {
                        CreateDevicePoolResult result;
                        try {
                            result = createDevicePool(createDevicePoolRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createDevicePoolRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(
            final CreateProjectRequest createProjectRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateProjectResult>() {
                    @Override
                    public CreateProjectResult call() {
                        return createProject(createProjectRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(
            final CreateProjectRequest createProjectRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateProjectResult>() {
                    @Override
                    public CreateProjectResult call() throws Exception {
                        CreateProjectResult result;
                        try {
                            result = createProject(createProjectRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createProjectRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(
            final CreateUploadRequest createUploadRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateUploadResult>() {
                    @Override
                    public CreateUploadResult call() {
                        return createUpload(createUploadRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateUploadResult> createUploadAsync(
            final CreateUploadRequest createUploadRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateUploadRequest, CreateUploadResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateUploadResult>() {
                    @Override
                    public CreateUploadResult call() throws Exception {
                        CreateUploadResult result;
                        try {
                            result = createUpload(createUploadRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createUploadRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(
            final GetDeviceRequest getDeviceRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeviceResult>() {
                    @Override
                    public GetDeviceResult call() {
                        return getDevice(getDeviceRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(
            final GetDeviceRequest getDeviceRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeviceResult>() {
                    @Override
                    public GetDeviceResult call() throws Exception {
                        GetDeviceResult result;
                        try {
                            result = getDevice(getDeviceRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getDeviceRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(
            final GetDevicePoolRequest getDevicePoolRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDevicePoolResult>() {
                    @Override
                    public GetDevicePoolResult call() {
                        return getDevicePool(getDevicePoolRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolResult> getDevicePoolAsync(
            final GetDevicePoolRequest getDevicePoolRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePoolRequest, GetDevicePoolResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDevicePoolResult>() {
                    @Override
                    public GetDevicePoolResult call() throws Exception {
                        GetDevicePoolResult result;
                        try {
                            result = getDevicePool(getDevicePoolRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getDevicePoolRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(
            final GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDevicePoolCompatibilityResult>() {
                    @Override
                    public GetDevicePoolCompatibilityResult call() {
                        return getDevicePoolCompatibility(getDevicePoolCompatibilityRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDevicePoolCompatibilityResult> getDevicePoolCompatibilityAsync(
            final GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePoolCompatibilityRequest, GetDevicePoolCompatibilityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDevicePoolCompatibilityResult>() {
                    @Override
                    public GetDevicePoolCompatibilityResult call()
                            throws Exception {
                        GetDevicePoolCompatibilityResult result;
                        try {
                            result = getDevicePoolCompatibility(getDevicePoolCompatibilityRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                getDevicePoolCompatibilityRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(
            final GetJobRequest getJobRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetJobResult>() {
                    @Override
                    public GetJobResult call() {
                        return getJob(getJobRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(
            final GetJobRequest getJobRequest,
            final com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetJobResult>() {
                    @Override
                    public GetJobResult call() throws Exception {
                        GetJobResult result;
                        try {
                            result = getJob(getJobRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getJobRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(
            final GetProjectRequest getProjectRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetProjectResult>() {
                    @Override
                    public GetProjectResult call() {
                        return getProject(getProjectRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetProjectResult> getProjectAsync(
            final GetProjectRequest getProjectRequest,
            final com.amazonaws.handlers.AsyncHandler<GetProjectRequest, GetProjectResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetProjectResult>() {
                    @Override
                    public GetProjectResult call() throws Exception {
                        GetProjectResult result;
                        try {
                            result = getProject(getProjectRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getProjectRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(
            final GetRunRequest getRunRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRunResult>() {
                    @Override
                    public GetRunResult call() {
                        return getRun(getRunRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetRunResult> getRunAsync(
            final GetRunRequest getRunRequest,
            final com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRunResult>() {
                    @Override
                    public GetRunResult call() throws Exception {
                        GetRunResult result;
                        try {
                            result = getRun(getRunRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getRunRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(
            final GetSuiteRequest getSuiteRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetSuiteResult>() {
                    @Override
                    public GetSuiteResult call() {
                        return getSuite(getSuiteRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetSuiteResult> getSuiteAsync(
            final GetSuiteRequest getSuiteRequest,
            final com.amazonaws.handlers.AsyncHandler<GetSuiteRequest, GetSuiteResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetSuiteResult>() {
                    @Override
                    public GetSuiteResult call() throws Exception {
                        GetSuiteResult result;
                        try {
                            result = getSuite(getSuiteRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getSuiteRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetTestResult> getTestAsync(
            final GetTestRequest getTestRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetTestResult>() {
                    @Override
                    public GetTestResult call() {
                        return getTest(getTestRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetTestResult> getTestAsync(
            final GetTestRequest getTestRequest,
            final com.amazonaws.handlers.AsyncHandler<GetTestRequest, GetTestResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetTestResult>() {
                    @Override
                    public GetTestResult call() throws Exception {
                        GetTestResult result;
                        try {
                            result = getTest(getTestRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getTestRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(
            final GetUploadRequest getUploadRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetUploadResult>() {
                    @Override
                    public GetUploadResult call() {
                        return getUpload(getUploadRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetUploadResult> getUploadAsync(
            final GetUploadRequest getUploadRequest,
            final com.amazonaws.handlers.AsyncHandler<GetUploadRequest, GetUploadResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetUploadResult>() {
                    @Override
                    public GetUploadResult call() throws Exception {
                        GetUploadResult result;
                        try {
                            result = getUpload(getUploadRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getUploadRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(
            final ListArtifactsRequest listArtifactsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListArtifactsResult>() {
                    @Override
                    public ListArtifactsResult call() {
                        return listArtifacts(listArtifactsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(
            final ListArtifactsRequest listArtifactsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListArtifactsResult>() {
                    @Override
                    public ListArtifactsResult call() throws Exception {
                        ListArtifactsResult result;
                        try {
                            result = listArtifacts(listArtifactsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listArtifactsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(
            final ListDevicePoolsRequest listDevicePoolsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDevicePoolsResult>() {
                    @Override
                    public ListDevicePoolsResult call() {
                        return listDevicePools(listDevicePoolsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDevicePoolsResult> listDevicePoolsAsync(
            final ListDevicePoolsRequest listDevicePoolsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListDevicePoolsRequest, ListDevicePoolsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDevicePoolsResult>() {
                    @Override
                    public ListDevicePoolsResult call() throws Exception {
                        ListDevicePoolsResult result;
                        try {
                            result = listDevicePools(listDevicePoolsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listDevicePoolsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(
            final ListDevicesRequest listDevicesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDevicesResult>() {
                    @Override
                    public ListDevicesResult call() {
                        return listDevices(listDevicesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(
            final ListDevicesRequest listDevicesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDevicesResult>() {
                    @Override
                    public ListDevicesResult call() throws Exception {
                        ListDevicesResult result;
                        try {
                            result = listDevices(listDevicesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listDevicesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            final ListJobsRequest listJobsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListJobsResult>() {
                    @Override
                    public ListJobsResult call() {
                        return listJobs(listJobsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            final ListJobsRequest listJobsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListJobsResult>() {
                    @Override
                    public ListJobsResult call() throws Exception {
                        ListJobsResult result;
                        try {
                            result = listJobs(listJobsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listJobsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(
            final ListProjectsRequest listProjectsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListProjectsResult>() {
                    @Override
                    public ListProjectsResult call() {
                        return listProjects(listProjectsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(
            final ListProjectsRequest listProjectsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListProjectsResult>() {
                    @Override
                    public ListProjectsResult call() throws Exception {
                        ListProjectsResult result;
                        try {
                            result = listProjects(listProjectsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listProjectsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            final ListRunsRequest listRunsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRunsResult>() {
                    @Override
                    public ListRunsResult call() {
                        return listRuns(listRunsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            final ListRunsRequest listRunsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRunsResult>() {
                    @Override
                    public ListRunsResult call() throws Exception {
                        ListRunsResult result;
                        try {
                            result = listRuns(listRunsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listRunsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(
            final ListSamplesRequest listSamplesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListSamplesResult>() {
                    @Override
                    public ListSamplesResult call() {
                        return listSamples(listSamplesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListSamplesResult> listSamplesAsync(
            final ListSamplesRequest listSamplesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListSamplesRequest, ListSamplesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListSamplesResult>() {
                    @Override
                    public ListSamplesResult call() throws Exception {
                        ListSamplesResult result;
                        try {
                            result = listSamples(listSamplesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listSamplesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(
            final ListSuitesRequest listSuitesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListSuitesResult>() {
                    @Override
                    public ListSuitesResult call() {
                        return listSuites(listSuitesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListSuitesResult> listSuitesAsync(
            final ListSuitesRequest listSuitesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListSuitesRequest, ListSuitesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListSuitesResult>() {
                    @Override
                    public ListSuitesResult call() throws Exception {
                        ListSuitesResult result;
                        try {
                            result = listSuites(listSuitesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listSuitesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(
            final ListTestsRequest listTestsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListTestsResult>() {
                    @Override
                    public ListTestsResult call() {
                        return listTests(listTestsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListTestsResult> listTestsAsync(
            final ListTestsRequest listTestsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListTestsRequest, ListTestsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListTestsResult>() {
                    @Override
                    public ListTestsResult call() throws Exception {
                        ListTestsResult result;
                        try {
                            result = listTests(listTestsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listTestsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(
            final ListUniqueProblemsRequest listUniqueProblemsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListUniqueProblemsResult>() {
                    @Override
                    public ListUniqueProblemsResult call() {
                        return listUniqueProblems(listUniqueProblemsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListUniqueProblemsResult> listUniqueProblemsAsync(
            final ListUniqueProblemsRequest listUniqueProblemsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListUniqueProblemsRequest, ListUniqueProblemsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListUniqueProblemsResult>() {
                    @Override
                    public ListUniqueProblemsResult call() throws Exception {
                        ListUniqueProblemsResult result;
                        try {
                            result = listUniqueProblems(listUniqueProblemsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listUniqueProblemsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(
            final ListUploadsRequest listUploadsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListUploadsResult>() {
                    @Override
                    public ListUploadsResult call() {
                        return listUploads(listUploadsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResult> listUploadsAsync(
            final ListUploadsRequest listUploadsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListUploadsRequest, ListUploadsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListUploadsResult>() {
                    @Override
                    public ListUploadsResult call() throws Exception {
                        ListUploadsResult result;
                        try {
                            result = listUploads(listUploadsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listUploadsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(
            final ScheduleRunRequest scheduleRunRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ScheduleRunResult>() {
                    @Override
                    public ScheduleRunResult call() {
                        return scheduleRun(scheduleRunRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ScheduleRunResult> scheduleRunAsync(
            final ScheduleRunRequest scheduleRunRequest,
            final com.amazonaws.handlers.AsyncHandler<ScheduleRunRequest, ScheduleRunResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ScheduleRunResult>() {
                    @Override
                    public ScheduleRunResult call() throws Exception {
                        ScheduleRunResult result;
                        try {
                            result = scheduleRun(scheduleRunRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(scheduleRunRequest, result);
                        return result;
                    }
                });
    }
}
