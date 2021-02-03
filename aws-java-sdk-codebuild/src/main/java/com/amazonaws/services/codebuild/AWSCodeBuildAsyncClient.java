/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS CodeBuild asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild compiles your source code, runs unit
 * tests, and produces artifacts that are ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for the most popular programming languages
 * and build tools, such as Apache Maven, Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests. You pay only
 * for the build time you consume. For more information about AWS CodeBuild, see the <i> <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/welcome.html">AWS CodeBuild User Guide</a>.</i>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeBuildAsyncClient extends AWSCodeBuildClient implements AWSCodeBuildAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild. A credentials provider chain
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
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the provided AWS account
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
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCodeBuildAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCodeBuildAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCodeBuildAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSCodeBuildAsyncClientBuilder asyncBuilder() {
        return AWSCodeBuildAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeBuildAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeBuild using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCodeBuildAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest request) {

        return batchDeleteBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(final BatchDeleteBuildsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteBuildsRequest, BatchDeleteBuildsResult> asyncHandler) {
        final BatchDeleteBuildsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteBuildsResult>() {
            @Override
            public BatchDeleteBuildsResult call() throws Exception {
                BatchDeleteBuildsResult result = null;

                try {
                    result = executeBatchDeleteBuilds(finalRequest);
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
    public java.util.concurrent.Future<BatchGetBuildBatchesResult> batchGetBuildBatchesAsync(BatchGetBuildBatchesRequest request) {

        return batchGetBuildBatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetBuildBatchesResult> batchGetBuildBatchesAsync(final BatchGetBuildBatchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetBuildBatchesRequest, BatchGetBuildBatchesResult> asyncHandler) {
        final BatchGetBuildBatchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetBuildBatchesResult>() {
            @Override
            public BatchGetBuildBatchesResult call() throws Exception {
                BatchGetBuildBatchesResult result = null;

                try {
                    result = executeBatchGetBuildBatches(finalRequest);
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
    public java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest request) {

        return batchGetBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(final BatchGetBuildsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetBuildsRequest, BatchGetBuildsResult> asyncHandler) {
        final BatchGetBuildsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetBuildsResult>() {
            @Override
            public BatchGetBuildsResult call() throws Exception {
                BatchGetBuildsResult result = null;

                try {
                    result = executeBatchGetBuilds(finalRequest);
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
    public java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest request) {

        return batchGetProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(final BatchGetProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetProjectsRequest, BatchGetProjectsResult> asyncHandler) {
        final BatchGetProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetProjectsResult>() {
            @Override
            public BatchGetProjectsResult call() throws Exception {
                BatchGetProjectsResult result = null;

                try {
                    result = executeBatchGetProjects(finalRequest);
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
    public java.util.concurrent.Future<BatchGetReportGroupsResult> batchGetReportGroupsAsync(BatchGetReportGroupsRequest request) {

        return batchGetReportGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetReportGroupsResult> batchGetReportGroupsAsync(final BatchGetReportGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetReportGroupsRequest, BatchGetReportGroupsResult> asyncHandler) {
        final BatchGetReportGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetReportGroupsResult>() {
            @Override
            public BatchGetReportGroupsResult call() throws Exception {
                BatchGetReportGroupsResult result = null;

                try {
                    result = executeBatchGetReportGroups(finalRequest);
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
    public java.util.concurrent.Future<BatchGetReportsResult> batchGetReportsAsync(BatchGetReportsRequest request) {

        return batchGetReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetReportsResult> batchGetReportsAsync(final BatchGetReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetReportsRequest, BatchGetReportsResult> asyncHandler) {
        final BatchGetReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetReportsResult>() {
            @Override
            public BatchGetReportsResult call() throws Exception {
                BatchGetReportsResult result = null;

                try {
                    result = executeBatchGetReports(finalRequest);
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
    public java.util.concurrent.Future<CreateReportGroupResult> createReportGroupAsync(CreateReportGroupRequest request) {

        return createReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReportGroupResult> createReportGroupAsync(final CreateReportGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReportGroupRequest, CreateReportGroupResult> asyncHandler) {
        final CreateReportGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReportGroupResult>() {
            @Override
            public CreateReportGroupResult call() throws Exception {
                CreateReportGroupResult result = null;

                try {
                    result = executeCreateReportGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest request) {

        return createWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(final CreateWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWebhookRequest, CreateWebhookResult> asyncHandler) {
        final CreateWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWebhookResult>() {
            @Override
            public CreateWebhookResult call() throws Exception {
                CreateWebhookResult result = null;

                try {
                    result = executeCreateWebhook(finalRequest);
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
    public java.util.concurrent.Future<DeleteBuildBatchResult> deleteBuildBatchAsync(DeleteBuildBatchRequest request) {

        return deleteBuildBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildBatchResult> deleteBuildBatchAsync(final DeleteBuildBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBuildBatchRequest, DeleteBuildBatchResult> asyncHandler) {
        final DeleteBuildBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBuildBatchResult>() {
            @Override
            public DeleteBuildBatchResult call() throws Exception {
                DeleteBuildBatchResult result = null;

                try {
                    result = executeDeleteBuildBatch(finalRequest);
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
    public java.util.concurrent.Future<DeleteReportResult> deleteReportAsync(DeleteReportRequest request) {

        return deleteReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportResult> deleteReportAsync(final DeleteReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReportRequest, DeleteReportResult> asyncHandler) {
        final DeleteReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReportResult>() {
            @Override
            public DeleteReportResult call() throws Exception {
                DeleteReportResult result = null;

                try {
                    result = executeDeleteReport(finalRequest);
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
    public java.util.concurrent.Future<DeleteReportGroupResult> deleteReportGroupAsync(DeleteReportGroupRequest request) {

        return deleteReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportGroupResult> deleteReportGroupAsync(final DeleteReportGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReportGroupRequest, DeleteReportGroupResult> asyncHandler) {
        final DeleteReportGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReportGroupResult>() {
            @Override
            public DeleteReportGroupResult call() throws Exception {
                DeleteReportGroupResult result = null;

                try {
                    result = executeDeleteReportGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteSourceCredentialsResult> deleteSourceCredentialsAsync(DeleteSourceCredentialsRequest request) {

        return deleteSourceCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceCredentialsResult> deleteSourceCredentialsAsync(final DeleteSourceCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSourceCredentialsRequest, DeleteSourceCredentialsResult> asyncHandler) {
        final DeleteSourceCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSourceCredentialsResult>() {
            @Override
            public DeleteSourceCredentialsResult call() throws Exception {
                DeleteSourceCredentialsResult result = null;

                try {
                    result = executeDeleteSourceCredentials(finalRequest);
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
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest request) {

        return deleteWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(final DeleteWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWebhookRequest, DeleteWebhookResult> asyncHandler) {
        final DeleteWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWebhookResult>() {
            @Override
            public DeleteWebhookResult call() throws Exception {
                DeleteWebhookResult result = null;

                try {
                    result = executeDeleteWebhook(finalRequest);
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
    public java.util.concurrent.Future<DescribeCodeCoveragesResult> describeCodeCoveragesAsync(DescribeCodeCoveragesRequest request) {

        return describeCodeCoveragesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeCoveragesResult> describeCodeCoveragesAsync(final DescribeCodeCoveragesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCodeCoveragesRequest, DescribeCodeCoveragesResult> asyncHandler) {
        final DescribeCodeCoveragesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCodeCoveragesResult>() {
            @Override
            public DescribeCodeCoveragesResult call() throws Exception {
                DescribeCodeCoveragesResult result = null;

                try {
                    result = executeDescribeCodeCoverages(finalRequest);
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
    public java.util.concurrent.Future<DescribeTestCasesResult> describeTestCasesAsync(DescribeTestCasesRequest request) {

        return describeTestCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTestCasesResult> describeTestCasesAsync(final DescribeTestCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTestCasesRequest, DescribeTestCasesResult> asyncHandler) {
        final DescribeTestCasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTestCasesResult>() {
            @Override
            public DescribeTestCasesResult call() throws Exception {
                DescribeTestCasesResult result = null;

                try {
                    result = executeDescribeTestCases(finalRequest);
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
    public java.util.concurrent.Future<GetReportGroupTrendResult> getReportGroupTrendAsync(GetReportGroupTrendRequest request) {

        return getReportGroupTrendAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReportGroupTrendResult> getReportGroupTrendAsync(final GetReportGroupTrendRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReportGroupTrendRequest, GetReportGroupTrendResult> asyncHandler) {
        final GetReportGroupTrendRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReportGroupTrendResult>() {
            @Override
            public GetReportGroupTrendResult call() throws Exception {
                GetReportGroupTrendResult result = null;

                try {
                    result = executeGetReportGroupTrend(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(final GetResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {
        final GetResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePolicyResult>() {
            @Override
            public GetResourcePolicyResult call() throws Exception {
                GetResourcePolicyResult result = null;

                try {
                    result = executeGetResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<ImportSourceCredentialsResult> importSourceCredentialsAsync(ImportSourceCredentialsRequest request) {

        return importSourceCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSourceCredentialsResult> importSourceCredentialsAsync(final ImportSourceCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportSourceCredentialsRequest, ImportSourceCredentialsResult> asyncHandler) {
        final ImportSourceCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportSourceCredentialsResult>() {
            @Override
            public ImportSourceCredentialsResult call() throws Exception {
                ImportSourceCredentialsResult result = null;

                try {
                    result = executeImportSourceCredentials(finalRequest);
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
    public java.util.concurrent.Future<InvalidateProjectCacheResult> invalidateProjectCacheAsync(InvalidateProjectCacheRequest request) {

        return invalidateProjectCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvalidateProjectCacheResult> invalidateProjectCacheAsync(final InvalidateProjectCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<InvalidateProjectCacheRequest, InvalidateProjectCacheResult> asyncHandler) {
        final InvalidateProjectCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InvalidateProjectCacheResult>() {
            @Override
            public InvalidateProjectCacheResult call() throws Exception {
                InvalidateProjectCacheResult result = null;

                try {
                    result = executeInvalidateProjectCache(finalRequest);
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
    public java.util.concurrent.Future<ListBuildBatchesResult> listBuildBatchesAsync(ListBuildBatchesRequest request) {

        return listBuildBatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildBatchesResult> listBuildBatchesAsync(final ListBuildBatchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuildBatchesRequest, ListBuildBatchesResult> asyncHandler) {
        final ListBuildBatchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuildBatchesResult>() {
            @Override
            public ListBuildBatchesResult call() throws Exception {
                ListBuildBatchesResult result = null;

                try {
                    result = executeListBuildBatches(finalRequest);
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
    public java.util.concurrent.Future<ListBuildBatchesForProjectResult> listBuildBatchesForProjectAsync(ListBuildBatchesForProjectRequest request) {

        return listBuildBatchesForProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildBatchesForProjectResult> listBuildBatchesForProjectAsync(final ListBuildBatchesForProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuildBatchesForProjectRequest, ListBuildBatchesForProjectResult> asyncHandler) {
        final ListBuildBatchesForProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuildBatchesForProjectResult>() {
            @Override
            public ListBuildBatchesForProjectResult call() throws Exception {
                ListBuildBatchesForProjectResult result = null;

                try {
                    result = executeListBuildBatchesForProject(finalRequest);
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
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request) {

        return listBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(final ListBuildsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler) {
        final ListBuildsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuildsResult>() {
            @Override
            public ListBuildsResult call() throws Exception {
                ListBuildsResult result = null;

                try {
                    result = executeListBuilds(finalRequest);
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
    public java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest request) {

        return listBuildsForProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(final ListBuildsForProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuildsForProjectRequest, ListBuildsForProjectResult> asyncHandler) {
        final ListBuildsForProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuildsForProjectResult>() {
            @Override
            public ListBuildsForProjectResult call() throws Exception {
                ListBuildsForProjectResult result = null;

                try {
                    result = executeListBuildsForProject(finalRequest);
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
    public java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(ListCuratedEnvironmentImagesRequest request) {

        return listCuratedEnvironmentImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(final ListCuratedEnvironmentImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCuratedEnvironmentImagesRequest, ListCuratedEnvironmentImagesResult> asyncHandler) {
        final ListCuratedEnvironmentImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCuratedEnvironmentImagesResult>() {
            @Override
            public ListCuratedEnvironmentImagesResult call() throws Exception {
                ListCuratedEnvironmentImagesResult result = null;

                try {
                    result = executeListCuratedEnvironmentImages(finalRequest);
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
    public java.util.concurrent.Future<ListReportGroupsResult> listReportGroupsAsync(ListReportGroupsRequest request) {

        return listReportGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportGroupsResult> listReportGroupsAsync(final ListReportGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReportGroupsRequest, ListReportGroupsResult> asyncHandler) {
        final ListReportGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReportGroupsResult>() {
            @Override
            public ListReportGroupsResult call() throws Exception {
                ListReportGroupsResult result = null;

                try {
                    result = executeListReportGroups(finalRequest);
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
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest request) {

        return listReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(final ListReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReportsRequest, ListReportsResult> asyncHandler) {
        final ListReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReportsResult>() {
            @Override
            public ListReportsResult call() throws Exception {
                ListReportsResult result = null;

                try {
                    result = executeListReports(finalRequest);
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
    public java.util.concurrent.Future<ListReportsForReportGroupResult> listReportsForReportGroupAsync(ListReportsForReportGroupRequest request) {

        return listReportsForReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportsForReportGroupResult> listReportsForReportGroupAsync(final ListReportsForReportGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReportsForReportGroupRequest, ListReportsForReportGroupResult> asyncHandler) {
        final ListReportsForReportGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReportsForReportGroupResult>() {
            @Override
            public ListReportsForReportGroupResult call() throws Exception {
                ListReportsForReportGroupResult result = null;

                try {
                    result = executeListReportsForReportGroup(finalRequest);
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
    public java.util.concurrent.Future<ListSharedProjectsResult> listSharedProjectsAsync(ListSharedProjectsRequest request) {

        return listSharedProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSharedProjectsResult> listSharedProjectsAsync(final ListSharedProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSharedProjectsRequest, ListSharedProjectsResult> asyncHandler) {
        final ListSharedProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSharedProjectsResult>() {
            @Override
            public ListSharedProjectsResult call() throws Exception {
                ListSharedProjectsResult result = null;

                try {
                    result = executeListSharedProjects(finalRequest);
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
    public java.util.concurrent.Future<ListSharedReportGroupsResult> listSharedReportGroupsAsync(ListSharedReportGroupsRequest request) {

        return listSharedReportGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSharedReportGroupsResult> listSharedReportGroupsAsync(final ListSharedReportGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSharedReportGroupsRequest, ListSharedReportGroupsResult> asyncHandler) {
        final ListSharedReportGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSharedReportGroupsResult>() {
            @Override
            public ListSharedReportGroupsResult call() throws Exception {
                ListSharedReportGroupsResult result = null;

                try {
                    result = executeListSharedReportGroups(finalRequest);
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
    public java.util.concurrent.Future<ListSourceCredentialsResult> listSourceCredentialsAsync(ListSourceCredentialsRequest request) {

        return listSourceCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSourceCredentialsResult> listSourceCredentialsAsync(final ListSourceCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSourceCredentialsRequest, ListSourceCredentialsResult> asyncHandler) {
        final ListSourceCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSourceCredentialsResult>() {
            @Override
            public ListSourceCredentialsResult call() throws Exception {
                ListSourceCredentialsResult result = null;

                try {
                    result = executeListSourceCredentials(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<RetryBuildResult> retryBuildAsync(RetryBuildRequest request) {

        return retryBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryBuildResult> retryBuildAsync(final RetryBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetryBuildRequest, RetryBuildResult> asyncHandler) {
        final RetryBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetryBuildResult>() {
            @Override
            public RetryBuildResult call() throws Exception {
                RetryBuildResult result = null;

                try {
                    result = executeRetryBuild(finalRequest);
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
    public java.util.concurrent.Future<RetryBuildBatchResult> retryBuildBatchAsync(RetryBuildBatchRequest request) {

        return retryBuildBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryBuildBatchResult> retryBuildBatchAsync(final RetryBuildBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetryBuildBatchRequest, RetryBuildBatchResult> asyncHandler) {
        final RetryBuildBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetryBuildBatchResult>() {
            @Override
            public RetryBuildBatchResult call() throws Exception {
                RetryBuildBatchResult result = null;

                try {
                    result = executeRetryBuildBatch(finalRequest);
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
    public java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest request) {

        return startBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBuildResult> startBuildAsync(final StartBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBuildRequest, StartBuildResult> asyncHandler) {
        final StartBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBuildResult>() {
            @Override
            public StartBuildResult call() throws Exception {
                StartBuildResult result = null;

                try {
                    result = executeStartBuild(finalRequest);
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
    public java.util.concurrent.Future<StartBuildBatchResult> startBuildBatchAsync(StartBuildBatchRequest request) {

        return startBuildBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBuildBatchResult> startBuildBatchAsync(final StartBuildBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBuildBatchRequest, StartBuildBatchResult> asyncHandler) {
        final StartBuildBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBuildBatchResult>() {
            @Override
            public StartBuildBatchResult call() throws Exception {
                StartBuildBatchResult result = null;

                try {
                    result = executeStartBuildBatch(finalRequest);
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
    public java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest request) {

        return stopBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBuildResult> stopBuildAsync(final StopBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopBuildRequest, StopBuildResult> asyncHandler) {
        final StopBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopBuildResult>() {
            @Override
            public StopBuildResult call() throws Exception {
                StopBuildResult result = null;

                try {
                    result = executeStopBuild(finalRequest);
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
    public java.util.concurrent.Future<StopBuildBatchResult> stopBuildBatchAsync(StopBuildBatchRequest request) {

        return stopBuildBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBuildBatchResult> stopBuildBatchAsync(final StopBuildBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopBuildBatchRequest, StopBuildBatchResult> asyncHandler) {
        final StopBuildBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopBuildBatchResult>() {
            @Override
            public StopBuildBatchResult call() throws Exception {
                StopBuildBatchResult result = null;

                try {
                    result = executeStopBuildBatch(finalRequest);
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
    public java.util.concurrent.Future<UpdateReportGroupResult> updateReportGroupAsync(UpdateReportGroupRequest request) {

        return updateReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReportGroupResult> updateReportGroupAsync(final UpdateReportGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReportGroupRequest, UpdateReportGroupResult> asyncHandler) {
        final UpdateReportGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReportGroupResult>() {
            @Override
            public UpdateReportGroupResult call() throws Exception {
                UpdateReportGroupResult result = null;

                try {
                    result = executeUpdateReportGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest request) {

        return updateWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(final UpdateWebhookRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWebhookRequest, UpdateWebhookResult> asyncHandler) {
        final UpdateWebhookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWebhookResult>() {
            @Override
            public UpdateWebhookResult call() throws Exception {
                UpdateWebhookResult result = null;

                try {
                    result = executeUpdateWebhook(finalRequest);
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
