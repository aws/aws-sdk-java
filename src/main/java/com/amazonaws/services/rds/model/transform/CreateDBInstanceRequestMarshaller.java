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
 * Create D B Instance Request Marshaller
 */
public class CreateDBInstanceRequestMarshaller implements Marshaller<Request<CreateDBInstanceRequest>, CreateDBInstanceRequest> {

    public Request<CreateDBInstanceRequest> marshall(CreateDBInstanceRequest createDBInstanceRequest) {

        if (createDBInstanceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateDBInstanceRequest> request = new DefaultRequest<CreateDBInstanceRequest>(createDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBInstance");
        request.addParameter("Version", "2013-09-09");

        if (createDBInstanceRequest.getDBName() != null) {
            request.addParameter("DBName", StringUtils.fromString(createDBInstanceRequest.getDBName()));
        }
        if (createDBInstanceRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(createDBInstanceRequest.getDBInstanceIdentifier()));
        }
        if (createDBInstanceRequest.getAllocatedStorage() != null) {
            request.addParameter("AllocatedStorage", StringUtils.fromInteger(createDBInstanceRequest.getAllocatedStorage()));
        }
        if (createDBInstanceRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(createDBInstanceRequest.getDBInstanceClass()));
        }
        if (createDBInstanceRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createDBInstanceRequest.getEngine()));
        }
        if (createDBInstanceRequest.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils.fromString(createDBInstanceRequest.getMasterUsername()));
        }
        if (createDBInstanceRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(createDBInstanceRequest.getMasterUserPassword()));
        }

        java.util.List<String> dBSecurityGroupsList = createDBInstanceRequest.getDBSecurityGroups();
        int dBSecurityGroupsListIndex = 1;

        for (String dBSecurityGroupsListValue : dBSecurityGroupsList) {
            if (dBSecurityGroupsListValue != null) {
                request.addParameter("DBSecurityGroups.DBSecurityGroupName." + dBSecurityGroupsListIndex, StringUtils.fromString(dBSecurityGroupsListValue));
            }

            dBSecurityGroupsListIndex++;
        }

        java.util.List<String> vpcSecurityGroupIdsList = createDBInstanceRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
        }
        if (createDBInstanceRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createDBInstanceRequest.getAvailabilityZone()));
        }
        if (createDBInstanceRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(createDBInstanceRequest.getDBSubnetGroupName()));
        }
        if (createDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(createDBInstanceRequest.getPreferredMaintenanceWindow()));
        }
        if (createDBInstanceRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(createDBInstanceRequest.getDBParameterGroupName()));
        }
        if (createDBInstanceRequest.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils.fromInteger(createDBInstanceRequest.getBackupRetentionPeriod()));
        }
        if (createDBInstanceRequest.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils.fromString(createDBInstanceRequest.getPreferredBackupWindow()));
        }
        if (createDBInstanceRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(createDBInstanceRequest.getPort()));
        }
        if (createDBInstanceRequest.isMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(createDBInstanceRequest.isMultiAZ()));
        }
        if (createDBInstanceRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(createDBInstanceRequest.getEngineVersion()));
        }
        if (createDBInstanceRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(createDBInstanceRequest.isAutoMinorVersionUpgrade()));
        }
        if (createDBInstanceRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(createDBInstanceRequest.getLicenseModel()));
        }
        if (createDBInstanceRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(createDBInstanceRequest.getIops()));
        }
        if (createDBInstanceRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(createDBInstanceRequest.getOptionGroupName()));
        }
        if (createDBInstanceRequest.getCharacterSetName() != null) {
            request.addParameter("CharacterSetName", StringUtils.fromString(createDBInstanceRequest.getCharacterSetName()));
        }
        if (createDBInstanceRequest.isPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(createDBInstanceRequest.isPubliclyAccessible()));
        }

        java.util.List<Tag> tagsList = createDBInstanceRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
            }

            tagsListIndex++;
        }


        return request;
    }
}
