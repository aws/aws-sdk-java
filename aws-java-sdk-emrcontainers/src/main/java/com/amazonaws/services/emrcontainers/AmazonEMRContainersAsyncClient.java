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
package com.amazonaws.services.emrcontainers;

import javax.annotation.Generated;

import com.amazonaws.services.emrcontainers.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon EMR Containers asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EMR on EKS provides a deployment option for Amazon EMR that allows you to run open-source big data frameworks
 * on Amazon Elastic Kubernetes Service (Amazon EKS). With this deployment option, you can focus on running analytics
 * workloads while Amazon EMR on EKS builds, configures, and manages containers for open-source applications. For more
 * information about Amazon EMR on EKS concepts and tasks, see <a
 * href="https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/emr-eks.html">What is Amazon EMR on EKS</a>.
 * </p>
 * <p>
 * <i>Amazon EMR containers</i> is the API name for Amazon EMR on EKS. The <code>emr-containers</code> prefix is used in
 * the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR on EKS. For example,
 * <code>aws emr-containers start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR on EKS. For example,
 * <code>"Action": [ "emr-containers:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR on EKS</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR on EKS service endpoints. For example,
 * <code>emr-containers.us-east-2.amazonaws.com</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/service-quotas.html#service-endpoints"
 * >Amazon EMR on EKS Service Endpoints</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEMRContainersAsyncClient extends AmazonEMRContainersClient implements AmazonEMRContainersAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonEMRContainersAsyncClientBuilder asyncBuilder() {
        return AmazonEMRContainersAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR Containers using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonEMRContainersAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EMR Containers using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonEMRContainersAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest request) {

        return cancelJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(final CancelJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRunRequest, CancelJobRunResult> asyncHandler) {
        final CancelJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelJobRunResult>() {
            @Override
            public CancelJobRunResult call() throws Exception {
                CancelJobRunResult result = null;

                try {
                    result = executeCancelJobRun(finalRequest);
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
    public java.util.concurrent.Future<CreateManagedEndpointResult> createManagedEndpointAsync(CreateManagedEndpointRequest request) {

        return createManagedEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateManagedEndpointResult> createManagedEndpointAsync(final CreateManagedEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateManagedEndpointRequest, CreateManagedEndpointResult> asyncHandler) {
        final CreateManagedEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateManagedEndpointResult>() {
            @Override
            public CreateManagedEndpointResult call() throws Exception {
                CreateManagedEndpointResult result = null;

                try {
                    result = executeCreateManagedEndpoint(finalRequest);
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
    public java.util.concurrent.Future<CreateVirtualClusterResult> createVirtualClusterAsync(CreateVirtualClusterRequest request) {

        return createVirtualClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualClusterResult> createVirtualClusterAsync(final CreateVirtualClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVirtualClusterRequest, CreateVirtualClusterResult> asyncHandler) {
        final CreateVirtualClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVirtualClusterResult>() {
            @Override
            public CreateVirtualClusterResult call() throws Exception {
                CreateVirtualClusterResult result = null;

                try {
                    result = executeCreateVirtualCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteManagedEndpointResult> deleteManagedEndpointAsync(DeleteManagedEndpointRequest request) {

        return deleteManagedEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedEndpointResult> deleteManagedEndpointAsync(final DeleteManagedEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteManagedEndpointRequest, DeleteManagedEndpointResult> asyncHandler) {
        final DeleteManagedEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteManagedEndpointResult>() {
            @Override
            public DeleteManagedEndpointResult call() throws Exception {
                DeleteManagedEndpointResult result = null;

                try {
                    result = executeDeleteManagedEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteVirtualClusterResult> deleteVirtualClusterAsync(DeleteVirtualClusterRequest request) {

        return deleteVirtualClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualClusterResult> deleteVirtualClusterAsync(final DeleteVirtualClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualClusterRequest, DeleteVirtualClusterResult> asyncHandler) {
        final DeleteVirtualClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVirtualClusterResult>() {
            @Override
            public DeleteVirtualClusterResult call() throws Exception {
                DeleteVirtualClusterResult result = null;

                try {
                    result = executeDeleteVirtualCluster(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(DescribeJobRunRequest request) {

        return describeJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(final DescribeJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobRunRequest, DescribeJobRunResult> asyncHandler) {
        final DescribeJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobRunResult>() {
            @Override
            public DescribeJobRunResult call() throws Exception {
                DescribeJobRunResult result = null;

                try {
                    result = executeDescribeJobRun(finalRequest);
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
    public java.util.concurrent.Future<DescribeManagedEndpointResult> describeManagedEndpointAsync(DescribeManagedEndpointRequest request) {

        return describeManagedEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeManagedEndpointResult> describeManagedEndpointAsync(final DescribeManagedEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeManagedEndpointRequest, DescribeManagedEndpointResult> asyncHandler) {
        final DescribeManagedEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeManagedEndpointResult>() {
            @Override
            public DescribeManagedEndpointResult call() throws Exception {
                DescribeManagedEndpointResult result = null;

                try {
                    result = executeDescribeManagedEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DescribeVirtualClusterResult> describeVirtualClusterAsync(DescribeVirtualClusterRequest request) {

        return describeVirtualClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualClusterResult> describeVirtualClusterAsync(final DescribeVirtualClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualClusterRequest, DescribeVirtualClusterResult> asyncHandler) {
        final DescribeVirtualClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVirtualClusterResult>() {
            @Override
            public DescribeVirtualClusterResult call() throws Exception {
                DescribeVirtualClusterResult result = null;

                try {
                    result = executeDescribeVirtualCluster(finalRequest);
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
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request) {

        return listJobRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(final ListJobRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler) {
        final ListJobRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobRunsResult>() {
            @Override
            public ListJobRunsResult call() throws Exception {
                ListJobRunsResult result = null;

                try {
                    result = executeListJobRuns(finalRequest);
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
    public java.util.concurrent.Future<ListManagedEndpointsResult> listManagedEndpointsAsync(ListManagedEndpointsRequest request) {

        return listManagedEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedEndpointsResult> listManagedEndpointsAsync(final ListManagedEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListManagedEndpointsRequest, ListManagedEndpointsResult> asyncHandler) {
        final ListManagedEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListManagedEndpointsResult>() {
            @Override
            public ListManagedEndpointsResult call() throws Exception {
                ListManagedEndpointsResult result = null;

                try {
                    result = executeListManagedEndpoints(finalRequest);
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
    public java.util.concurrent.Future<ListVirtualClustersResult> listVirtualClustersAsync(ListVirtualClustersRequest request) {

        return listVirtualClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualClustersResult> listVirtualClustersAsync(final ListVirtualClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVirtualClustersRequest, ListVirtualClustersResult> asyncHandler) {
        final ListVirtualClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVirtualClustersResult>() {
            @Override
            public ListVirtualClustersResult call() throws Exception {
                ListVirtualClustersResult result = null;

                try {
                    result = executeListVirtualClusters(finalRequest);
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
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request) {

        return startJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(final StartJobRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler) {
        final StartJobRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartJobRunResult>() {
            @Override
            public StartJobRunResult call() throws Exception {
                StartJobRunResult result = null;

                try {
                    result = executeStartJobRun(finalRequest);
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
