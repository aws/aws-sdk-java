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
package com.amazonaws.services.redshift;

import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.*;
import com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters;

/**
 * Abstract implementation of {@code AmazonRedshift}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRedshift implements AmazonRedshift {

    protected AbstractAmazonRedshift() {
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
    public ReservedNode acceptReservedNodeExchange(AcceptReservedNodeExchangeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClusterSecurityGroup authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchDeleteClusterSnapshotsResult batchDeleteClusterSnapshots(BatchDeleteClusterSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchModifyClusterSnapshotsResult batchModifyClusterSnapshots(BatchModifyClusterSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelResizeResult cancelResize(CancelResizeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot copyClusterSnapshot(CopyClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster createCluster(CreateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClusterSecurityGroup createClusterSecurityGroup(CreateClusterSecurityGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot createClusterSnapshot(CreateClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClusterSubnetGroup createClusterSubnetGroup(CreateClusterSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EventSubscription createEventSubscription(CreateEventSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public HsmClientCertificate createHsmClientCertificate(CreateHsmClientCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public HsmConfiguration createHsmConfiguration(CreateHsmConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SnapshotCopyGrant createSnapshotCopyGrant(CreateSnapshotCopyGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster deleteCluster(DeleteClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterParameterGroupResult deleteClusterParameterGroup(DeleteClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterSecurityGroupResult deleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot deleteClusterSnapshot(DeleteClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEventSubscriptionResult deleteEventSubscription(DeleteEventSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHsmClientCertificateResult deleteHsmClientCertificate(DeleteHsmClientCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSnapshotCopyGrantResult deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterDbRevisionsResult describeClusterDbRevisions(DescribeClusterDbRevisionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups(DescribeClusterParameterGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups() {
        return describeClusterParameterGroups(new DescribeClusterParameterGroupsRequest());
    }

    @Override
    public DescribeClusterParametersResult describeClusterParameters(DescribeClusterParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups() {
        return describeClusterSecurityGroups(new DescribeClusterSecurityGroupsRequest());
    }

    @Override
    public DescribeClusterSnapshotsResult describeClusterSnapshots(DescribeClusterSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterSnapshotsResult describeClusterSnapshots() {
        return describeClusterSnapshots(new DescribeClusterSnapshotsRequest());
    }

    @Override
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups() {
        return describeClusterSubnetGroups(new DescribeClusterSubnetGroupsRequest());
    }

    @Override
    public DescribeClusterTracksResult describeClusterTracks(DescribeClusterTracksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterVersionsResult describeClusterVersions(DescribeClusterVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClusterVersionsResult describeClusterVersions() {
        return describeClusterVersions(new DescribeClusterVersionsRequest());
    }

    @Override
    public DescribeClustersResult describeClusters(DescribeClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClustersResult describeClusters() {
        return describeClusters(new DescribeClustersRequest());
    }

    @Override
    public DefaultClusterParameters describeDefaultClusterParameters(DescribeDefaultClusterParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventCategoriesResult describeEventCategories() {
        return describeEventCategories(new DescribeEventCategoriesRequest());
    }

    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions() {
        return describeEventSubscriptions(new DescribeEventSubscriptionsRequest());
    }

    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    @Override
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates(DescribeHsmClientCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates() {
        return describeHsmClientCertificates(new DescribeHsmClientCertificatesRequest());
    }

    @Override
    public DescribeHsmConfigurationsResult describeHsmConfigurations(DescribeHsmConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHsmConfigurationsResult describeHsmConfigurations() {
        return describeHsmConfigurations(new DescribeHsmConfigurationsRequest());
    }

    @Override
    public DescribeLoggingStatusResult describeLoggingStatus(DescribeLoggingStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions() {
        return describeOrderableClusterOptions(new DescribeOrderableClusterOptionsRequest());
    }

    @Override
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings() {
        return describeReservedNodeOfferings(new DescribeReservedNodeOfferingsRequest());
    }

    @Override
    public DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedNodesResult describeReservedNodes() {
        return describeReservedNodes(new DescribeReservedNodesRequest());
    }

    @Override
    public DescribeResizeResult describeResize(DescribeResizeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants() {
        return describeSnapshotCopyGrants(new DescribeSnapshotCopyGrantsRequest());
    }

    @Override
    public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStorageResult describeStorage(DescribeStorageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTableRestoreStatusResult describeTableRestoreStatus(DescribeTableRestoreStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTableRestoreStatusResult describeTableRestoreStatus() {
        return describeTableRestoreStatus(new DescribeTableRestoreStatusRequest());
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags() {
        return describeTags(new DescribeTagsRequest());
    }

    @Override
    public DisableLoggingResult disableLogging(DisableLoggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster disableSnapshotCopy(DisableSnapshotCopyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EnableLoggingResult enableLogging(EnableLoggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster enableSnapshotCopy(EnableSnapshotCopyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetClusterCredentialsResult getClusterCredentials(GetClusterCredentialsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetReservedNodeExchangeOfferingsResult getReservedNodeExchangeOfferings(GetReservedNodeExchangeOfferingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster modifyCluster(ModifyClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster modifyClusterDbRevision(ModifyClusterDbRevisionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster modifyClusterIamRoles(ModifyClusterIamRolesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster modifyClusterMaintenance(ModifyClusterMaintenanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyClusterParameterGroupResult modifyClusterParameterGroup(ModifyClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot modifyClusterSnapshot(ModifyClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyClusterSnapshotScheduleResult modifyClusterSnapshotSchedule(ModifyClusterSnapshotScheduleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClusterSubnetGroup modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifySnapshotScheduleResult modifySnapshotSchedule(ModifySnapshotScheduleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReservedNode purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster rebootCluster(RebootClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetClusterParameterGroupResult resetClusterParameterGroup(ResetClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster resizeCluster(ResizeClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TableRestoreStatus restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ClusterSecurityGroup revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot revokeSnapshotAccess(RevokeSnapshotAccessRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Cluster rotateEncryptionKey(RotateEncryptionKeyRequest request) {
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

    @Override
    public AmazonRedshiftWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
