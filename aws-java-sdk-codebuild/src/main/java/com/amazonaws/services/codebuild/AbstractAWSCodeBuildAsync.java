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
package com.amazonaws.services.codebuild;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;

/**
 * Abstract implementation of {@code AWSCodeBuildAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeBuildAsync extends AbstractAWSCodeBuild implements AWSCodeBuildAsync {

    protected AbstractAWSCodeBuildAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest request) {

        return batchDeleteBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteBuildsRequest, BatchDeleteBuildsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest request) {

        return batchGetBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetBuildsRequest, BatchGetBuildsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest request) {

        return batchGetProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetProjectsRequest, BatchGetProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetReportGroupsResult> batchGetReportGroupsAsync(BatchGetReportGroupsRequest request) {

        return batchGetReportGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetReportGroupsResult> batchGetReportGroupsAsync(BatchGetReportGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetReportGroupsRequest, BatchGetReportGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetReportsResult> batchGetReportsAsync(BatchGetReportsRequest request) {

        return batchGetReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetReportsResult> batchGetReportsAsync(BatchGetReportsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetReportsRequest, BatchGetReportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReportGroupResult> createReportGroupAsync(CreateReportGroupRequest request) {

        return createReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReportGroupResult> createReportGroupAsync(CreateReportGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReportGroupRequest, CreateReportGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest request) {

        return createWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWebhookRequest, CreateWebhookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReportResult> deleteReportAsync(DeleteReportRequest request) {

        return deleteReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportResult> deleteReportAsync(DeleteReportRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReportRequest, DeleteReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReportGroupResult> deleteReportGroupAsync(DeleteReportGroupRequest request) {

        return deleteReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReportGroupResult> deleteReportGroupAsync(DeleteReportGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReportGroupRequest, DeleteReportGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceCredentialsResult> deleteSourceCredentialsAsync(DeleteSourceCredentialsRequest request) {

        return deleteSourceCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceCredentialsResult> deleteSourceCredentialsAsync(DeleteSourceCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSourceCredentialsRequest, DeleteSourceCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest request) {

        return deleteWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWebhookRequest, DeleteWebhookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTestCasesResult> describeTestCasesAsync(DescribeTestCasesRequest request) {

        return describeTestCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTestCasesResult> describeTestCasesAsync(DescribeTestCasesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTestCasesRequest, DescribeTestCasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportSourceCredentialsResult> importSourceCredentialsAsync(ImportSourceCredentialsRequest request) {

        return importSourceCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSourceCredentialsResult> importSourceCredentialsAsync(ImportSourceCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportSourceCredentialsRequest, ImportSourceCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InvalidateProjectCacheResult> invalidateProjectCacheAsync(InvalidateProjectCacheRequest request) {

        return invalidateProjectCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvalidateProjectCacheResult> invalidateProjectCacheAsync(InvalidateProjectCacheRequest request,
            com.amazonaws.handlers.AsyncHandler<InvalidateProjectCacheRequest, InvalidateProjectCacheResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request) {

        return listBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest request) {

        return listBuildsForProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBuildsForProjectRequest, ListBuildsForProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(ListCuratedEnvironmentImagesRequest request) {

        return listCuratedEnvironmentImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(ListCuratedEnvironmentImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCuratedEnvironmentImagesRequest, ListCuratedEnvironmentImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReportGroupsResult> listReportGroupsAsync(ListReportGroupsRequest request) {

        return listReportGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportGroupsResult> listReportGroupsAsync(ListReportGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReportGroupsRequest, ListReportGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest request) {

        return listReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReportsRequest, ListReportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReportsForReportGroupResult> listReportsForReportGroupAsync(ListReportsForReportGroupRequest request) {

        return listReportsForReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReportsForReportGroupResult> listReportsForReportGroupAsync(ListReportsForReportGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReportsForReportGroupRequest, ListReportsForReportGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSharedProjectsResult> listSharedProjectsAsync(ListSharedProjectsRequest request) {

        return listSharedProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSharedProjectsResult> listSharedProjectsAsync(ListSharedProjectsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSharedProjectsRequest, ListSharedProjectsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSharedReportGroupsResult> listSharedReportGroupsAsync(ListSharedReportGroupsRequest request) {

        return listSharedReportGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSharedReportGroupsResult> listSharedReportGroupsAsync(ListSharedReportGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSharedReportGroupsRequest, ListSharedReportGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSourceCredentialsResult> listSourceCredentialsAsync(ListSourceCredentialsRequest request) {

        return listSourceCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSourceCredentialsResult> listSourceCredentialsAsync(ListSourceCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSourceCredentialsRequest, ListSourceCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest request) {

        return startBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest request,
            com.amazonaws.handlers.AsyncHandler<StartBuildRequest, StartBuildResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest request) {

        return stopBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest request,
            com.amazonaws.handlers.AsyncHandler<StopBuildRequest, StopBuildResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateReportGroupResult> updateReportGroupAsync(UpdateReportGroupRequest request) {

        return updateReportGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReportGroupResult> updateReportGroupAsync(UpdateReportGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateReportGroupRequest, UpdateReportGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest request) {

        return updateWebhookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWebhookRequest, UpdateWebhookResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
