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
package com.amazonaws.services.codecommit;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing CodeCommit asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides descriptions of the operations and data
 * types for AWS CodeCommit API.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <ul>
 * <li>Repositories, by calling the following:
 * <ul>
 * <li><a>BatchGetRepositories</a>, which returns information about one or more repositories associated with your AWS
 * account</li>
 * <li><a>CreateRepository</a>, which creates an AWS CodeCommit repository</li>
 * <li><a>DeleteRepository</a>, which deletes an AWS CodeCommit repository</li>
 * <li><a>GetRepository</a>, which returns information about a specified repository</li>
 * <li><a>ListRepositories</a>, which lists all AWS CodeCommit repositories associated with your AWS account</li>
 * <li><a>UpdateRepositoryDescription</a>, which sets or updates the description of the repository</li>
 * <li><a>UpdateRepositoryName</a>, which changes the name of the repository. If you change the name of a repository, no
 * other users of that repository will be able to access it until you send them the new HTTPS or SSH URL to use.</li>
 * </ul>
 * </li>
 * <li>Branches, by calling the following:
 * <ul>
 * <li><a>CreateBranch</a>, which creates a new branch in a specified repository</li>
 * <li><a>GetBranch</a>, which returns information about a specified branch</li>
 * <li><a>ListBranches</a>, which lists all branches for a specified repository</li>
 * <li><a>UpdateDefaultBranch</a>, which changes the default branch for a repository</li>
 * </ul>
 * </li>
 * <li>Information about committed code in a repository, by calling the following:
 * <ul>
 * <li><a>GetCommit</a>, which returns information about a commit, including commit messages and committer information.</li>
 * </ul>
 * </li>
 * <li>Triggers, by calling the following:
 * <ul>
 * <li><a>GetRepositoryTriggers</a>, which returns information about triggers configured for a repository</li>
 * <li><a>PutRepositoryTriggers</a>, which replaces all triggers for a repository and can be used to create or delete
 * triggers</li>
 * <li><a>TestRepositoryTriggers</a>, which tests the functionality of a repository trigger by sending data to the
 * trigger target</li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <a
 * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
 * </p>
 */
@ThreadSafe
public class AWSCodeCommitAsyncClient extends AWSCodeCommitClient implements AWSCodeCommitAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit. A credentials provider chain will
     * be used that searches for credentials in this order:
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
    public AWSCodeCommitAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to CodeCommit (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the provided AWS account
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
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodeCommitAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeCommit using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeCommitAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(BatchGetRepositoriesRequest request) {

        return batchGetRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(final BatchGetRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetRepositoriesResult>() {
            @Override
            public BatchGetRepositoriesResult call() throws Exception {
                BatchGetRepositoriesResult result;

                try {
                    result = batchGetRepositories(request);
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
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest request) {

        return createBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBranchResult> createBranchAsync(final CreateBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateBranchResult>() {
            @Override
            public CreateBranchResult call() throws Exception {
                CreateBranchResult result;

                try {
                    result = createBranch(request);
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
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(final CreateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateRepositoryResult>() {
            @Override
            public CreateRepositoryResult call() throws Exception {
                CreateRepositoryResult result;

                try {
                    result = createRepository(request);
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
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(final DeleteRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryResult>() {
            @Override
            public DeleteRepositoryResult call() throws Exception {
                DeleteRepositoryResult result;

                try {
                    result = deleteRepository(request);
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
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest request) {

        return getBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(final GetBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetBranchResult>() {
            @Override
            public GetBranchResult call() throws Exception {
                GetBranchResult result;

                try {
                    result = getBranch(request);
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
    public java.util.concurrent.Future<GetCommitResult> getCommitAsync(GetCommitRequest request) {

        return getCommitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommitResult> getCommitAsync(final GetCommitRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommitRequest, GetCommitResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCommitResult>() {
            @Override
            public GetCommitResult call() throws Exception {
                GetCommitResult result;

                try {
                    result = getCommit(request);
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
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest request) {

        return getRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(final GetRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryResult>() {
            @Override
            public GetRepositoryResult call() throws Exception {
                GetRepositoryResult result;

                try {
                    result = getRepository(request);
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
    public java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(GetRepositoryTriggersRequest request) {

        return getRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryTriggersResult> getRepositoryTriggersAsync(final GetRepositoryTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryTriggersRequest, GetRepositoryTriggersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryTriggersResult>() {
            @Override
            public GetRepositoryTriggersResult call() throws Exception {
                GetRepositoryTriggersResult result;

                try {
                    result = getRepositoryTriggers(request);
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
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest request) {

        return listBranchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(final ListBranchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListBranchesResult>() {
            @Override
            public ListBranchesResult call() throws Exception {
                ListBranchesResult result;

                try {
                    result = listBranches(request);
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
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request) {

        return listRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(final ListRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRepositoriesResult>() {
            @Override
            public ListRepositoriesResult call() throws Exception {
                ListRepositoriesResult result;

                try {
                    result = listRepositories(request);
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
    public java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(PutRepositoryTriggersRequest request) {

        return putRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryTriggersResult> putRepositoryTriggersAsync(final PutRepositoryTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRepositoryTriggersRequest, PutRepositoryTriggersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutRepositoryTriggersResult>() {
            @Override
            public PutRepositoryTriggersResult call() throws Exception {
                PutRepositoryTriggersResult result;

                try {
                    result = putRepositoryTriggers(request);
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
    public java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(TestRepositoryTriggersRequest request) {

        return testRepositoryTriggersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestRepositoryTriggersResult> testRepositoryTriggersAsync(final TestRepositoryTriggersRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestRepositoryTriggersRequest, TestRepositoryTriggersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TestRepositoryTriggersResult>() {
            @Override
            public TestRepositoryTriggersResult call() throws Exception {
                TestRepositoryTriggersResult result;

                try {
                    result = testRepositoryTriggers(request);
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
    public java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(UpdateDefaultBranchRequest request) {

        return updateDefaultBranchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDefaultBranchResult> updateDefaultBranchAsync(final UpdateDefaultBranchRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, UpdateDefaultBranchResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateDefaultBranchResult>() {
            @Override
            public UpdateDefaultBranchResult call() throws Exception {
                UpdateDefaultBranchResult result;

                try {
                    result = updateDefaultBranch(request);
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
    public java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(UpdateRepositoryDescriptionRequest request) {

        return updateRepositoryDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryDescriptionResult> updateRepositoryDescriptionAsync(final UpdateRepositoryDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, UpdateRepositoryDescriptionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateRepositoryDescriptionResult>() {
            @Override
            public UpdateRepositoryDescriptionResult call() throws Exception {
                UpdateRepositoryDescriptionResult result;

                try {
                    result = updateRepositoryDescription(request);
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
    public java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(UpdateRepositoryNameRequest request) {

        return updateRepositoryNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryNameResult> updateRepositoryNameAsync(final UpdateRepositoryNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, UpdateRepositoryNameResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateRepositoryNameResult>() {
            @Override
            public UpdateRepositoryNameResult call() throws Exception {
                UpdateRepositoryNameResult result;

                try {
                    result = updateRepositoryName(request);
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
