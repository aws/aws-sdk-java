/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail;

import com.amazonaws.services.lightsail.model.*;

/**
 * Abstract implementation of {@code AmazonLightsailAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonLightsailAsync extends AbstractAmazonLightsail implements AmazonLightsailAsync {

    protected AbstractAmazonLightsailAsync() {
    }

    @Override
    public java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest request) {

        return allocateStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<AllocateStaticIpRequest, AllocateStaticIpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest request) {

        return attachStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachStaticIpRequest, AttachStaticIpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest request) {

        return closeInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest request,
            com.amazonaws.handlers.AsyncHandler<CloseInstancePublicPortsRequest, CloseInstancePublicPortsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest request) {

        return createDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDomainEntryRequest, CreateDomainEntryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest request) {

        return createInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceSnapshotRequest, CreateInstanceSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest request) {

        return createInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesRequest, CreateInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(CreateInstancesFromSnapshotRequest request) {

        return createInstancesFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(CreateInstancesFromSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesFromSnapshotRequest, CreateInstancesFromSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request) {

        return createKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest request) {

        return deleteDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainEntryRequest, DeleteDomainEntryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest request) {

        return deleteInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceSnapshotRequest, DeleteInstanceSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request) {

        return deleteKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest request) {

        return detachStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachStaticIpRequest, DetachStaticIpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest request) {

        return downloadDefaultKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<DownloadDefaultKeyPairRequest, DownloadDefaultKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest request) {

        return getActiveNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetActiveNamesRequest, GetActiveNamesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest request) {

        return getBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBlueprintsRequest, GetBlueprintsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest request) {

        return getBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBundlesRequest, GetBundlesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request) {

        return getDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest request) {

        return getDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDomainsRequest, GetDomainsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request) {

        return getInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest request) {

        return getInstanceAccessDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceAccessDetailsRequest, GetInstanceAccessDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest request) {

        return getInstanceMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceMetricDataRequest, GetInstanceMetricDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest request) {

        return getInstancePortStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstancePortStatesRequest, GetInstancePortStatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest request) {

        return getInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotRequest, GetInstanceSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest request) {

        return getInstanceSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotsRequest, GetInstanceSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest request) {

        return getInstanceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceStateRequest, GetInstanceStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest request) {

        return getInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstancesRequest, GetInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest request) {

        return getKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairRequest, GetKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest request) {

        return getKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairsRequest, GetKeyPairsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request) {

        return getOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest request) {

        return getOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOperationsRequest, GetOperationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest request) {

        return getOperationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOperationsForResourceRequest, GetOperationsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest request) {

        return getRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRegionsRequest, GetRegionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest request) {

        return getStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpRequest, GetStaticIpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest request) {

        return getStaticIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpsRequest, GetStaticIpsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request) {

        return importKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest request) {

        return isVpcPeeredAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest request,
            com.amazonaws.handlers.AsyncHandler<IsVpcPeeredRequest, IsVpcPeeredResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest request) {

        return openInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest request,
            com.amazonaws.handlers.AsyncHandler<OpenInstancePublicPortsRequest, OpenInstancePublicPortsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest request) {

        return peerVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<PeerVpcRequest, PeerVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest request) {

        return rebootInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest request) {

        return releaseStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest request,
            com.amazonaws.handlers.AsyncHandler<ReleaseStaticIpRequest, ReleaseStaticIpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest request) {

        return startInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest request) {

        return stopInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest request) {

        return unpeerVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest request,
            com.amazonaws.handlers.AsyncHandler<UnpeerVpcRequest, UnpeerVpcResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest request) {

        return updateDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainEntryRequest, UpdateDomainEntryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
