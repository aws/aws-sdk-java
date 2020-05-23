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
package com.amazonaws.services.storagegateway;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSStorageGateway}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSStorageGateway implements AWSStorageGateway {

    protected AbstractAWSStorageGateway() {
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
    public ActivateGatewayResult activateGateway(ActivateGatewayRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddCacheResult addCache(AddCacheRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddUploadBufferResult addUploadBuffer(AddUploadBufferRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddWorkingStorageResult addWorkingStorage(AddWorkingStorageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AssignTapePoolResult assignTapePool(AssignTapePoolRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AttachVolumeResult attachVolume(AttachVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CancelArchivalResult cancelArchival(CancelArchivalRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CancelRetrievalResult cancelRetrieval(CancelRetrievalRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateCachediSCSIVolumeResult createCachediSCSIVolume(CreateCachediSCSIVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateNFSFileShareResult createNFSFileShare(CreateNFSFileShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateSMBFileShareResult createSMBFileShare(CreateSMBFileShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(CreateSnapshotFromVolumeRecoveryPointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateStorediSCSIVolumeResult createStorediSCSIVolume(CreateStorediSCSIVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTapeWithBarcodeResult createTapeWithBarcode(CreateTapeWithBarcodeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTapesResult createTapes(CreateTapesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteAutomaticTapeCreationPolicyResult deleteAutomaticTapeCreationPolicy(DeleteAutomaticTapeCreationPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteChapCredentialsResult deleteChapCredentials(DeleteChapCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteFileShareResult deleteFileShare(DeleteFileShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteTapeResult deleteTape(DeleteTapeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteTapeArchiveResult deleteTapeArchive(DeleteTapeArchiveRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAvailabilityMonitorTestResult describeAvailabilityMonitorTest(DescribeAvailabilityMonitorTestRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeBandwidthRateLimitResult describeBandwidthRateLimit(DescribeBandwidthRateLimitRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCacheResult describeCache(DescribeCacheRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeChapCredentialsResult describeChapCredentials(DescribeChapCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeGatewayInformationResult describeGatewayInformation(DescribeGatewayInformationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(DescribeMaintenanceStartTimeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeNFSFileSharesResult describeNFSFileShares(DescribeNFSFileSharesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeSMBFileSharesResult describeSMBFileShares(DescribeSMBFileSharesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeSMBSettingsResult describeSMBSettings(DescribeSMBSettingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotScheduleResult describeSnapshotSchedule(DescribeSnapshotScheduleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(DescribeStorediSCSIVolumesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTapeArchivesResult describeTapeArchives(DescribeTapeArchivesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTapeArchivesResult describeTapeArchives() {
        return describeTapeArchives(new DescribeTapeArchivesRequest());
    }

    @Override
    public DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(DescribeTapeRecoveryPointsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeTapesResult describeTapes(DescribeTapesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeUploadBufferResult describeUploadBuffer(DescribeUploadBufferRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeVTLDevicesResult describeVTLDevices(DescribeVTLDevicesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeWorkingStorageResult describeWorkingStorage(DescribeWorkingStorageRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DetachVolumeResult detachVolume(DetachVolumeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DisableGatewayResult disableGateway(DisableGatewayRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public JoinDomainResult joinDomain(JoinDomainRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListAutomaticTapeCreationPoliciesResult listAutomaticTapeCreationPolicies(ListAutomaticTapeCreationPoliciesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListFileSharesResult listFileShares(ListFileSharesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListGatewaysResult listGateways() {
        return listGateways(new ListGatewaysRequest());
    }

    @Override
    public ListLocalDisksResult listLocalDisks(ListLocalDisksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource() {
        return listTagsForResource(new ListTagsForResourceRequest());
    }

    @Override
    public ListTapesResult listTapes(ListTapesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListVolumeInitiatorsResult listVolumeInitiators(ListVolumeInitiatorsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(ListVolumeRecoveryPointsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListVolumesResult listVolumes(ListVolumesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NotifyWhenUploadedResult notifyWhenUploaded(NotifyWhenUploadedRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RefreshCacheResult refreshCache(RefreshCacheRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource() {
        return removeTagsFromResource(new RemoveTagsFromResourceRequest());
    }

    @Override
    public ResetCacheResult resetCache(ResetCacheRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RetrieveTapeArchiveResult retrieveTapeArchive(RetrieveTapeArchiveRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(RetrieveTapeRecoveryPointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetLocalConsolePasswordResult setLocalConsolePassword(SetLocalConsolePasswordRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SetSMBGuestPasswordResult setSMBGuestPassword(SetSMBGuestPasswordRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartAvailabilityMonitorTestResult startAvailabilityMonitorTest(StartAvailabilityMonitorTestRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartGatewayResult startGateway(StartGatewayRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateAutomaticTapeCreationPolicyResult updateAutomaticTapeCreationPolicy(UpdateAutomaticTapeCreationPolicyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateBandwidthRateLimitResult updateBandwidthRateLimit(UpdateBandwidthRateLimitRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateChapCredentialsResult updateChapCredentials(UpdateChapCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateNFSFileShareResult updateNFSFileShare(UpdateNFSFileShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateSMBFileShareResult updateSMBFileShare(UpdateSMBFileShareRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateSMBSecurityStrategyResult updateSMBSecurityStrategy(UpdateSMBSecurityStrategyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateSnapshotScheduleResult updateSnapshotSchedule(UpdateSnapshotScheduleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateVTLDeviceTypeResult updateVTLDeviceType(UpdateVTLDeviceTypeRequest request) {
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
