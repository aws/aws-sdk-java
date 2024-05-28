/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chatbot;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;

/**
 * Abstract implementation of {@code AWSChatbotAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSChatbotAsync extends AbstractAWSChatbot implements AWSChatbotAsync {

    protected AbstractAWSChatbotAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateChimeWebhookConfigurationResult> createChimeWebhookConfigurationAsync(
            CreateChimeWebhookConfigurationRequest request) {

        return createChimeWebhookConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChimeWebhookConfigurationResult> createChimeWebhookConfigurationAsync(
            CreateChimeWebhookConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateChimeWebhookConfigurationRequest, CreateChimeWebhookConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftTeamsChannelConfigurationResult> createMicrosoftTeamsChannelConfigurationAsync(
            CreateMicrosoftTeamsChannelConfigurationRequest request) {

        return createMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftTeamsChannelConfigurationResult> createMicrosoftTeamsChannelConfigurationAsync(
            CreateMicrosoftTeamsChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMicrosoftTeamsChannelConfigurationRequest, CreateMicrosoftTeamsChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest request) {

        return createSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSlackChannelConfigurationRequest, CreateSlackChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteChimeWebhookConfigurationResult> deleteChimeWebhookConfigurationAsync(
            DeleteChimeWebhookConfigurationRequest request) {

        return deleteChimeWebhookConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChimeWebhookConfigurationResult> deleteChimeWebhookConfigurationAsync(
            DeleteChimeWebhookConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteChimeWebhookConfigurationRequest, DeleteChimeWebhookConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsChannelConfigurationResult> deleteMicrosoftTeamsChannelConfigurationAsync(
            DeleteMicrosoftTeamsChannelConfigurationRequest request) {

        return deleteMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsChannelConfigurationResult> deleteMicrosoftTeamsChannelConfigurationAsync(
            DeleteMicrosoftTeamsChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsChannelConfigurationRequest, DeleteMicrosoftTeamsChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsConfiguredTeamResult> deleteMicrosoftTeamsConfiguredTeamAsync(
            DeleteMicrosoftTeamsConfiguredTeamRequest request) {

        return deleteMicrosoftTeamsConfiguredTeamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsConfiguredTeamResult> deleteMicrosoftTeamsConfiguredTeamAsync(
            DeleteMicrosoftTeamsConfiguredTeamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsConfiguredTeamRequest, DeleteMicrosoftTeamsConfiguredTeamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsUserIdentityResult> deleteMicrosoftTeamsUserIdentityAsync(
            DeleteMicrosoftTeamsUserIdentityRequest request) {

        return deleteMicrosoftTeamsUserIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsUserIdentityResult> deleteMicrosoftTeamsUserIdentityAsync(
            DeleteMicrosoftTeamsUserIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsUserIdentityRequest, DeleteMicrosoftTeamsUserIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest request) {

        return deleteSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackChannelConfigurationRequest, DeleteSlackChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackUserIdentityResult> deleteSlackUserIdentityAsync(DeleteSlackUserIdentityRequest request) {

        return deleteSlackUserIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackUserIdentityResult> deleteSlackUserIdentityAsync(DeleteSlackUserIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackUserIdentityRequest, DeleteSlackUserIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceAuthorizationResult> deleteSlackWorkspaceAuthorizationAsync(
            DeleteSlackWorkspaceAuthorizationRequest request) {

        return deleteSlackWorkspaceAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceAuthorizationResult> deleteSlackWorkspaceAuthorizationAsync(
            DeleteSlackWorkspaceAuthorizationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackWorkspaceAuthorizationRequest, DeleteSlackWorkspaceAuthorizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeChimeWebhookConfigurationsResult> describeChimeWebhookConfigurationsAsync(
            DescribeChimeWebhookConfigurationsRequest request) {

        return describeChimeWebhookConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChimeWebhookConfigurationsResult> describeChimeWebhookConfigurationsAsync(
            DescribeChimeWebhookConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeChimeWebhookConfigurationsRequest, DescribeChimeWebhookConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackChannelConfigurationsResult> describeSlackChannelConfigurationsAsync(
            DescribeSlackChannelConfigurationsRequest request) {

        return describeSlackChannelConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackChannelConfigurationsResult> describeSlackChannelConfigurationsAsync(
            DescribeSlackChannelConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSlackChannelConfigurationsRequest, DescribeSlackChannelConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackUserIdentitiesResult> describeSlackUserIdentitiesAsync(DescribeSlackUserIdentitiesRequest request) {

        return describeSlackUserIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackUserIdentitiesResult> describeSlackUserIdentitiesAsync(DescribeSlackUserIdentitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSlackUserIdentitiesRequest, DescribeSlackUserIdentitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackWorkspacesResult> describeSlackWorkspacesAsync(DescribeSlackWorkspacesRequest request) {

        return describeSlackWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackWorkspacesResult> describeSlackWorkspacesAsync(DescribeSlackWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSlackWorkspacesRequest, DescribeSlackWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountPreferencesResult> getAccountPreferencesAsync(GetAccountPreferencesRequest request) {

        return getAccountPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountPreferencesResult> getAccountPreferencesAsync(GetAccountPreferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountPreferencesRequest, GetAccountPreferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMicrosoftTeamsChannelConfigurationResult> getMicrosoftTeamsChannelConfigurationAsync(
            GetMicrosoftTeamsChannelConfigurationRequest request) {

        return getMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMicrosoftTeamsChannelConfigurationResult> getMicrosoftTeamsChannelConfigurationAsync(
            GetMicrosoftTeamsChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMicrosoftTeamsChannelConfigurationRequest, GetMicrosoftTeamsChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsChannelConfigurationsResult> listMicrosoftTeamsChannelConfigurationsAsync(
            ListMicrosoftTeamsChannelConfigurationsRequest request) {

        return listMicrosoftTeamsChannelConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsChannelConfigurationsResult> listMicrosoftTeamsChannelConfigurationsAsync(
            ListMicrosoftTeamsChannelConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsChannelConfigurationsRequest, ListMicrosoftTeamsChannelConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsConfiguredTeamsResult> listMicrosoftTeamsConfiguredTeamsAsync(
            ListMicrosoftTeamsConfiguredTeamsRequest request) {

        return listMicrosoftTeamsConfiguredTeamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsConfiguredTeamsResult> listMicrosoftTeamsConfiguredTeamsAsync(
            ListMicrosoftTeamsConfiguredTeamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsConfiguredTeamsRequest, ListMicrosoftTeamsConfiguredTeamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsUserIdentitiesResult> listMicrosoftTeamsUserIdentitiesAsync(
            ListMicrosoftTeamsUserIdentitiesRequest request) {

        return listMicrosoftTeamsUserIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsUserIdentitiesResult> listMicrosoftTeamsUserIdentitiesAsync(
            ListMicrosoftTeamsUserIdentitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsUserIdentitiesRequest, ListMicrosoftTeamsUserIdentitiesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAccountPreferencesResult> updateAccountPreferencesAsync(UpdateAccountPreferencesRequest request) {

        return updateAccountPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountPreferencesResult> updateAccountPreferencesAsync(UpdateAccountPreferencesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountPreferencesRequest, UpdateAccountPreferencesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateChimeWebhookConfigurationResult> updateChimeWebhookConfigurationAsync(
            UpdateChimeWebhookConfigurationRequest request) {

        return updateChimeWebhookConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChimeWebhookConfigurationResult> updateChimeWebhookConfigurationAsync(
            UpdateChimeWebhookConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateChimeWebhookConfigurationRequest, UpdateChimeWebhookConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMicrosoftTeamsChannelConfigurationResult> updateMicrosoftTeamsChannelConfigurationAsync(
            UpdateMicrosoftTeamsChannelConfigurationRequest request) {

        return updateMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMicrosoftTeamsChannelConfigurationResult> updateMicrosoftTeamsChannelConfigurationAsync(
            UpdateMicrosoftTeamsChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMicrosoftTeamsChannelConfigurationRequest, UpdateMicrosoftTeamsChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest request) {

        return updateSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSlackChannelConfigurationRequest, UpdateSlackChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
