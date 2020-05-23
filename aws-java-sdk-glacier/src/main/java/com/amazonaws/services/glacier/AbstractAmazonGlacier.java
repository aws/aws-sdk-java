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
package com.amazonaws.services.glacier;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.*;
import com.amazonaws.services.glacier.waiters.AmazonGlacierWaiters;

/**
 * Abstract implementation of {@code AmazonGlacier}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonGlacier implements AmazonGlacier {

    protected AbstractAmazonGlacier() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbortMultipartUploadResult abortMultipartUpload(AbortMultipartUploadRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbortVaultLockResult abortVaultLock(AbortVaultLockRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddTagsToVaultResult addTagsToVault(AddTagsToVaultRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateVaultResult createVault(CreateVaultRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteArchiveResult deleteArchive(DeleteArchiveRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteVaultResult deleteVault(DeleteVaultRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteVaultAccessPolicyResult deleteVaultAccessPolicy(DeleteVaultAccessPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteVaultNotificationsResult deleteVaultNotifications(DeleteVaultNotificationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeVaultResult describeVault(DescribeVaultRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetDataRetrievalPolicyResult getDataRetrievalPolicy(GetDataRetrievalPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetJobOutputResult getJobOutput(GetJobOutputRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetVaultAccessPolicyResult getVaultAccessPolicy(GetVaultAccessPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetVaultLockResult getVaultLock(GetVaultLockRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetVaultNotificationsResult getVaultNotifications(GetVaultNotificationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InitiateJobResult initiateJob(InitiateJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InitiateVaultLockResult initiateVaultLock(InitiateVaultLockRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListMultipartUploadsResult listMultipartUploads(ListMultipartUploadsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPartsResult listParts(ListPartsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListProvisionedCapacityResult listProvisionedCapacity(ListProvisionedCapacityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForVaultResult listTagsForVault(ListTagsForVaultRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListVaultsResult listVaults(ListVaultsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PurchaseProvisionedCapacityResult purchaseProvisionedCapacity(PurchaseProvisionedCapacityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromVaultResult removeTagsFromVault(RemoveTagsFromVaultRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetDataRetrievalPolicyResult setDataRetrievalPolicy(SetDataRetrievalPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetVaultAccessPolicyResult setVaultAccessPolicy(SetVaultAccessPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetVaultNotificationsResult setVaultNotifications(SetVaultNotificationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UploadArchiveResult uploadArchive(UploadArchiveRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UploadMultipartPartResult uploadMultipartPart(UploadMultipartPartRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AmazonGlacierWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
