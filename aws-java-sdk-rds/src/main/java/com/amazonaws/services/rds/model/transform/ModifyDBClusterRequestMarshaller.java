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
 * ModifyDBClusterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBClusterRequestMarshaller implements Marshaller<Request<ModifyDBClusterRequest>, ModifyDBClusterRequest> {

    public Request<ModifyDBClusterRequest> marshall(ModifyDBClusterRequest modifyDBClusterRequest) {

        if (modifyDBClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBClusterRequest> request = new DefaultRequest<ModifyDBClusterRequest>(modifyDBClusterRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBClusterRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(modifyDBClusterRequest.getDBClusterIdentifier()));
        }

        if (modifyDBClusterRequest.getNewDBClusterIdentifier() != null) {
            request.addParameter("NewDBClusterIdentifier", StringUtils.fromString(modifyDBClusterRequest.getNewDBClusterIdentifier()));
        }

        if (modifyDBClusterRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyDBClusterRequest.getApplyImmediately()));
        }

        if (modifyDBClusterRequest.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(modifyDBClusterRequest.getBackupRetentionPeriod()));
        }

        if (modifyDBClusterRequest.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName", StringUtils.fromString(modifyDBClusterRequest.getDBClusterParameterGroupName()));
        }

        if (!modifyDBClusterRequest.getVpcSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBClusterRequest.getVpcSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBClusterRequest
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

        if (modifyDBClusterRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(modifyDBClusterRequest.getPort()));
        }

        if (modifyDBClusterRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(modifyDBClusterRequest.getMasterUserPassword()));
        }

        if (modifyDBClusterRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(modifyDBClusterRequest.getOptionGroupName()));
        }

        if (modifyDBClusterRequest.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(modifyDBClusterRequest.getPreferredBackupWindow()));
        }

        if (modifyDBClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyDBClusterRequest.getPreferredMaintenanceWindow()));
        }

        if (modifyDBClusterRequest.getEnableIAMDatabaseAuthentication() != null) {
            request.addParameter("EnableIAMDatabaseAuthentication", StringUtils.fromBoolean(modifyDBClusterRequest.getEnableIAMDatabaseAuthentication()));
        }

        if (modifyDBClusterRequest.getBacktrackWindow() != null) {
            request.addParameter("BacktrackWindow", StringUtils.fromLong(modifyDBClusterRequest.getBacktrackWindow()));
        }

        {
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration = modifyDBClusterRequest.getCloudwatchLogsExportConfiguration();
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

        if (modifyDBClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyDBClusterRequest.getEngineVersion()));
        }

        {
            ScalingConfiguration scalingConfiguration = modifyDBClusterRequest.getScalingConfiguration();
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

        if (modifyDBClusterRequest.getDeletionProtection() != null) {
            request.addParameter("DeletionProtection", StringUtils.fromBoolean(modifyDBClusterRequest.getDeletionProtection()));
        }

        if (modifyDBClusterRequest.getEnableHttpEndpoint() != null) {
            request.addParameter("EnableHttpEndpoint", StringUtils.fromBoolean(modifyDBClusterRequest.getEnableHttpEndpoint()));
        }

        if (modifyDBClusterRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils.fromBoolean(modifyDBClusterRequest.getCopyTagsToSnapshot()));
        }

        return request;
    }

}
