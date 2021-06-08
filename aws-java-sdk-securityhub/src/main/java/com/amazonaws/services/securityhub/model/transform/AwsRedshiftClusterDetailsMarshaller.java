/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRedshiftClusterDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRedshiftClusterDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ALLOWVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowVersionUpgrade").build();
    private static final MarshallingInfo<Integer> AUTOMATEDSNAPSHOTRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomatedSnapshotRetentionPeriod").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> CLUSTERAVAILABILITYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterAvailabilityStatus").build();
    private static final MarshallingInfo<String> CLUSTERCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCreateTime").build();
    private static final MarshallingInfo<String> CLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterIdentifier").build();
    private static final MarshallingInfo<List> CLUSTERNODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClusterNodes").build();
    private static final MarshallingInfo<List> CLUSTERPARAMETERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterParameterGroups").build();
    private static final MarshallingInfo<String> CLUSTERPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterPublicKey").build();
    private static final MarshallingInfo<String> CLUSTERREVISIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterRevisionNumber").build();
    private static final MarshallingInfo<List> CLUSTERSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterSecurityGroups").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERSNAPSHOTCOPYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterSnapshotCopyStatus").build();
    private static final MarshallingInfo<String> CLUSTERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterStatus").build();
    private static final MarshallingInfo<String> CLUSTERSUBNETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterSubnetGroupName").build();
    private static final MarshallingInfo<String> CLUSTERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterVersion").build();
    private static final MarshallingInfo<String> DBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DBName").build();
    private static final MarshallingInfo<List> DEFERREDMAINTENANCEWINDOWS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeferredMaintenanceWindows").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICIPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticIpStatus").build();
    private static final MarshallingInfo<String> ELASTICRESIZENUMBEROFNODEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticResizeNumberOfNodeOptions").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encrypted").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<Boolean> ENHANCEDVPCROUTING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnhancedVpcRouting").build();
    private static final MarshallingInfo<String> EXPECTEDNEXTSNAPSHOTSCHEDULETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedNextSnapshotScheduleTime").build();
    private static final MarshallingInfo<String> EXPECTEDNEXTSNAPSHOTSCHEDULETIMESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedNextSnapshotScheduleTimeStatus").build();
    private static final MarshallingInfo<StructuredPojo> HSMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HsmStatus").build();
    private static final MarshallingInfo<List> IAMROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IamRoles").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> MAINTENANCETRACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceTrackName").build();
    private static final MarshallingInfo<Integer> MANUALSNAPSHOTRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManualSnapshotRetentionPeriod").build();
    private static final MarshallingInfo<String> MASTERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUsername").build();
    private static final MarshallingInfo<String> NEXTMAINTENANCEWINDOWSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextMaintenanceWindowStartTime").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<Integer> NUMBEROFNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfNodes").build();
    private static final MarshallingInfo<List> PENDINGACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PendingActions").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGMODIFIEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PendingModifiedValues").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredMaintenanceWindow").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();
    private static final MarshallingInfo<StructuredPojo> RESIZEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResizeInfo").build();
    private static final MarshallingInfo<StructuredPojo> RESTORESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreStatus").build();
    private static final MarshallingInfo<String> SNAPSHOTSCHEDULEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotScheduleIdentifier").build();
    private static final MarshallingInfo<String> SNAPSHOTSCHEDULESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotScheduleState").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroups").build();

    private static final AwsRedshiftClusterDetailsMarshaller instance = new AwsRedshiftClusterDetailsMarshaller();

    public static AwsRedshiftClusterDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRedshiftClusterDetails awsRedshiftClusterDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRedshiftClusterDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getAllowVersionUpgrade(), ALLOWVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getAutomatedSnapshotRetentionPeriod(), AUTOMATEDSNAPSHOTRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterAvailabilityStatus(), CLUSTERAVAILABILITYSTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterCreateTime(), CLUSTERCREATETIME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterIdentifier(), CLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterNodes(), CLUSTERNODES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterParameterGroups(), CLUSTERPARAMETERGROUPS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterPublicKey(), CLUSTERPUBLICKEY_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterRevisionNumber(), CLUSTERREVISIONNUMBER_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterSecurityGroups(), CLUSTERSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterSnapshotCopyStatus(), CLUSTERSNAPSHOTCOPYSTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterStatus(), CLUSTERSTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterSubnetGroupName(), CLUSTERSUBNETGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getClusterVersion(), CLUSTERVERSION_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getDBName(), DBNAME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getDeferredMaintenanceWindows(), DEFERREDMAINTENANCEWINDOWS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getElasticIpStatus(), ELASTICIPSTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getElasticResizeNumberOfNodeOptions(), ELASTICRESIZENUMBEROFNODEOPTIONS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getEnhancedVpcRouting(), ENHANCEDVPCROUTING_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getExpectedNextSnapshotScheduleTime(), EXPECTEDNEXTSNAPSHOTSCHEDULETIME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getExpectedNextSnapshotScheduleTimeStatus(), EXPECTEDNEXTSNAPSHOTSCHEDULETIMESTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getHsmStatus(), HSMSTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getIamRoles(), IAMROLES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getMaintenanceTrackName(), MAINTENANCETRACKNAME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getManualSnapshotRetentionPeriod(), MANUALSNAPSHOTRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getMasterUsername(), MASTERUSERNAME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getNextMaintenanceWindowStartTime(), NEXTMAINTENANCEWINDOWSTARTTIME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getNumberOfNodes(), NUMBEROFNODES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getPendingActions(), PENDINGACTIONS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getPendingModifiedValues(), PENDINGMODIFIEDVALUES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getResizeInfo(), RESIZEINFO_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getRestoreStatus(), RESTORESTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getSnapshotScheduleIdentifier(), SNAPSHOTSCHEDULEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getSnapshotScheduleState(), SNAPSHOTSCHEDULESTATE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterDetails.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
