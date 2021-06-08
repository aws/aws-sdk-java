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
 * AwsRdsDbClusterDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbClusterDetailsMarshaller {

    private static final MarshallingInfo<Integer> ALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedStorage").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();
    private static final MarshallingInfo<Integer> BACKUPRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupRetentionPeriod").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<String> READERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReaderEndpoint").build();
    private static final MarshallingInfo<List> CUSTOMENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomEndpoints").build();
    private static final MarshallingInfo<Boolean> MULTIAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MultiAz").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> MASTERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUsername").build();
    private static final MarshallingInfo<String> PREFERREDBACKUPWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredBackupWindow").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredMaintenanceWindow").build();
    private static final MarshallingInfo<List> READREPLICAIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadReplicaIdentifiers").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroups").build();
    private static final MarshallingInfo<String> HOSTEDZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HostedZoneId").build();
    private static final MarshallingInfo<Boolean> STORAGEENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageEncrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> DBCLUSTERRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterResourceId").build();
    private static final MarshallingInfo<List> ASSOCIATEDROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedRoles").build();
    private static final MarshallingInfo<String> CLUSTERCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCreateTime").build();
    private static final MarshallingInfo<List> ENABLEDCLOUDWATCHLOGSEXPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnabledCloudWatchLogsExports").build();
    private static final MarshallingInfo<String> ENGINEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineMode").build();
    private static final MarshallingInfo<Boolean> DELETIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionProtection").build();
    private static final MarshallingInfo<Boolean> HTTPENDPOINTENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpEndpointEnabled").build();
    private static final MarshallingInfo<String> ACTIVITYSTREAMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActivityStreamStatus").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToSnapshot").build();
    private static final MarshallingInfo<Boolean> CROSSACCOUNTCLONE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossAccountClone").build();
    private static final MarshallingInfo<List> DOMAINMEMBERSHIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainMemberships").build();
    private static final MarshallingInfo<String> DBCLUSTERPARAMETERGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterParameterGroup").build();
    private static final MarshallingInfo<String> DBSUBNETGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSubnetGroup").build();
    private static final MarshallingInfo<List> DBCLUSTEROPTIONGROUPMEMBERSHIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterOptionGroupMemberships").build();
    private static final MarshallingInfo<String> DBCLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterIdentifier").build();
    private static final MarshallingInfo<List> DBCLUSTERMEMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterMembers").build();
    private static final MarshallingInfo<Boolean> IAMDATABASEAUTHENTICATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamDatabaseAuthenticationEnabled").build();

    private static final AwsRdsDbClusterDetailsMarshaller instance = new AwsRdsDbClusterDetailsMarshaller();

    public static AwsRdsDbClusterDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbClusterDetails awsRdsDbClusterDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbClusterDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getBackupRetentionPeriod(), BACKUPRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getReaderEndpoint(), READERENDPOINT_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getCustomEndpoints(), CUSTOMENDPOINTS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getMultiAz(), MULTIAZ_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getMasterUsername(), MASTERUSERNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getPreferredBackupWindow(), PREFERREDBACKUPWINDOW_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getReadReplicaIdentifiers(), READREPLICAIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getHostedZoneId(), HOSTEDZONEID_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getStorageEncrypted(), STORAGEENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDbClusterResourceId(), DBCLUSTERRESOURCEID_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getAssociatedRoles(), ASSOCIATEDROLES_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getClusterCreateTime(), CLUSTERCREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getEnabledCloudWatchLogsExports(), ENABLEDCLOUDWATCHLOGSEXPORTS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getEngineMode(), ENGINEMODE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDeletionProtection(), DELETIONPROTECTION_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getHttpEndpointEnabled(), HTTPENDPOINTENABLED_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getActivityStreamStatus(), ACTIVITYSTREAMSTATUS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getCopyTagsToSnapshot(), COPYTAGSTOSNAPSHOT_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getCrossAccountClone(), CROSSACCOUNTCLONE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDomainMemberships(), DOMAINMEMBERSHIPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDbClusterParameterGroup(), DBCLUSTERPARAMETERGROUP_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDbSubnetGroup(), DBSUBNETGROUP_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDbClusterOptionGroupMemberships(), DBCLUSTEROPTIONGROUPMEMBERSHIPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDbClusterIdentifier(), DBCLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getDbClusterMembers(), DBCLUSTERMEMBERS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterDetails.getIamDatabaseAuthenticationEnabled(), IAMDATABASEAUTHENTICATIONENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
