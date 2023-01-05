/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage;

import javax.annotation.Generated;

import com.amazonaws.services.backupstorage.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Backup Storage asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * The frontend service for Cryo Storage.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBackupStorageAsyncClient extends AWSBackupStorageClient implements AWSBackupStorageAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSBackupStorageAsyncClientBuilder asyncBuilder() {
        return AWSBackupStorageAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Backup Storage using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBackupStorageAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Backup Storage using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSBackupStorageAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request) {

        return deleteObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(final DeleteObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler) {
        final DeleteObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteObjectResult>() {
            @Override
            public DeleteObjectResult call() throws Exception {
                DeleteObjectResult result = null;

                try {
                    result = executeDeleteObject(finalRequest);
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
    public java.util.concurrent.Future<GetChunkResult> getChunkAsync(GetChunkRequest request) {

        return getChunkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChunkResult> getChunkAsync(final GetChunkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChunkRequest, GetChunkResult> asyncHandler) {
        final GetChunkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChunkResult>() {
            @Override
            public GetChunkResult call() throws Exception {
                GetChunkResult result = null;

                try {
                    result = executeGetChunk(finalRequest);
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
    public java.util.concurrent.Future<GetObjectMetadataResult> getObjectMetadataAsync(GetObjectMetadataRequest request) {

        return getObjectMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectMetadataResult> getObjectMetadataAsync(final GetObjectMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetObjectMetadataRequest, GetObjectMetadataResult> asyncHandler) {
        final GetObjectMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetObjectMetadataResult>() {
            @Override
            public GetObjectMetadataResult call() throws Exception {
                GetObjectMetadataResult result = null;

                try {
                    result = executeGetObjectMetadata(finalRequest);
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
    public java.util.concurrent.Future<ListChunksResult> listChunksAsync(ListChunksRequest request) {

        return listChunksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChunksResult> listChunksAsync(final ListChunksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChunksRequest, ListChunksResult> asyncHandler) {
        final ListChunksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChunksResult>() {
            @Override
            public ListChunksResult call() throws Exception {
                ListChunksResult result = null;

                try {
                    result = executeListChunks(finalRequest);
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
    public java.util.concurrent.Future<ListObjectsResult> listObjectsAsync(ListObjectsRequest request) {

        return listObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectsResult> listObjectsAsync(final ListObjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectsRequest, ListObjectsResult> asyncHandler) {
        final ListObjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListObjectsResult>() {
            @Override
            public ListObjectsResult call() throws Exception {
                ListObjectsResult result = null;

                try {
                    result = executeListObjects(finalRequest);
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
    public java.util.concurrent.Future<NotifyObjectCompleteResult> notifyObjectCompleteAsync(NotifyObjectCompleteRequest request) {

        return notifyObjectCompleteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyObjectCompleteResult> notifyObjectCompleteAsync(final NotifyObjectCompleteRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyObjectCompleteRequest, NotifyObjectCompleteResult> asyncHandler) {
        final NotifyObjectCompleteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<NotifyObjectCompleteResult>() {
            @Override
            public NotifyObjectCompleteResult call() throws Exception {
                NotifyObjectCompleteResult result = null;

                try {
                    result = executeNotifyObjectComplete(finalRequest);
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
    public java.util.concurrent.Future<PutChunkResult> putChunkAsync(PutChunkRequest request) {

        return putChunkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutChunkResult> putChunkAsync(final PutChunkRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutChunkRequest, PutChunkResult> asyncHandler) {
        final PutChunkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutChunkResult>() {
            @Override
            public PutChunkResult call() throws Exception {
                PutChunkResult result = null;

                try {
                    result = executePutChunk(finalRequest);
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
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest request) {

        return putObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(final PutObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutObjectRequest, PutObjectResult> asyncHandler) {
        final PutObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutObjectResult>() {
            @Override
            public PutObjectResult call() throws Exception {
                PutObjectResult result = null;

                try {
                    result = executePutObject(finalRequest);
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
    public java.util.concurrent.Future<StartObjectResult> startObjectAsync(StartObjectRequest request) {

        return startObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartObjectResult> startObjectAsync(final StartObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartObjectRequest, StartObjectResult> asyncHandler) {
        final StartObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartObjectResult>() {
            @Override
            public StartObjectResult call() throws Exception {
                StartObjectResult result = null;

                try {
                    result = executeStartObject(finalRequest);
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
