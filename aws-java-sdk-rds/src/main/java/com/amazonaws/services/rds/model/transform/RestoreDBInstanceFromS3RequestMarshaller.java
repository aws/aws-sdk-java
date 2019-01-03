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
 * RestoreDBInstanceFromS3Request Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBInstanceFromS3RequestMarshaller implements Marshaller<Request<RestoreDBInstanceFromS3Request>, RestoreDBInstanceFromS3Request> {

    public Request<RestoreDBInstanceFromS3Request> marshall(RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request) {

        if (restoreDBInstanceFromS3Request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBInstanceFromS3Request> request = new DefaultRequest<RestoreDBInstanceFromS3Request>(restoreDBInstanceFromS3Request, "AmazonRDS");
        request.addParameter("Action", "RestoreDBInstanceFromS3");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreDBInstanceFromS3Request.getDBName() != null) {
            request.addParameter("DBName", StringUtils.fromString(restoreDBInstanceFromS3Request.getDBName()));
        }

        if (restoreDBInstanceFromS3Request.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceFromS3Request.getDBInstanceIdentifier()));
        }

        if (restoreDBInstanceFromS3Request.getAllocatedStorage() != null) {
            request.addParameter("AllocatedStorage", StringUtils.fromInteger(restoreDBInstanceFromS3Request.getAllocatedStorage()));
        }

        if (restoreDBInstanceFromS3Request.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(restoreDBInstanceFromS3Request.getDBInstanceClass()));
        }

        if (restoreDBInstanceFromS3Request.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBInstanceFromS3Request.getEngine()));
        }

        if (restoreDBInstanceFromS3Request.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils.fromString(restoreDBInstanceFromS3Request.getMasterUsername()));
        }

        if (restoreDBInstanceFromS3Request.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(restoreDBInstanceFromS3Request.getMasterUserPassword()));
        }

        if (!restoreDBInstanceFromS3Request.getDBSecurityGroups().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromS3Request.getDBSecurityGroups()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> dBSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromS3Request
                    .getDBSecurityGroups();
            int dBSecurityGroupsListIndex = 1;

            for (String dBSecurityGroupsListValue : dBSecurityGroupsList) {
                if (dBSecurityGroupsListValue != null) {
                    request.addParameter("DBSecurityGroups.DBSecurityGroupName." + dBSecurityGroupsListIndex, StringUtils.fromString(dBSecurityGroupsListValue));
                }
                dBSecurityGroupsListIndex++;
            }
        }

        if (!restoreDBInstanceFromS3Request.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromS3Request.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromS3Request
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

        if (restoreDBInstanceFromS3Request.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(restoreDBInstanceFromS3Request.getAvailabilityZone()));
        }

        if (restoreDBInstanceFromS3Request.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBInstanceFromS3Request.getDBSubnetGroupName()));
        }

        if (restoreDBInstanceFromS3Request.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(restoreDBInstanceFromS3Request.getPreferredMaintenanceWindow()));
        }

        if (restoreDBInstanceFromS3Request.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(restoreDBInstanceFromS3Request.getDBParameterGroupName()));
        }

        if (restoreDBInstanceFromS3Request.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(restoreDBInstanceFromS3Request.getBackupRetentionPeriod()));
        }

        if (restoreDBInstanceFromS3Request.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(restoreDBInstanceFromS3Request.getPreferredBackupWindow()));
        }

        if (restoreDBInstanceFromS3Request.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBInstanceFromS3Request.getPort()));
        }

        if (restoreDBInstanceFromS3Request.getMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getMultiAZ()));
        }

        if (restoreDBInstanceFromS3Request.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(restoreDBInstanceFromS3Request.getEngineVersion()));
        }

        if (restoreDBInstanceFromS3Request.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getAutoMinorVersionUpgrade()));
        }

        if (restoreDBInstanceFromS3Request.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(restoreDBInstanceFromS3Request.getLicenseModel()));
        }

        if (restoreDBInstanceFromS3Request.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(restoreDBInstanceFromS3Request.getIops()));
        }

        if (restoreDBInstanceFromS3Request.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBInstanceFromS3Request.getOptionGroupName()));
        }

        if (restoreDBInstanceFromS3Request.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getPubliclyAccessible()));
        }

        if (!restoreDBInstanceFromS3Request.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) restoreDBInstanceFromS3Request.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) restoreDBInstanceFromS3Request.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (restoreDBInstanceFromS3Request.getStorageType() != null) {
            request.addParameter("StorageType", StringUtils.fromString(restoreDBInstanceFromS3Request.getStorageType()));
        }

        if (restoreDBInstanceFromS3Request.getStorageEncrypted() != null) {
            request.addParameter("StorageEncrypted", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getStorageEncrypted()));
        }

        if (restoreDBInstanceFromS3Request.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreDBInstanceFromS3Request.getKmsKeyId()));
        }

        if (restoreDBInstanceFromS3Request.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getCopyTagsToSnapshot()));
        }

        if (restoreDBInstanceFromS3Request.getMonitoringInterval() != null) {
            request.addParameter("MonitoringInterval", StringUtils.fromInteger(restoreDBInstanceFromS3Request.getMonitoringInterval()));
        }

        if (restoreDBInstanceFromS3Request.getMonitoringRoleArn() != null) {
            request.addParameter("MonitoringRoleArn", StringUtils.fromString(restoreDBInstanceFromS3Request.getMonitoringRoleArn()));
        }

        if (restoreDBInstanceFromS3Request.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication",
                    StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getEnableIAMDatabaseAuthentication()));
        }

        if (restoreDBInstanceFromS3Request.getSourceEngine() != null) {
            request.addParameter("SourceEngine", StringUtils.fromString(restoreDBInstanceFromS3Request.getSourceEngine()));
        }

        if (restoreDBInstanceFromS3Request.getSourceEngineVersion() != null) {
            request.addParameter("SourceEngineVersion", StringUtils.fromString(restoreDBInstanceFromS3Request.getSourceEngineVersion()));
        }

        if (restoreDBInstanceFromS3Request.getS3BucketName() != null) {
            request.addParameter("S3BucketName", StringUtils.fromString(restoreDBInstanceFromS3Request.getS3BucketName()));
        }

        if (restoreDBInstanceFromS3Request.getS3Prefix() != null) {
            request.addParameter("S3Prefix", StringUtils.fromString(restoreDBInstanceFromS3Request.getS3Prefix()));
        }

        if (restoreDBInstanceFromS3Request.getS3IngestionRoleArn() != null) {
            request.addParameter("S3IngestionRoleArn", StringUtils.fromString(restoreDBInstanceFromS3Request.getS3IngestionRoleArn()));
        }

        if (restoreDBInstanceFromS3Request.getEnablePerformanceInsights() != null) {
            request.addParameter("EnablePerformanceInsights", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getEnablePerformanceInsights()));
        }

        if (restoreDBInstanceFromS3Request.getPerformanceInsightsKMSKeyId() != null) {
            request.addParameter("PerformanceInsightsKMSKeyId", StringUtils.fromString(restoreDBInstanceFromS3Request.getPerformanceInsightsKMSKeyId()));
        }

        if (restoreDBInstanceFromS3Request.getPerformanceInsightsRetentionPeriod() != null) {
            request.addParameter("PerformanceInsightsRetentionPeriod",
                    StringUtils.fromInteger(restoreDBInstanceFromS3Request.getPerformanceInsightsRetentionPeriod()));
        }

        if (!restoreDBInstanceFromS3Request.getEnableCloudwatchLogsExports().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromS3Request.getEnableCloudwatchLogsExports()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExportsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBInstanceFromS3Request
                    .getEnableCloudwatchLogsExports();
            int enableCloudwatchLogsExportsListIndex = 1;

            for (String enableCloudwatchLogsExportsListValue : enableCloudwatchLogsExportsList) {
                if (enableCloudwatchLogsExportsListValue != null) {
                    request.addParameter("EnableCloudwatchLogsExports.member." + enableCloudwatchLogsExportsListIndex,
                            StringUtils.fromString(enableCloudwatchLogsExportsListValue));
                }
                enableCloudwatchLogsExportsListIndex++;
            }
        }

        if (!restoreDBInstanceFromS3Request.getProcessorFeatures().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ProcessorFeature>) restoreDBInstanceFromS3Request.getProcessorFeatures()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeaturesList = (com.amazonaws.internal.SdkInternalList<ProcessorFeature>) restoreDBInstanceFromS3Request
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

        if (restoreDBInstanceFromS3Request.getUseDefaultProcessorFeatures() != null) {
            request.addParameter("UseDefaultProcessorFeatures", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getUseDefaultProcessorFeatures()));
        }

        if (restoreDBInstanceFromS3Request.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(restoreDBInstanceFromS3Request.getDeletionProtection()));
        }

        return request;
    }

}
