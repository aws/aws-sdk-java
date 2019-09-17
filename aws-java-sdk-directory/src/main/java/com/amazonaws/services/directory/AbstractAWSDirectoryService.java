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
package com.amazonaws.services.directory;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSDirectoryService}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSDirectoryService implements AWSDirectoryService {

    protected AbstractAWSDirectoryService() {
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
    public AcceptSharedDirectoryResult acceptSharedDirectory(AcceptSharedDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddIpRoutesResult addIpRoutes(AddIpRoutesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelSchemaExtensionResult cancelSchemaExtension(CancelSchemaExtensionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ConnectDirectoryResult connectDirectory(ConnectDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateComputerResult createComputer(CreateComputerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateConditionalForwarderResult createConditionalForwarder(CreateConditionalForwarderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDirectoryResult createDirectory(CreateDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLogSubscriptionResult createLogSubscription(CreateLogSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateMicrosoftADResult createMicrosoftAD(CreateMicrosoftADRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTrustResult createTrust(CreateTrustRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConditionalForwarderResult deleteConditionalForwarder(DeleteConditionalForwarderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLogSubscriptionResult deleteLogSubscription(DeleteLogSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTrustResult deleteTrust(DeleteTrustRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterEventTopicResult deregisterEventTopic(DeregisterEventTopicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConditionalForwardersResult describeConditionalForwarders(DescribeConditionalForwardersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDirectoriesResult describeDirectories(DescribeDirectoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDirectoriesResult describeDirectories() {
        return describeDirectories(new DescribeDirectoriesRequest());
    }

    @Override
    public DescribeDomainControllersResult describeDomainControllers(DescribeDomainControllersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventTopicsResult describeEventTopics(DescribeEventTopicsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSharedDirectoriesResult describeSharedDirectories(DescribeSharedDirectoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    @Override
    public DescribeTrustsResult describeTrusts(DescribeTrustsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableRadiusResult disableRadius(DisableRadiusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisableSsoResult disableSso(DisableSsoRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableRadiusResult enableRadius(EnableRadiusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableSsoResult enableSso(EnableSsoRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDirectoryLimitsResult getDirectoryLimits(GetDirectoryLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDirectoryLimitsResult getDirectoryLimits() {
        return getDirectoryLimits(new GetDirectoryLimitsRequest());
    }

    @Override
    public GetSnapshotLimitsResult getSnapshotLimits(GetSnapshotLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIpRoutesResult listIpRoutes(ListIpRoutesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLogSubscriptionsResult listLogSubscriptions(ListLogSubscriptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSchemaExtensionsResult listSchemaExtensions(ListSchemaExtensionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterEventTopicResult registerEventTopic(RegisterEventTopicRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RejectSharedDirectoryResult rejectSharedDirectory(RejectSharedDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveIpRoutesResult removeIpRoutes(RemoveIpRoutesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetUserPasswordResult resetUserPassword(ResetUserPasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ShareDirectoryResult shareDirectory(ShareDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartSchemaExtensionResult startSchemaExtension(StartSchemaExtensionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnshareDirectoryResult unshareDirectory(UnshareDirectoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateConditionalForwarderResult updateConditionalForwarder(UpdateConditionalForwarderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateNumberOfDomainControllersResult updateNumberOfDomainControllers(UpdateNumberOfDomainControllersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRadiusResult updateRadius(UpdateRadiusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateTrustResult updateTrust(UpdateTrustRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public VerifyTrustResult verifyTrust(VerifyTrustRequest request) {
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
