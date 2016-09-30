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
package com.amazonaws.services.glacier;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon Glacier asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Glacier is a storage solution for "cold data."
 * </p>
 * <p>
 * Amazon Glacier is an extremely low-cost storage service that provides secure, durable, and easy-to-use storage for
 * data backup and archival. With Amazon Glacier, customers can store their data cost effectively for months, years, or
 * decades. Amazon Glacier also enables customers to offload the administrative burdens of operating and scaling storage
 * to AWS, so they don't have to worry about capacity planning, hardware provisioning, data replication, hardware
 * failure and recovery, or time-consuming hardware migrations.
 * </p>
 * <p>
 * Amazon Glacier is a great storage choice when low storage cost is paramount, your data is rarely retrieved, and
 * retrieval latency of several hours is acceptable. If your application requires fast or frequent access to your data,
 * consider using Amazon S3. For more information, go to <a href="http://aws.amazon.com/s3/">Amazon Simple Storage
 * Service (Amazon S3)</a>.
 * </p>
 * <p>
 * You can store any kind of data in any format. There is no maximum limit on the total amount of data you can store in
 * Amazon Glacier.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Glacier, we recommend that you begin by reading the following sections in the
 * <i>Amazon Glacier Developer Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/introduction.html">What is Amazon Glacier</a> - This
 * section of the Developer Guide describes the underlying data model, the operations it supports, and the AWS SDKs that
 * you can use to interact with the service.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/amazon-glacier-getting-started.html">Getting Started
 * with Amazon Glacier</a> - The Getting Started section walks you through the process of creating a vault, uploading
 * archives, creating jobs to download archives, retrieving the job output, and deleting archives.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonGlacierAsyncClient extends AmazonGlacierClient implements AmazonGlacierAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier. A credentials provider chain
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
     */
    public AmazonGlacierAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon Glacier (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonGlacierAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the provided AWS account
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
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGlacierAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Glacier using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonGlacierAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AbortMultipartUploadResult> abortMultipartUploadAsync(AbortMultipartUploadRequest request) {

        return abortMultipartUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AbortMultipartUploadResult> abortMultipartUploadAsync(final AbortMultipartUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<AbortMultipartUploadRequest, AbortMultipartUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AbortMultipartUploadResult>() {
            @Override
            public AbortMultipartUploadResult call() throws Exception {
                AbortMultipartUploadResult result;

                try {
                    result = abortMultipartUpload(request);
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
    public java.util.concurrent.Future<AbortVaultLockResult> abortVaultLockAsync(AbortVaultLockRequest request) {

        return abortVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AbortVaultLockResult> abortVaultLockAsync(final AbortVaultLockRequest request,
            final com.amazonaws.handlers.AsyncHandler<AbortVaultLockRequest, AbortVaultLockResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AbortVaultLockResult>() {
            @Override
            public AbortVaultLockResult call() throws Exception {
                AbortVaultLockResult result;

                try {
                    result = abortVaultLock(request);
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
    public java.util.concurrent.Future<AddTagsToVaultResult> addTagsToVaultAsync(AddTagsToVaultRequest request) {

        return addTagsToVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToVaultResult> addTagsToVaultAsync(final AddTagsToVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToVaultRequest, AddTagsToVaultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToVaultResult>() {
            @Override
            public AddTagsToVaultResult call() throws Exception {
                AddTagsToVaultResult result;

                try {
                    result = addTagsToVault(request);
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
    public java.util.concurrent.Future<CompleteMultipartUploadResult> completeMultipartUploadAsync(CompleteMultipartUploadRequest request) {

        return completeMultipartUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteMultipartUploadResult> completeMultipartUploadAsync(final CompleteMultipartUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteMultipartUploadRequest, CompleteMultipartUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CompleteMultipartUploadResult>() {
            @Override
            public CompleteMultipartUploadResult call() throws Exception {
                CompleteMultipartUploadResult result;

                try {
                    result = completeMultipartUpload(request);
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
    public java.util.concurrent.Future<CompleteVaultLockResult> completeVaultLockAsync(CompleteVaultLockRequest request) {

        return completeVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteVaultLockResult> completeVaultLockAsync(final CompleteVaultLockRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteVaultLockRequest, CompleteVaultLockResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CompleteVaultLockResult>() {
            @Override
            public CompleteVaultLockResult call() throws Exception {
                CompleteVaultLockResult result;

                try {
                    result = completeVaultLock(request);
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
    public java.util.concurrent.Future<CreateVaultResult> createVaultAsync(CreateVaultRequest request) {

        return createVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVaultResult> createVaultAsync(final CreateVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVaultRequest, CreateVaultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateVaultResult>() {
            @Override
            public CreateVaultResult call() throws Exception {
                CreateVaultResult result;

                try {
                    result = createVault(request);
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
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request) {

        return deleteArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(final DeleteArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteArchiveResult>() {
            @Override
            public DeleteArchiveResult call() throws Exception {
                DeleteArchiveResult result;

                try {
                    result = deleteArchive(request);
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
    public java.util.concurrent.Future<DeleteVaultResult> deleteVaultAsync(DeleteVaultRequest request) {

        return deleteVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultResult> deleteVaultAsync(final DeleteVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVaultRequest, DeleteVaultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVaultResult>() {
            @Override
            public DeleteVaultResult call() throws Exception {
                DeleteVaultResult result;

                try {
                    result = deleteVault(request);
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
    public java.util.concurrent.Future<DeleteVaultAccessPolicyResult> deleteVaultAccessPolicyAsync(DeleteVaultAccessPolicyRequest request) {

        return deleteVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultAccessPolicyResult> deleteVaultAccessPolicyAsync(final DeleteVaultAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVaultAccessPolicyRequest, DeleteVaultAccessPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVaultAccessPolicyResult>() {
            @Override
            public DeleteVaultAccessPolicyResult call() throws Exception {
                DeleteVaultAccessPolicyResult result;

                try {
                    result = deleteVaultAccessPolicy(request);
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
    public java.util.concurrent.Future<DeleteVaultNotificationsResult> deleteVaultNotificationsAsync(DeleteVaultNotificationsRequest request) {

        return deleteVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultNotificationsResult> deleteVaultNotificationsAsync(final DeleteVaultNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVaultNotificationsRequest, DeleteVaultNotificationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVaultNotificationsResult>() {
            @Override
            public DeleteVaultNotificationsResult call() throws Exception {
                DeleteVaultNotificationsResult result;

                try {
                    result = deleteVaultNotifications(request);
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
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(final DescribeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobResult>() {
            @Override
            public DescribeJobResult call() throws Exception {
                DescribeJobResult result;

                try {
                    result = describeJob(request);
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
    public java.util.concurrent.Future<DescribeVaultResult> describeVaultAsync(DescribeVaultRequest request) {

        return describeVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVaultResult> describeVaultAsync(final DescribeVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVaultRequest, DescribeVaultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVaultResult>() {
            @Override
            public DescribeVaultResult call() throws Exception {
                DescribeVaultResult result;

                try {
                    result = describeVault(request);
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
    public java.util.concurrent.Future<GetDataRetrievalPolicyResult> getDataRetrievalPolicyAsync(GetDataRetrievalPolicyRequest request) {

        return getDataRetrievalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataRetrievalPolicyResult> getDataRetrievalPolicyAsync(final GetDataRetrievalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataRetrievalPolicyRequest, GetDataRetrievalPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDataRetrievalPolicyResult>() {
            @Override
            public GetDataRetrievalPolicyResult call() throws Exception {
                GetDataRetrievalPolicyResult result;

                try {
                    result = getDataRetrievalPolicy(request);
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
    public java.util.concurrent.Future<GetJobOutputResult> getJobOutputAsync(GetJobOutputRequest request) {

        return getJobOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobOutputResult> getJobOutputAsync(final GetJobOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobOutputRequest, GetJobOutputResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetJobOutputResult>() {
            @Override
            public GetJobOutputResult call() throws Exception {
                GetJobOutputResult result;

                try {
                    result = getJobOutput(request);
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
    public java.util.concurrent.Future<GetVaultAccessPolicyResult> getVaultAccessPolicyAsync(GetVaultAccessPolicyRequest request) {

        return getVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVaultAccessPolicyResult> getVaultAccessPolicyAsync(final GetVaultAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVaultAccessPolicyRequest, GetVaultAccessPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetVaultAccessPolicyResult>() {
            @Override
            public GetVaultAccessPolicyResult call() throws Exception {
                GetVaultAccessPolicyResult result;

                try {
                    result = getVaultAccessPolicy(request);
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
    public java.util.concurrent.Future<GetVaultLockResult> getVaultLockAsync(GetVaultLockRequest request) {

        return getVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVaultLockResult> getVaultLockAsync(final GetVaultLockRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVaultLockRequest, GetVaultLockResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetVaultLockResult>() {
            @Override
            public GetVaultLockResult call() throws Exception {
                GetVaultLockResult result;

                try {
                    result = getVaultLock(request);
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
    public java.util.concurrent.Future<GetVaultNotificationsResult> getVaultNotificationsAsync(GetVaultNotificationsRequest request) {

        return getVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVaultNotificationsResult> getVaultNotificationsAsync(final GetVaultNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVaultNotificationsRequest, GetVaultNotificationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetVaultNotificationsResult>() {
            @Override
            public GetVaultNotificationsResult call() throws Exception {
                GetVaultNotificationsResult result;

                try {
                    result = getVaultNotifications(request);
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
    public java.util.concurrent.Future<InitiateJobResult> initiateJobAsync(InitiateJobRequest request) {

        return initiateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateJobResult> initiateJobAsync(final InitiateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateJobRequest, InitiateJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InitiateJobResult>() {
            @Override
            public InitiateJobResult call() throws Exception {
                InitiateJobResult result;

                try {
                    result = initiateJob(request);
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
    public java.util.concurrent.Future<InitiateMultipartUploadResult> initiateMultipartUploadAsync(InitiateMultipartUploadRequest request) {

        return initiateMultipartUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateMultipartUploadResult> initiateMultipartUploadAsync(final InitiateMultipartUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateMultipartUploadRequest, InitiateMultipartUploadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InitiateMultipartUploadResult>() {
            @Override
            public InitiateMultipartUploadResult call() throws Exception {
                InitiateMultipartUploadResult result;

                try {
                    result = initiateMultipartUpload(request);
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
    public java.util.concurrent.Future<InitiateVaultLockResult> initiateVaultLockAsync(InitiateVaultLockRequest request) {

        return initiateVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateVaultLockResult> initiateVaultLockAsync(final InitiateVaultLockRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateVaultLockRequest, InitiateVaultLockResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<InitiateVaultLockResult>() {
            @Override
            public InitiateVaultLockResult call() throws Exception {
                InitiateVaultLockResult result;

                try {
                    result = initiateVaultLock(request);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result;

                try {
                    result = listJobs(request);
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
    public java.util.concurrent.Future<ListMultipartUploadsResult> listMultipartUploadsAsync(ListMultipartUploadsRequest request) {

        return listMultipartUploadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadsResult> listMultipartUploadsAsync(final ListMultipartUploadsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMultipartUploadsRequest, ListMultipartUploadsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListMultipartUploadsResult>() {
            @Override
            public ListMultipartUploadsResult call() throws Exception {
                ListMultipartUploadsResult result;

                try {
                    result = listMultipartUploads(request);
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
    public java.util.concurrent.Future<ListPartsResult> listPartsAsync(ListPartsRequest request) {

        return listPartsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartsResult> listPartsAsync(final ListPartsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartsRequest, ListPartsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListPartsResult>() {
            @Override
            public ListPartsResult call() throws Exception {
                ListPartsResult result;

                try {
                    result = listParts(request);
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
    public java.util.concurrent.Future<ListTagsForVaultResult> listTagsForVaultAsync(ListTagsForVaultRequest request) {

        return listTagsForVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForVaultResult> listTagsForVaultAsync(final ListTagsForVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForVaultRequest, ListTagsForVaultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForVaultResult>() {
            @Override
            public ListTagsForVaultResult call() throws Exception {
                ListTagsForVaultResult result;

                try {
                    result = listTagsForVault(request);
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
    public java.util.concurrent.Future<ListVaultsResult> listVaultsAsync(ListVaultsRequest request) {

        return listVaultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVaultsResult> listVaultsAsync(final ListVaultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVaultsRequest, ListVaultsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVaultsResult>() {
            @Override
            public ListVaultsResult call() throws Exception {
                ListVaultsResult result;

                try {
                    result = listVaults(request);
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
    public java.util.concurrent.Future<RemoveTagsFromVaultResult> removeTagsFromVaultAsync(RemoveTagsFromVaultRequest request) {

        return removeTagsFromVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromVaultResult> removeTagsFromVaultAsync(final RemoveTagsFromVaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromVaultRequest, RemoveTagsFromVaultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromVaultResult>() {
            @Override
            public RemoveTagsFromVaultResult call() throws Exception {
                RemoveTagsFromVaultResult result;

                try {
                    result = removeTagsFromVault(request);
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
    public java.util.concurrent.Future<SetDataRetrievalPolicyResult> setDataRetrievalPolicyAsync(SetDataRetrievalPolicyRequest request) {

        return setDataRetrievalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDataRetrievalPolicyResult> setDataRetrievalPolicyAsync(final SetDataRetrievalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDataRetrievalPolicyRequest, SetDataRetrievalPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetDataRetrievalPolicyResult>() {
            @Override
            public SetDataRetrievalPolicyResult call() throws Exception {
                SetDataRetrievalPolicyResult result;

                try {
                    result = setDataRetrievalPolicy(request);
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
    public java.util.concurrent.Future<SetVaultAccessPolicyResult> setVaultAccessPolicyAsync(SetVaultAccessPolicyRequest request) {

        return setVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVaultAccessPolicyResult> setVaultAccessPolicyAsync(final SetVaultAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetVaultAccessPolicyRequest, SetVaultAccessPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetVaultAccessPolicyResult>() {
            @Override
            public SetVaultAccessPolicyResult call() throws Exception {
                SetVaultAccessPolicyResult result;

                try {
                    result = setVaultAccessPolicy(request);
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
    public java.util.concurrent.Future<SetVaultNotificationsResult> setVaultNotificationsAsync(SetVaultNotificationsRequest request) {

        return setVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVaultNotificationsResult> setVaultNotificationsAsync(final SetVaultNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetVaultNotificationsRequest, SetVaultNotificationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetVaultNotificationsResult>() {
            @Override
            public SetVaultNotificationsResult call() throws Exception {
                SetVaultNotificationsResult result;

                try {
                    result = setVaultNotifications(request);
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
    public java.util.concurrent.Future<UploadArchiveResult> uploadArchiveAsync(UploadArchiveRequest request) {

        return uploadArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadArchiveResult> uploadArchiveAsync(final UploadArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadArchiveRequest, UploadArchiveResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UploadArchiveResult>() {
            @Override
            public UploadArchiveResult call() throws Exception {
                UploadArchiveResult result;

                try {
                    result = uploadArchive(request);
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
    public java.util.concurrent.Future<UploadMultipartPartResult> uploadMultipartPartAsync(UploadMultipartPartRequest request) {

        return uploadMultipartPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadMultipartPartResult> uploadMultipartPartAsync(final UploadMultipartPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadMultipartPartRequest, UploadMultipartPartResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UploadMultipartPartResult>() {
            @Override
            public UploadMultipartPartResult call() throws Exception {
                UploadMultipartPartResult result;

                try {
                    result = uploadMultipartPart(request);
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
