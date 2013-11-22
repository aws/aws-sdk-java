/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify D B Instance Request Marshaller
 */
public class ModifyDBInstanceRequestMarshaller implements Marshaller<Request<ModifyDBInstanceRequest>, ModifyDBInstanceRequest> {

    public Request<ModifyDBInstanceRequest> marshall(ModifyDBInstanceRequest modifyDBInstanceRequest) {

        if (modifyDBInstanceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyDBInstanceRequest> request = new DefaultRequest<ModifyDBInstanceRequest>(modifyDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBInstance");
        request.addParameter("Version", "2013-09-09");

        if (modifyDBInstanceRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceIdentifier()));
        }
        if (modifyDBInstanceRequest.getAllocatedStorage() != null) {
            request.addParameter("AllocatedStorage", StringUtils.fromInteger(modifyDBInstanceRequest.getAllocatedStorage()));
        }
        if (modifyDBInstanceRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceClass()));
        }

        java.util.List<String> dBSecurityGroupsList = modifyDBInstanceRequest.getDBSecurityGroups();
        int dBSecurityGroupsListIndex = 1;

        for (String dBSecurityGroupsListValue : dBSecurityGroupsList) {
            if (dBSecurityGroupsListValue != null) {
                request.addParameter("DBSecurityGroups.DBSecurityGroupName." + dBSecurityGroupsListIndex, StringUtils.fromString(dBSecurityGroupsListValue));
            }

            dBSecurityGroupsListIndex++;
        }

        java.util.List<String> vpcSecurityGroupIdsList = modifyDBInstanceRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
        }
        if (modifyDBInstanceRequest.isApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyDBInstanceRequest.isApplyImmediately()));
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
        if (modifyDBInstanceRequest.isMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(modifyDBInstanceRequest.isMultiAZ()));
        }
        if (modifyDBInstanceRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyDBInstanceRequest.getEngineVersion()));
        }
        if (modifyDBInstanceRequest.isAllowMajorVersionUpgrade() != null) {
            request.addParameter("AllowMajorVersionUpgrade", StringUtils.fromBoolean(modifyDBInstanceRequest.isAllowMajorVersionUpgrade()));
        }
        if (modifyDBInstanceRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(modifyDBInstanceRequest.isAutoMinorVersionUpgrade()));
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


        return request;
    }
}
