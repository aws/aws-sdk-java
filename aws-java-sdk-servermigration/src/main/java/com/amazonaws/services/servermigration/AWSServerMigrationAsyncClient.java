/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing SMS asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * Amazon Server Migration Service automates the process of migrating servers to EC2.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SMS using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
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
     * @deprecated use {@link AWSServerMigrationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServerMigrationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSServerMigrationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSServerMigrationAsyncClientBuilder asyncBuilder() {
        return AWSServerMigrationAsyncClientBuilder.standard();
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
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(CreateReplicationJobRequest request) {

        return createReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationJobResult> createReplicationJobAsync(final CreateReplicationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationJobRequest, CreateReplicationJobResult> asyncHandler) {
        final CreateReplicationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationJobResult>() {
            @Override
            public CreateReplicationJobResult call() throws Exception {
                CreateReplicationJobResult result = null;

                try {
                    result = executeCreateReplicationJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(DeleteReplicationJobRequest request) {

        return deleteReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationJobResult> deleteReplicationJobAsync(final DeleteReplicationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationJobRequest, DeleteReplicationJobResult> asyncHandler) {
        final DeleteReplicationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationJobResult>() {
            @Override
            public DeleteReplicationJobResult call() throws Exception {
                DeleteReplicationJobResult result = null;

                try {
                    result = executeDeleteReplicationJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(DeleteServerCatalogRequest request) {

        return deleteServerCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerCatalogResult> deleteServerCatalogAsync(final DeleteServerCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServerCatalogRequest, DeleteServerCatalogResult> asyncHandler) {
        final DeleteServerCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServerCatalogResult>() {
            @Override
            public DeleteServerCatalogResult call() throws Exception {
                DeleteServerCatalogResult result = null;

                try {
                    result = executeDeleteServerCatalog(finalRequest);
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
    public java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(DisassociateConnectorRequest request) {

        return disassociateConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectorResult> disassociateConnectorAsync(final DisassociateConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateConnectorRequest, DisassociateConnectorResult> asyncHandler) {
        final DisassociateConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateConnectorResult>() {
            @Override
            public DisassociateConnectorResult call() throws Exception {
                DisassociateConnectorResult result = null;

                try {
                    result = executeDisassociateConnector(finalRequest);
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
    public java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(GetConnectorsRequest request) {

        return getConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectorsResult> getConnectorsAsync(final GetConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectorsRequest, GetConnectorsResult> asyncHandler) {
        final GetConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectorsResult>() {
            @Override
            public GetConnectorsResult call() throws Exception {
                GetConnectorsResult result = null;

                try {
                    result = executeGetConnectors(finalRequest);
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
    public java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(GetReplicationJobsRequest request) {

        return getReplicationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationJobsResult> getReplicationJobsAsync(final GetReplicationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationJobsRequest, GetReplicationJobsResult> asyncHandler) {
        final GetReplicationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationJobsResult>() {
            @Override
            public GetReplicationJobsResult call() throws Exception {
                GetReplicationJobsResult result = null;

                try {
                    result = executeGetReplicationJobs(finalRequest);
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
    public java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(GetReplicationRunsRequest request) {

        return getReplicationRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationRunsResult> getReplicationRunsAsync(final GetReplicationRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationRunsRequest, GetReplicationRunsResult> asyncHandler) {
        final GetReplicationRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationRunsResult>() {
            @Override
            public GetReplicationRunsResult call() throws Exception {
                GetReplicationRunsResult result = null;

                try {
                    result = executeGetReplicationRuns(finalRequest);
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
    public java.util.concurrent.Future<GetServersResult> getServersAsync(GetServersRequest request) {

        return getServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServersResult> getServersAsync(final GetServersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServersRequest, GetServersResult> asyncHandler) {
        final GetServersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServersResult>() {
            @Override
            public GetServersResult call() throws Exception {
                GetServersResult result = null;

                try {
                    result = executeGetServers(finalRequest);
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
    public java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(ImportServerCatalogRequest request) {

        return importServerCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportServerCatalogResult> importServerCatalogAsync(final ImportServerCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportServerCatalogRequest, ImportServerCatalogResult> asyncHandler) {
        final ImportServerCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportServerCatalogResult>() {
            @Override
            public ImportServerCatalogResult call() throws Exception {
                ImportServerCatalogResult result = null;

                try {
                    result = executeImportServerCatalog(finalRequest);
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
    public java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(StartOnDemandReplicationRunRequest request) {

        return startOnDemandReplicationRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOnDemandReplicationRunResult> startOnDemandReplicationRunAsync(final StartOnDemandReplicationRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartOnDemandReplicationRunRequest, StartOnDemandReplicationRunResult> asyncHandler) {
        final StartOnDemandReplicationRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartOnDemandReplicationRunResult>() {
            @Override
            public StartOnDemandReplicationRunResult call() throws Exception {
                StartOnDemandReplicationRunResult result = null;

                try {
                    result = executeStartOnDemandReplicationRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(UpdateReplicationJobRequest request) {

        return updateReplicationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationJobResult> updateReplicationJobAsync(final UpdateReplicationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationJobRequest, UpdateReplicationJobResult> asyncHandler) {
        final UpdateReplicationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationJobResult>() {
            @Override
            public UpdateReplicationJobResult call() throws Exception {
                UpdateReplicationJobResult result = null;

                try {
                    result = executeUpdateReplicationJob(finalRequest);
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
