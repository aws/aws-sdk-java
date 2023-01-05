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
package com.amazonaws.services.backupgateway;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;

/**
 * Abstract implementation of {@code AWSBackupGatewayAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBackupGatewayAsync extends AbstractAWSBackupGateway implements AWSBackupGatewayAsync {

    protected AbstractAWSBackupGatewayAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateGatewayToServerResult> associateGatewayToServerAsync(AssociateGatewayToServerRequest request) {

        return associateGatewayToServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateGatewayToServerResult> associateGatewayToServerAsync(AssociateGatewayToServerRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateGatewayToServerRequest, AssociateGatewayToServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest request) {

        return createGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGatewayRequest, CreateGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request) {

        return deleteGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHypervisorResult> deleteHypervisorAsync(DeleteHypervisorRequest request) {

        return deleteHypervisorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHypervisorResult> deleteHypervisorAsync(DeleteHypervisorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHypervisorRequest, DeleteHypervisorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateGatewayFromServerResult> disassociateGatewayFromServerAsync(DisassociateGatewayFromServerRequest request) {

        return disassociateGatewayFromServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateGatewayFromServerResult> disassociateGatewayFromServerAsync(DisassociateGatewayFromServerRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateGatewayFromServerRequest, DisassociateGatewayFromServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBandwidthRateLimitScheduleResult> getBandwidthRateLimitScheduleAsync(GetBandwidthRateLimitScheduleRequest request) {

        return getBandwidthRateLimitScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBandwidthRateLimitScheduleResult> getBandwidthRateLimitScheduleAsync(GetBandwidthRateLimitScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBandwidthRateLimitScheduleRequest, GetBandwidthRateLimitScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest request) {

        return getGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGatewayRequest, GetGatewayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorResult> getHypervisorAsync(GetHypervisorRequest request) {

        return getHypervisorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorResult> getHypervisorAsync(GetHypervisorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHypervisorRequest, GetHypervisorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorPropertyMappingsResult> getHypervisorPropertyMappingsAsync(GetHypervisorPropertyMappingsRequest request) {

        return getHypervisorPropertyMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHypervisorPropertyMappingsResult> getHypervisorPropertyMappingsAsync(GetHypervisorPropertyMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHypervisorPropertyMappingsRequest, GetHypervisorPropertyMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVirtualMachineResult> getVirtualMachineAsync(GetVirtualMachineRequest request) {

        return getVirtualMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVirtualMachineResult> getVirtualMachineAsync(GetVirtualMachineRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVirtualMachineRequest, GetVirtualMachineResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportHypervisorConfigurationResult> importHypervisorConfigurationAsync(ImportHypervisorConfigurationRequest request) {

        return importHypervisorConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportHypervisorConfigurationResult> importHypervisorConfigurationAsync(ImportHypervisorConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportHypervisorConfigurationRequest, ImportHypervisorConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHypervisorsResult> listHypervisorsAsync(ListHypervisorsRequest request) {

        return listHypervisorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHypervisorsResult> listHypervisorsAsync(ListHypervisorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHypervisorsRequest, ListHypervisorsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListVirtualMachinesResult> listVirtualMachinesAsync(ListVirtualMachinesRequest request) {

        return listVirtualMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualMachinesResult> listVirtualMachinesAsync(ListVirtualMachinesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVirtualMachinesRequest, ListVirtualMachinesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutBandwidthRateLimitScheduleResult> putBandwidthRateLimitScheduleAsync(PutBandwidthRateLimitScheduleRequest request) {

        return putBandwidthRateLimitScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBandwidthRateLimitScheduleResult> putBandwidthRateLimitScheduleAsync(PutBandwidthRateLimitScheduleRequest request,
            com.amazonaws.handlers.AsyncHandler<PutBandwidthRateLimitScheduleRequest, PutBandwidthRateLimitScheduleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutHypervisorPropertyMappingsResult> putHypervisorPropertyMappingsAsync(PutHypervisorPropertyMappingsRequest request) {

        return putHypervisorPropertyMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutHypervisorPropertyMappingsResult> putHypervisorPropertyMappingsAsync(PutHypervisorPropertyMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutHypervisorPropertyMappingsRequest, PutHypervisorPropertyMappingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutMaintenanceStartTimeResult> putMaintenanceStartTimeAsync(PutMaintenanceStartTimeRequest request) {

        return putMaintenanceStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMaintenanceStartTimeResult> putMaintenanceStartTimeAsync(PutMaintenanceStartTimeRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMaintenanceStartTimeRequest, PutMaintenanceStartTimeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartVirtualMachinesMetadataSyncResult> startVirtualMachinesMetadataSyncAsync(
            StartVirtualMachinesMetadataSyncRequest request) {

        return startVirtualMachinesMetadataSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartVirtualMachinesMetadataSyncResult> startVirtualMachinesMetadataSyncAsync(
            StartVirtualMachinesMetadataSyncRequest request,
            com.amazonaws.handlers.AsyncHandler<StartVirtualMachinesMetadataSyncRequest, StartVirtualMachinesMetadataSyncResult> asyncHandler) {

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
    public java.util.concurrent.Future<TestHypervisorConfigurationResult> testHypervisorConfigurationAsync(TestHypervisorConfigurationRequest request) {

        return testHypervisorConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestHypervisorConfigurationResult> testHypervisorConfigurationAsync(TestHypervisorConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<TestHypervisorConfigurationRequest, TestHypervisorConfigurationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest request) {

        return updateGatewayInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest request) {

        return updateGatewaySoftwareNowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateHypervisorResult> updateHypervisorAsync(UpdateHypervisorRequest request) {

        return updateHypervisorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHypervisorResult> updateHypervisorAsync(UpdateHypervisorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateHypervisorRequest, UpdateHypervisorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
