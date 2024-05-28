/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdbelastic;

import javax.annotation.Generated;

import com.amazonaws.services.docdbelastic.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing DocDB Elastic asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>Amazon DocumentDB elastic clusters</fullname>
 * <p>
 * Amazon DocumentDB elastic-clusters support workloads with millions of reads/writes per second and petabytes of
 * storage capacity. Amazon DocumentDB elastic clusters also simplify how developers interact with Amazon DocumentDB
 * elastic-clusters by eliminating the need to choose, manage or upgrade instances.
 * </p>
 * <p>
 * Amazon DocumentDB elastic-clusters were created to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * provide a solution for customers looking for a database that provides virtually limitless scale with rich query
 * capabilities and MongoDB API compatibility.
 * </p>
 * </li>
 * <li>
 * <p>
 * give customers higher connection limits, and to reduce downtime from patching.
 * </p>
 * </li>
 * <li>
 * <p>
 * continue investing in a cloud-native, elastic, and class leading architecture for JSON workloads.
 * </p>
 * </li>
 * </ul>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDocDBElasticAsyncClient extends AmazonDocDBElasticClient implements AmazonDocDBElasticAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonDocDBElasticAsyncClientBuilder asyncBuilder() {
        return AmazonDocDBElasticAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DocDB Elastic using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDocDBElasticAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DocDB Elastic using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonDocDBElasticAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CopyClusterSnapshotResult> copyClusterSnapshotAsync(CopyClusterSnapshotRequest request) {

        return copyClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyClusterSnapshotResult> copyClusterSnapshotAsync(final CopyClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyClusterSnapshotRequest, CopyClusterSnapshotResult> asyncHandler) {
        final CopyClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyClusterSnapshotResult>() {
            @Override
            public CopyClusterSnapshotResult call() throws Exception {
                CopyClusterSnapshotResult result = null;

                try {
                    result = executeCopyClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {
        final CreateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClusterResult>() {
            @Override
            public CreateClusterResult call() throws Exception {
                CreateClusterResult result = null;

                try {
                    result = executeCreateCluster(finalRequest);
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
    public java.util.concurrent.Future<CreateClusterSnapshotResult> createClusterSnapshotAsync(CreateClusterSnapshotRequest request) {

        return createClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterSnapshotResult> createClusterSnapshotAsync(final CreateClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, CreateClusterSnapshotResult> asyncHandler) {
        final CreateClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClusterSnapshotResult>() {
            @Override
            public CreateClusterSnapshotResult call() throws Exception {
                CreateClusterSnapshotResult result = null;

                try {
                    result = executeCreateClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {
        final DeleteClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterResult>() {
            @Override
            public DeleteClusterResult call() throws Exception {
                DeleteClusterResult result = null;

                try {
                    result = executeDeleteCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteClusterSnapshotResult> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request) {

        return deleteClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSnapshotResult> deleteClusterSnapshotAsync(final DeleteClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, DeleteClusterSnapshotResult> asyncHandler) {
        final DeleteClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterSnapshotResult>() {
            @Override
            public DeleteClusterSnapshotResult call() throws Exception {
                DeleteClusterSnapshotResult result = null;

                try {
                    result = executeDeleteClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetClusterResult> getClusterAsync(GetClusterRequest request) {

        return getClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClusterResult> getClusterAsync(final GetClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClusterRequest, GetClusterResult> asyncHandler) {
        final GetClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClusterResult>() {
            @Override
            public GetClusterResult call() throws Exception {
                GetClusterResult result = null;

                try {
                    result = executeGetCluster(finalRequest);
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
    public java.util.concurrent.Future<GetClusterSnapshotResult> getClusterSnapshotAsync(GetClusterSnapshotRequest request) {

        return getClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClusterSnapshotResult> getClusterSnapshotAsync(final GetClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClusterSnapshotRequest, GetClusterSnapshotResult> asyncHandler) {
        final GetClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClusterSnapshotResult>() {
            @Override
            public GetClusterSnapshotResult call() throws Exception {
                GetClusterSnapshotResult result = null;

                try {
                    result = executeGetClusterSnapshot(finalRequest);
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
    public java.util.concurrent.Future<ListClusterSnapshotsResult> listClusterSnapshotsAsync(ListClusterSnapshotsRequest request) {

        return listClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClusterSnapshotsResult> listClusterSnapshotsAsync(final ListClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClusterSnapshotsRequest, ListClusterSnapshotsResult> asyncHandler) {
        final ListClusterSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClusterSnapshotsResult>() {
            @Override
            public ListClusterSnapshotsResult call() throws Exception {
                ListClusterSnapshotsResult result = null;

                try {
                    result = executeListClusterSnapshots(finalRequest);
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
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(final ListClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {
        final ListClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClustersResult>() {
            @Override
            public ListClustersResult call() throws Exception {
                ListClustersResult result = null;

                try {
                    result = executeListClusters(finalRequest);
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
    public java.util.concurrent.Future<RestoreClusterFromSnapshotResult> restoreClusterFromSnapshotAsync(RestoreClusterFromSnapshotRequest request) {

        return restoreClusterFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreClusterFromSnapshotResult> restoreClusterFromSnapshotAsync(final RestoreClusterFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreClusterFromSnapshotRequest, RestoreClusterFromSnapshotResult> asyncHandler) {
        final RestoreClusterFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreClusterFromSnapshotResult>() {
            @Override
            public RestoreClusterFromSnapshotResult call() throws Exception {
                RestoreClusterFromSnapshotResult result = null;

                try {
                    result = executeRestoreClusterFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<StartClusterResult> startClusterAsync(StartClusterRequest request) {

        return startClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartClusterResult> startClusterAsync(final StartClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartClusterRequest, StartClusterResult> asyncHandler) {
        final StartClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartClusterResult>() {
            @Override
            public StartClusterResult call() throws Exception {
                StartClusterResult result = null;

                try {
                    result = executeStartCluster(finalRequest);
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
    public java.util.concurrent.Future<StopClusterResult> stopClusterAsync(StopClusterRequest request) {

        return stopClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopClusterResult> stopClusterAsync(final StopClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopClusterRequest, StopClusterResult> asyncHandler) {
        final StopClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopClusterResult>() {
            @Override
            public StopClusterResult call() throws Exception {
                StopClusterResult result = null;

                try {
                    result = executeStopCluster(finalRequest);
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
    public java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest request) {

        return updateClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(final UpdateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler) {
        final UpdateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClusterResult>() {
            @Override
            public UpdateClusterResult call() throws Exception {
                UpdateClusterResult result = null;

                try {
                    result = executeUpdateCluster(finalRequest);
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
