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
package com.amazonaws.services.migrationhub;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhub.model.*;

/**
 * Abstract implementation of {@code AWSMigrationHubAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMigrationHubAsync extends AbstractAWSMigrationHub implements AWSMigrationHubAsync {

    protected AbstractAWSMigrationHubAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateCreatedArtifactResult> associateCreatedArtifactAsync(AssociateCreatedArtifactRequest request) {

        return associateCreatedArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateCreatedArtifactResult> associateCreatedArtifactAsync(AssociateCreatedArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateCreatedArtifactRequest, AssociateCreatedArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateDiscoveredResourceResult> associateDiscoveredResourceAsync(AssociateDiscoveredResourceRequest request) {

        return associateDiscoveredResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDiscoveredResourceResult> associateDiscoveredResourceAsync(AssociateDiscoveredResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateDiscoveredResourceRequest, AssociateDiscoveredResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProgressUpdateStreamResult> createProgressUpdateStreamAsync(CreateProgressUpdateStreamRequest request) {

        return createProgressUpdateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProgressUpdateStreamResult> createProgressUpdateStreamAsync(CreateProgressUpdateStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProgressUpdateStreamRequest, CreateProgressUpdateStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProgressUpdateStreamResult> deleteProgressUpdateStreamAsync(DeleteProgressUpdateStreamRequest request) {

        return deleteProgressUpdateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProgressUpdateStreamResult> deleteProgressUpdateStreamAsync(DeleteProgressUpdateStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProgressUpdateStreamRequest, DeleteProgressUpdateStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationStateResult> describeApplicationStateAsync(DescribeApplicationStateRequest request) {

        return describeApplicationStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationStateResult> describeApplicationStateAsync(DescribeApplicationStateRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationStateRequest, DescribeApplicationStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMigrationTaskResult> describeMigrationTaskAsync(DescribeMigrationTaskRequest request) {

        return describeMigrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMigrationTaskResult> describeMigrationTaskAsync(DescribeMigrationTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMigrationTaskRequest, DescribeMigrationTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateCreatedArtifactResult> disassociateCreatedArtifactAsync(DisassociateCreatedArtifactRequest request) {

        return disassociateCreatedArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateCreatedArtifactResult> disassociateCreatedArtifactAsync(DisassociateCreatedArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateCreatedArtifactRequest, DisassociateCreatedArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateDiscoveredResourceResult> disassociateDiscoveredResourceAsync(DisassociateDiscoveredResourceRequest request) {

        return disassociateDiscoveredResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDiscoveredResourceResult> disassociateDiscoveredResourceAsync(DisassociateDiscoveredResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateDiscoveredResourceRequest, DisassociateDiscoveredResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportMigrationTaskResult> importMigrationTaskAsync(ImportMigrationTaskRequest request) {

        return importMigrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportMigrationTaskResult> importMigrationTaskAsync(ImportMigrationTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportMigrationTaskRequest, ImportMigrationTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCreatedArtifactsResult> listCreatedArtifactsAsync(ListCreatedArtifactsRequest request) {

        return listCreatedArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCreatedArtifactsResult> listCreatedArtifactsAsync(ListCreatedArtifactsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCreatedArtifactsRequest, ListCreatedArtifactsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMigrationTasksResult> listMigrationTasksAsync(ListMigrationTasksRequest request) {

        return listMigrationTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMigrationTasksResult> listMigrationTasksAsync(ListMigrationTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMigrationTasksRequest, ListMigrationTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProgressUpdateStreamsResult> listProgressUpdateStreamsAsync(ListProgressUpdateStreamsRequest request) {

        return listProgressUpdateStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProgressUpdateStreamsResult> listProgressUpdateStreamsAsync(ListProgressUpdateStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProgressUpdateStreamsRequest, ListProgressUpdateStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<NotifyApplicationStateResult> notifyApplicationStateAsync(NotifyApplicationStateRequest request) {

        return notifyApplicationStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyApplicationStateResult> notifyApplicationStateAsync(NotifyApplicationStateRequest request,
            com.amazonaws.handlers.AsyncHandler<NotifyApplicationStateRequest, NotifyApplicationStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<NotifyMigrationTaskStateResult> notifyMigrationTaskStateAsync(NotifyMigrationTaskStateRequest request) {

        return notifyMigrationTaskStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyMigrationTaskStateResult> notifyMigrationTaskStateAsync(NotifyMigrationTaskStateRequest request,
            com.amazonaws.handlers.AsyncHandler<NotifyMigrationTaskStateRequest, NotifyMigrationTaskStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutResourceAttributesResult> putResourceAttributesAsync(PutResourceAttributesRequest request) {

        return putResourceAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourceAttributesResult> putResourceAttributesAsync(PutResourceAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<PutResourceAttributesRequest, PutResourceAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
