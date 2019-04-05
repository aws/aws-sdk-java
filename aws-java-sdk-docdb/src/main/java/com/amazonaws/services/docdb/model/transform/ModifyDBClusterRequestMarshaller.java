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
package com.amazonaws.services.docdb.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.docdb.model.*;
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

        Request<ModifyDBClusterRequest> request = new DefaultRequest<ModifyDBClusterRequest>(modifyDBClusterRequest, "AmazonDocDB");
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

        if (modifyDBClusterRequest.getVpcSecurityGroupIds() != null) {
            java.util.List<String> vpcSecurityGroupIdsList = modifyDBClusterRequest.getVpcSecurityGroupIds();
            if (vpcSecurityGroupIdsList.isEmpty()) {
                request.addParameter("VpcSecurityGroupIds", "");
            } else {
                int vpcSecurityGroupIdsListIndex = 1;

                for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                    if (vpcSecurityGroupIdsListValue != null) {
                        request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                                StringUtils.fromString(vpcSecurityGroupIdsListValue));
                    }
                    vpcSecurityGroupIdsListIndex++;
                }
            }
        }

        if (modifyDBClusterRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(modifyDBClusterRequest.getPort()));
        }

        if (modifyDBClusterRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(modifyDBClusterRequest.getMasterUserPassword()));
        }

        if (modifyDBClusterRequest.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(modifyDBClusterRequest.getPreferredBackupWindow()));
        }

        if (modifyDBClusterRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyDBClusterRequest.getPreferredMaintenanceWindow()));
        }

        {
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration = modifyDBClusterRequest.getCloudwatchLogsExportConfiguration();
            if (cloudwatchLogsExportConfiguration != null) {

                if (cloudwatchLogsExportConfiguration.getEnableLogTypes() != null) {
                    java.util.List<String> enableLogTypesList = cloudwatchLogsExportConfiguration.getEnableLogTypes();
                    if (enableLogTypesList.isEmpty()) {
                        request.addParameter("CloudwatchLogsExportConfiguration.EnableLogTypes", "");
                    } else {
                        int enableLogTypesListIndex = 1;

                        for (String enableLogTypesListValue : enableLogTypesList) {
                            if (enableLogTypesListValue != null) {
                                request.addParameter("CloudwatchLogsExportConfiguration.EnableLogTypes.member." + enableLogTypesListIndex,
                                        StringUtils.fromString(enableLogTypesListValue));
                            }
                            enableLogTypesListIndex++;
                        }
                    }
                }

                if (cloudwatchLogsExportConfiguration.getDisableLogTypes() != null) {
                    java.util.List<String> disableLogTypesList = cloudwatchLogsExportConfiguration.getDisableLogTypes();
                    if (disableLogTypesList.isEmpty()) {
                        request.addParameter("CloudwatchLogsExportConfiguration.DisableLogTypes", "");
                    } else {
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
        }

        if (modifyDBClusterRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyDBClusterRequest.getEngineVersion()));
        }

        return request;
    }

}
