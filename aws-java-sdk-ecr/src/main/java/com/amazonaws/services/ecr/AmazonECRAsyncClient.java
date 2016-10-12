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
package com.amazonaws.services.ecr;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon ECR asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EC2 Container Registry (Amazon ECR) is a managed AWS Docker registry service. Customers can use the familiar
 * Docker CLI to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions using AWS IAM so that specific users or
 * Amazon EC2 instances can access repositories and images. Developers can use the Docker CLI to author and manage
 * images.
 * </p>
 */
@ThreadSafe
public class AmazonECRAsyncClient extends AmazonECRClient implements AmazonECRAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR. A credentials provider chain will
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
    public AmazonECRAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon ECR (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonECRAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the provided AWS account
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
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonECRAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonECRAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(BatchCheckLayerAvailabilityRequest request) {

        return batchCheckLayerAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(final BatchCheckLayerAvailabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchCheckLayerAvailabilityResult>() {
            @Override
            public BatchCheckLayerAvailabilityResult call() throws Exception {
                BatchCheckLayerAvailabilityResult result;

                try {
                    result = batchCheckLayerAvailability(request);
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
    public java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest request) {

        return batchDeleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(final BatchDeleteImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteImageRequest, BatchDeleteImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteImageResult>() {
            @Override
            public BatchDeleteImageResult call() throws Exception {
                BatchDeleteImageResult result;

                try {
                    result = batchDeleteImage(request);
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
    public java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(BatchGetImageRequest request) {

        return batchGetImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(final BatchGetImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetImageRequest, BatchGetImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetImageResult>() {
            @Override
            public BatchGetImageResult call() throws Exception {
                BatchGetImageResult result;

                try {
                    result = batchGetImage(request);
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
    public java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest request) {

        return completeLayerUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(final CompleteLayerUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteLayerUploadRequest, CompleteLayerUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CompleteLayerUploadResult>() {
            @Override
            public CompleteLayerUploadResult call() throws Exception {
                CompleteLayerUploadResult result;

                try {
                    result = completeLayerUpload(request);
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
    public java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest request) {

        return deleteRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(final DeleteRepositoryPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryPolicyResult>() {
            @Override
            public DeleteRepositoryPolicyResult call() throws Exception {
                DeleteRepositoryPolicyResult result;

                try {
                    result = deleteRepositoryPolicy(request);
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
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(final DescribeImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeImagesResult>() {
            @Override
            public DescribeImagesResult call() throws Exception {
                DescribeImagesResult result;

                try {
                    result = describeImages(request);
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
    public java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest request) {

        return describeRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(final DescribeRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRepositoriesRequest, DescribeRepositoriesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRepositoriesResult>() {
            @Override
            public DescribeRepositoriesResult call() throws Exception {
                DescribeRepositoriesResult result;

                try {
                    result = describeRepositories(request);
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
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest request) {

        return getAuthorizationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(final GetAuthorizationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizationTokenResult>() {
            @Override
            public GetAuthorizationTokenResult call() throws Exception {
                GetAuthorizationTokenResult result;

                try {
                    result = getAuthorizationToken(request);
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
    public java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(GetDownloadUrlForLayerRequest request) {

        return getDownloadUrlForLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(final GetDownloadUrlForLayerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDownloadUrlForLayerRequest, GetDownloadUrlForLayerResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDownloadUrlForLayerResult>() {
            @Override
            public GetDownloadUrlForLayerResult call() throws Exception {
                GetDownloadUrlForLayerResult result;

                try {
                    result = getDownloadUrlForLayer(request);
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
    public java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest request) {

        return getRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(final GetRepositoryPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryPolicyRequest, GetRepositoryPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryPolicyResult>() {
            @Override
            public GetRepositoryPolicyResult call() throws Exception {
                GetRepositoryPolicyResult result;

                try {
                    result = getRepositoryPolicy(request);
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
    public java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest request) {

        return initiateLayerUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(final InitiateLayerUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateLayerUploadRequest, InitiateLayerUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InitiateLayerUploadResult>() {
            @Override
            public InitiateLayerUploadResult call() throws Exception {
                InitiateLayerUploadResult result;

                try {
                    result = initiateLayerUpload(request);
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
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(ListImagesRequest request) {

        return listImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(final ListImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListImagesResult>() {
            @Override
            public ListImagesResult call() throws Exception {
                ListImagesResult result;

                try {
                    result = listImages(request);
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
    public java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest request) {

        return putImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImageResult> putImageAsync(final PutImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutImageRequest, PutImageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutImageResult>() {
            @Override
            public PutImageResult call() throws Exception {
                PutImageResult result;

                try {
                    result = putImage(request);
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
    public java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest request) {

        return setRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(final SetRepositoryPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetRepositoryPolicyRequest, SetRepositoryPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetRepositoryPolicyResult>() {
            @Override
            public SetRepositoryPolicyResult call() throws Exception {
                SetRepositoryPolicyResult result;

                try {
                    result = setRepositoryPolicy(request);
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
    public java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest request) {

        return uploadLayerPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(final UploadLayerPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadLayerPartRequest, UploadLayerPartResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UploadLayerPartResult>() {
            @Override
            public UploadLayerPartResult call() throws Exception {
                UploadLayerPartResult result;

                try {
                    result = uploadLayerPart(request);
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
