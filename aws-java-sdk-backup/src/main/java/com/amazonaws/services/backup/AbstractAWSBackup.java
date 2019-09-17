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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSBackup}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBackup implements AWSBackup {

    protected AbstractAWSBackup() {
    }

    @Override
    public CreateBackupPlanResult createBackupPlan(CreateBackupPlanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBackupSelectionResult createBackupSelection(CreateBackupSelectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBackupVaultResult createBackupVault(CreateBackupVaultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupPlanResult deleteBackupPlan(DeleteBackupPlanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupSelectionResult deleteBackupSelection(DeleteBackupSelectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupVaultResult deleteBackupVault(DeleteBackupVaultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupVaultAccessPolicyResult deleteBackupVaultAccessPolicy(DeleteBackupVaultAccessPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteBackupVaultNotificationsResult deleteBackupVaultNotifications(DeleteBackupVaultNotificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRecoveryPointResult deleteRecoveryPoint(DeleteRecoveryPointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBackupJobResult describeBackupJob(DescribeBackupJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeBackupVaultResult describeBackupVault(DescribeBackupVaultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeProtectedResourceResult describeProtectedResource(DescribeProtectedResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRecoveryPointResult describeRecoveryPoint(DescribeRecoveryPointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRestoreJobResult describeRestoreJob(DescribeRestoreJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportBackupPlanTemplateResult exportBackupPlanTemplate(ExportBackupPlanTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBackupPlanResult getBackupPlan(GetBackupPlanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBackupPlanFromJSONResult getBackupPlanFromJSON(GetBackupPlanFromJSONRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBackupPlanFromTemplateResult getBackupPlanFromTemplate(GetBackupPlanFromTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBackupSelectionResult getBackupSelection(GetBackupSelectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBackupVaultAccessPolicyResult getBackupVaultAccessPolicy(GetBackupVaultAccessPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBackupVaultNotificationsResult getBackupVaultNotifications(GetBackupVaultNotificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRecoveryPointRestoreMetadataResult getRecoveryPointRestoreMetadata(GetRecoveryPointRestoreMetadataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSupportedResourceTypesResult getSupportedResourceTypes(GetSupportedResourceTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBackupJobsResult listBackupJobs(ListBackupJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBackupPlanTemplatesResult listBackupPlanTemplates(ListBackupPlanTemplatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBackupPlanVersionsResult listBackupPlanVersions(ListBackupPlanVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBackupPlansResult listBackupPlans(ListBackupPlansRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBackupSelectionsResult listBackupSelections(ListBackupSelectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListBackupVaultsResult listBackupVaults(ListBackupVaultsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProtectedResourcesResult listProtectedResources(ListProtectedResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecoveryPointsByBackupVaultResult listRecoveryPointsByBackupVault(ListRecoveryPointsByBackupVaultRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRecoveryPointsByResourceResult listRecoveryPointsByResource(ListRecoveryPointsByResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRestoreJobsResult listRestoreJobs(ListRestoreJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutBackupVaultAccessPolicyResult putBackupVaultAccessPolicy(PutBackupVaultAccessPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutBackupVaultNotificationsResult putBackupVaultNotifications(PutBackupVaultNotificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartBackupJobResult startBackupJob(StartBackupJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartRestoreJobResult startRestoreJob(StartRestoreJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopBackupJobResult stopBackupJob(StopBackupJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateBackupPlanResult updateBackupPlan(UpdateBackupPlanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRecoveryPointLifecycleResult updateRecoveryPointLifecycle(UpdateRecoveryPointLifecycleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
