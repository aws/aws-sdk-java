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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyDBInstanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBInstanceRequestMarshaller implements Marshaller<Request<ModifyDBInstanceRequest>, ModifyDBInstanceRequest> {

    public Request<ModifyDBInstanceRequest> marshall(ModifyDBInstanceRequest modifyDBInstanceRequest) {

        if (modifyDBInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBInstanceRequest> request = new DefaultRequest<ModifyDBInstanceRequest>(modifyDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBInstance");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBInstanceRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceIdentifier()));
        }

        if (modifyDBInstanceRequest.getAllocatedStorage() != null) {
            request.addParameter("AllocatedStorage", StringUtils.fromInteger(modifyDBInstanceRequest.getAllocatedStorage()));
        }

        if (modifyDBInstanceRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceClass()));
        }

        if (modifyDBInstanceRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(modifyDBInstanceRequest.getDBSubnetGroupName()));
        }

        if (!modifyDBInstanceRequest.getDBSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBInstanceRequest.getDBSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> dBSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBInstanceRequest
                    .getDBSecurityGroups();
            int dBSecurityGroupsListIndex = 1;

            for (String dBSecurityGroupsListValue : dBSecurityGroupsList) {
                if (dBSecurityGroupsListValue != null) {
                    request.addParameter("DBSecurityGroups.DBSecurityGroupName." + dBSecurityGroupsListIndex, StringUtils.fromString(dBSecurityGroupsListValue));
                }
                dBSecurityGroupsListIndex++;
            }
        }

        if (!modifyDBInstanceRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBInstanceRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBInstanceRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                            StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        if (modifyDBInstanceRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyDBInstanceRequest.getApplyImmediately()));
        }

        if (modifyDBInstanceRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(modifyDBInstanceRequest.getMasterUserPassword()));
        }

        if (modifyDBInstanceRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(modifyDBInstanceRequest.getDBParameterGroupName()));
        }

        if (modifyDBInstanceRequest.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(modifyDBInstanceRequest.getBackupRetentionPeriod()));
        }

        if (modifyDBInstanceRequest.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(modifyDBInstanceRequest.getPreferredBackupWindow()));
        }

        if (modifyDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyDBInstanceRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyDBInstanceRequest.getMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(modifyDBInstanceRequest.getMultiAZ()));
        }

        if (modifyDBInstanceRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyDBInstanceRequest.getEngineVersion()));
        }

        if (modifyDBInstanceRequest.getAllowMajorVersionUpgrade() != null) {
            request.addParameter("AllowMajorVersionUpgrade", StringUtils.fromBoolean(modifyDBInstanceRequest.getAllowMajorVersionUpgrade()));
        }

        if (modifyDBInstanceRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyDBInstanceRequest.getAutoMinorVersionUpgrade()));
        }

        if (modifyDBInstanceRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(modifyDBInstanceRequest.getLicenseModel()));
        }

        if (modifyDBInstanceRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(modifyDBInstanceRequest.getIops()));
        }

        if (modifyDBInstanceRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(modifyDBInstanceRequest.getOptionGroupName()));
        }

        if (modifyDBInstanceRequest.getNewDBInstanceIdentifier() != null) {
            request.addParameter("NewDBInstanceIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getNewDBInstanceIdentifier()));
        }

        if (modifyDBInstanceRequest.getStorageType() != null) {
            request.addParameter("StorageType", StringUtils.fromString(modifyDBInstanceRequest.getStorageType()));
        }

        if (modifyDBInstanceRequest.getTdeCredentialArn() != null) {
            request.addParameter("TdeCredentialArn", StringUtils.fromString(modifyDBInstanceRequest.getTdeCredentialArn()));
        }

        if (modifyDBInstanceRequest.getTdeCredentialPassword() != null) {
            request.addParameter("TdeCredentialPassword", StringUtils.fromString(modifyDBInstanceRequest.getTdeCredentialPassword()));
        }

        if (modifyDBInstanceRequest.getCACertificateIdentifier() != null) {
            request.addParameter("CACertificateIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getCACertificateIdentifier()));
        }

        if (modifyDBInstanceRequest.getDomain() != null) {
            request.addParameter("Domain", StringUtils.fromString(modifyDBInstanceRequest.getDomain()));
        }

        if (modifyDBInstanceRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(modifyDBInstanceRequest.getCopyTagsToSnapshot()));
        }

        if (modifyDBInstanceRequest.getMonitoringInterval() != null) {
            request.addParameter("MonitoringInterval", StringUtils.fromInteger(modifyDBInstanceRequest.getMonitoringInterval()));
        }

        if (modifyDBInstanceRequest.getDBPortNumber() != null) {
            request.addParameter("DBPortNumber", StringUtils.fromInteger(modifyDBInstanceRequest.getDBPortNumber()));
        }

        if (modifyDBInstanceRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(modifyDBInstanceRequest.getPubliclyAccessible()));
        }

        if (modifyDBInstanceRequest.getMonitoringRoleArn() != null) {
            request.addParameter("MonitoringRoleArn", StringUtils.fromString(modifyDBInstanceRequest.getMonitoringRoleArn()));
        }

        if (modifyDBInstanceRequest.getDomainIAMRoleName() != null) {
            request.addParameter("DomainIAMRoleName", StringUtils.fromString(modifyDBInstanceRequest.getDomainIAMRoleName()));
        }

        if (modifyDBInstanceRequest.getPromotionTier() != null) {
            request.addParameter("PromotionTier", StringUtils.fromInteger(modifyDBInstanceRequest.getPromotionTier()));
        }

        if (modifyDBInstanceRequest.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication", StringUtils.fromBoolean(modifyDBInstanceRequest.getEnableIAMDatabaseAuthentication()));
        }

        if (modifyDBInstanceRequest.getEnablePerformanceInsights() != null) {
            request.addParameter("EnablePerformanceInsights", StringUtils.fromBoolean(modifyDBInstanceRequest.getEnablePerformanceInsights()));
        }

        if (modifyDBInstanceRequest.getPerformanceInsightsKMSKeyId() != null) {
            request.addParameter("PerformanceInsightsKMSKeyId", StringUtils.fromString(modifyDBInstanceRequest.getPerformanceInsightsKMSKeyId()));
        }

        if (modifyDBInstanceRequest.getPerformanceInsightsRetentionPeriod() != null) {
            request.addParameter("PerformanceInsightsRetentionPeriod", StringUtils.fromInteger(modifyDBInstanceRequest.getPerformanceInsightsRetentionPeriod()));
        }

        {
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration = modifyDBInstanceRequest.getCloudwatchLogsExportConfiguration();
            if (cloudwatchLogsExportConfiguration != null) {

                if (!cloudwatchLogsExportConfiguration.getEnableLogTypes().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) cloudwatchLogsExportConfiguration.getEnableLogTypes()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> enableLogTypesList = (com.amazonaws.internal.SdkInternalList<String>) cloudwatchLogsExportConfiguration
                            .getEnableLogTypes();
                    int enableLogTypesListIndex = 1;

                    for (String enableLogTypesListValue : enableLogTypesList) {
                        if (enableLogTypesListValue != null) {
                            request.addParameter("CloudwatchLogsExportConfiguration.EnableLogTypes.member." + enableLogTypesListIndex,
                                    StringUtils.fromString(enableLogTypesListValue));
                        }
                        enableLogTypesListIndex++;
                    }
                }

                if (!cloudwatchLogsExportConfiguration.getDisableLogTypes().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) cloudwatchLogsExportConfiguration.getDisableLogTypes()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> disableLogTypesList = (com.amazonaws.internal.SdkInternalList<String>) cloudwatchLogsExportConfiguration
                            .getDisableLogTypes();
                    int disableLogTypesListIndex = 1;

                    for (String disableLogTypesListValue : disableLogTypesList) {
                        if (disableLogTypesListValue != null) {
                            request.addParameter("CloudwatchLogsExportConfiguration.DisableLogTypes.member." + disableLogTypesListIndex,
                                    StringUtils.fromString(disableLogTypesListValue));
                        }
                        disableLogTypesListIndex++;
                    }
                }
            }
        }

        if (!modifyDBInstanceRequest.getProcessorFeatures().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ProcessorFeature>) modifyDBInstanceRequest.getProcessorFeatures()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeaturesList = (com.amazonaws.internal.SdkInternalList<ProcessorFeature>) modifyDBInstanceRequest
                    .getProcessorFeatures();
            int processorFeaturesListIndex = 1;

            for (ProcessorFeature processorFeaturesListValue : processorFeaturesList) {

                if (processorFeaturesListValue.getName() != null) {
                    request.addParameter("ProcessorFeatures.ProcessorFeature." + processorFeaturesListIndex + ".Name",
                            StringUtils.fromString(processorFeaturesListValue.getName()));
                }

                if (processorFeaturesListValue.getValue() != null) {
                    request.addParameter("ProcessorFeatures.ProcessorFeature." + processorFeaturesListIndex + ".Value",
                            StringUtils.fromString(processorFeaturesListValue.getValue()));
                }
                processorFeaturesListIndex++;
            }
        }

        if (modifyDBInstanceRequest.getUseDefaultProcessorFeatures() != null) {
            request.addParameter("UseDefaultProcessorFeatures", StringUtils.fromBoolean(modifyDBInstanceRequest.getUseDefaultProcessorFeatures()));
        }

        if (modifyDBInstanceRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(modifyDBInstanceRequest.getDeletionProtection()));
        }

        return request;
    }

}
