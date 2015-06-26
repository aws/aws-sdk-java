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
package com.amazonaws.services.elasticfilesystem;

import com.amazonaws.services.elasticfilesystem.model.*;

/**
 * Interface for accessing EFS asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 */
public class AmazonElasticFileSystemAsyncClient extends
        AmazonElasticFileSystemClient implements AmazonElasticFileSystemAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonElasticFileSystemAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *        connects to EFS (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the specified AWS account credentials.
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the specified AWS account credentials and executor service. Default
     * client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the specified AWS account credentials, executor service, and client
     * configuration options.
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the specified AWS account credentials provider. Default client
     * settings will be used.
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the provided AWS account credentials provider and client
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
     * using the specified AWS account credentials provider, executor service,
     * and client configuration options.
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
    public AmazonElasticFileSystemAsyncClient(
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
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(
            final CreateFileSystemRequest createFileSystemRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateFileSystemResult>() {
                    @Override
                    public CreateFileSystemResult call() {
                        return createFileSystem(createFileSystemRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(
            final CreateFileSystemRequest createFileSystemRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateFileSystemResult>() {
                    @Override
                    public CreateFileSystemResult call() throws Exception {
                        CreateFileSystemResult result;
                        try {
                            result = createFileSystem(createFileSystemRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createFileSystemRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(
            final CreateMountTargetRequest createMountTargetRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateMountTargetResult>() {
                    @Override
                    public CreateMountTargetResult call() {
                        return createMountTarget(createMountTargetRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(
            final CreateMountTargetRequest createMountTargetRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateMountTargetResult>() {
                    @Override
                    public CreateMountTargetResult call() throws Exception {
                        CreateMountTargetResult result;
                        try {
                            result = createMountTarget(createMountTargetRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler
                                .onSuccess(createMountTargetRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> createTagsAsync(
            final CreateTagsRequest createTagsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        createTags(createTagsRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> createTagsAsync(
            final CreateTagsRequest createTagsRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            createTags(createTagsRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createTagsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteFileSystemAsync(
            final DeleteFileSystemRequest deleteFileSystemRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        deleteFileSystem(deleteFileSystemRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteFileSystemAsync(
            final DeleteFileSystemRequest deleteFileSystemRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            deleteFileSystem(deleteFileSystemRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(deleteFileSystemRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMountTargetAsync(
            final DeleteMountTargetRequest deleteMountTargetRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        deleteMountTarget(deleteMountTargetRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMountTargetAsync(
            final DeleteMountTargetRequest deleteMountTargetRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteMountTargetRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            deleteMountTarget(deleteMountTargetRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler
                                .onSuccess(deleteMountTargetRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTagsAsync(
            final DeleteTagsRequest deleteTagsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        deleteTags(deleteTagsRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTagsAsync(
            final DeleteTagsRequest deleteTagsRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            deleteTags(deleteTagsRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(deleteTagsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            final DescribeFileSystemsRequest describeFileSystemsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeFileSystemsResult>() {
                    @Override
                    public DescribeFileSystemsResult call() {
                        return describeFileSystems(describeFileSystemsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            final DescribeFileSystemsRequest describeFileSystemsRequest,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeFileSystemsResult>() {
                    @Override
                    public DescribeFileSystemsResult call() throws Exception {
                        DescribeFileSystemsResult result;
                        try {
                            result = describeFileSystems(describeFileSystemsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(describeFileSystemsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync() {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeFileSystems operation
     * with an AsyncHandler.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            final DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMountTargetSecurityGroupsResult>() {
                    @Override
                    public DescribeMountTargetSecurityGroupsResult call() {
                        return describeMountTargetSecurityGroups(describeMountTargetSecurityGroupsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            final DescribeMountTargetSecurityGroupsRequest describeMountTargetSecurityGroupsRequest,
            final com.amazonaws.handlers.AsyncHandler<DescribeMountTargetSecurityGroupsRequest, DescribeMountTargetSecurityGroupsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMountTargetSecurityGroupsResult>() {
                    @Override
                    public DescribeMountTargetSecurityGroupsResult call()
                            throws Exception {
                        DescribeMountTargetSecurityGroupsResult result;
                        try {
                            result = describeMountTargetSecurityGroups(describeMountTargetSecurityGroupsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                describeMountTargetSecurityGroupsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(
            final DescribeMountTargetsRequest describeMountTargetsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMountTargetsResult>() {
                    @Override
                    public DescribeMountTargetsResult call() {
                        return describeMountTargets(describeMountTargetsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(
            final DescribeMountTargetsRequest describeMountTargetsRequest,
            final com.amazonaws.handlers.AsyncHandler<DescribeMountTargetsRequest, DescribeMountTargetsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMountTargetsResult>() {
                    @Override
                    public DescribeMountTargetsResult call() throws Exception {
                        DescribeMountTargetsResult result;
                        try {
                            result = describeMountTargets(describeMountTargetsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(describeMountTargetsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
                    @Override
                    public DescribeTagsResult call() {
                        return describeTags(describeTagsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest describeTagsRequest,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
                    @Override
                    public DescribeTagsResult call() throws Exception {
                        DescribeTagsResult result;
                        try {
                            result = describeTags(describeTagsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(describeTagsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> modifyMountTargetSecurityGroupsAsync(
            final ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        modifyMountTargetSecurityGroups(modifyMountTargetSecurityGroupsRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> modifyMountTargetSecurityGroupsAsync(
            final ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest,
            final com.amazonaws.handlers.AsyncHandler<ModifyMountTargetSecurityGroupsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            modifyMountTargetSecurityGroups(modifyMountTargetSecurityGroupsRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                modifyMountTargetSecurityGroupsRequest, result);
                        return result;
                    }
                });
    }
}
