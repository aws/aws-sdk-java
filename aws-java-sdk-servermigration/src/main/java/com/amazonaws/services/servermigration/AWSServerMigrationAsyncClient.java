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
package com.amazonaws.services.servermigration;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing SMS asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * Amazon Server Migration Service automates the process of migrating servers to EC2.
 */
@ThreadSafe
public class AWSServerMigrationAsyncClient extends AWSServerMigrationClient implements AWSServerMigrationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS. A credentials provider chain will be used
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
    public AWSServerMigrationAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the provided AWS account credentials
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
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSServerMigrationAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSServerMigrationAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest request) {

        return createReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(final CreateReplicationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationJobRequest, CreateReplicationJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationJobResult>() {
            @Override
            public CreateReplicationJobResult call() throws Exception {
                CreateReplicationJobResult result;

                try {
                    result = createReplicationJob(request);
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
    public java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest request) {

        return deleteReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(final DeleteReplicationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationJobRequest, DeleteReplicationJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationJobResult>() {
            @Override
            public DeleteReplicationJobResult call() throws Exception {
                DeleteReplicationJobResult result;

                try {
                    result = deleteReplicationJob(request);
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
    public java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest request) {

        return deleteServerCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(final DeleteServerCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServerCatalogRequest, DeleteServerCatalogResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteServerCatalogResult>() {
            @Override
            public DeleteServerCatalogResult call() throws Exception {
                DeleteServerCatalogResult result;

                try {
                    result = deleteServerCatalog(request);
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
    public java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest request) {

        return disassociateConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(final DisassociateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateConnectorRequest, DisassociateConnectorResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisassociateConnectorResult>() {
            @Override
            public DisassociateConnectorResult call() throws Exception {
                DisassociateConnectorResult result;

                try {
                    result = disassociateConnector(request);
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
    public java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest request) {

        return getConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(final GetConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectorsRequest, GetConnectorsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetConnectorsResult>() {
            @Override
            public GetConnectorsResult call() throws Exception {
                GetConnectorsResult result;

                try {
                    result = getConnectors(request);
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
    public java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest request) {

        return getReplicationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(final GetReplicationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationJobsRequest, GetReplicationJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationJobsResult>() {
            @Override
            public GetReplicationJobsResult call() throws Exception {
                GetReplicationJobsResult result;

                try {
                    result = getReplicationJobs(request);
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
    public java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest request) {

        return getReplicationRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(final GetReplicationRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationRunsRequest, GetReplicationRunsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationRunsResult>() {
            @Override
            public GetReplicationRunsResult call() throws Exception {
                GetReplicationRunsResult result;

                try {
                    result = getReplicationRuns(request);
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
    public java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest request) {

        return getServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServersResult> getServersAsync(final GetServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServersRequest, GetServersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetServersResult>() {
            @Override
            public GetServersResult call() throws Exception {
                GetServersResult result;

                try {
                    result = getServers(request);
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
    public java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest request) {

        return importServerCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(final ImportServerCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportServerCatalogRequest, ImportServerCatalogResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportServerCatalogResult>() {
            @Override
            public ImportServerCatalogResult call() throws Exception {
                ImportServerCatalogResult result;

                try {
                    result = importServerCatalog(request);
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
    public java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(StartOnDemandReplicationRunRequest request) {

        return startOnDemandReplicationRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(final StartOnDemandReplicationRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartOnDemandReplicationRunRequest, StartOnDemandReplicationRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartOnDemandReplicationRunResult>() {
            @Override
            public StartOnDemandReplicationRunResult call() throws Exception {
                StartOnDemandReplicationRunResult result;

                try {
                    result = startOnDemandReplicationRun(request);
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
    public java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest request) {

        return updateReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(final UpdateReplicationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationJobRequest, UpdateReplicationJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationJobResult>() {
            @Override
            public UpdateReplicationJobResult call() throws Exception {
                UpdateReplicationJobResult result;

                try {
                    result = updateReplicationJob(request);
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
