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
 * Amazon Elastic Container Service for Kubernetes (Amazon EKS) is a managed service that makes it easy for you to run
 * Kubernetes on AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an
 * open-source system for automating the deployment, scaling, and management of containerized applications.
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
