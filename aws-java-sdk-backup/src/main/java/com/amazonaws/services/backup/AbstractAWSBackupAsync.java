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
package com.amazonaws.services.backup;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;

/**
 * Abstract implementation of {@code AWSBackupAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBackupAsync extends AbstractAWSBackup implements AWSBackupAsync {

    protected AbstractAWSBackupAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateBackupPlanResult> createBackupPlanAsync(CreateBackupPlanRequest request) {

        return createBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupPlanResult> createBackupPlanAsync(CreateBackupPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupPlanRequest, CreateBackupPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBackupSelectionResult> createBackupSelectionAsync(CreateBackupSelectionRequest request) {

        return createBackupSelectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupSelectionResult> createBackupSelectionAsync(CreateBackupSelectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupSelectionRequest, CreateBackupSelectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBackupVaultResult> createBackupVaultAsync(CreateBackupVaultRequest request) {

        return createBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupVaultResult> createBackupVaultAsync(CreateBackupVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupVaultRequest, CreateBackupVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupPlanResult> deleteBackupPlanAsync(DeleteBackupPlanRequest request) {

        return deleteBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupPlanResult> deleteBackupPlanAsync(DeleteBackupPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupPlanRequest, DeleteBackupPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupSelectionResult> deleteBackupSelectionAsync(DeleteBackupSelectionRequest request) {

        return deleteBackupSelectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupSelectionResult> deleteBackupSelectionAsync(DeleteBackupSelectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupSelectionRequest, DeleteBackupSelectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultResult> deleteBackupVaultAsync(DeleteBackupVaultRequest request) {

        return deleteBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultResult> deleteBackupVaultAsync(DeleteBackupVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultRequest, DeleteBackupVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultAccessPolicyResult> deleteBackupVaultAccessPolicyAsync(DeleteBackupVaultAccessPolicyRequest request) {

        return deleteBackupVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultAccessPolicyResult> deleteBackupVaultAccessPolicyAsync(DeleteBackupVaultAccessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultAccessPolicyRequest, DeleteBackupVaultAccessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultNotificationsResult> deleteBackupVaultNotificationsAsync(DeleteBackupVaultNotificationsRequest request) {

        return deleteBackupVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupVaultNotificationsResult> deleteBackupVaultNotificationsAsync(DeleteBackupVaultNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultNotificationsRequest, DeleteBackupVaultNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryPointResult> deleteRecoveryPointAsync(DeleteRecoveryPointRequest request) {

        return deleteRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryPointResult> deleteRecoveryPointAsync(DeleteRecoveryPointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRecoveryPointRequest, DeleteRecoveryPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupJobResult> describeBackupJobAsync(DescribeBackupJobRequest request) {

        return describeBackupJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupJobResult> describeBackupJobAsync(DescribeBackupJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupJobRequest, DescribeBackupJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupVaultResult> describeBackupVaultAsync(DescribeBackupVaultRequest request) {

        return describeBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupVaultResult> describeBackupVaultAsync(DescribeBackupVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupVaultRequest, DescribeBackupVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectedResourceResult> describeProtectedResourceAsync(DescribeProtectedResourceRequest request) {

        return describeProtectedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectedResourceResult> describeProtectedResourceAsync(DescribeProtectedResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectedResourceRequest, DescribeProtectedResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoveryPointResult> describeRecoveryPointAsync(DescribeRecoveryPointRequest request) {

        return describeRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoveryPointResult> describeRecoveryPointAsync(DescribeRecoveryPointRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecoveryPointRequest, DescribeRecoveryPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRestoreJobResult> describeRestoreJobAsync(DescribeRestoreJobRequest request) {

        return describeRestoreJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRestoreJobResult> describeRestoreJobAsync(DescribeRestoreJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRestoreJobRequest, DescribeRestoreJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExportBackupPlanTemplateResult> exportBackupPlanTemplateAsync(ExportBackupPlanTemplateRequest request) {

        return exportBackupPlanTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportBackupPlanTemplateResult> exportBackupPlanTemplateAsync(ExportBackupPlanTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<ExportBackupPlanTemplateRequest, ExportBackupPlanTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanResult> getBackupPlanAsync(GetBackupPlanRequest request) {

        return getBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanResult> getBackupPlanAsync(GetBackupPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBackupPlanRequest, GetBackupPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanFromJSONResult> getBackupPlanFromJSONAsync(GetBackupPlanFromJSONRequest request) {

        return getBackupPlanFromJSONAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanFromJSONResult> getBackupPlanFromJSONAsync(GetBackupPlanFromJSONRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBackupPlanFromJSONRequest, GetBackupPlanFromJSONResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanFromTemplateResult> getBackupPlanFromTemplateAsync(GetBackupPlanFromTemplateRequest request) {

        return getBackupPlanFromTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupPlanFromTemplateResult> getBackupPlanFromTemplateAsync(GetBackupPlanFromTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBackupPlanFromTemplateRequest, GetBackupPlanFromTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBackupSelectionResult> getBackupSelectionAsync(GetBackupSelectionRequest request) {

        return getBackupSelectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupSelectionResult> getBackupSelectionAsync(GetBackupSelectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBackupSelectionRequest, GetBackupSelectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBackupVaultAccessPolicyResult> getBackupVaultAccessPolicyAsync(GetBackupVaultAccessPolicyRequest request) {

        return getBackupVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupVaultAccessPolicyResult> getBackupVaultAccessPolicyAsync(GetBackupVaultAccessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBackupVaultAccessPolicyRequest, GetBackupVaultAccessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBackupVaultNotificationsResult> getBackupVaultNotificationsAsync(GetBackupVaultNotificationsRequest request) {

        return getBackupVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackupVaultNotificationsResult> getBackupVaultNotificationsAsync(GetBackupVaultNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBackupVaultNotificationsRequest, GetBackupVaultNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecoveryPointRestoreMetadataResult> getRecoveryPointRestoreMetadataAsync(
            GetRecoveryPointRestoreMetadataRequest request) {

        return getRecoveryPointRestoreMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecoveryPointRestoreMetadataResult> getRecoveryPointRestoreMetadataAsync(
            GetRecoveryPointRestoreMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryPointRestoreMetadataRequest, GetRecoveryPointRestoreMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSupportedResourceTypesResult> getSupportedResourceTypesAsync(GetSupportedResourceTypesRequest request) {

        return getSupportedResourceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSupportedResourceTypesResult> getSupportedResourceTypesAsync(GetSupportedResourceTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSupportedResourceTypesRequest, GetSupportedResourceTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBackupJobsResult> listBackupJobsAsync(ListBackupJobsRequest request) {

        return listBackupJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupJobsResult> listBackupJobsAsync(ListBackupJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupJobsRequest, ListBackupJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlanTemplatesResult> listBackupPlanTemplatesAsync(ListBackupPlanTemplatesRequest request) {

        return listBackupPlanTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlanTemplatesResult> listBackupPlanTemplatesAsync(ListBackupPlanTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupPlanTemplatesRequest, ListBackupPlanTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlanVersionsResult> listBackupPlanVersionsAsync(ListBackupPlanVersionsRequest request) {

        return listBackupPlanVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlanVersionsResult> listBackupPlanVersionsAsync(ListBackupPlanVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupPlanVersionsRequest, ListBackupPlanVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlansResult> listBackupPlansAsync(ListBackupPlansRequest request) {

        return listBackupPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupPlansResult> listBackupPlansAsync(ListBackupPlansRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupPlansRequest, ListBackupPlansResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBackupSelectionsResult> listBackupSelectionsAsync(ListBackupSelectionsRequest request) {

        return listBackupSelectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupSelectionsResult> listBackupSelectionsAsync(ListBackupSelectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupSelectionsRequest, ListBackupSelectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBackupVaultsResult> listBackupVaultsAsync(ListBackupVaultsRequest request) {

        return listBackupVaultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupVaultsResult> listBackupVaultsAsync(ListBackupVaultsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupVaultsRequest, ListBackupVaultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProtectedResourcesResult> listProtectedResourcesAsync(ListProtectedResourcesRequest request) {

        return listProtectedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtectedResourcesResult> listProtectedResourcesAsync(ListProtectedResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProtectedResourcesRequest, ListProtectedResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsByBackupVaultResult> listRecoveryPointsByBackupVaultAsync(
            ListRecoveryPointsByBackupVaultRequest request) {

        return listRecoveryPointsByBackupVaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsByBackupVaultResult> listRecoveryPointsByBackupVaultAsync(
            ListRecoveryPointsByBackupVaultRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsByBackupVaultRequest, ListRecoveryPointsByBackupVaultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsByResourceResult> listRecoveryPointsByResourceAsync(ListRecoveryPointsByResourceRequest request) {

        return listRecoveryPointsByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecoveryPointsByResourceResult> listRecoveryPointsByResourceAsync(ListRecoveryPointsByResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsByResourceRequest, ListRecoveryPointsByResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRestoreJobsResult> listRestoreJobsAsync(ListRestoreJobsRequest request) {

        return listRestoreJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRestoreJobsResult> listRestoreJobsAsync(ListRestoreJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRestoreJobsRequest, ListRestoreJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutBackupVaultAccessPolicyResult> putBackupVaultAccessPolicyAsync(PutBackupVaultAccessPolicyRequest request) {

        return putBackupVaultAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBackupVaultAccessPolicyResult> putBackupVaultAccessPolicyAsync(PutBackupVaultAccessPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutBackupVaultAccessPolicyRequest, PutBackupVaultAccessPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutBackupVaultNotificationsResult> putBackupVaultNotificationsAsync(PutBackupVaultNotificationsRequest request) {

        return putBackupVaultNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBackupVaultNotificationsResult> putBackupVaultNotificationsAsync(PutBackupVaultNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutBackupVaultNotificationsRequest, PutBackupVaultNotificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartBackupJobResult> startBackupJobAsync(StartBackupJobRequest request) {

        return startBackupJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBackupJobResult> startBackupJobAsync(StartBackupJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartBackupJobRequest, StartBackupJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartRestoreJobResult> startRestoreJobAsync(StartRestoreJobRequest request) {

        return startRestoreJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRestoreJobResult> startRestoreJobAsync(StartRestoreJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartRestoreJobRequest, StartRestoreJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopBackupJobResult> stopBackupJobAsync(StopBackupJobRequest request) {

        return stopBackupJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBackupJobResult> stopBackupJobAsync(StopBackupJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopBackupJobRequest, StopBackupJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateBackupPlanResult> updateBackupPlanAsync(UpdateBackupPlanRequest request) {

        return updateBackupPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackupPlanResult> updateBackupPlanAsync(UpdateBackupPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBackupPlanRequest, UpdateBackupPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRecoveryPointLifecycleResult> updateRecoveryPointLifecycleAsync(UpdateRecoveryPointLifecycleRequest request) {

        return updateRecoveryPointLifecycleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecoveryPointLifecycleResult> updateRecoveryPointLifecycleAsync(UpdateRecoveryPointLifecycleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRecoveryPointLifecycleRequest, UpdateRecoveryPointLifecycleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
