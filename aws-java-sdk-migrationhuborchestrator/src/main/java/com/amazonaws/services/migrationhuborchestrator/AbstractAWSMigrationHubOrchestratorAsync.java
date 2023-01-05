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
package com.amazonaws.services.migrationhuborchestrator;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhuborchestrator.model.*;

/**
 * Abstract implementation of {@code AWSMigrationHubOrchestratorAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMigrationHubOrchestratorAsync extends AbstractAWSMigrationHubOrchestrator implements AWSMigrationHubOrchestratorAsync {

    protected AbstractAWSMigrationHubOrchestratorAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request) {

        return createWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowStepResult> createWorkflowStepAsync(CreateWorkflowStepRequest request) {

        return createWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowStepResult> createWorkflowStepAsync(CreateWorkflowStepRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowStepRequest, CreateWorkflowStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowStepGroupResult> createWorkflowStepGroupAsync(CreateWorkflowStepGroupRequest request) {

        return createWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkflowStepGroupResult> createWorkflowStepGroupAsync(CreateWorkflowStepGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowStepGroupRequest, CreateWorkflowStepGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request) {

        return deleteWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowStepResult> deleteWorkflowStepAsync(DeleteWorkflowStepRequest request) {

        return deleteWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowStepResult> deleteWorkflowStepAsync(DeleteWorkflowStepRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowStepRequest, DeleteWorkflowStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowStepGroupResult> deleteWorkflowStepGroupAsync(DeleteWorkflowStepGroupRequest request) {

        return deleteWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkflowStepGroupResult> deleteWorkflowStepGroupAsync(DeleteWorkflowStepGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowStepGroupRequest, DeleteWorkflowStepGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemplateStepResult> getTemplateStepAsync(GetTemplateStepRequest request) {

        return getTemplateStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateStepResult> getTemplateStepAsync(GetTemplateStepRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemplateStepRequest, GetTemplateStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTemplateStepGroupResult> getTemplateStepGroupAsync(GetTemplateStepGroupRequest request) {

        return getTemplateStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateStepGroupResult> getTemplateStepGroupAsync(GetTemplateStepGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTemplateStepGroupRequest, GetTemplateStepGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request) {

        return getWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepResult> getWorkflowStepAsync(GetWorkflowStepRequest request) {

        return getWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepResult> getWorkflowStepAsync(GetWorkflowStepRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowStepRequest, GetWorkflowStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepGroupResult> getWorkflowStepGroupAsync(GetWorkflowStepGroupRequest request) {

        return getWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkflowStepGroupResult> getWorkflowStepGroupAsync(GetWorkflowStepGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowStepGroupRequest, GetWorkflowStepGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest request) {

        return listPluginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPluginsResult> listPluginsAsync(ListPluginsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPluginsRequest, ListPluginsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTemplateStepGroupsResult> listTemplateStepGroupsAsync(ListTemplateStepGroupsRequest request) {

        return listTemplateStepGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateStepGroupsResult> listTemplateStepGroupsAsync(ListTemplateStepGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTemplateStepGroupsRequest, ListTemplateStepGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTemplateStepsResult> listTemplateStepsAsync(ListTemplateStepsRequest request) {

        return listTemplateStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateStepsResult> listTemplateStepsAsync(ListTemplateStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTemplateStepsRequest, ListTemplateStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest request) {

        return listTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowStepGroupsResult> listWorkflowStepGroupsAsync(ListWorkflowStepGroupsRequest request) {

        return listWorkflowStepGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowStepGroupsResult> listWorkflowStepGroupsAsync(ListWorkflowStepGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowStepGroupsRequest, ListWorkflowStepGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowStepsResult> listWorkflowStepsAsync(ListWorkflowStepsRequest request) {

        return listWorkflowStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowStepsResult> listWorkflowStepsAsync(ListWorkflowStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowStepsRequest, ListWorkflowStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request) {

        return listWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RetryWorkflowStepResult> retryWorkflowStepAsync(RetryWorkflowStepRequest request) {

        return retryWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryWorkflowStepResult> retryWorkflowStepAsync(RetryWorkflowStepRequest request,
            com.amazonaws.handlers.AsyncHandler<RetryWorkflowStepRequest, RetryWorkflowStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartWorkflowResult> startWorkflowAsync(StartWorkflowRequest request) {

        return startWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWorkflowResult> startWorkflowAsync(StartWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<StartWorkflowRequest, StartWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopWorkflowResult> stopWorkflowAsync(StopWorkflowRequest request) {

        return stopWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopWorkflowResult> stopWorkflowAsync(StopWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<StopWorkflowRequest, StopWorkflowResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request) {

        return updateWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowStepResult> updateWorkflowStepAsync(UpdateWorkflowStepRequest request) {

        return updateWorkflowStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowStepResult> updateWorkflowStepAsync(UpdateWorkflowStepRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowStepRequest, UpdateWorkflowStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowStepGroupResult> updateWorkflowStepGroupAsync(UpdateWorkflowStepGroupRequest request) {

        return updateWorkflowStepGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkflowStepGroupResult> updateWorkflowStepGroupAsync(UpdateWorkflowStepGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowStepGroupRequest, UpdateWorkflowStepGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
