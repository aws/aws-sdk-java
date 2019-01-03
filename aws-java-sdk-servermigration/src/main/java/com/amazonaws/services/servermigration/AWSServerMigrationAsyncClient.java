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
 * <fullname>AAWS Sever Migration Service</fullname>
 * <p>
 * This is the <i>AWS Sever Migration Service API Reference</i>. It provides descriptions, syntax, and usage examples
 * for each of the actions and data types for the AWS Sever Migration Service (AWS SMS). The topic for each action shows
 * the Query API request parameters and the XML response. You can also view the XML request elements in the WSDL.
 * </p>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * To learn more about the Server Migration Service, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://aws.amazon.com/server-migration-service/">AWS Sever Migration Service product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/server-migration-service/latest/userguide/server-migration.html">AWS Sever
 * Migration Service User Guide</a>
 * </p>
 * </li>
 * </ul>
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
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {
        final CreateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppResult>() {
            @Override
            public CreateAppResult call() throws Exception {
                CreateAppResult result = null;

                try {
                    result = executeCreateApp(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppLaunchConfigurationResult> deleteAppLaunchConfigurationAsync(DeleteAppLaunchConfigurationRequest request) {

        return deleteAppLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppLaunchConfigurationResult> deleteAppLaunchConfigurationAsync(final DeleteAppLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppLaunchConfigurationRequest, DeleteAppLaunchConfigurationResult> asyncHandler) {
        final DeleteAppLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppLaunchConfigurationResult>() {
            @Override
            public DeleteAppLaunchConfigurationResult call() throws Exception {
                DeleteAppLaunchConfigurationResult result = null;

                try {
                    result = executeDeleteAppLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppReplicationConfigurationResult> deleteAppReplicationConfigurationAsync(
            DeleteAppReplicationConfigurationRequest request) {

        return deleteAppReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppReplicationConfigurationResult> deleteAppReplicationConfigurationAsync(
            final DeleteAppReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppReplicationConfigurationRequest, DeleteAppReplicationConfigurationResult> asyncHandler) {
        final DeleteAppReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppReplicationConfigurationResult>() {
            @Override
            public DeleteAppReplicationConfigurationResult call() throws Exception {
                DeleteAppReplicationConfigurationResult result = null;

                try {
                    result = executeDeleteAppReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GenerateChangeSetResult> generateChangeSetAsync(GenerateChangeSetRequest request) {

        return generateChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateChangeSetResult> generateChangeSetAsync(final GenerateChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateChangeSetRequest, GenerateChangeSetResult> asyncHandler) {
        final GenerateChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateChangeSetResult>() {
            @Override
            public GenerateChangeSetResult call() throws Exception {
                GenerateChangeSetResult result = null;

                try {
                    result = executeGenerateChangeSet(finalRequest);
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
    public java.util.concurrent.Future<GenerateTemplateResult> generateTemplateAsync(GenerateTemplateRequest request) {

        return generateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateTemplateResult> generateTemplateAsync(final GenerateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateTemplateRequest, GenerateTemplateResult> asyncHandler) {
        final GenerateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateTemplateResult>() {
            @Override
            public GenerateTemplateResult call() throws Exception {
                GenerateTemplateResult result = null;

                try {
                    result = executeGenerateTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest request) {

        return getAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppResult> getAppAsync(final GetAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler) {
        final GetAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppResult>() {
            @Override
            public GetAppResult call() throws Exception {
                GetAppResult result = null;

                try {
                    result = executeGetApp(finalRequest);
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
    public java.util.concurrent.Future<GetAppLaunchConfigurationResult> getAppLaunchConfigurationAsync(GetAppLaunchConfigurationRequest request) {

        return getAppLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppLaunchConfigurationResult> getAppLaunchConfigurationAsync(final GetAppLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppLaunchConfigurationRequest, GetAppLaunchConfigurationResult> asyncHandler) {
        final GetAppLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppLaunchConfigurationResult>() {
            @Override
            public GetAppLaunchConfigurationResult call() throws Exception {
                GetAppLaunchConfigurationResult result = null;

                try {
                    result = executeGetAppLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetAppReplicationConfigurationResult> getAppReplicationConfigurationAsync(GetAppReplicationConfigurationRequest request) {

        return getAppReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppReplicationConfigurationResult> getAppReplicationConfigurationAsync(
            final GetAppReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppReplicationConfigurationRequest, GetAppReplicationConfigurationResult> asyncHandler) {
        final GetAppReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppReplicationConfigurationResult>() {
            @Override
            public GetAppReplicationConfigurationResult call() throws Exception {
                GetAppReplicationConfigurationResult result = null;

                try {
                    result = executeGetAppReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<LaunchAppResult> launchAppAsync(LaunchAppRequest request) {

        return launchAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LaunchAppResult> launchAppAsync(final LaunchAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<LaunchAppRequest, LaunchAppResult> asyncHandler) {
        final LaunchAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LaunchAppResult>() {
            @Override
            public LaunchAppResult call() throws Exception {
                LaunchAppResult result = null;

                try {
                    result = executeLaunchApp(finalRequest);
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
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest request) {

        return listAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppsResult> listAppsAsync(final ListAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler) {
        final ListAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppsResult>() {
            @Override
            public ListAppsResult call() throws Exception {
                ListAppsResult result = null;

                try {
                    result = executeListApps(finalRequest);
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
    public java.util.concurrent.Future<PutAppLaunchConfigurationResult> putAppLaunchConfigurationAsync(PutAppLaunchConfigurationRequest request) {

        return putAppLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppLaunchConfigurationResult> putAppLaunchConfigurationAsync(final PutAppLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAppLaunchConfigurationRequest, PutAppLaunchConfigurationResult> asyncHandler) {
        final PutAppLaunchConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAppLaunchConfigurationResult>() {
            @Override
            public PutAppLaunchConfigurationResult call() throws Exception {
                PutAppLaunchConfigurationResult result = null;

                try {
                    result = executePutAppLaunchConfiguration(finalRequest);
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
    public java.util.concurrent.Future<PutAppReplicationConfigurationResult> putAppReplicationConfigurationAsync(PutAppReplicationConfigurationRequest request) {

        return putAppReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppReplicationConfigurationResult> putAppReplicationConfigurationAsync(
            final PutAppReplicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAppReplicationConfigurationRequest, PutAppReplicationConfigurationResult> asyncHandler) {
        final PutAppReplicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAppReplicationConfigurationResult>() {
            @Override
            public PutAppReplicationConfigurationResult call() throws Exception {
                PutAppReplicationConfigurationResult result = null;

                try {
                    result = executePutAppReplicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<StartAppReplicationResult> startAppReplicationAsync(StartAppReplicationRequest request) {

        return startAppReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAppReplicationResult> startAppReplicationAsync(final StartAppReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAppReplicationRequest, StartAppReplicationResult> asyncHandler) {
        final StartAppReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAppReplicationResult>() {
            @Override
            public StartAppReplicationResult call() throws Exception {
                StartAppReplicationResult result = null;

                try {
                    result = executeStartAppReplication(finalRequest);
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
    public java.util.concurrent.Future<StopAppReplicationResult> stopAppReplicationAsync(StopAppReplicationRequest request) {

        return stopAppReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAppReplicationResult> stopAppReplicationAsync(final StopAppReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAppReplicationRequest, StopAppReplicationResult> asyncHandler) {
        final StopAppReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAppReplicationResult>() {
            @Override
            public StopAppReplicationResult call() throws Exception {
                StopAppReplicationResult result = null;

                try {
                    result = executeStopAppReplication(finalRequest);
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
    public java.util.concurrent.Future<TerminateAppResult> terminateAppAsync(TerminateAppRequest request) {

        return terminateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateAppResult> terminateAppAsync(final TerminateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateAppRequest, TerminateAppResult> asyncHandler) {
        final TerminateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateAppResult>() {
            @Override
            public TerminateAppResult call() throws Exception {
                TerminateAppResult result = null;

                try {
                    result = executeTerminateApp(finalRequest);
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
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest request) {

        return updateAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppResult> updateAppAsync(final UpdateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler) {
        final UpdateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppResult>() {
            @Override
            public UpdateAppResult call() throws Exception {
                UpdateAppResult result = null;

                try {
                    result = executeUpdateApp(finalRequest);
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
