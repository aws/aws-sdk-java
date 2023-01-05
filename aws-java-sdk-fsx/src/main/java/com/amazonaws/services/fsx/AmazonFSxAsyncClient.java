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
package com.amazonaws.services.fsx;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon FSx asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonFSxAsyncClient extends AmazonFSxClient implements AmazonFSxAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonFSxAsyncClientBuilder asyncBuilder() {
        return AmazonFSxAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon FSx using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonFSxAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon FSx using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonFSxAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(AssociateFileSystemAliasesRequest request) {

        return associateFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(final AssociateFileSystemAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateFileSystemAliasesRequest, AssociateFileSystemAliasesResult> asyncHandler) {
        final AssociateFileSystemAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateFileSystemAliasesResult>() {
            @Override
            public AssociateFileSystemAliasesResult call() throws Exception {
                AssociateFileSystemAliasesResult result = null;

                try {
                    result = executeAssociateFileSystemAliases(finalRequest);
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
    public java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest request) {

        return cancelDataRepositoryTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(final CancelDataRepositoryTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelDataRepositoryTaskRequest, CancelDataRepositoryTaskResult> asyncHandler) {
        final CancelDataRepositoryTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelDataRepositoryTaskResult>() {
            @Override
            public CancelDataRepositoryTaskResult call() throws Exception {
                CancelDataRepositoryTaskResult result = null;

                try {
                    result = executeCancelDataRepositoryTask(finalRequest);
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
    public java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest request) {

        return copyBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(final CopyBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyBackupRequest, CopyBackupResult> asyncHandler) {
        final CopyBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyBackupResult>() {
            @Override
            public CopyBackupResult call() throws Exception {
                CopyBackupResult result = null;

                try {
                    result = executeCopyBackup(finalRequest);
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
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request) {

        return createBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(final CreateBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) {
        final CreateBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackupResult>() {
            @Override
            public CreateBackupResult call() throws Exception {
                CreateBackupResult result = null;

                try {
                    result = executeCreateBackup(finalRequest);
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
    public java.util.concurrent.Future<CreateDataRepositoryAssociationResult> createDataRepositoryAssociationAsync(
            CreateDataRepositoryAssociationRequest request) {

        return createDataRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryAssociationResult> createDataRepositoryAssociationAsync(
            final CreateDataRepositoryAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryAssociationRequest, CreateDataRepositoryAssociationResult> asyncHandler) {
        final CreateDataRepositoryAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataRepositoryAssociationResult>() {
            @Override
            public CreateDataRepositoryAssociationResult call() throws Exception {
                CreateDataRepositoryAssociationResult result = null;

                try {
                    result = executeCreateDataRepositoryAssociation(finalRequest);
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
    public java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest request) {

        return createDataRepositoryTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(final CreateDataRepositoryTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryTaskRequest, CreateDataRepositoryTaskResult> asyncHandler) {
        final CreateDataRepositoryTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataRepositoryTaskResult>() {
            @Override
            public CreateDataRepositoryTaskResult call() throws Exception {
                CreateDataRepositoryTaskResult result = null;

                try {
                    result = executeCreateDataRepositoryTask(finalRequest);
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
    public java.util.concurrent.Future<CreateFileCacheResult> createFileCacheAsync(CreateFileCacheRequest request) {

        return createFileCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileCacheResult> createFileCacheAsync(final CreateFileCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFileCacheRequest, CreateFileCacheResult> asyncHandler) {
        final CreateFileCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFileCacheResult>() {
            @Override
            public CreateFileCacheResult call() throws Exception {
                CreateFileCacheResult result = null;

                try {
                    result = executeCreateFileCache(finalRequest);
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
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request) {

        return createFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(final CreateFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {
        final CreateFileSystemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFileSystemResult>() {
            @Override
            public CreateFileSystemResult call() throws Exception {
                CreateFileSystemResult result = null;

                try {
                    result = executeCreateFileSystem(finalRequest);
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
    public java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(CreateFileSystemFromBackupRequest request) {

        return createFileSystemFromBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(final CreateFileSystemFromBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFileSystemFromBackupRequest, CreateFileSystemFromBackupResult> asyncHandler) {
        final CreateFileSystemFromBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFileSystemFromBackupResult>() {
            @Override
            public CreateFileSystemFromBackupResult call() throws Exception {
                CreateFileSystemFromBackupResult result = null;

                try {
                    result = executeCreateFileSystemFromBackup(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateStorageVirtualMachineResult> createStorageVirtualMachineAsync(CreateStorageVirtualMachineRequest request) {

        return createStorageVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorageVirtualMachineResult> createStorageVirtualMachineAsync(final CreateStorageVirtualMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStorageVirtualMachineRequest, CreateStorageVirtualMachineResult> asyncHandler) {
        final CreateStorageVirtualMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStorageVirtualMachineResult>() {
            @Override
            public CreateStorageVirtualMachineResult call() throws Exception {
                CreateStorageVirtualMachineResult result = null;

                try {
                    result = executeCreateStorageVirtualMachine(finalRequest);
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
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request) {

        return createVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(final CreateVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler) {
        final CreateVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVolumeResult>() {
            @Override
            public CreateVolumeResult call() throws Exception {
                CreateVolumeResult result = null;

                try {
                    result = executeCreateVolume(finalRequest);
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
    public java.util.concurrent.Future<CreateVolumeFromBackupResult> createVolumeFromBackupAsync(CreateVolumeFromBackupRequest request) {

        return createVolumeFromBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeFromBackupResult> createVolumeFromBackupAsync(final CreateVolumeFromBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVolumeFromBackupRequest, CreateVolumeFromBackupResult> asyncHandler) {
        final CreateVolumeFromBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVolumeFromBackupResult>() {
            @Override
            public CreateVolumeFromBackupResult call() throws Exception {
                CreateVolumeFromBackupResult result = null;

                try {
                    result = executeCreateVolumeFromBackup(finalRequest);
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
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(final DeleteBackupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {
        final DeleteBackupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackupResult>() {
            @Override
            public DeleteBackupResult call() throws Exception {
                DeleteBackupResult result = null;

                try {
                    result = executeDeleteBackup(finalRequest);
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
    public java.util.concurrent.Future<DeleteDataRepositoryAssociationResult> deleteDataRepositoryAssociationAsync(
            DeleteDataRepositoryAssociationRequest request) {

        return deleteDataRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataRepositoryAssociationResult> deleteDataRepositoryAssociationAsync(
            final DeleteDataRepositoryAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataRepositoryAssociationRequest, DeleteDataRepositoryAssociationResult> asyncHandler) {
        final DeleteDataRepositoryAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataRepositoryAssociationResult>() {
            @Override
            public DeleteDataRepositoryAssociationResult call() throws Exception {
                DeleteDataRepositoryAssociationResult result = null;

                try {
                    result = executeDeleteDataRepositoryAssociation(finalRequest);
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
    public java.util.concurrent.Future<DeleteFileCacheResult> deleteFileCacheAsync(DeleteFileCacheRequest request) {

        return deleteFileCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileCacheResult> deleteFileCacheAsync(final DeleteFileCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileCacheRequest, DeleteFileCacheResult> asyncHandler) {
        final DeleteFileCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFileCacheResult>() {
            @Override
            public DeleteFileCacheResult call() throws Exception {
                DeleteFileCacheResult result = null;

                try {
                    result = executeDeleteFileCache(finalRequest);
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
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request) {

        return deleteFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(final DeleteFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler) {
        final DeleteFileSystemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFileSystemResult>() {
            @Override
            public DeleteFileSystemResult call() throws Exception {
                DeleteFileSystemResult result = null;

                try {
                    result = executeDeleteFileSystem(finalRequest);
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {
        final DeleteSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
            @Override
            public DeleteSnapshotResult call() throws Exception {
                DeleteSnapshotResult result = null;

                try {
                    result = executeDeleteSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteStorageVirtualMachineResult> deleteStorageVirtualMachineAsync(DeleteStorageVirtualMachineRequest request) {

        return deleteStorageVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageVirtualMachineResult> deleteStorageVirtualMachineAsync(final DeleteStorageVirtualMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStorageVirtualMachineRequest, DeleteStorageVirtualMachineResult> asyncHandler) {
        final DeleteStorageVirtualMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStorageVirtualMachineResult>() {
            @Override
            public DeleteStorageVirtualMachineResult call() throws Exception {
                DeleteStorageVirtualMachineResult result = null;

                try {
                    result = executeDeleteStorageVirtualMachine(finalRequest);
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
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {
        final DeleteVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVolumeResult>() {
            @Override
            public DeleteVolumeResult call() throws Exception {
                DeleteVolumeResult result = null;

                try {
                    result = executeDeleteVolume(finalRequest);
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
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request) {

        return describeBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(final DescribeBackupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler) {
        final DescribeBackupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBackupsResult>() {
            @Override
            public DescribeBackupsResult call() throws Exception {
                DescribeBackupsResult result = null;

                try {
                    result = executeDescribeBackups(finalRequest);
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
    public java.util.concurrent.Future<DescribeDataRepositoryAssociationsResult> describeDataRepositoryAssociationsAsync(
            DescribeDataRepositoryAssociationsRequest request) {

        return describeDataRepositoryAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryAssociationsResult> describeDataRepositoryAssociationsAsync(
            final DescribeDataRepositoryAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryAssociationsRequest, DescribeDataRepositoryAssociationsResult> asyncHandler) {
        final DescribeDataRepositoryAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataRepositoryAssociationsResult>() {
            @Override
            public DescribeDataRepositoryAssociationsResult call() throws Exception {
                DescribeDataRepositoryAssociationsResult result = null;

                try {
                    result = executeDescribeDataRepositoryAssociations(finalRequest);
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
    public java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(DescribeDataRepositoryTasksRequest request) {

        return describeDataRepositoryTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(final DescribeDataRepositoryTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryTasksRequest, DescribeDataRepositoryTasksResult> asyncHandler) {
        final DescribeDataRepositoryTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataRepositoryTasksResult>() {
            @Override
            public DescribeDataRepositoryTasksResult call() throws Exception {
                DescribeDataRepositoryTasksResult result = null;

                try {
                    result = executeDescribeDataRepositoryTasks(finalRequest);
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
    public java.util.concurrent.Future<DescribeFileCachesResult> describeFileCachesAsync(DescribeFileCachesRequest request) {

        return describeFileCachesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileCachesResult> describeFileCachesAsync(final DescribeFileCachesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileCachesRequest, DescribeFileCachesResult> asyncHandler) {
        final DescribeFileCachesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFileCachesResult>() {
            @Override
            public DescribeFileCachesResult call() throws Exception {
                DescribeFileCachesResult result = null;

                try {
                    result = executeDescribeFileCaches(finalRequest);
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
    public java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(DescribeFileSystemAliasesRequest request) {

        return describeFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(final DescribeFileSystemAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileSystemAliasesRequest, DescribeFileSystemAliasesResult> asyncHandler) {
        final DescribeFileSystemAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFileSystemAliasesResult>() {
            @Override
            public DescribeFileSystemAliasesResult call() throws Exception {
                DescribeFileSystemAliasesResult result = null;

                try {
                    result = executeDescribeFileSystemAliases(finalRequest);
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
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request) {

        return describeFileSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(final DescribeFileSystemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {
        final DescribeFileSystemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFileSystemsResult>() {
            @Override
            public DescribeFileSystemsResult call() throws Exception {
                DescribeFileSystemsResult result = null;

                try {
                    result = executeDescribeFileSystems(finalRequest);
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
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {
        final DescribeSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotsResult>() {
            @Override
            public DescribeSnapshotsResult call() throws Exception {
                DescribeSnapshotsResult result = null;

                try {
                    result = executeDescribeSnapshots(finalRequest);
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
    public java.util.concurrent.Future<DescribeStorageVirtualMachinesResult> describeStorageVirtualMachinesAsync(DescribeStorageVirtualMachinesRequest request) {

        return describeStorageVirtualMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageVirtualMachinesResult> describeStorageVirtualMachinesAsync(
            final DescribeStorageVirtualMachinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStorageVirtualMachinesRequest, DescribeStorageVirtualMachinesResult> asyncHandler) {
        final DescribeStorageVirtualMachinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStorageVirtualMachinesResult>() {
            @Override
            public DescribeStorageVirtualMachinesResult call() throws Exception {
                DescribeStorageVirtualMachinesResult result = null;

                try {
                    result = executeDescribeStorageVirtualMachines(finalRequest);
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
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(final DescribeVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {
        final DescribeVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVolumesResult>() {
            @Override
            public DescribeVolumesResult call() throws Exception {
                DescribeVolumesResult result = null;

                try {
                    result = executeDescribeVolumes(finalRequest);
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
    public java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(DisassociateFileSystemAliasesRequest request) {

        return disassociateFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(
            final DisassociateFileSystemAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFileSystemAliasesRequest, DisassociateFileSystemAliasesResult> asyncHandler) {
        final DisassociateFileSystemAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFileSystemAliasesResult>() {
            @Override
            public DisassociateFileSystemAliasesResult call() throws Exception {
                DisassociateFileSystemAliasesResult result = null;

                try {
                    result = executeDisassociateFileSystemAliases(finalRequest);
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
    public java.util.concurrent.Future<ReleaseFileSystemNfsV3LocksResult> releaseFileSystemNfsV3LocksAsync(ReleaseFileSystemNfsV3LocksRequest request) {

        return releaseFileSystemNfsV3LocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseFileSystemNfsV3LocksResult> releaseFileSystemNfsV3LocksAsync(final ReleaseFileSystemNfsV3LocksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseFileSystemNfsV3LocksRequest, ReleaseFileSystemNfsV3LocksResult> asyncHandler) {
        final ReleaseFileSystemNfsV3LocksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleaseFileSystemNfsV3LocksResult>() {
            @Override
            public ReleaseFileSystemNfsV3LocksResult call() throws Exception {
                ReleaseFileSystemNfsV3LocksResult result = null;

                try {
                    result = executeReleaseFileSystemNfsV3Locks(finalRequest);
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
    public java.util.concurrent.Future<RestoreVolumeFromSnapshotResult> restoreVolumeFromSnapshotAsync(RestoreVolumeFromSnapshotRequest request) {

        return restoreVolumeFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreVolumeFromSnapshotResult> restoreVolumeFromSnapshotAsync(final RestoreVolumeFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreVolumeFromSnapshotRequest, RestoreVolumeFromSnapshotResult> asyncHandler) {
        final RestoreVolumeFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreVolumeFromSnapshotResult>() {
            @Override
            public RestoreVolumeFromSnapshotResult call() throws Exception {
                RestoreVolumeFromSnapshotResult result = null;

                try {
                    result = executeRestoreVolumeFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<UpdateDataRepositoryAssociationResult> updateDataRepositoryAssociationAsync(
            UpdateDataRepositoryAssociationRequest request) {

        return updateDataRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataRepositoryAssociationResult> updateDataRepositoryAssociationAsync(
            final UpdateDataRepositoryAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataRepositoryAssociationRequest, UpdateDataRepositoryAssociationResult> asyncHandler) {
        final UpdateDataRepositoryAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataRepositoryAssociationResult>() {
            @Override
            public UpdateDataRepositoryAssociationResult call() throws Exception {
                UpdateDataRepositoryAssociationResult result = null;

                try {
                    result = executeUpdateDataRepositoryAssociation(finalRequest);
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
    public java.util.concurrent.Future<UpdateFileCacheResult> updateFileCacheAsync(UpdateFileCacheRequest request) {

        return updateFileCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileCacheResult> updateFileCacheAsync(final UpdateFileCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFileCacheRequest, UpdateFileCacheResult> asyncHandler) {
        final UpdateFileCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFileCacheResult>() {
            @Override
            public UpdateFileCacheResult call() throws Exception {
                UpdateFileCacheResult result = null;

                try {
                    result = executeUpdateFileCache(finalRequest);
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
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request) {

        return updateFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(final UpdateFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler) {
        final UpdateFileSystemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFileSystemResult>() {
            @Override
            public UpdateFileSystemResult call() throws Exception {
                UpdateFileSystemResult result = null;

                try {
                    result = executeUpdateFileSystem(finalRequest);
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
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest request) {

        return updateSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(final UpdateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler) {
        final UpdateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSnapshotResult>() {
            @Override
            public UpdateSnapshotResult call() throws Exception {
                UpdateSnapshotResult result = null;

                try {
                    result = executeUpdateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<UpdateStorageVirtualMachineResult> updateStorageVirtualMachineAsync(UpdateStorageVirtualMachineRequest request) {

        return updateStorageVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageVirtualMachineResult> updateStorageVirtualMachineAsync(final UpdateStorageVirtualMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStorageVirtualMachineRequest, UpdateStorageVirtualMachineResult> asyncHandler) {
        final UpdateStorageVirtualMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStorageVirtualMachineResult>() {
            @Override
            public UpdateStorageVirtualMachineResult call() throws Exception {
                UpdateStorageVirtualMachineResult result = null;

                try {
                    result = executeUpdateStorageVirtualMachine(finalRequest);
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
    public java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest request) {

        return updateVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(final UpdateVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResult> asyncHandler) {
        final UpdateVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVolumeResult>() {
            @Override
            public UpdateVolumeResult call() throws Exception {
                UpdateVolumeResult result = null;

                try {
                    result = executeUpdateVolume(finalRequest);
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
