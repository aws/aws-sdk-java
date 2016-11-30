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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonLightsail}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonLightsail implements AmazonLightsail {

    protected AbstractAmazonLightsail() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CloseInstancePublicPortsResult closeInstancePublicPorts(CloseInstancePublicPortsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstanceSnapshotResult createInstanceSnapshot(CreateInstanceSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstancesResult createInstances(CreateInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstancesFromSnapshotResult createInstancesFromSnapshot(CreateInstancesFromSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteInstanceSnapshotResult deleteInstanceSnapshot(DeleteInstanceSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetachStaticIpResult detachStaticIp(DetachStaticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DownloadDefaultKeyPairResult downloadDefaultKeyPair(DownloadDefaultKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetActiveNamesResult getActiveNames(GetActiveNamesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBlueprintsResult getBlueprints(GetBlueprintsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBundlesResult getBundles(GetBundlesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDomainResult getDomain(GetDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDomainsResult getDomains(GetDomainsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceResult getInstance(GetInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceMetricDataResult getInstanceMetricData(GetInstanceMetricDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstancePortStatesResult getInstancePortStates(GetInstancePortStatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceSnapshotResult getInstanceSnapshot(GetInstanceSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceSnapshotsResult getInstanceSnapshots(GetInstanceSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceStateResult getInstanceState(GetInstanceStateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstancesResult getInstances(GetInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetKeyPairResult getKeyPair(GetKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetKeyPairsResult getKeyPairs(GetKeyPairsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOperationsResult getOperations(GetOperationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOperationsForResourceResult getOperationsForResource(GetOperationsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRegionsResult getRegions(GetRegionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStaticIpResult getStaticIp(GetStaticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStaticIpsResult getStaticIps(GetStaticIpsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public OpenInstancePublicPortsResult openInstancePublicPorts(OpenInstancePublicPortsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PeerVpcResult peerVpc(PeerVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RebootInstanceResult rebootInstance(RebootInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartInstanceResult startInstance(StartInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopInstanceResult stopInstance(StopInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnpeerVpcResult unpeerVpc(UnpeerVpcRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDomainEntryResult updateDomainEntry(UpdateDomainEntryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
