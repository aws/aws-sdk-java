/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon EKS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Elastic Kubernetes Service (Amazon EKS) is a managed service that makes it easy for you to run Kubernetes on
 * AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an open-source system
 * for automating the deployment, scaling, and management of containerized applications.
 * </p>
 * <p>
 * Amazon EKS runs up-to-date versions of the open-source Kubernetes software, so you can use all the existing plugins
 * and tooling from the Kubernetes community. Applications running on Amazon EKS are fully compatible with applications
 * running on any standard Kubernetes environment, whether running in on-premises data centers or public clouds. This
 * means that you can easily migrate any standard Kubernetes application to Amazon EKS without any code modification
 * required.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEKSAsyncClient extends AmazonEKSClient implements AmazonEKSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonEKSAsyncClientBuilder asyncBuilder() {
        return AmazonEKSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EKS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonEKSAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateFargateProfileResult> createFargateProfileAsync(CreateFargateProfileRequest request) {

        return createFargateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFargateProfileResult> createFargateProfileAsync(final CreateFargateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFargateProfileRequest, CreateFargateProfileResult> asyncHandler) {
        final CreateFargateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFargateProfileResult>() {
            @Override
            public CreateFargateProfileResult call() throws Exception {
                CreateFargateProfileResult result = null;

                try {
                    result = executeCreateFargateProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateNodegroupResult> createNodegroupAsync(CreateNodegroupRequest request) {

        return createNodegroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNodegroupResult> createNodegroupAsync(final CreateNodegroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNodegroupRequest, CreateNodegroupResult> asyncHandler) {
        final CreateNodegroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNodegroupResult>() {
            @Override
            public CreateNodegroupResult call() throws Exception {
                CreateNodegroupResult result = null;

                try {
                    result = executeCreateNodegroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteFargateProfileResult> deleteFargateProfileAsync(DeleteFargateProfileRequest request) {

        return deleteFargateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFargateProfileResult> deleteFargateProfileAsync(final DeleteFargateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFargateProfileRequest, DeleteFargateProfileResult> asyncHandler) {
        final DeleteFargateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFargateProfileResult>() {
            @Override
            public DeleteFargateProfileResult call() throws Exception {
                DeleteFargateProfileResult result = null;

                try {
                    result = executeDeleteFargateProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteNodegroupResult> deleteNodegroupAsync(DeleteNodegroupRequest request) {

        return deleteNodegroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodegroupResult> deleteNodegroupAsync(final DeleteNodegroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNodegroupRequest, DeleteNodegroupResult> asyncHandler) {
        final DeleteNodegroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNodegroupResult>() {
            @Override
            public DeleteNodegroupResult call() throws Exception {
                DeleteNodegroupResult result = null;

                try {
                    result = executeDeleteNodegroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(final DescribeClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {
        final DescribeClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterResult>() {
            @Override
            public DescribeClusterResult call() throws Exception {
                DescribeClusterResult result = null;

                try {
                    result = executeDescribeCluster(finalRequest);
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
    public java.util.concurrent.Future<DescribeFargateProfileResult> describeFargateProfileAsync(DescribeFargateProfileRequest request) {

        return describeFargateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFargateProfileResult> describeFargateProfileAsync(final DescribeFargateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFargateProfileRequest, DescribeFargateProfileResult> asyncHandler) {
        final DescribeFargateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFargateProfileResult>() {
            @Override
            public DescribeFargateProfileResult call() throws Exception {
                DescribeFargateProfileResult result = null;

                try {
                    result = executeDescribeFargateProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeNodegroupResult> describeNodegroupAsync(DescribeNodegroupRequest request) {

        return describeNodegroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNodegroupResult> describeNodegroupAsync(final DescribeNodegroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNodegroupRequest, DescribeNodegroupResult> asyncHandler) {
        final DescribeNodegroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNodegroupResult>() {
            @Override
            public DescribeNodegroupResult call() throws Exception {
                DescribeNodegroupResult result = null;

                try {
                    result = executeDescribeNodegroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(DescribeUpdateRequest request) {

        return describeUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(final DescribeUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUpdateRequest, DescribeUpdateResult> asyncHandler) {
        final DescribeUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUpdateResult>() {
            @Override
            public DescribeUpdateResult call() throws Exception {
                DescribeUpdateResult result = null;

                try {
                    result = executeDescribeUpdate(finalRequest);
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
    public java.util.concurrent.Future<ListFargateProfilesResult> listFargateProfilesAsync(ListFargateProfilesRequest request) {

        return listFargateProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFargateProfilesResult> listFargateProfilesAsync(final ListFargateProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFargateProfilesRequest, ListFargateProfilesResult> asyncHandler) {
        final ListFargateProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFargateProfilesResult>() {
            @Override
            public ListFargateProfilesResult call() throws Exception {
                ListFargateProfilesResult result = null;

                try {
                    result = executeListFargateProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListNodegroupsResult> listNodegroupsAsync(ListNodegroupsRequest request) {

        return listNodegroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNodegroupsResult> listNodegroupsAsync(final ListNodegroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNodegroupsRequest, ListNodegroupsResult> asyncHandler) {
        final ListNodegroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNodegroupsResult>() {
            @Override
            public ListNodegroupsResult call() throws Exception {
                ListNodegroupsResult result = null;

                try {
                    result = executeListNodegroups(finalRequest);
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
    public java.util.concurrent.Future<ListUpdatesResult> listUpdatesAsync(ListUpdatesRequest request) {

        return listUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUpdatesResult> listUpdatesAsync(final ListUpdatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUpdatesRequest, ListUpdatesResult> asyncHandler) {
        final ListUpdatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUpdatesResult>() {
            @Override
            public ListUpdatesResult call() throws Exception {
                ListUpdatesResult result = null;

                try {
                    result = executeListUpdates(finalRequest);
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
    public java.util.concurrent.Future<UpdateClusterConfigResult> updateClusterConfigAsync(UpdateClusterConfigRequest request) {

        return updateClusterConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterConfigResult> updateClusterConfigAsync(final UpdateClusterConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClusterConfigRequest, UpdateClusterConfigResult> asyncHandler) {
        final UpdateClusterConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClusterConfigResult>() {
            @Override
            public UpdateClusterConfigResult call() throws Exception {
                UpdateClusterConfigResult result = null;

                try {
                    result = executeUpdateClusterConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateClusterVersionResult> updateClusterVersionAsync(UpdateClusterVersionRequest request) {

        return updateClusterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterVersionResult> updateClusterVersionAsync(final UpdateClusterVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClusterVersionRequest, UpdateClusterVersionResult> asyncHandler) {
        final UpdateClusterVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClusterVersionResult>() {
            @Override
            public UpdateClusterVersionResult call() throws Exception {
                UpdateClusterVersionResult result = null;

                try {
                    result = executeUpdateClusterVersion(finalRequest);
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
    public java.util.concurrent.Future<UpdateNodegroupConfigResult> updateNodegroupConfigAsync(UpdateNodegroupConfigRequest request) {

        return updateNodegroupConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNodegroupConfigResult> updateNodegroupConfigAsync(final UpdateNodegroupConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNodegroupConfigRequest, UpdateNodegroupConfigResult> asyncHandler) {
        final UpdateNodegroupConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNodegroupConfigResult>() {
            @Override
            public UpdateNodegroupConfigResult call() throws Exception {
                UpdateNodegroupConfigResult result = null;

                try {
                    result = executeUpdateNodegroupConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateNodegroupVersionResult> updateNodegroupVersionAsync(UpdateNodegroupVersionRequest request) {

        return updateNodegroupVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNodegroupVersionResult> updateNodegroupVersionAsync(final UpdateNodegroupVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNodegroupVersionRequest, UpdateNodegroupVersionResult> asyncHandler) {
        final UpdateNodegroupVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNodegroupVersionResult>() {
            @Override
            public UpdateNodegroupVersionResult call() throws Exception {
                UpdateNodegroupVersionResult result = null;

                try {
                    result = executeUpdateNodegroupVersion(finalRequest);
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
