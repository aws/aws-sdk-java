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
 * CreateDBClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterRequestMarshaller implements Marshaller<Request<CreateDBClusterRequest>, CreateDBClusterRequest> {

    public Request<CreateDBClusterRequest> marshall(CreateDBClusterRequest createDBClusterRequest) {

        if (createDBClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBClusterRequest> request = new DefaultRequest<CreateDBClusterRequest>(createDBClusterRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (!createDBClusterRequest.getAvailabilityZones().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBClusterRequest.getAvailabilityZones()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) createDBClusterRequest
                    .getAvailabilityZones();
            int availabilityZonesListIndex = 1;

            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.AvailabilityZone." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        if (createDBClusterRequest.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(createDBClusterRequest.getBackupRetentionPeriod()));
        }

        if (createDBClusterRequest.getCharacterSetName() != null) {
            request.addParameter("CharacterSetName", StringUtils.fromString(createDBClusterRequest.getCharacterSetName()));
        }

        if (createDBClusterRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(createDBClusterRequest.getDatabaseName()));
        }

        if (createDBClusterRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(createDBClusterRequest.getDBClusterIdentifier()));
        }

        if (createDBClusterRequest.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName", StringUtils.fromString(createDBClusterRequest.getDBClusterParameterGroupName()));
        }

        if (!createDBClusterRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBClusterRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createDBClusterRequest
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

        if (createDBClusterRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(createDBClusterRequest.getDBSubnetGroupName()));
        }

        if (createDBClusterRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createDBClusterRequest.getEngine()));
        }

        if (createDBClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createDBClusterRequest.getEngineVersion()));
        }

        if (createDBClusterRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createDBClusterRequest.getPort()));
        }

        if (createDBClusterRequest.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils.fromString(createDBClusterRequest.getMasterUsername()));
        }

        if (createDBClusterRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(createDBClusterRequest.getMasterUserPassword()));
        }

        if (createDBClusterRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(createDBClusterRequest.getOptionGroupName()));
        }

        if (createDBClusterRequest.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(createDBClusterRequest.getPreferredBackupWindow()));
        }

        if (createDBClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createDBClusterRequest.getPreferredMaintenanceWindow()));
        }

        if (createDBClusterRequest.getReplicationSourceIdentifier() != null) {
            request.addParameter("ReplicationSourceIdentifier", StringUtils.fromString(createDBClusterRequest.getReplicationSourceIdentifier()));
        }

        if (!createDBClusterRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) createDBClusterRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createDBClusterRequest.getTags();
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

        if (createDBClusterRequest.getStorageEncrypted() != null) {
            request.addParameter("StorageEncrypted", StringUtils.fromBoolean(createDBClusterRequest.getStorageEncrypted()));
        }

        if (createDBClusterRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createDBClusterRequest.getKmsKeyId()));
        }

        if (createDBClusterRequest.getPreSignedUrl() != null) {
            request.addParameter("PreSignedUrl", StringUtils.fromString(createDBClusterRequest.getPreSignedUrl()));
        }

        if (createDBClusterRequest.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication", StringUtils.fromBoolean(createDBClusterRequest.getEnableIAMDatabaseAuthentication()));
        }

        if (createDBClusterRequest.getBacktrackWindow() != null) {
            request.addParameter("BacktrackWindow", StringUtils.fromLong(createDBClusterRequest.getBacktrackWindow()));
        }

        if (!createDBClusterRequest.getEnableCloudwatchLogsExports().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createDBClusterRequest.getEnableCloudwatchLogsExports()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExportsList = (com.amazonaws.internal.SdkInternalList<String>) createDBClusterRequest
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

        if (createDBClusterRequest.getEngineMode() != null) {
            request.addParameter("EngineMode", StringUtils.fromString(createDBClusterRequest.getEngineMode()));
        }

        {
            ScalingConfiguration scalingConfiguration = createDBClusterRequest.getScalingConfiguration();
            if (scalingConfiguration != null) {

                if (scalingConfiguration.getMinCapacity() != null) {
                    request.addParameter("ScalingConfiguration.MinCapacity", StringUtils.fromInteger(scalingConfiguration.getMinCapacity()));
                }

                if (scalingConfiguration.getMaxCapacity() != null) {
                    request.addParameter("ScalingConfiguration.MaxCapacity", StringUtils.fromInteger(scalingConfiguration.getMaxCapacity()));
                }

                if (scalingConfiguration.getAutoPause() != null) {
                    request.addParameter("ScalingConfiguration.AutoPause", StringUtils.fromBoolean(scalingConfiguration.getAutoPause()));
                }

                if (scalingConfiguration.getSecondsUntilAutoPause() != null) {
                    request.addParameter("ScalingConfiguration.SecondsUntilAutoPause", StringUtils.fromInteger(scalingConfiguration.getSecondsUntilAutoPause()));
                }

                if (scalingConfiguration.getTimeoutAction() != null) {
                    request.addParameter("ScalingConfiguration.TimeoutAction", StringUtils.fromString(scalingConfiguration.getTimeoutAction()));
                }
            }
        }

        if (createDBClusterRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(createDBClusterRequest.getDeletionProtection()));
        }

        if (createDBClusterRequest.getGlobalClusterIdentifier() != null) {
            request.addParameter("GlobalClusterIdentifier", StringUtils.fromString(createDBClusterRequest.getGlobalClusterIdentifier()));
        }

        if (createDBClusterRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(createDBClusterRequest.getCopyTagsToSnapshot()));
        }

        if (createDBClusterRequest.getSourceRegion() != null) {
            request.addParameter("SourceRegion", StringUtils.fromString(createDBClusterRequest.getSourceRegion()));
        }

        return request;
    }

}
