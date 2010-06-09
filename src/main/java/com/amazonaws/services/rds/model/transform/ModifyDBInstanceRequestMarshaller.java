/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        Request<ModifyDBInstanceRequest> request = new DefaultRequest<ModifyDBInstanceRequest>(modifyDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBInstance");
        request.addParameter("Version", "2010-01-01");
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getDBInstanceIdentifier() != null) {
                request.addParameter("DBInstanceIdentifier", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceIdentifier()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getAllocatedStorage() != null) {
                request.addParameter("AllocatedStorage", StringUtils.fromInteger(modifyDBInstanceRequest.getAllocatedStorage()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getDBInstanceClass() != null) {
                request.addParameter("DBInstanceClass", StringUtils.fromString(modifyDBInstanceRequest.getDBInstanceClass()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            java.util.List<String> dBSecurityGroupsList = modifyDBInstanceRequest.getDBSecurityGroups();
            int dBSecurityGroupsListIndex = 1;
            for (String dBSecurityGroupsListValue : dBSecurityGroupsList) { 
                if (dBSecurityGroupsListValue != null) {
                    request.addParameter("DBSecurityGroups.member." + dBSecurityGroupsListIndex, StringUtils.fromString(dBSecurityGroupsListValue));
                }
                dBSecurityGroupsListIndex++;
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.isApplyImmediately() != null) {
                request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyDBInstanceRequest.isApplyImmediately()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getMasterUserPassword() != null) {
                request.addParameter("MasterUserPassword", StringUtils.fromString(modifyDBInstanceRequest.getMasterUserPassword()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getDBParameterGroupName() != null) {
                request.addParameter("DBParameterGroupName", StringUtils.fromString(modifyDBInstanceRequest.getDBParameterGroupName()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getBackupRetentionPeriod() != null) {
                request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(modifyDBInstanceRequest.getBackupRetentionPeriod()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getPreferredBackupWindow() != null) {
                request.addParameter("PreferredBackupWindow", StringUtils.fromString(modifyDBInstanceRequest.getPreferredBackupWindow()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
                request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(modifyDBInstanceRequest.getPreferredMaintenanceWindow()));
            }
        }
        if (modifyDBInstanceRequest != null) {
            if (modifyDBInstanceRequest.isMultiAZ() != null) {
                request.addParameter("MultiAZ", StringUtils.fromBoolean(modifyDBInstanceRequest.isMultiAZ()));
            }
        }


        return request;
    }
}
