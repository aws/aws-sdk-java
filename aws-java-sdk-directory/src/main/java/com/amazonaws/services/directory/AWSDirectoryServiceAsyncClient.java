/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.directory;

import com.amazonaws.services.directory.model.*;

/**
 * Interface for accessing Directory Service asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * This is the <i>AWS Directory Service API Reference</i>. This guide provides
 * detailed information about AWS Directory Service operations, data types,
 * parameters, and errors.
 * </p>
 */
public class AWSDirectoryServiceAsyncClient extends AWSDirectoryServiceClient
        implements AWSDirectoryServiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AWSDirectoryServiceAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the specified AWS account credentials.
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
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the specified AWS account credentials and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the specified AWS account credentials, executor
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
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the specified AWS account credentials provider.
     * Default client settings will be used.
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
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the provided AWS account credentials provider and
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
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the specified AWS account credentials provider
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSDirectoryServiceAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Directory Service using the specified AWS account credentials provider,
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
    public AWSDirectoryServiceAsyncClient(
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

    @Override
    public java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(
            ConnectDirectoryRequest request) {

        return connectDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(
            final ConnectDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ConnectDirectoryResult>() {
                    @Override
                    public ConnectDirectoryResult call() throws Exception {
                        ConnectDirectoryResult result;

                        try {
                            result = connectDirectory(request);
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
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateAliasResult>() {
                    @Override
                    public CreateAliasResult call() throws Exception {
                        CreateAliasResult result;

                        try {
                            result = createAlias(request);
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
    public java.util.concurrent.Future<CreateComputerResult> createComputerAsync(
            CreateComputerRequest request) {

        return createComputerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComputerResult> createComputerAsync(
            final CreateComputerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateComputerResult>() {
                    @Override
                    public CreateComputerResult call() throws Exception {
                        CreateComputerResult result;

                        try {
                            result = createComputer(request);
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
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(
            CreateDirectoryRequest request) {

        return createDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(
            final CreateDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDirectoryResult>() {
                    @Override
                    public CreateDirectoryResult call() throws Exception {
                        CreateDirectoryResult result;

                        try {
                            result = createDirectory(request);
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
    public java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(
            CreateMicrosoftADRequest request) {

        return createMicrosoftADAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(
            final CreateMicrosoftADRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMicrosoftADRequest, CreateMicrosoftADResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateMicrosoftADResult>() {
                    @Override
                    public CreateMicrosoftADResult call() throws Exception {
                        CreateMicrosoftADResult result;

                        try {
                            result = createMicrosoftAD(request);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
                    @Override
                    public CreateSnapshotResult call() throws Exception {
                        CreateSnapshotResult result;

                        try {
                            result = createSnapshot(request);
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
    public java.util.concurrent.Future<CreateTrustResult> createTrustAsync(
            CreateTrustRequest request) {

        return createTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrustResult> createTrustAsync(
            final CreateTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrustRequest, CreateTrustResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateTrustResult>() {
                    @Override
                    public CreateTrustResult call() throws Exception {
                        CreateTrustResult result;

                        try {
                            result = createTrust(request);
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
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(
            DeleteDirectoryRequest request) {

        return deleteDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(
            final DeleteDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteDirectoryResult>() {
                    @Override
                    public DeleteDirectoryResult call() throws Exception {
                        DeleteDirectoryResult result;

                        try {
                            result = deleteDirectory(request);
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(
            DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(
            final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
                    @Override
                    public DeleteSnapshotResult call() throws Exception {
                        DeleteSnapshotResult result;

                        try {
                            result = deleteSnapshot(request);
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
    public java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(
            DeleteTrustRequest request) {

        return deleteTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(
            final DeleteTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrustRequest, DeleteTrustResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteTrustResult>() {
                    @Override
                    public DeleteTrustResult call() throws Exception {
                        DeleteTrustResult result;

                        try {
                            result = deleteTrust(request);
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
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            DescribeDirectoriesRequest request) {

        return describeDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            final DescribeDirectoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDirectoriesResult>() {
                    @Override
                    public DescribeDirectoriesResult call() throws Exception {
                        DescribeDirectoriesResult result;

                        try {
                            result = describeDirectories(request);
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
     * Simplified method form for invoking the DescribeDirectories operation.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync() {

        return describeDirectoriesAsync(new DescribeDirectoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDirectories operation
     * with an AsyncHandler.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler) {

        return describeDirectoriesAsync(new DescribeDirectoriesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            final DescribeSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeSnapshotsResult>() {
                    @Override
                    public DescribeSnapshotsResult call() throws Exception {
                        DescribeSnapshotsResult result;

                        try {
                            result = describeSnapshots(request);
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
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync() {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with
     * an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(
            DescribeTrustsRequest request) {

        return describeTrustsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(
            final DescribeTrustsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustsRequest, DescribeTrustsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTrustsResult>() {
                    @Override
                    public DescribeTrustsResult call() throws Exception {
                        DescribeTrustsResult result;

                        try {
                            result = describeTrusts(request);
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
    public java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(
            DisableRadiusRequest request) {

        return disableRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(
            final DisableRadiusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DisableRadiusResult>() {
                    @Override
                    public DisableRadiusResult call() throws Exception {
                        DisableRadiusResult result;

                        try {
                            result = disableRadius(request);
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
    public java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(
            DisableSsoRequest request) {

        return disableSsoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(
            final DisableSsoRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DisableSsoResult>() {
                    @Override
                    public DisableSsoResult call() throws Exception {
                        DisableSsoResult result;

                        try {
                            result = disableSso(request);
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
    public java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(
            EnableRadiusRequest request) {

        return enableRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(
            final EnableRadiusRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<EnableRadiusResult>() {
                    @Override
                    public EnableRadiusResult call() throws Exception {
                        EnableRadiusResult result;

                        try {
                            result = enableRadius(request);
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
    public java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(
            EnableSsoRequest request) {

        return enableSsoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(
            final EnableSsoRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<EnableSsoResult>() {
                    @Override
                    public EnableSsoResult call() throws Exception {
                        EnableSsoResult result;

                        try {
                            result = enableSso(request);
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
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            GetDirectoryLimitsRequest request) {

        return getDirectoryLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            final GetDirectoryLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDirectoryLimitsResult>() {
                    @Override
                    public GetDirectoryLimitsResult call() throws Exception {
                        GetDirectoryLimitsResult result;

                        try {
                            result = getDirectoryLimits(request);
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
     * Simplified method form for invoking the GetDirectoryLimits operation.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync() {

        return getDirectoryLimitsAsync(new GetDirectoryLimitsRequest());
    }

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation with
     * an AsyncHandler.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler) {

        return getDirectoryLimitsAsync(new GetDirectoryLimitsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            GetSnapshotLimitsRequest request) {

        return getSnapshotLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            final GetSnapshotLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetSnapshotLimitsResult>() {
                    @Override
                    public GetSnapshotLimitsResult call() throws Exception {
                        GetSnapshotLimitsResult result;

                        try {
                            result = getSnapshotLimits(request);
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
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            RestoreFromSnapshotRequest request) {

        return restoreFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            final RestoreFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RestoreFromSnapshotResult>() {
                    @Override
                    public RestoreFromSnapshotResult call() throws Exception {
                        RestoreFromSnapshotResult result;

                        try {
                            result = restoreFromSnapshot(request);
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
    public java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(
            UpdateRadiusRequest request) {

        return updateRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(
            final UpdateRadiusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateRadiusResult>() {
                    @Override
                    public UpdateRadiusResult call() throws Exception {
                        UpdateRadiusResult result;

                        try {
                            result = updateRadius(request);
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
    public java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(
            VerifyTrustRequest request) {

        return verifyTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(
            final VerifyTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyTrustRequest, VerifyTrustResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<VerifyTrustResult>() {
                    @Override
                    public VerifyTrustResult call() throws Exception {
                        VerifyTrustResult result;

                        try {
                            result = verifyTrust(request);
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
}
