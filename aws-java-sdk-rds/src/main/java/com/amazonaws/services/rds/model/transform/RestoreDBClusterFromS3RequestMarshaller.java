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
 * RestoreDBClusterFromS3Request Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterFromS3RequestMarshaller implements Marshaller<Request<RestoreDBClusterFromS3Request>, RestoreDBClusterFromS3Request> {

    public Request<RestoreDBClusterFromS3Request> marshall(RestoreDBClusterFromS3Request restoreDBClusterFromS3Request) {

        if (restoreDBClusterFromS3Request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBClusterFromS3Request> request = new DefaultRequest<RestoreDBClusterFromS3Request>(restoreDBClusterFromS3Request, "AmazonRDS");
        request.addParameter("Action", "RestoreDBClusterFromS3");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (!restoreDBClusterFromS3Request.getAvailabilityZones().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBClusterFromS3Request.getAvailabilityZones()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBClusterFromS3Request
                    .getAvailabilityZones();
            int availabilityZonesListIndex = 1;

            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.AvailabilityZone." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        if (restoreDBClusterFromS3Request.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(restoreDBClusterFromS3Request.getBackupRetentionPeriod()));
        }

        if (restoreDBClusterFromS3Request.getCharacterSetName() != null) {
            request.addParameter("CharacterSetName", StringUtils.fromString(restoreDBClusterFromS3Request.getCharacterSetName()));
        }

        if (restoreDBClusterFromS3Request.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(restoreDBClusterFromS3Request.getDatabaseName()));
        }

        if (restoreDBClusterFromS3Request.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(restoreDBClusterFromS3Request.getDBClusterIdentifier()));
        }

        if (restoreDBClusterFromS3Request.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName", StringUtils.fromString(restoreDBClusterFromS3Request.getDBClusterParameterGroupName()));
        }

        if (!restoreDBClusterFromS3Request.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBClusterFromS3Request.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBClusterFromS3Request
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

        if (restoreDBClusterFromS3Request.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBClusterFromS3Request.getDBSubnetGroupName()));
        }

        if (restoreDBClusterFromS3Request.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBClusterFromS3Request.getEngine()));
        }

        if (restoreDBClusterFromS3Request.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(restoreDBClusterFromS3Request.getEngineVersion()));
        }

        if (restoreDBClusterFromS3Request.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBClusterFromS3Request.getPort()));
        }

        if (restoreDBClusterFromS3Request.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils.fromString(restoreDBClusterFromS3Request.getMasterUsername()));
        }

        if (restoreDBClusterFromS3Request.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(restoreDBClusterFromS3Request.getMasterUserPassword()));
        }

        if (restoreDBClusterFromS3Request.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBClusterFromS3Request.getOptionGroupName()));
        }

        if (restoreDBClusterFromS3Request.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(restoreDBClusterFromS3Request.getPreferredBackupWindow()));
        }

        if (restoreDBClusterFromS3Request.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(restoreDBClusterFromS3Request.getPreferredMaintenanceWindow()));
        }

        if (!restoreDBClusterFromS3Request.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) restoreDBClusterFromS3Request.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) restoreDBClusterFromS3Request.getTags();
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

        if (restoreDBClusterFromS3Request.getStorageEncrypted() != null) {
            request.addParameter("StorageEncrypted", StringUtils.fromBoolean(restoreDBClusterFromS3Request.getStorageEncrypted()));
        }

        if (restoreDBClusterFromS3Request.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreDBClusterFromS3Request.getKmsKeyId()));
        }

        if (restoreDBClusterFromS3Request.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication", StringUtils.fromBoolean(restoreDBClusterFromS3Request.getEnableIAMDatabaseAuthentication()));
        }

        if (restoreDBClusterFromS3Request.getSourceEngine() != null) {
            request.addParameter("SourceEngine", StringUtils.fromString(restoreDBClusterFromS3Request.getSourceEngine()));
        }

        if (restoreDBClusterFromS3Request.getSourceEngineVersion() != null) {
            request.addParameter("SourceEngineVersion", StringUtils.fromString(restoreDBClusterFromS3Request.getSourceEngineVersion()));
        }

        if (restoreDBClusterFromS3Request.getS3BucketName() != null) {
            request.addParameter("S3BucketName", StringUtils.fromString(restoreDBClusterFromS3Request.getS3BucketName()));
        }

        if (restoreDBClusterFromS3Request.getS3Prefix() != null) {
            request.addParameter("S3Prefix", StringUtils.fromString(restoreDBClusterFromS3Request.getS3Prefix()));
        }

        if (restoreDBClusterFromS3Request.getS3IngestionRoleArn() != null) {
            request.addParameter("S3IngestionRoleArn", StringUtils.fromString(restoreDBClusterFromS3Request.getS3IngestionRoleArn()));
        }

        if (restoreDBClusterFromS3Request.getBacktrackWindow() != null) {
            request.addParameter("BacktrackWindow", StringUtils.fromLong(restoreDBClusterFromS3Request.getBacktrackWindow()));
        }

        if (!restoreDBClusterFromS3Request.getEnableCloudwatchLogsExports().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) restoreDBClusterFromS3Request.getEnableCloudwatchLogsExports()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExportsList = (com.amazonaws.internal.SdkInternalList<String>) restoreDBClusterFromS3Request
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

        if (restoreDBClusterFromS3Request.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(restoreDBClusterFromS3Request.getDeletionProtection()));
        }

        if (restoreDBClusterFromS3Request.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(restoreDBClusterFromS3Request.getCopyTagsToSnapshot()));
        }

        return request;
    }

}
