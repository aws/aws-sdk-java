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

/**
 * Abstract implementation of {@code AmazonFSxAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonFSxAsync extends AbstractAmazonFSx implements AmazonFSxAsync {

    protected AbstractAmazonFSxAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(AssociateFileSystemAliasesRequest request) {

        return associateFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFileSystemAliasesResult> associateFileSystemAliasesAsync(AssociateFileSystemAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateFileSystemAliasesRequest, AssociateFileSystemAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest request) {

        return cancelDataRepositoryTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelDataRepositoryTaskResult> cancelDataRepositoryTaskAsync(CancelDataRepositoryTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelDataRepositoryTaskRequest, CancelDataRepositoryTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest request) {

        return copyBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyBackupResult> copyBackupAsync(CopyBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyBackupRequest, CopyBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request) {

        return createBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryAssociationResult> createDataRepositoryAssociationAsync(
            CreateDataRepositoryAssociationRequest request) {

        return createDataRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryAssociationResult> createDataRepositoryAssociationAsync(
            CreateDataRepositoryAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryAssociationRequest, CreateDataRepositoryAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest request) {

        return createDataRepositoryTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataRepositoryTaskResult> createDataRepositoryTaskAsync(CreateDataRepositoryTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDataRepositoryTaskRequest, CreateDataRepositoryTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFileCacheResult> createFileCacheAsync(CreateFileCacheRequest request) {

        return createFileCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileCacheResult> createFileCacheAsync(CreateFileCacheRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFileCacheRequest, CreateFileCacheResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request) {

        return createFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(CreateFileSystemFromBackupRequest request) {

        return createFileSystemFromBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemFromBackupResult> createFileSystemFromBackupAsync(CreateFileSystemFromBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemFromBackupRequest, CreateFileSystemFromBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStorageVirtualMachineResult> createStorageVirtualMachineAsync(CreateStorageVirtualMachineRequest request) {

        return createStorageVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorageVirtualMachineResult> createStorageVirtualMachineAsync(CreateStorageVirtualMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStorageVirtualMachineRequest, CreateStorageVirtualMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request) {

        return createVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeFromBackupResult> createVolumeFromBackupAsync(CreateVolumeFromBackupRequest request) {

        return createVolumeFromBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVolumeFromBackupResult> createVolumeFromBackupAsync(CreateVolumeFromBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVolumeFromBackupRequest, CreateVolumeFromBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDataRepositoryAssociationResult> deleteDataRepositoryAssociationAsync(
            DeleteDataRepositoryAssociationRequest request) {

        return deleteDataRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataRepositoryAssociationResult> deleteDataRepositoryAssociationAsync(
            DeleteDataRepositoryAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDataRepositoryAssociationRequest, DeleteDataRepositoryAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFileCacheResult> deleteFileCacheAsync(DeleteFileCacheRequest request) {

        return deleteFileCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileCacheResult> deleteFileCacheAsync(DeleteFileCacheRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFileCacheRequest, DeleteFileCacheResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request) {

        return deleteFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageVirtualMachineResult> deleteStorageVirtualMachineAsync(DeleteStorageVirtualMachineRequest request) {

        return deleteStorageVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageVirtualMachineResult> deleteStorageVirtualMachineAsync(DeleteStorageVirtualMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageVirtualMachineRequest, DeleteStorageVirtualMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request) {

        return describeBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryAssociationsResult> describeDataRepositoryAssociationsAsync(
            DescribeDataRepositoryAssociationsRequest request) {

        return describeDataRepositoryAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryAssociationsResult> describeDataRepositoryAssociationsAsync(
            DescribeDataRepositoryAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryAssociationsRequest, DescribeDataRepositoryAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(DescribeDataRepositoryTasksRequest request) {

        return describeDataRepositoryTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataRepositoryTasksResult> describeDataRepositoryTasksAsync(DescribeDataRepositoryTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDataRepositoryTasksRequest, DescribeDataRepositoryTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileCachesResult> describeFileCachesAsync(DescribeFileCachesRequest request) {

        return describeFileCachesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileCachesResult> describeFileCachesAsync(DescribeFileCachesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileCachesRequest, DescribeFileCachesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(DescribeFileSystemAliasesRequest request) {

        return describeFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemAliasesResult> describeFileSystemAliasesAsync(DescribeFileSystemAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemAliasesRequest, DescribeFileSystemAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request) {

        return describeFileSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageVirtualMachinesResult> describeStorageVirtualMachinesAsync(DescribeStorageVirtualMachinesRequest request) {

        return describeStorageVirtualMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageVirtualMachinesResult> describeStorageVirtualMachinesAsync(DescribeStorageVirtualMachinesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStorageVirtualMachinesRequest, DescribeStorageVirtualMachinesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request) {

        return describeVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(DisassociateFileSystemAliasesRequest request) {

        return disassociateFileSystemAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFileSystemAliasesResult> disassociateFileSystemAliasesAsync(DisassociateFileSystemAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateFileSystemAliasesRequest, DisassociateFileSystemAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReleaseFileSystemNfsV3LocksResult> releaseFileSystemNfsV3LocksAsync(ReleaseFileSystemNfsV3LocksRequest request) {

        return releaseFileSystemNfsV3LocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseFileSystemNfsV3LocksResult> releaseFileSystemNfsV3LocksAsync(ReleaseFileSystemNfsV3LocksRequest request,
            com.amazonaws.handlers.AsyncHandler<ReleaseFileSystemNfsV3LocksRequest, ReleaseFileSystemNfsV3LocksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreVolumeFromSnapshotResult> restoreVolumeFromSnapshotAsync(RestoreVolumeFromSnapshotRequest request) {

        return restoreVolumeFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreVolumeFromSnapshotResult> restoreVolumeFromSnapshotAsync(RestoreVolumeFromSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreVolumeFromSnapshotRequest, RestoreVolumeFromSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDataRepositoryAssociationResult> updateDataRepositoryAssociationAsync(
            UpdateDataRepositoryAssociationRequest request) {

        return updateDataRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataRepositoryAssociationResult> updateDataRepositoryAssociationAsync(
            UpdateDataRepositoryAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDataRepositoryAssociationRequest, UpdateDataRepositoryAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFileCacheResult> updateFileCacheAsync(UpdateFileCacheRequest request) {

        return updateFileCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileCacheResult> updateFileCacheAsync(UpdateFileCacheRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFileCacheRequest, UpdateFileCacheResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request) {

        return updateFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest request) {

        return updateSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageVirtualMachineResult> updateStorageVirtualMachineAsync(UpdateStorageVirtualMachineRequest request) {

        return updateStorageVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageVirtualMachineResult> updateStorageVirtualMachineAsync(UpdateStorageVirtualMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStorageVirtualMachineRequest, UpdateStorageVirtualMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest request) {

        return updateVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
