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
 * Create D B Instance Request Marshaller
 */        
public class CreateDBInstanceRequestMarshaller implements Marshaller<Request<CreateDBInstanceRequest>, CreateDBInstanceRequest> {

    public Request<CreateDBInstanceRequest> marshall(CreateDBInstanceRequest createDBInstanceRequest) {
        Request<CreateDBInstanceRequest> request = new DefaultRequest<CreateDBInstanceRequest>(createDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBInstance");
        request.addParameter("Version", "2010-01-01");
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getDBName() != null) {
                request.addParameter("DBName", StringUtils.fromString(createDBInstanceRequest.getDBName()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getDBInstanceIdentifier() != null) {
                request.addParameter("DBInstanceIdentifier", StringUtils.fromString(createDBInstanceRequest.getDBInstanceIdentifier()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getAllocatedStorage() != null) {
                request.addParameter("AllocatedStorage", StringUtils.fromInteger(createDBInstanceRequest.getAllocatedStorage()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getDBInstanceClass() != null) {
                request.addParameter("DBInstanceClass", StringUtils.fromString(createDBInstanceRequest.getDBInstanceClass()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getEngine() != null) {
                request.addParameter("Engine", StringUtils.fromString(createDBInstanceRequest.getEngine()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getMasterUsername() != null) {
                request.addParameter("MasterUsername", StringUtils.fromString(createDBInstanceRequest.getMasterUsername()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getMasterUserPassword() != null) {
                request.addParameter("MasterUserPassword", StringUtils.fromString(createDBInstanceRequest.getMasterUserPassword()));
            }
        }
        if (createDBInstanceRequest != null) {
            java.util.List<String> dBSecurityGroupsList = createDBInstanceRequest.getDBSecurityGroups();
            int dBSecurityGroupsListIndex = 1;
            for (String dBSecurityGroupsListValue : dBSecurityGroupsList) { 
                if (dBSecurityGroupsListValue != null) {
                    request.addParameter("DBSecurityGroups.member." + dBSecurityGroupsListIndex, StringUtils.fromString(dBSecurityGroupsListValue));
                }
                dBSecurityGroupsListIndex++;
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getAvailabilityZone() != null) {
                request.addParameter("AvailabilityZone", StringUtils.fromString(createDBInstanceRequest.getAvailabilityZone()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
                request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createDBInstanceRequest.getPreferredMaintenanceWindow()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getDBParameterGroupName() != null) {
                request.addParameter("DBParameterGroupName", StringUtils.fromString(createDBInstanceRequest.getDBParameterGroupName()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getBackupRetentionPeriod() != null) {
                request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(createDBInstanceRequest.getBackupRetentionPeriod()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getPreferredBackupWindow() != null) {
                request.addParameter("PreferredBackupWindow", StringUtils.fromString(createDBInstanceRequest.getPreferredBackupWindow()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.getPort() != null) {
                request.addParameter("Port", StringUtils.fromInteger(createDBInstanceRequest.getPort()));
            }
        }
        if (createDBInstanceRequest != null) {
            if (createDBInstanceRequest.isMultiAZ() != null) {
                request.addParameter("MultiAZ", StringUtils.fromBoolean(createDBInstanceRequest.isMultiAZ()));
            }
        }


        return request;
    }
}
