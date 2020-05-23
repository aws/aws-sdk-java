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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCodeBuild}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeBuild implements AWSCodeBuild {

    protected AbstractAWSCodeBuild() {
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
    public BatchDeleteBuildsResult batchDeleteBuilds(BatchDeleteBuildsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchGetReportGroupsResult batchGetReportGroups(BatchGetReportGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BatchGetReportsResult batchGetReports(BatchGetReportsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateReportGroupResult createReportGroup(CreateReportGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateWebhookResult createWebhook(CreateWebhookRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteReportResult deleteReport(DeleteReportRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteReportGroupResult deleteReportGroup(DeleteReportGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteSourceCredentialsResult deleteSourceCredentials(DeleteSourceCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTestCasesResult describeTestCases(DescribeTestCasesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImportSourceCredentialsResult importSourceCredentials(ImportSourceCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InvalidateProjectCacheResult invalidateProjectCache(InvalidateProjectCacheRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListBuildsResult listBuilds(ListBuildsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListBuildsForProjectResult listBuildsForProject(ListBuildsForProjectRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(ListCuratedEnvironmentImagesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListReportGroupsResult listReportGroups(ListReportGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListReportsResult listReports(ListReportsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListReportsForReportGroupResult listReportsForReportGroup(ListReportsForReportGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListSharedProjectsResult listSharedProjects(ListSharedProjectsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListSharedReportGroupsResult listSharedReportGroups(ListSharedReportGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListSourceCredentialsResult listSourceCredentials(ListSourceCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartBuildResult startBuild(StartBuildRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopBuildResult stopBuild(StopBuildRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateReportGroupResult updateReportGroup(UpdateReportGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateWebhookResult updateWebhook(UpdateWebhookRequest request) {
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

}
