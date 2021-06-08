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
package com.amazonaws.services.codestarconnections;

import javax.annotation.Generated;

import com.amazonaws.services.codestarconnections.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS CodeStar connections asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeStar Connections</fullname>
 * <p>
 * This AWS CodeStar Connections API Reference provides descriptions and usage examples of the operations and data types
 * for the AWS CodeStar Connections API. You can use the connections API to work with connections and installations.
 * </p>
 * <p>
 * <i>Connections</i> are configurations that you use to connect AWS resources to external code repositories. Each
 * connection is a resource that can be given to services such as CodePipeline to connect to a third-party repository
 * such as Bitbucket. For example, you can add the connection in CodePipeline so that it triggers your pipeline when a
 * code change is made to your third-party code repository. Each connection is named and associated with a unique ARN
 * that is used to reference the connection.
 * </p>
 * <p>
 * When you create a connection, the console initiates a third-party connection handshake. <i>Installations</i> are the
 * apps that are used to conduct this handshake. For example, the installation for the Bitbucket provider type is the
 * Bitbucket app. When you create a connection, you can choose an existing installation or create one.
 * </p>
 * <p>
 * When you want to create a connection to an installed provider type such as GitHub Enterprise Server, you create a
 * <i>host</i> for your connections.
 * </p>
 * <p>
 * You can work with connections by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateConnection</a>, which creates a uniquely named connection that can be referenced by services such as
 * CodePipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteConnection</a>, which deletes the specified connection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetConnection</a>, which returns information about the connection, including the connection status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListConnections</a>, which lists the connections associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with hosts by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateHost</a>, which creates a host that represents the infrastructure where your provider is installed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteHost</a>, which deletes the specified host.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetHost</a>, which returns information about the host, including the setup status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListHosts</a>, which lists the hosts associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with tags in AWS CodeStar Connections by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
 * CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeStar Connections.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeStar Connections, see the <a
 * href="https://docs.aws.amazon.com/dtconsole/latest/userguide/welcome-connections.html">Developer Tools User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeStarconnectionsAsyncClient extends AWSCodeStarconnectionsClient implements AWSCodeStarconnectionsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCodeStarconnectionsAsyncClientBuilder asyncBuilder() {
        return AWSCodeStarconnectionsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeStar connections using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeStarconnectionsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeStar connections using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCodeStarconnectionsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(final CreateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {
        final CreateConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectionResult>() {
            @Override
            public CreateConnectionResult call() throws Exception {
                CreateConnectionResult result = null;

                try {
                    result = executeCreateConnection(finalRequest);
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
    public java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest request) {

        return createHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHostResult> createHostAsync(final CreateHostRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHostRequest, CreateHostResult> asyncHandler) {
        final CreateHostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHostResult>() {
            @Override
            public CreateHostResult call() throws Exception {
                CreateHostResult result = null;

                try {
                    result = executeCreateHost(finalRequest);
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
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(final DeleteConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {
        final DeleteConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectionResult>() {
            @Override
            public DeleteConnectionResult call() throws Exception {
                DeleteConnectionResult result = null;

                try {
                    result = executeDeleteConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest request) {

        return deleteHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(final DeleteHostRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHostRequest, DeleteHostResult> asyncHandler) {
        final DeleteHostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHostResult>() {
            @Override
            public DeleteHostResult call() throws Exception {
                DeleteHostResult result = null;

                try {
                    result = executeDeleteHost(finalRequest);
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
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request) {

        return getConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(final GetConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler) {
        final GetConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectionResult>() {
            @Override
            public GetConnectionResult call() throws Exception {
                GetConnectionResult result = null;

                try {
                    result = executeGetConnection(finalRequest);
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
    public java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest request) {

        return getHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostResult> getHostAsync(final GetHostRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostRequest, GetHostResult> asyncHandler) {
        final GetHostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostResult>() {
            @Override
            public GetHostResult call() throws Exception {
                GetHostResult result = null;

                try {
                    result = executeGetHost(finalRequest);
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
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request) {

        return listConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(final ListConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler) {
        final ListConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectionsResult>() {
            @Override
            public ListConnectionsResult call() throws Exception {
                ListConnectionsResult result = null;

                try {
                    result = executeListConnections(finalRequest);
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
    public java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest request) {

        return listHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostsResult> listHostsAsync(final ListHostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHostsRequest, ListHostsResult> asyncHandler) {
        final ListHostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHostsResult>() {
            @Override
            public ListHostsResult call() throws Exception {
                ListHostsResult result = null;

                try {
                    result = executeListHosts(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest request) {

        return updateHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostResult> updateHostAsync(final UpdateHostRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHostRequest, UpdateHostResult> asyncHandler) {
        final UpdateHostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHostResult>() {
            @Override
            public UpdateHostResult call() throws Exception {
                UpdateHostResult result = null;

                try {
                    result = executeUpdateHost(finalRequest);
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
