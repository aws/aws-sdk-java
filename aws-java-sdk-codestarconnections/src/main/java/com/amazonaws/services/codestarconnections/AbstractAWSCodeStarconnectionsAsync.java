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
package com.amazonaws.services.codestarconnections;

import javax.annotation.Generated;

import com.amazonaws.services.codestarconnections.model.*;

/**
 * Abstract implementation of {@code AWSCodeStarconnectionsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeStarconnectionsAsync extends AbstractAWSCodeStarconnections implements AWSCodeStarconnectionsAsync {

    protected AbstractAWSCodeStarconnectionsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest request) {

        return createHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHostRequest, CreateHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryLinkResult> createRepositoryLinkAsync(CreateRepositoryLinkRequest request) {

        return createRepositoryLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryLinkResult> createRepositoryLinkAsync(CreateRepositoryLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryLinkRequest, CreateRepositoryLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSyncConfigurationResult> createSyncConfigurationAsync(CreateSyncConfigurationRequest request) {

        return createSyncConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSyncConfigurationResult> createSyncConfigurationAsync(CreateSyncConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSyncConfigurationRequest, CreateSyncConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest request) {

        return deleteHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHostRequest, DeleteHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryLinkResult> deleteRepositoryLinkAsync(DeleteRepositoryLinkRequest request) {

        return deleteRepositoryLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryLinkResult> deleteRepositoryLinkAsync(DeleteRepositoryLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryLinkRequest, DeleteRepositoryLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSyncConfigurationResult> deleteSyncConfigurationAsync(DeleteSyncConfigurationRequest request) {

        return deleteSyncConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSyncConfigurationResult> deleteSyncConfigurationAsync(DeleteSyncConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSyncConfigurationRequest, DeleteSyncConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request) {

        return getConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest request) {

        return getHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHostRequest, GetHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryLinkResult> getRepositoryLinkAsync(GetRepositoryLinkRequest request) {

        return getRepositoryLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryLinkResult> getRepositoryLinkAsync(GetRepositoryLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryLinkRequest, GetRepositoryLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositorySyncStatusResult> getRepositorySyncStatusAsync(GetRepositorySyncStatusRequest request) {

        return getRepositorySyncStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositorySyncStatusResult> getRepositorySyncStatusAsync(GetRepositorySyncStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositorySyncStatusRequest, GetRepositorySyncStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetResourceSyncStatusResult> getResourceSyncStatusAsync(GetResourceSyncStatusRequest request) {

        return getResourceSyncStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceSyncStatusResult> getResourceSyncStatusAsync(GetResourceSyncStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceSyncStatusRequest, GetResourceSyncStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSyncBlockerSummaryResult> getSyncBlockerSummaryAsync(GetSyncBlockerSummaryRequest request) {

        return getSyncBlockerSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSyncBlockerSummaryResult> getSyncBlockerSummaryAsync(GetSyncBlockerSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSyncBlockerSummaryRequest, GetSyncBlockerSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSyncConfigurationResult> getSyncConfigurationAsync(GetSyncConfigurationRequest request) {

        return getSyncConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSyncConfigurationResult> getSyncConfigurationAsync(GetSyncConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSyncConfigurationRequest, GetSyncConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request) {

        return listConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest request) {

        return listHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHostsRequest, ListHostsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryLinksResult> listRepositoryLinksAsync(ListRepositoryLinksRequest request) {

        return listRepositoryLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryLinksResult> listRepositoryLinksAsync(ListRepositoryLinksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositoryLinksRequest, ListRepositoryLinksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRepositorySyncDefinitionsResult> listRepositorySyncDefinitionsAsync(ListRepositorySyncDefinitionsRequest request) {

        return listRepositorySyncDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositorySyncDefinitionsResult> listRepositorySyncDefinitionsAsync(ListRepositorySyncDefinitionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRepositorySyncDefinitionsRequest, ListRepositorySyncDefinitionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSyncConfigurationsResult> listSyncConfigurationsAsync(ListSyncConfigurationsRequest request) {

        return listSyncConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSyncConfigurationsResult> listSyncConfigurationsAsync(ListSyncConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSyncConfigurationsRequest, ListSyncConfigurationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest request) {

        return updateHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateHostRequest, UpdateHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryLinkResult> updateRepositoryLinkAsync(UpdateRepositoryLinkRequest request) {

        return updateRepositoryLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryLinkResult> updateRepositoryLinkAsync(UpdateRepositoryLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryLinkRequest, UpdateRepositoryLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSyncBlockerResult> updateSyncBlockerAsync(UpdateSyncBlockerRequest request) {

        return updateSyncBlockerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSyncBlockerResult> updateSyncBlockerAsync(UpdateSyncBlockerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSyncBlockerRequest, UpdateSyncBlockerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSyncConfigurationResult> updateSyncConfigurationAsync(UpdateSyncConfigurationRequest request) {

        return updateSyncConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSyncConfigurationResult> updateSyncConfigurationAsync(UpdateSyncConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSyncConfigurationRequest, UpdateSyncConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
