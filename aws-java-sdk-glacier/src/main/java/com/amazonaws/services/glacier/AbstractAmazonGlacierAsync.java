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
package com.amazonaws.services.glacier;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;

/**
 * Abstract implementation of {@code AmazonGlacierAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonGlacierAsync extends AbstractAmazonGlacier implements AmazonGlacierAsync {

    protected AbstractAmazonGlacierAsync() {
    }

    @Override
    public java.util.concurrent.Future<AbortMultipartUploadResult> abortMultipartUploadAsync(AbortMultipartUploadRequest request) {

        return abortMultipartUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AbortMultipartUploadResult> abortMultipartUploadAsync(AbortMultipartUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<AbortMultipartUploadRequest, AbortMultipartUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AbortVaultLockResult> abortVaultLockAsync(AbortVaultLockRequest request) {

        return abortVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AbortVaultLockResult> abortVaultLockAsync(AbortVaultLockRequest request,
            com.amazonaws.handlers.AsyncHandler<AbortVaultLockRequest, AbortVaultLockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddTagsToVaultResult> addTagsToVaultAsync(AddTagsToVaultRequest request) {

        return addTagsToVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToVaultResult> addTagsToVaultAsync(AddTagsToVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToVaultRequest, AddTagsToVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CompleteMultipartUploadResult> completeMultipartUploadAsync(CompleteMultipartUploadRequest request) {

        return completeMultipartUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteMultipartUploadResult> completeMultipartUploadAsync(CompleteMultipartUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<CompleteMultipartUploadRequest, CompleteMultipartUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CompleteVaultLockResult> completeVaultLockAsync(CompleteVaultLockRequest request) {

        return completeVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteVaultLockResult> completeVaultLockAsync(CompleteVaultLockRequest request,
            com.amazonaws.handlers.AsyncHandler<CompleteVaultLockRequest, CompleteVaultLockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVaultResult> createVaultAsync(CreateVaultRequest request) {

        return createVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVaultResult> createVaultAsync(CreateVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVaultRequest, CreateVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request) {

        return deleteArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultResult> deleteVaultAsync(DeleteVaultRequest request) {

        return deleteVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultResult> deleteVaultAsync(DeleteVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVaultRequest, DeleteVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultAccessPolicyResult> deleteVaultAccessPolicyAsync(DeleteVaultAccessPolicyRequest request) {

        return deleteVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultAccessPolicyResult> deleteVaultAccessPolicyAsync(DeleteVaultAccessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVaultAccessPolicyRequest, DeleteVaultAccessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultNotificationsResult> deleteVaultNotificationsAsync(DeleteVaultNotificationsRequest request) {

        return deleteVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultNotificationsResult> deleteVaultNotificationsAsync(DeleteVaultNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVaultNotificationsRequest, DeleteVaultNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVaultResult> describeVaultAsync(DescribeVaultRequest request) {

        return describeVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVaultResult> describeVaultAsync(DescribeVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVaultRequest, DescribeVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDataRetrievalPolicyResult> getDataRetrievalPolicyAsync(GetDataRetrievalPolicyRequest request) {

        return getDataRetrievalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataRetrievalPolicyResult> getDataRetrievalPolicyAsync(GetDataRetrievalPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDataRetrievalPolicyRequest, GetDataRetrievalPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobOutputResult> getJobOutputAsync(GetJobOutputRequest request) {

        return getJobOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobOutputResult> getJobOutputAsync(GetJobOutputRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobOutputRequest, GetJobOutputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVaultAccessPolicyResult> getVaultAccessPolicyAsync(GetVaultAccessPolicyRequest request) {

        return getVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVaultAccessPolicyResult> getVaultAccessPolicyAsync(GetVaultAccessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVaultAccessPolicyRequest, GetVaultAccessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVaultLockResult> getVaultLockAsync(GetVaultLockRequest request) {

        return getVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVaultLockResult> getVaultLockAsync(GetVaultLockRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVaultLockRequest, GetVaultLockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVaultNotificationsResult> getVaultNotificationsAsync(GetVaultNotificationsRequest request) {

        return getVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVaultNotificationsResult> getVaultNotificationsAsync(GetVaultNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVaultNotificationsRequest, GetVaultNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InitiateJobResult> initiateJobAsync(InitiateJobRequest request) {

        return initiateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateJobResult> initiateJobAsync(InitiateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<InitiateJobRequest, InitiateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InitiateMultipartUploadResult> initiateMultipartUploadAsync(InitiateMultipartUploadRequest request) {

        return initiateMultipartUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateMultipartUploadResult> initiateMultipartUploadAsync(InitiateMultipartUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<InitiateMultipartUploadRequest, InitiateMultipartUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InitiateVaultLockResult> initiateVaultLockAsync(InitiateVaultLockRequest request) {

        return initiateVaultLockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateVaultLockResult> initiateVaultLockAsync(InitiateVaultLockRequest request,
            com.amazonaws.handlers.AsyncHandler<InitiateVaultLockRequest, InitiateVaultLockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadsResult> listMultipartUploadsAsync(ListMultipartUploadsRequest request) {

        return listMultipartUploadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadsResult> listMultipartUploadsAsync(ListMultipartUploadsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMultipartUploadsRequest, ListMultipartUploadsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPartsResult> listPartsAsync(ListPartsRequest request) {

        return listPartsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartsResult> listPartsAsync(ListPartsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPartsRequest, ListPartsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedCapacityResult> listProvisionedCapacityAsync(ListProvisionedCapacityRequest request) {

        return listProvisionedCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedCapacityResult> listProvisionedCapacityAsync(ListProvisionedCapacityRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedCapacityRequest, ListProvisionedCapacityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForVaultResult> listTagsForVaultAsync(ListTagsForVaultRequest request) {

        return listTagsForVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForVaultResult> listTagsForVaultAsync(ListTagsForVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForVaultRequest, ListTagsForVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListVaultsResult> listVaultsAsync(ListVaultsRequest request) {

        return listVaultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVaultsResult> listVaultsAsync(ListVaultsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVaultsRequest, ListVaultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseProvisionedCapacityResult> purchaseProvisionedCapacityAsync(PurchaseProvisionedCapacityRequest request) {

        return purchaseProvisionedCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseProvisionedCapacityResult> purchaseProvisionedCapacityAsync(PurchaseProvisionedCapacityRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseProvisionedCapacityRequest, PurchaseProvisionedCapacityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromVaultResult> removeTagsFromVaultAsync(RemoveTagsFromVaultRequest request) {

        return removeTagsFromVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromVaultResult> removeTagsFromVaultAsync(RemoveTagsFromVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromVaultRequest, RemoveTagsFromVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetDataRetrievalPolicyResult> setDataRetrievalPolicyAsync(SetDataRetrievalPolicyRequest request) {

        return setDataRetrievalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDataRetrievalPolicyResult> setDataRetrievalPolicyAsync(SetDataRetrievalPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<SetDataRetrievalPolicyRequest, SetDataRetrievalPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetVaultAccessPolicyResult> setVaultAccessPolicyAsync(SetVaultAccessPolicyRequest request) {

        return setVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVaultAccessPolicyResult> setVaultAccessPolicyAsync(SetVaultAccessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<SetVaultAccessPolicyRequest, SetVaultAccessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetVaultNotificationsResult> setVaultNotificationsAsync(SetVaultNotificationsRequest request) {

        return setVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVaultNotificationsResult> setVaultNotificationsAsync(SetVaultNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<SetVaultNotificationsRequest, SetVaultNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadArchiveResult> uploadArchiveAsync(UploadArchiveRequest request) {

        return uploadArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadArchiveResult> uploadArchiveAsync(UploadArchiveRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadArchiveRequest, UploadArchiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadMultipartPartResult> uploadMultipartPartAsync(UploadMultipartPartRequest request) {

        return uploadMultipartPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadMultipartPartResult> uploadMultipartPartAsync(UploadMultipartPartRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadMultipartPartRequest, UploadMultipartPartResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
