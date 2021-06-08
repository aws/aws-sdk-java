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
package com.amazonaws.services.ebs;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon EBS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * You can use the Amazon Elastic Block Store (Amazon EBS) direct APIs to create EBS snapshots, write data directly to
 * your snapshots, read data on your snapshots, and identify the differences or changes between two snapshots. If you’re
 * an independent software vendor (ISV) who offers backup services for Amazon EBS, the EBS direct APIs make it more
 * efficient and cost-effective to track incremental changes on your EBS volumes through snapshots. This can be done
 * without having to create new volumes from snapshots, and then use Amazon Elastic Compute Cloud (Amazon EC2) instances
 * to compare the differences.
 * </p>
 * <p>
 * You can create incremental snapshots directly from data on-premises into EBS volumes and the cloud to use for quick
 * disaster recovery. With the ability to write and read snapshots, you can write your on-premises data to an EBS
 * snapshot during a disaster. Then after recovery, you can restore it back to AWS or on-premises from the snapshot. You
 * no longer need to build and maintain complex mechanisms to copy data to and from Amazon EBS.
 * </p>
 * <p>
 * This API reference provides detailed information about the actions, data types, parameters, and errors of the EBS
 * direct APIs. For more information about the elements that make up the EBS direct APIs, and examples of how to use
 * them effectively, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html">Accessing the Contents of an
 * EBS Snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>. For more information about the supported AWS
 * Regions, endpoints, and service quotas for the EBS direct APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/ebs-service.html">Amazon Elastic Block Store Endpoints and
 * Quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEBSAsyncClient extends AmazonEBSClient implements AmazonEBSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonEBSAsyncClientBuilder asyncBuilder() {
        return AmazonEBSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EBS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonEBSAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EBS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonEBSAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CompleteSnapshotResult> completeSnapshotAsync(CompleteSnapshotRequest request) {

        return completeSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteSnapshotResult> completeSnapshotAsync(final CompleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteSnapshotRequest, CompleteSnapshotResult> asyncHandler) {
        final CompleteSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CompleteSnapshotResult>() {
            @Override
            public CompleteSnapshotResult call() throws Exception {
                CompleteSnapshotResult result = null;

                try {
                    result = executeCompleteSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetSnapshotBlockResult> getSnapshotBlockAsync(GetSnapshotBlockRequest request) {

        return getSnapshotBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotBlockResult> getSnapshotBlockAsync(final GetSnapshotBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSnapshotBlockRequest, GetSnapshotBlockResult> asyncHandler) {
        final GetSnapshotBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSnapshotBlockResult>() {
            @Override
            public GetSnapshotBlockResult call() throws Exception {
                GetSnapshotBlockResult result = null;

                try {
                    result = executeGetSnapshotBlock(finalRequest);
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
    public java.util.concurrent.Future<ListChangedBlocksResult> listChangedBlocksAsync(ListChangedBlocksRequest request) {

        return listChangedBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangedBlocksResult> listChangedBlocksAsync(final ListChangedBlocksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChangedBlocksRequest, ListChangedBlocksResult> asyncHandler) {
        final ListChangedBlocksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChangedBlocksResult>() {
            @Override
            public ListChangedBlocksResult call() throws Exception {
                ListChangedBlocksResult result = null;

                try {
                    result = executeListChangedBlocks(finalRequest);
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
    public java.util.concurrent.Future<ListSnapshotBlocksResult> listSnapshotBlocksAsync(ListSnapshotBlocksRequest request) {

        return listSnapshotBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSnapshotBlocksResult> listSnapshotBlocksAsync(final ListSnapshotBlocksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSnapshotBlocksRequest, ListSnapshotBlocksResult> asyncHandler) {
        final ListSnapshotBlocksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSnapshotBlocksResult>() {
            @Override
            public ListSnapshotBlocksResult call() throws Exception {
                ListSnapshotBlocksResult result = null;

                try {
                    result = executeListSnapshotBlocks(finalRequest);
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
    public java.util.concurrent.Future<PutSnapshotBlockResult> putSnapshotBlockAsync(PutSnapshotBlockRequest request) {

        return putSnapshotBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSnapshotBlockResult> putSnapshotBlockAsync(final PutSnapshotBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSnapshotBlockRequest, PutSnapshotBlockResult> asyncHandler) {
        final PutSnapshotBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSnapshotBlockResult>() {
            @Override
            public PutSnapshotBlockResult call() throws Exception {
                PutSnapshotBlockResult result = null;

                try {
                    result = executePutSnapshotBlock(finalRequest);
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
    public java.util.concurrent.Future<StartSnapshotResult> startSnapshotAsync(StartSnapshotRequest request) {

        return startSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSnapshotResult> startSnapshotAsync(final StartSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSnapshotRequest, StartSnapshotResult> asyncHandler) {
        final StartSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSnapshotResult>() {
            @Override
            public StartSnapshotResult call() throws Exception {
                StartSnapshotResult result = null;

                try {
                    result = executeStartSnapshot(finalRequest);
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
