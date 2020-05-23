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
package com.amazonaws.services.rds;

import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.*;
import com.amazonaws.services.rds.waiters.AmazonRDSWaiters;

/**
 * Abstract implementation of {@code AmazonRDS}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRDS implements AmazonRDS {

    protected AbstractAmazonRDS() {
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
    public AddRoleToDBClusterResult addRoleToDBCluster(AddRoleToDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddRoleToDBInstanceResult addRoleToDBInstance(AddRoleToDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSecurityGroup authorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BacktrackDBClusterResult backtrackDBCluster(BacktrackDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBParameterGroup copyDBParameterGroup(CopyDBParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSnapshot copyDBSnapshot(CopyDBSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public OptionGroup copyOptionGroup(CopyOptionGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CustomAvailabilityZone createCustomAvailabilityZone(CreateCustomAvailabilityZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster createDBCluster(CreateDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateDBClusterEndpointResult createDBClusterEndpoint(CreateDBClusterEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance createDBInstance(CreateDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateDBProxyResult createDBProxy(CreateDBProxyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSecurityGroup createDBSecurityGroup(CreateDBSecurityGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSnapshot createDBSnapshot(CreateDBSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EventSubscription createEventSubscription(CreateEventSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GlobalCluster createGlobalCluster(CreateGlobalClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public OptionGroup createOptionGroup(CreateOptionGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CustomAvailabilityZone deleteCustomAvailabilityZone(DeleteCustomAvailabilityZoneRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster deleteDBCluster(DeleteDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDBClusterEndpointResult deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDBClusterParameterGroupResult deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance deleteDBInstance(DeleteDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstanceAutomatedBackup deleteDBInstanceAutomatedBackup(DeleteDBInstanceAutomatedBackupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDBParameterGroupResult deleteDBParameterGroup(DeleteDBParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDBProxyResult deleteDBProxy(DeleteDBProxyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDBSecurityGroupResult deleteDBSecurityGroup(DeleteDBSecurityGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSnapshot deleteDBSnapshot(DeleteDBSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GlobalCluster deleteGlobalCluster(DeleteGlobalClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteInstallationMediaResult deleteInstallationMedia(DeleteInstallationMediaRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteOptionGroupResult deleteOptionGroup(DeleteOptionGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeregisterDBProxyTargetsResult deregisterDBProxyTargets(DeregisterDBProxyTargetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes() {
        return describeAccountAttributes(new DescribeAccountAttributesRequest());
    }

    @Override
    public DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCertificatesResult describeCertificates() {
        return describeCertificates(new DescribeCertificatesRequest());
    }

    @Override
    public DescribeCustomAvailabilityZonesResult describeCustomAvailabilityZones(DescribeCustomAvailabilityZonesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterBacktracksResult describeDBClusterBacktracks(DescribeDBClusterBacktracksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterEndpointsResult describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups() {
        return describeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
    }

    @Override
    public DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots() {
        return describeDBClusterSnapshots(new DescribeDBClusterSnapshotsRequest());
    }

    @Override
    public DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBClustersResult describeDBClusters() {
        return describeDBClusters(new DescribeDBClustersRequest());
    }

    @Override
    public DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBEngineVersionsResult describeDBEngineVersions() {
        return describeDBEngineVersions(new DescribeDBEngineVersionsRequest());
    }

    @Override
    public DescribeDBInstanceAutomatedBackupsResult describeDBInstanceAutomatedBackups(DescribeDBInstanceAutomatedBackupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBInstancesResult describeDBInstances() {
        return describeDBInstances(new DescribeDBInstancesRequest());
    }

    @Override
    public DescribeDBLogFilesResult describeDBLogFiles(DescribeDBLogFilesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBParameterGroupsResult describeDBParameterGroups() {
        return describeDBParameterGroups(new DescribeDBParameterGroupsRequest());
    }

    @Override
    public DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBProxyTargetGroupsResult describeDBProxyTargetGroups(DescribeDBProxyTargetGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBProxyTargetsResult describeDBProxyTargets(DescribeDBProxyTargetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups(DescribeDBSecurityGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups() {
        return describeDBSecurityGroups(new DescribeDBSecurityGroupsRequest());
    }

    @Override
    public DBSnapshotAttributesResult describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSnapshotAttributesResult describeDBSnapshotAttributes() {
        return describeDBSnapshotAttributes(new DescribeDBSnapshotAttributesRequest());
    }

    @Override
    public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBSnapshotsResult describeDBSnapshots() {
        return describeDBSnapshots(new DescribeDBSnapshotsRequest());
    }

    @Override
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups() {
        return describeDBSubnetGroups(new DescribeDBSubnetGroupsRequest());
    }

    @Override
    public EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeEventCategoriesResult describeEventCategories() {
        return describeEventCategories(new DescribeEventCategoriesRequest());
    }

    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions() {
        return describeEventSubscriptions(new DescribeEventSubscriptionsRequest());
    }

    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeGlobalClustersResult describeGlobalClusters(DescribeGlobalClustersRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeInstallationMediaResult describeInstallationMedia(DescribeInstallationMediaRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOptionGroupOptionsResult describeOptionGroupOptions(DescribeOptionGroupOptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOptionGroupsResult describeOptionGroups(DescribeOptionGroupsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOptionGroupsResult describeOptionGroups() {
        return describeOptionGroups(new DescribeOptionGroupsRequest());
    }

    @Override
    public DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions() {
        return describePendingMaintenanceActions(new DescribePendingMaintenanceActionsRequest());
    }

    @Override
    public DescribeReservedDBInstancesResult describeReservedDBInstances(DescribeReservedDBInstancesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeReservedDBInstancesResult describeReservedDBInstances() {
        return describeReservedDBInstances(new DescribeReservedDBInstancesRequest());
    }

    @Override
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings() {
        return describeReservedDBInstancesOfferings(new DescribeReservedDBInstancesOfferingsRequest());
    }

    @Override
    public DescribeSourceRegionsResult describeSourceRegions(DescribeSourceRegionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValidDBInstanceModificationsMessage describeValidDBInstanceModifications(DescribeValidDBInstanceModificationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DownloadDBLogFilePortionResult downloadDBLogFilePortion(DownloadDBLogFilePortionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster failoverDBCluster(FailoverDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster failoverDBCluster() {
        return failoverDBCluster(new FailoverDBClusterRequest());
    }

    @Override
    public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Certificate modifyCertificates(ModifyCertificatesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyCurrentDBClusterCapacityResult modifyCurrentDBClusterCapacity(ModifyCurrentDBClusterCapacityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster modifyDBCluster(ModifyDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyDBClusterEndpointResult modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance modifyDBInstance(ModifyDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModifyDBProxyTargetGroupResult modifyDBProxyTargetGroup(ModifyDBProxyTargetGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSnapshot modifyDBSnapshot(ModifyDBSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSnapshotAttributesResult modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GlobalCluster modifyGlobalCluster(ModifyGlobalClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public OptionGroup modifyOptionGroup(ModifyOptionGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance promoteReadReplica(PromoteReadReplicaRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ReservedDBInstance purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance rebootDBInstance(RebootDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RegisterDBProxyTargetsResult registerDBProxyTargets(RegisterDBProxyTargetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GlobalCluster removeFromGlobalCluster(RemoveFromGlobalClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveRoleFromDBClusterResult removeRoleFromDBCluster(RemoveRoleFromDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveRoleFromDBInstanceResult removeRoleFromDBInstance(RemoveRoleFromDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster restoreDBClusterFromS3(RestoreDBClusterFromS3Request request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance restoreDBInstanceFromS3(RestoreDBInstanceFromS3Request request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBSecurityGroup revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartActivityStreamResult startActivityStream(StartActivityStreamRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster startDBCluster(StartDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance startDBInstance(StartDBInstanceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StartExportTaskResult startExportTask(StartExportTaskRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StopActivityStreamResult stopActivityStream(StopActivityStreamRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBCluster stopDBCluster(StopDBClusterRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DBInstance stopDBInstance(StopDBInstanceRequest request) {
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

    @Override
    public AmazonRDSWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
