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
 * AwsRdsDbInstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbInstanceDetailsMarshaller {

    private static final MarshallingInfo<List> ASSOCIATEDROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedRoles").build();
    private static final MarshallingInfo<String> CACERTIFICATEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CACertificateIdentifier").build();
    private static final MarshallingInfo<String> DBCLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DBClusterIdentifier").build();
    private static final MarshallingInfo<String> DBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DBInstanceIdentifier").build();
    private static final MarshallingInfo<String> DBINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DBInstanceClass").build();
    private static final MarshallingInfo<Integer> DBINSTANCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstancePort").build();
    private static final MarshallingInfo<String> DBIRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbiResourceId").build();
    private static final MarshallingInfo<String> DBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DBName").build();
    private static final MarshallingInfo<Boolean> DELETIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionProtection").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<Boolean> IAMDATABASEAUTHENTICATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IAMDatabaseAuthenticationEnabled").build();
    private static final MarshallingInfo<String> INSTANCECREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCreateTime").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();
    private static final MarshallingInfo<Boolean> STORAGEENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageEncrypted").build();
    private static final MarshallingInfo<String> TDECREDENTIALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TdeCredentialArn").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroups").build();
    private static final MarshallingInfo<Boolean> MULTIAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MultiAz").build();
    private static final MarshallingInfo<String> ENHANCEDMONITORINGRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnhancedMonitoringResourceArn").build();
    private static final MarshallingInfo<String> DBINSTANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstanceStatus").build();
    private static final MarshallingInfo<String> MASTERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUsername").build();
    private static final MarshallingInfo<Integer> ALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedStorage").build();
    private static final MarshallingInfo<String> PREFERREDBACKUPWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredBackupWindow").build();
    private static final MarshallingInfo<Integer> BACKUPRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupRetentionPeriod").build();
    private static final MarshallingInfo<List> DBSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSecurityGroups").build();
    private static final MarshallingInfo<List> DBPARAMETERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbParameterGroups").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<StructuredPojo> DBSUBNETGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSubnetGroup").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredMaintenanceWindow").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGMODIFIEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PendingModifiedValues").build();
    private static final MarshallingInfo<String> LATESTRESTORABLETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestRestorableTime").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMinorVersionUpgrade").build();
    private static final MarshallingInfo<String> READREPLICASOURCEDBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadReplicaSourceDBInstanceIdentifier").build();
    private static final MarshallingInfo<List> READREPLICADBINSTANCEIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadReplicaDBInstanceIdentifiers").build();
    private static final MarshallingInfo<List> READREPLICADBCLUSTERIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadReplicaDBClusterIdentifiers").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseModel").build();
    private static final MarshallingInfo<Integer> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Iops").build();
    private static final MarshallingInfo<List> OPTIONGROUPMEMBERSHIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptionGroupMemberships").build();
    private static final MarshallingInfo<String> CHARACTERSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CharacterSetName").build();
    private static final MarshallingInfo<String> SECONDARYAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryAvailabilityZone").build();
    private static final MarshallingInfo<List> STATUSINFOS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StatusInfos").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageType").build();
    private static final MarshallingInfo<List> DOMAINMEMBERSHIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainMemberships").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToSnapshot").build();
    private static final MarshallingInfo<Integer> MONITORINGINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringInterval").build();
    private static final MarshallingInfo<String> MONITORINGROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringRoleArn").build();
    private static final MarshallingInfo<Integer> PROMOTIONTIER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PromotionTier").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<Boolean> PERFORMANCEINSIGHTSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerformanceInsightsEnabled").build();
    private static final MarshallingInfo<String> PERFORMANCEINSIGHTSKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerformanceInsightsKmsKeyId").build();
    private static final MarshallingInfo<Integer> PERFORMANCEINSIGHTSRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerformanceInsightsRetentionPeriod").build();
    private static final MarshallingInfo<List> ENABLEDCLOUDWATCHLOGSEXPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnabledCloudWatchLogsExports").build();
    private static final MarshallingInfo<List> PROCESSORFEATURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessorFeatures").build();
    private static final MarshallingInfo<StructuredPojo> LISTENERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ListenerEndpoint").build();
    private static final MarshallingInfo<Integer> MAXALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAllocatedStorage").build();

    private static final AwsRdsDbInstanceDetailsMarshaller instance = new AwsRdsDbInstanceDetailsMarshaller();

    public static AwsRdsDbInstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbInstanceDetails awsRdsDbInstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbInstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getAssociatedRoles(), ASSOCIATEDROLES_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getCACertificateIdentifier(), CACERTIFICATEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBClusterIdentifier(), DBCLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBInstanceIdentifier(), DBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBInstanceClass(), DBINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbInstancePort(), DBINSTANCEPORT_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbiResourceId(), DBIRESOURCEID_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBName(), DBNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDeletionProtection(), DELETIONPROTECTION_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getIAMDatabaseAuthenticationEnabled(), IAMDATABASEAUTHENTICATIONENABLED_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getInstanceCreateTime(), INSTANCECREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getStorageEncrypted(), STORAGEENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getTdeCredentialArn(), TDECREDENTIALARN_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getMultiAz(), MULTIAZ_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEnhancedMonitoringResourceArn(), ENHANCEDMONITORINGRESOURCEARN_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbInstanceStatus(), DBINSTANCESTATUS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getMasterUsername(), MASTERUSERNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPreferredBackupWindow(), PREFERREDBACKUPWINDOW_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getBackupRetentionPeriod(), BACKUPRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbSecurityGroups(), DBSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbParameterGroups(), DBPARAMETERGROUPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbSubnetGroup(), DBSUBNETGROUP_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPendingModifiedValues(), PENDINGMODIFIEDVALUES_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getLatestRestorableTime(), LATESTRESTORABLETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getReadReplicaSourceDBInstanceIdentifier(), READREPLICASOURCEDBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getReadReplicaDBInstanceIdentifiers(), READREPLICADBINSTANCEIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getReadReplicaDBClusterIdentifiers(), READREPLICADBCLUSTERIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getOptionGroupMemberships(), OPTIONGROUPMEMBERSHIPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getCharacterSetName(), CHARACTERSETNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getSecondaryAvailabilityZone(), SECONDARYAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getStatusInfos(), STATUSINFOS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDomainMemberships(), DOMAINMEMBERSHIPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getCopyTagsToSnapshot(), COPYTAGSTOSNAPSHOT_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getMonitoringInterval(), MONITORINGINTERVAL_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getMonitoringRoleArn(), MONITORINGROLEARN_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPromotionTier(), PROMOTIONTIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPerformanceInsightsEnabled(), PERFORMANCEINSIGHTSENABLED_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPerformanceInsightsKmsKeyId(), PERFORMANCEINSIGHTSKMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPerformanceInsightsRetentionPeriod(), PERFORMANCEINSIGHTSRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEnabledCloudWatchLogsExports(), ENABLEDCLOUDWATCHLOGSEXPORTS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getProcessorFeatures(), PROCESSORFEATURES_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getListenerEndpoint(), LISTENERENDPOINT_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getMaxAllocatedStorage(), MAXALLOCATEDSTORAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
