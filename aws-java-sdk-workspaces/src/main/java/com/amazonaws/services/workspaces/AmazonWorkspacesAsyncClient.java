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
package com.amazonaws.services.workspaces;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon WorkSpaces asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
 * users.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
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
     * @deprecated use {@link AmazonWorkspacesAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonWorkspacesAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonWorkspacesAsyncClientBuilder asyncBuilder() {
        return AmazonWorkspacesAsyncClientBuilder.standard();
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
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateIpGroupsResult> associateIpGroupsAsync(AssociateIpGroupsRequest request) {

        return associateIpGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateIpGroupsResult> associateIpGroupsAsync(final AssociateIpGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateIpGroupsRequest, AssociateIpGroupsResult> asyncHandler) {
        final AssociateIpGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateIpGroupsResult>() {
            @Override
            public AssociateIpGroupsResult call() throws Exception {
                AssociateIpGroupsResult result = null;

                try {
                    result = executeAssociateIpGroups(finalRequest);
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
    public java.util.concurrent.Future<AuthorizeIpRulesResult> authorizeIpRulesAsync(AuthorizeIpRulesRequest request) {

        return authorizeIpRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AuthorizeIpRulesResult> authorizeIpRulesAsync(final AuthorizeIpRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeIpRulesRequest, AuthorizeIpRulesResult> asyncHandler) {
        final AuthorizeIpRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AuthorizeIpRulesResult>() {
            @Override
            public AuthorizeIpRulesResult call() throws Exception {
                AuthorizeIpRulesResult result = null;

                try {
                    result = executeAuthorizeIpRules(finalRequest);
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
    public java.util.concurrent.Future<CreateIpGroupResult> createIpGroupAsync(CreateIpGroupRequest request) {

        return createIpGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIpGroupResult> createIpGroupAsync(final CreateIpGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIpGroupRequest, CreateIpGroupResult> asyncHandler) {
        final CreateIpGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIpGroupResult>() {
            @Override
            public CreateIpGroupResult call() throws Exception {
                CreateIpGroupResult result = null;

                try {
                    result = executeCreateIpGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {
        final CreateTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result = null;

                try {
                    result = executeCreateTags(finalRequest);
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
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest request) {

        return createWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(final CreateWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler) {
        final CreateWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkspacesResult>() {
            @Override
            public CreateWorkspacesResult call() throws Exception {
                CreateWorkspacesResult result = null;

                try {
                    result = executeCreateWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<DeleteIpGroupResult> deleteIpGroupAsync(DeleteIpGroupRequest request) {

        return deleteIpGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIpGroupResult> deleteIpGroupAsync(final DeleteIpGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIpGroupRequest, DeleteIpGroupResult> asyncHandler) {
        final DeleteIpGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIpGroupResult>() {
            @Override
            public DeleteIpGroupResult call() throws Exception {
                DeleteIpGroupResult result = null;

                try {
                    result = executeDeleteIpGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
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
    public java.util.concurrent.Future<DeleteWorkspaceImageResult> deleteWorkspaceImageAsync(DeleteWorkspaceImageRequest request) {

        return deleteWorkspaceImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceImageResult> deleteWorkspaceImageAsync(final DeleteWorkspaceImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceImageRequest, DeleteWorkspaceImageResult> asyncHandler) {
        final DeleteWorkspaceImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkspaceImageResult>() {
            @Override
            public DeleteWorkspaceImageResult call() throws Exception {
                DeleteWorkspaceImageResult result = null;

                try {
                    result = executeDeleteWorkspaceImage(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest request) {

        return describeAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(final DescribeAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountRequest, DescribeAccountResult> asyncHandler) {
        final DescribeAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountResult>() {
            @Override
            public DescribeAccountResult call() throws Exception {
                DescribeAccountResult result = null;

                try {
                    result = executeDescribeAccount(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountModificationsResult> describeAccountModificationsAsync(DescribeAccountModificationsRequest request) {

        return describeAccountModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountModificationsResult> describeAccountModificationsAsync(final DescribeAccountModificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountModificationsRequest, DescribeAccountModificationsResult> asyncHandler) {
        final DescribeAccountModificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountModificationsResult>() {
            @Override
            public DescribeAccountModificationsResult call() throws Exception {
                DescribeAccountModificationsResult result = null;

                try {
                    result = executeDescribeAccountModifications(finalRequest);
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
    public java.util.concurrent.Future<DescribeClientPropertiesResult> describeClientPropertiesAsync(DescribeClientPropertiesRequest request) {

        return describeClientPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClientPropertiesResult> describeClientPropertiesAsync(final DescribeClientPropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClientPropertiesRequest, DescribeClientPropertiesResult> asyncHandler) {
        final DescribeClientPropertiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClientPropertiesResult>() {
            @Override
            public DescribeClientPropertiesResult call() throws Exception {
                DescribeClientPropertiesResult result = null;

                try {
                    result = executeDescribeClientProperties(finalRequest);
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
    public java.util.concurrent.Future<DescribeIpGroupsResult> describeIpGroupsAsync(DescribeIpGroupsRequest request) {

        return describeIpGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIpGroupsResult> describeIpGroupsAsync(final DescribeIpGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIpGroupsRequest, DescribeIpGroupsResult> asyncHandler) {
        final DescribeIpGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIpGroupsResult>() {
            @Override
            public DescribeIpGroupsResult call() throws Exception {
                DescribeIpGroupsResult result = null;

                try {
                    result = executeDescribeIpGroups(finalRequest);
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
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {
        final DescribeTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;

                try {
                    result = executeDescribeTags(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest request) {

        return describeWorkspaceBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(final DescribeWorkspaceBundlesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler) {
        final DescribeWorkspaceBundlesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceBundlesResult>() {
            @Override
            public DescribeWorkspaceBundlesResult call() throws Exception {
                DescribeWorkspaceBundlesResult result = null;

                try {
                    result = executeDescribeWorkspaceBundles(finalRequest);
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
    @Override
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
        final DescribeWorkspaceDirectoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceDirectoriesResult>() {
            @Override
            public DescribeWorkspaceDirectoriesResult call() throws Exception {
                DescribeWorkspaceDirectoriesResult result = null;

                try {
                    result = executeDescribeWorkspaceDirectories(finalRequest);
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
    @Override
    public java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler) {

        return describeWorkspaceDirectoriesAsync(new DescribeWorkspaceDirectoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceImagesResult> describeWorkspaceImagesAsync(DescribeWorkspaceImagesRequest request) {

        return describeWorkspaceImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceImagesResult> describeWorkspaceImagesAsync(final DescribeWorkspaceImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceImagesRequest, DescribeWorkspaceImagesResult> asyncHandler) {
        final DescribeWorkspaceImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspaceImagesResult>() {
            @Override
            public DescribeWorkspaceImagesResult call() throws Exception {
                DescribeWorkspaceImagesResult result = null;

                try {
                    result = executeDescribeWorkspaceImages(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest request) {

        return describeWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(final DescribeWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler) {
        final DescribeWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspacesResult>() {
            @Override
            public DescribeWorkspacesResult call() throws Exception {
                DescribeWorkspacesResult result = null;

                try {
                    result = executeDescribeWorkspaces(finalRequest);
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
    @Override
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
        final DescribeWorkspacesConnectionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkspacesConnectionStatusResult>() {
            @Override
            public DescribeWorkspacesConnectionStatusResult call() throws Exception {
                DescribeWorkspacesConnectionStatusResult result = null;

                try {
                    result = executeDescribeWorkspacesConnectionStatus(finalRequest);
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
    public java.util.concurrent.Future<DisassociateIpGroupsResult> disassociateIpGroupsAsync(DisassociateIpGroupsRequest request) {

        return disassociateIpGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateIpGroupsResult> disassociateIpGroupsAsync(final DisassociateIpGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateIpGroupsRequest, DisassociateIpGroupsResult> asyncHandler) {
        final DisassociateIpGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateIpGroupsResult>() {
            @Override
            public DisassociateIpGroupsResult call() throws Exception {
                DisassociateIpGroupsResult result = null;

                try {
                    result = executeDisassociateIpGroups(finalRequest);
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
    public java.util.concurrent.Future<ImportWorkspaceImageResult> importWorkspaceImageAsync(ImportWorkspaceImageRequest request) {

        return importWorkspaceImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportWorkspaceImageResult> importWorkspaceImageAsync(final ImportWorkspaceImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportWorkspaceImageRequest, ImportWorkspaceImageResult> asyncHandler) {
        final ImportWorkspaceImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportWorkspaceImageResult>() {
            @Override
            public ImportWorkspaceImageResult call() throws Exception {
                ImportWorkspaceImageResult result = null;

                try {
                    result = executeImportWorkspaceImage(finalRequest);
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
    public java.util.concurrent.Future<ListAvailableManagementCidrRangesResult> listAvailableManagementCidrRangesAsync(
            ListAvailableManagementCidrRangesRequest request) {

        return listAvailableManagementCidrRangesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableManagementCidrRangesResult> listAvailableManagementCidrRangesAsync(
            final ListAvailableManagementCidrRangesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAvailableManagementCidrRangesRequest, ListAvailableManagementCidrRangesResult> asyncHandler) {
        final ListAvailableManagementCidrRangesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAvailableManagementCidrRangesResult>() {
            @Override
            public ListAvailableManagementCidrRangesResult call() throws Exception {
                ListAvailableManagementCidrRangesResult result = null;

                try {
                    result = executeListAvailableManagementCidrRanges(finalRequest);
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
    public java.util.concurrent.Future<ModifyAccountResult> modifyAccountAsync(ModifyAccountRequest request) {

        return modifyAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyAccountResult> modifyAccountAsync(final ModifyAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyAccountRequest, ModifyAccountResult> asyncHandler) {
        final ModifyAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyAccountResult>() {
            @Override
            public ModifyAccountResult call() throws Exception {
                ModifyAccountResult result = null;

                try {
                    result = executeModifyAccount(finalRequest);
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
    public java.util.concurrent.Future<ModifyClientPropertiesResult> modifyClientPropertiesAsync(ModifyClientPropertiesRequest request) {

        return modifyClientPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClientPropertiesResult> modifyClientPropertiesAsync(final ModifyClientPropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClientPropertiesRequest, ModifyClientPropertiesResult> asyncHandler) {
        final ModifyClientPropertiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyClientPropertiesResult>() {
            @Override
            public ModifyClientPropertiesResult call() throws Exception {
                ModifyClientPropertiesResult result = null;

                try {
                    result = executeModifyClientProperties(finalRequest);
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
    public java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(ModifyWorkspacePropertiesRequest request) {

        return modifyWorkspacePropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(final ModifyWorkspacePropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyWorkspacePropertiesRequest, ModifyWorkspacePropertiesResult> asyncHandler) {
        final ModifyWorkspacePropertiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyWorkspacePropertiesResult>() {
            @Override
            public ModifyWorkspacePropertiesResult call() throws Exception {
                ModifyWorkspacePropertiesResult result = null;

                try {
                    result = executeModifyWorkspaceProperties(finalRequest);
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
    public java.util.concurrent.Future<ModifyWorkspaceStateResult> modifyWorkspaceStateAsync(ModifyWorkspaceStateRequest request) {

        return modifyWorkspaceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyWorkspaceStateResult> modifyWorkspaceStateAsync(final ModifyWorkspaceStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceStateRequest, ModifyWorkspaceStateResult> asyncHandler) {
        final ModifyWorkspaceStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyWorkspaceStateResult>() {
            @Override
            public ModifyWorkspaceStateResult call() throws Exception {
                ModifyWorkspaceStateResult result = null;

                try {
                    result = executeModifyWorkspaceState(finalRequest);
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
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest request) {

        return rebootWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(final RebootWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler) {
        final RebootWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootWorkspacesResult>() {
            @Override
            public RebootWorkspacesResult call() throws Exception {
                RebootWorkspacesResult result = null;

                try {
                    result = executeRebootWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest request) {

        return rebuildWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(final RebuildWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler) {
        final RebuildWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebuildWorkspacesResult>() {
            @Override
            public RebuildWorkspacesResult call() throws Exception {
                RebuildWorkspacesResult result = null;

                try {
                    result = executeRebuildWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<RevokeIpRulesResult> revokeIpRulesAsync(RevokeIpRulesRequest request) {

        return revokeIpRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeIpRulesResult> revokeIpRulesAsync(final RevokeIpRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeIpRulesRequest, RevokeIpRulesResult> asyncHandler) {
        final RevokeIpRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeIpRulesResult>() {
            @Override
            public RevokeIpRulesResult call() throws Exception {
                RevokeIpRulesResult result = null;

                try {
                    result = executeRevokeIpRules(finalRequest);
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
    public java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest request) {

        return startWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(final StartWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartWorkspacesRequest, StartWorkspacesResult> asyncHandler) {
        final StartWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartWorkspacesResult>() {
            @Override
            public StartWorkspacesResult call() throws Exception {
                StartWorkspacesResult result = null;

                try {
                    result = executeStartWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest request) {

        return stopWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(final StopWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopWorkspacesRequest, StopWorkspacesResult> asyncHandler) {
        final StopWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopWorkspacesResult>() {
            @Override
            public StopWorkspacesResult call() throws Exception {
                StopWorkspacesResult result = null;

                try {
                    result = executeStopWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest request) {

        return terminateWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(final TerminateWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler) {
        final TerminateWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateWorkspacesResult>() {
            @Override
            public TerminateWorkspacesResult call() throws Exception {
                TerminateWorkspacesResult result = null;

                try {
                    result = executeTerminateWorkspaces(finalRequest);
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
    public java.util.concurrent.Future<UpdateRulesOfIpGroupResult> updateRulesOfIpGroupAsync(UpdateRulesOfIpGroupRequest request) {

        return updateRulesOfIpGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRulesOfIpGroupResult> updateRulesOfIpGroupAsync(final UpdateRulesOfIpGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRulesOfIpGroupRequest, UpdateRulesOfIpGroupResult> asyncHandler) {
        final UpdateRulesOfIpGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRulesOfIpGroupResult>() {
            @Override
            public UpdateRulesOfIpGroupResult call() throws Exception {
                UpdateRulesOfIpGroupResult result = null;

                try {
                    result = executeUpdateRulesOfIpGroup(finalRequest);
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
