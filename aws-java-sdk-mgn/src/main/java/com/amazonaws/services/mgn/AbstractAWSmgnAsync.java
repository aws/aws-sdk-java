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
package com.amazonaws.services.mgn;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;

/**
 * Abstract implementation of {@code AWSmgnAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSmgnAsync extends AbstractAWSmgn implements AWSmgnAsync {

    protected AbstractAWSmgnAsync() {
    }

    @Override
    public java.util.concurrent.Future<ArchiveApplicationResult> archiveApplicationAsync(ArchiveApplicationRequest request) {

        return archiveApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ArchiveApplicationResult> archiveApplicationAsync(ArchiveApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<ArchiveApplicationRequest, ArchiveApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ArchiveWaveResult> archiveWaveAsync(ArchiveWaveRequest request) {

        return archiveWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ArchiveWaveResult> archiveWaveAsync(ArchiveWaveRequest request,
            com.amazonaws.handlers.AsyncHandler<ArchiveWaveRequest, ArchiveWaveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateApplicationsResult> associateApplicationsAsync(AssociateApplicationsRequest request) {

        return associateApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateApplicationsResult> associateApplicationsAsync(AssociateApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateApplicationsRequest, AssociateApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateSourceServersResult> associateSourceServersAsync(AssociateSourceServersRequest request) {

        return associateSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSourceServersResult> associateSourceServersAsync(AssociateSourceServersRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateSourceServersRequest, AssociateSourceServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(ChangeServerLifeCycleStateRequest request) {

        return changeServerLifeCycleStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(ChangeServerLifeCycleStateRequest request,
            com.amazonaws.handlers.AsyncHandler<ChangeServerLifeCycleStateRequest, ChangeServerLifeCycleStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchConfigurationTemplateResult> createLaunchConfigurationTemplateAsync(
            CreateLaunchConfigurationTemplateRequest request) {

        return createLaunchConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchConfigurationTemplateResult> createLaunchConfigurationTemplateAsync(
            CreateLaunchConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationTemplateRequest, CreateLaunchConfigurationTemplateResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateWaveResult> createWaveAsync(CreateWaveRequest request) {

        return createWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWaveResult> createWaveAsync(CreateWaveRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWaveRequest, CreateWaveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteLaunchConfigurationTemplateResult> deleteLaunchConfigurationTemplateAsync(
            DeleteLaunchConfigurationTemplateRequest request) {

        return deleteLaunchConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchConfigurationTemplateResult> deleteLaunchConfigurationTemplateAsync(
            DeleteLaunchConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationTemplateRequest, DeleteLaunchConfigurationTemplateResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteVcenterClientResult> deleteVcenterClientAsync(DeleteVcenterClientRequest request) {

        return deleteVcenterClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVcenterClientResult> deleteVcenterClientAsync(DeleteVcenterClientRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVcenterClientRequest, DeleteVcenterClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWaveResult> deleteWaveAsync(DeleteWaveRequest request) {

        return deleteWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWaveResult> deleteWaveAsync(DeleteWaveRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWaveRequest, DeleteWaveResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeLaunchConfigurationTemplatesResult> describeLaunchConfigurationTemplatesAsync(
            DescribeLaunchConfigurationTemplatesRequest request) {

        return describeLaunchConfigurationTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationTemplatesResult> describeLaunchConfigurationTemplatesAsync(
            DescribeLaunchConfigurationTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationTemplatesRequest, DescribeLaunchConfigurationTemplatesResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeVcenterClientsResult> describeVcenterClientsAsync(DescribeVcenterClientsRequest request) {

        return describeVcenterClientsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVcenterClientsResult> describeVcenterClientsAsync(DescribeVcenterClientsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVcenterClientsRequest, DescribeVcenterClientsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateApplicationsResult> disassociateApplicationsAsync(DisassociateApplicationsRequest request) {

        return disassociateApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateApplicationsResult> disassociateApplicationsAsync(DisassociateApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateApplicationsRequest, DisassociateApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateSourceServersResult> disassociateSourceServersAsync(DisassociateSourceServersRequest request) {

        return disassociateSourceServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSourceServersResult> disassociateSourceServersAsync(DisassociateSourceServersRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateSourceServersRequest, DisassociateSourceServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(DisconnectFromServiceRequest request) {

        return disconnectFromServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(DisconnectFromServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectFromServiceRequest, DisconnectFromServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(FinalizeCutoverRequest request) {

        return finalizeCutoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(FinalizeCutoverRequest request,
            com.amazonaws.handlers.AsyncHandler<FinalizeCutoverRequest, FinalizeCutoverResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSourceServerActionsResult> listSourceServerActionsAsync(ListSourceServerActionsRequest request) {

        return listSourceServerActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSourceServerActionsResult> listSourceServerActionsAsync(ListSourceServerActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSourceServerActionsRequest, ListSourceServerActionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTemplateActionsResult> listTemplateActionsAsync(ListTemplateActionsRequest request) {

        return listTemplateActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateActionsResult> listTemplateActionsAsync(ListTemplateActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTemplateActionsRequest, ListTemplateActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWavesResult> listWavesAsync(ListWavesRequest request) {

        return listWavesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWavesResult> listWavesAsync(ListWavesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWavesRequest, ListWavesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(MarkAsArchivedRequest request) {

        return markAsArchivedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(MarkAsArchivedRequest request,
            com.amazonaws.handlers.AsyncHandler<MarkAsArchivedRequest, MarkAsArchivedResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutSourceServerActionResult> putSourceServerActionAsync(PutSourceServerActionRequest request) {

        return putSourceServerActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSourceServerActionResult> putSourceServerActionAsync(PutSourceServerActionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSourceServerActionRequest, PutSourceServerActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTemplateActionResult> putTemplateActionAsync(PutTemplateActionRequest request) {

        return putTemplateActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTemplateActionResult> putTemplateActionAsync(PutTemplateActionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTemplateActionRequest, PutTemplateActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveSourceServerActionResult> removeSourceServerActionAsync(RemoveSourceServerActionRequest request) {

        return removeSourceServerActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveSourceServerActionResult> removeSourceServerActionAsync(RemoveSourceServerActionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveSourceServerActionRequest, RemoveSourceServerActionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTemplateActionResult> removeTemplateActionAsync(RemoveTemplateActionRequest request) {

        return removeTemplateActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTemplateActionResult> removeTemplateActionAsync(RemoveTemplateActionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTemplateActionRequest, RemoveTemplateActionResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(StartCutoverRequest request) {

        return startCutoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(StartCutoverRequest request,
            com.amazonaws.handlers.AsyncHandler<StartCutoverRequest, StartCutoverResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartTestResult> startTestAsync(StartTestRequest request) {

        return startTestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTestResult> startTestAsync(StartTestRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTestRequest, StartTestResult> asyncHandler) {

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
    public java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(TerminateTargetInstancesRequest request) {

        return terminateTargetInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(TerminateTargetInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateTargetInstancesRequest, TerminateTargetInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnarchiveApplicationResult> unarchiveApplicationAsync(UnarchiveApplicationRequest request) {

        return unarchiveApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnarchiveApplicationResult> unarchiveApplicationAsync(UnarchiveApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UnarchiveApplicationRequest, UnarchiveApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnarchiveWaveResult> unarchiveWaveAsync(UnarchiveWaveRequest request) {

        return unarchiveWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnarchiveWaveResult> unarchiveWaveAsync(UnarchiveWaveRequest request,
            com.amazonaws.handlers.AsyncHandler<UnarchiveWaveRequest, UnarchiveWaveResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateLaunchConfigurationTemplateResult> updateLaunchConfigurationTemplateAsync(
            UpdateLaunchConfigurationTemplateRequest request) {

        return updateLaunchConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchConfigurationTemplateResult> updateLaunchConfigurationTemplateAsync(
            UpdateLaunchConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationTemplateRequest, UpdateLaunchConfigurationTemplateResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<UpdateSourceServerReplicationTypeResult> updateSourceServerReplicationTypeAsync(
            UpdateSourceServerReplicationTypeRequest request) {

        return updateSourceServerReplicationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSourceServerReplicationTypeResult> updateSourceServerReplicationTypeAsync(
            UpdateSourceServerReplicationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSourceServerReplicationTypeRequest, UpdateSourceServerReplicationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWaveResult> updateWaveAsync(UpdateWaveRequest request) {

        return updateWaveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWaveResult> updateWaveAsync(UpdateWaveRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWaveRequest, UpdateWaveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
