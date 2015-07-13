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
package com.amazonaws.services.codecommit;

import com.amazonaws.services.codecommit.model.*;

/**
 * Interface for accessing CodeCommit asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides
 * descriptions of the AWS CodeCommit API.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <ul>
 * <li>Repositories</li>
 * <li>Branches</li>
 * <li>Commits</li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <i>AWS CodeCommit
 * User Guide</i>.
 * </p>
 */
public class AWSCodeCommitAsyncClient extends AWSCodeCommitClient implements
        AWSCodeCommitAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit. A credentials provider chain will be used that searches for
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
    public AWSCodeCommitAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit. A credentials provider chain will be used that searches for
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
     *        connects to CodeCommit (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodeCommitAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the specified AWS account credentials.
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
    public AWSCodeCommitAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSCodeCommitAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the specified AWS account credentials, executor service,
     * and client configuration options.
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
    public AWSCodeCommitAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the specified AWS account credentials provider. Default
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
    public AWSCodeCommitAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the provided AWS account credentials provider and client
     * configuration options.
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
    public AWSCodeCommitAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSCodeCommitAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeCommit using the specified AWS account credentials provider, executor
     * service, and client configuration options.
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
    public AWSCodeCommitAsyncClient(
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
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(
            final BatchGetRepositoriesRequest batchGetRepositoriesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetRepositoriesResult>() {
                    @Override
                    public BatchGetRepositoriesResult call() {
                        return batchGetRepositories(batchGetRepositoriesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetRepositoriesResult> batchGetRepositoriesAsync(
            final BatchGetRepositoriesRequest batchGetRepositoriesRequest,
            final com.amazonaws.handlers.AsyncHandler<BatchGetRepositoriesRequest, BatchGetRepositoriesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetRepositoriesResult>() {
                    @Override
                    public BatchGetRepositoriesResult call() throws Exception {
                        BatchGetRepositoriesResult result;
                        try {
                            result = batchGetRepositories(batchGetRepositoriesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(batchGetRepositoriesRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> createBranchAsync(
            final CreateBranchRequest createBranchRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        createBranch(createBranchRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> createBranchAsync(
            final CreateBranchRequest createBranchRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            createBranch(createBranchRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createBranchRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(
            final CreateRepositoryRequest createRepositoryRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateRepositoryResult>() {
                    @Override
                    public CreateRepositoryResult call() {
                        return createRepository(createRepositoryRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(
            final CreateRepositoryRequest createRepositoryRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateRepositoryResult>() {
                    @Override
                    public CreateRepositoryResult call() throws Exception {
                        CreateRepositoryResult result;
                        try {
                            result = createRepository(createRepositoryRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createRepositoryRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(
            final DeleteRepositoryRequest deleteRepositoryRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteRepositoryResult>() {
                    @Override
                    public DeleteRepositoryResult call() {
                        return deleteRepository(deleteRepositoryRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(
            final DeleteRepositoryRequest deleteRepositoryRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteRepositoryResult>() {
                    @Override
                    public DeleteRepositoryResult call() throws Exception {
                        DeleteRepositoryResult result;
                        try {
                            result = deleteRepository(deleteRepositoryRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(deleteRepositoryRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(
            final GetBranchRequest getBranchRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetBranchResult>() {
                    @Override
                    public GetBranchResult call() {
                        return getBranch(getBranchRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetBranchResult> getBranchAsync(
            final GetBranchRequest getBranchRequest,
            final com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetBranchResult>() {
                    @Override
                    public GetBranchResult call() throws Exception {
                        GetBranchResult result;
                        try {
                            result = getBranch(getBranchRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getBranchRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(
            final GetRepositoryRequest getRepositoryRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRepositoryResult>() {
                    @Override
                    public GetRepositoryResult call() {
                        return getRepository(getRepositoryRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(
            final GetRepositoryRequest getRepositoryRequest,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRepositoryResult>() {
                    @Override
                    public GetRepositoryResult call() throws Exception {
                        GetRepositoryResult result;
                        try {
                            result = getRepository(getRepositoryRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getRepositoryRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(
            final ListBranchesRequest listBranchesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListBranchesResult>() {
                    @Override
                    public ListBranchesResult call() {
                        return listBranches(listBranchesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(
            final ListBranchesRequest listBranchesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListBranchesResult>() {
                    @Override
                    public ListBranchesResult call() throws Exception {
                        ListBranchesResult result;
                        try {
                            result = listBranches(listBranchesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listBranchesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(
            final ListRepositoriesRequest listRepositoriesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRepositoriesResult>() {
                    @Override
                    public ListRepositoriesResult call() {
                        return listRepositories(listRepositoriesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(
            final ListRepositoriesRequest listRepositoriesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRepositoriesResult>() {
                    @Override
                    public ListRepositoriesResult call() throws Exception {
                        ListRepositoriesResult result;
                        try {
                            result = listRepositories(listRepositoriesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listRepositoriesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateDefaultBranchAsync(
            final UpdateDefaultBranchRequest updateDefaultBranchRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        updateDefaultBranch(updateDefaultBranchRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateDefaultBranchAsync(
            final UpdateDefaultBranchRequest updateDefaultBranchRequest,
            final com.amazonaws.handlers.AsyncHandler<UpdateDefaultBranchRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            updateDefaultBranch(updateDefaultBranchRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(updateDefaultBranchRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateRepositoryDescriptionAsync(
            final UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        updateRepositoryDescription(updateRepositoryDescriptionRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateRepositoryDescriptionAsync(
            final UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryDescriptionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            updateRepositoryDescription(updateRepositoryDescriptionRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                updateRepositoryDescriptionRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateRepositoryNameAsync(
            final UpdateRepositoryNameRequest updateRepositoryNameRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        updateRepositoryName(updateRepositoryNameRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateRepositoryNameAsync(
            final UpdateRepositoryNameRequest updateRepositoryNameRequest,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryNameRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            updateRepositoryName(updateRepositoryNameRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(updateRepositoryNameRequest,
                                result);
                        return result;
                    }
                });
    }
}
