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
package com.amazonaws.services.drs;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;

/**
 * Abstract implementation of {@code AWSdrsAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSdrsAsync extends AbstractAWSdrs implements AWSdrsAsync {

    protected AbstractAWSdrsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateExtendedSourceServerResult> createExtendedSourceServerAsync(CreateExtendedSourceServerRequest request) {

        return createExtendedSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExtendedSourceServerResult> createExtendedSourceServerAsync(CreateExtendedSourceServerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateExtendedSourceServerRequest, CreateExtendedSourceServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest request) {

        return createReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigurationTemplateRequest, CreateReplicationConfigurationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest request) {

        return deleteJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryInstanceResult> deleteRecoveryInstanceAsync(DeleteRecoveryInstanceRequest request) {

        return deleteRecoveryInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecoveryInstanceResult> deleteRecoveryInstanceAsync(DeleteRecoveryInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRecoveryInstanceRequest, DeleteRecoveryInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest request) {

        return deleteReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigurationTemplateRequest, DeleteReplicationConfigurationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest request) {

        return deleteSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSourceServerRequest, DeleteSourceServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest request) {

        return describeJobLogItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobLogItemsRequest, DescribeJobLogItemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request) {

        return describeJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoveryInstancesResult> describeRecoveryInstancesAsync(DescribeRecoveryInstancesRequest request) {

        return describeRecoveryInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoveryInstancesResult> describeRecoveryInstancesAsync(DescribeRecoveryInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecoveryInstancesRequest, DescribeRecoveryInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoverySnapshotsResult> describeRecoverySnapshotsAsync(DescribeRecoverySnapshotsRequest request) {

        return describeRecoverySnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecoverySnapshotsResult> describeRecoverySnapshotsAsync(DescribeRecoverySnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecoverySnapshotsRequest, DescribeRecoverySnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest request) {

        return describeReplicationConfigurationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigurationTemplatesRequest, DescribeReplicationConfigurationTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest request) {

        return describeSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSourceServersRequest, DescribeSourceServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectRecoveryInstanceResult> disconnectRecoveryInstanceAsync(DisconnectRecoveryInstanceRequest request) {

        return disconnectRecoveryInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectRecoveryInstanceResult> disconnectRecoveryInstanceAsync(DisconnectRecoveryInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectRecoveryInstanceRequest, DisconnectRecoveryInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectSourceServerResult> disconnectSourceServerAsync(DisconnectSourceServerRequest request) {

        return disconnectSourceServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectSourceServerResult> disconnectSourceServerAsync(DisconnectSourceServerRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectSourceServerRequest, DisconnectSourceServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFailbackReplicationConfigurationResult> getFailbackReplicationConfigurationAsync(
            GetFailbackReplicationConfigurationRequest request) {

        return getFailbackReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFailbackReplicationConfigurationResult> getFailbackReplicationConfigurationAsync(
            GetFailbackReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFailbackReplicationConfigurationRequest, GetFailbackReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest request) {

        return getLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLaunchConfigurationRequest, GetLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(GetReplicationConfigurationRequest request) {

        return getReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(GetReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetReplicationConfigurationRequest, GetReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest request) {

        return initializeServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<InitializeServiceRequest, InitializeServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListExtensibleSourceServersResult> listExtensibleSourceServersAsync(ListExtensibleSourceServersRequest request) {

        return listExtensibleSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExtensibleSourceServersResult> listExtensibleSourceServersAsync(ListExtensibleSourceServersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListExtensibleSourceServersRequest, ListExtensibleSourceServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStagingAccountsResult> listStagingAccountsAsync(ListStagingAccountsRequest request) {

        return listStagingAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStagingAccountsResult> listStagingAccountsAsync(ListStagingAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStagingAccountsRequest, ListStagingAccountsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest request) {

        return retryDataReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<RetryDataReplicationRequest, RetryDataReplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReverseReplicationResult> reverseReplicationAsync(ReverseReplicationRequest request) {

        return reverseReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReverseReplicationResult> reverseReplicationAsync(ReverseReplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<ReverseReplicationRequest, ReverseReplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartFailbackLaunchResult> startFailbackLaunchAsync(StartFailbackLaunchRequest request) {

        return startFailbackLaunchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFailbackLaunchResult> startFailbackLaunchAsync(StartFailbackLaunchRequest request,
            com.amazonaws.handlers.AsyncHandler<StartFailbackLaunchRequest, StartFailbackLaunchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartRecoveryResult> startRecoveryAsync(StartRecoveryRequest request) {

        return startRecoveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRecoveryResult> startRecoveryAsync(StartRecoveryRequest request,
            com.amazonaws.handlers.AsyncHandler<StartRecoveryRequest, StartRecoveryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest request) {

        return startReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReplicationRequest, StartReplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopFailbackResult> stopFailbackAsync(StopFailbackRequest request) {

        return stopFailbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFailbackResult> stopFailbackAsync(StopFailbackRequest request,
            com.amazonaws.handlers.AsyncHandler<StopFailbackRequest, StopFailbackResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(StopReplicationRequest request) {

        return stopReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(StopReplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<StopReplicationRequest, StopReplicationResult> asyncHandler) {

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
    public java.util.concurrent.Future<TerminateRecoveryInstancesResult> terminateRecoveryInstancesAsync(TerminateRecoveryInstancesRequest request) {

        return terminateRecoveryInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateRecoveryInstancesResult> terminateRecoveryInstancesAsync(TerminateRecoveryInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateRecoveryInstancesRequest, TerminateRecoveryInstancesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateFailbackReplicationConfigurationResult> updateFailbackReplicationConfigurationAsync(
            UpdateFailbackReplicationConfigurationRequest request) {

        return updateFailbackReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFailbackReplicationConfigurationResult> updateFailbackReplicationConfigurationAsync(
            UpdateFailbackReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFailbackReplicationConfigurationRequest, UpdateFailbackReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(UpdateLaunchConfigurationRequest request) {

        return updateLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(UpdateLaunchConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationRequest, UpdateLaunchConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(UpdateReplicationConfigurationRequest request) {

        return updateReplicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(UpdateReplicationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationRequest, UpdateReplicationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest request) {

        return updateReplicationConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationTemplateRequest, UpdateReplicationConfigurationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
