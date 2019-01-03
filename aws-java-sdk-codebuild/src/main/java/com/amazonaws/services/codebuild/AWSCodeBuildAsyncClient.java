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
 * for the build time you consume. For more information about AWS CodeBuild, see the <i>AWS CodeBuild User Guide</i>.
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchDeleteBuilds</code>: Deletes one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build projects. A <i>build project</i> defines how
 * AWS CodeBuild runs a build. This includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build output. A <i>build environment</i> is a
 * representation of operating system, programming language runtime, and tools that AWS CodeBuild uses to run a build.
 * You can add tags to build projects to help manage your resources and costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateWebhook</code>: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed
 * to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateWebhook</code>: Changes the settings of an existing webhook.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteWebhook</code>: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to
 * the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>: Gets a list of build project names, with each build project name representing a single
 * build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>: Changes the settings of an existing build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuilds</code>: Gets a list of build IDs, with each build ID representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuildsForProject</code>: Gets a list of build IDs for the specified build project, with each build ID
 * representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartBuild</code>: Starts running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StopBuild</code>: Attempts to stop running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteSourceCredentials</code>: Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ImportSourceCredentials</code>: Imports the source repository credentials for an AWS CodeBuild project that has
 * its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSourceCredentials</code>: Returns a list of <code>SourceCredentialsInfo</code> objects. Each
 * <code>SourceCredentialsInfo</code> object includes the authentication type, token ARN, and type of source provider
 * for one set of credentials.
 * </p>
 * </li>
 * </ul>
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
