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
package com.amazonaws.services.workspaces;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon WorkSpaces asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * This reference provides detailed information about the Amazon WorkSpaces operations.
 * </p>
 */
@ThreadSafe
public class AmazonWorkspacesAsyncClient extends AmazonWorkspacesClient implements AmazonWorkspacesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces. A credentials provider chain
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
    public AmazonWorkspacesAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the provided AWS
     * account credentials provider and client configuration options.
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
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonWorkspacesAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonWorkspacesAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result;

                try {
                    result = createTags(request);
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
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest request) {

        return createWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(final CreateWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkspacesResult>() {
            @Override
            public CreateWorkspacesResult call() throws Exception {
                CreateWorkspacesResult result;

                try {
                    result = createWorkspaces(request);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result;

                try {
                    result = deleteTags(request);
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
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result;

                try {
                    result = describeTags(request);
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
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest request) {

        return describeWorkspaceBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(final DescribeWorkspaceBundlesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceBundlesResult>() {
            @Override
            public DescribeWorkspaceBundlesResult call() throws Exception {
                DescribeWorkspaceBundlesResult result;

                try {
                    result = describeWorkspaceBundles(request);
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
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync() {

        return describeWorkspaceBundlesAsync(new DescribeWorkspaceBundlesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation with an AsyncHandler.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {

        return describeWorkspaceBundlesAsync(new DescribeWorkspaceBundlesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest request) {

        return describeWorkspaceDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(final DescribeWorkspaceDirectoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceDirectoriesResult>() {
            @Override
            public DescribeWorkspaceDirectoriesResult call() throws Exception {
                DescribeWorkspaceDirectoriesResult result;

                try {
                    result = describeWorkspaceDirectories(request);
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
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync() {

        return describeWorkspaceDirectoriesAsync(new DescribeWorkspaceDirectoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation with an AsyncHandler.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        return describeWorkspaceDirectoriesAsync(new DescribeWorkspaceDirectoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest request) {

        return describeWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(final DescribeWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspacesResult>() {
            @Override
            public DescribeWorkspacesResult call() throws Exception {
                DescribeWorkspacesResult result;

                try {
                    result = describeWorkspaces(request);
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
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync() {

        return describeWorkspacesAsync(new DescribeWorkspacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation with an AsyncHandler.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {

        return describeWorkspacesAsync(new DescribeWorkspacesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest request) {

        return describeWorkspacesConnectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            final DescribeWorkspacesConnectionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesConnectionStatusRequest, DescribeWorkspacesConnectionStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspacesConnectionStatusResult>() {
            @Override
            public DescribeWorkspacesConnectionStatusResult call() throws Exception {
                DescribeWorkspacesConnectionStatusResult result;

                try {
                    result = describeWorkspacesConnectionStatus(request);
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
    public java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(ModifyWorkspacePropertiesRequest request) {

        return modifyWorkspacePropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(final ModifyWorkspacePropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyWorkspacePropertiesRequest, ModifyWorkspacePropertiesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyWorkspacePropertiesResult>() {
            @Override
            public ModifyWorkspacePropertiesResult call() throws Exception {
                ModifyWorkspacePropertiesResult result;

                try {
                    result = modifyWorkspaceProperties(request);
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
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest request) {

        return rebootWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(final RebootWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RebootWorkspacesResult>() {
            @Override
            public RebootWorkspacesResult call() throws Exception {
                RebootWorkspacesResult result;

                try {
                    result = rebootWorkspaces(request);
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
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest request) {

        return rebuildWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(final RebuildWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RebuildWorkspacesResult>() {
            @Override
            public RebuildWorkspacesResult call() throws Exception {
                RebuildWorkspacesResult result;

                try {
                    result = rebuildWorkspaces(request);
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
    public java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest request) {

        return startWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(final StartWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartWorkspacesRequest, StartWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartWorkspacesResult>() {
            @Override
            public StartWorkspacesResult call() throws Exception {
                StartWorkspacesResult result;

                try {
                    result = startWorkspaces(request);
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
    public java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest request) {

        return stopWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(final StopWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopWorkspacesRequest, StopWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopWorkspacesResult>() {
            @Override
            public StopWorkspacesResult call() throws Exception {
                StopWorkspacesResult result;

                try {
                    result = stopWorkspaces(request);
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
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest request) {

        return terminateWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(final TerminateWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TerminateWorkspacesResult>() {
            @Override
            public TerminateWorkspacesResult call() throws Exception {
                TerminateWorkspacesResult result;

                try {
                    result = terminateWorkspaces(request);
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
