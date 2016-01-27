/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create D B Cluster Request Marshaller
 */
public class CreateDBClusterRequestMarshaller implements Marshaller<Request<CreateDBClusterRequest>, CreateDBClusterRequest> {

    public Request<CreateDBClusterRequest> marshall(CreateDBClusterRequest createDBClusterRequest) {

        if (createDBClusterRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBClusterRequest> request = new DefaultRequest<CreateDBClusterRequest>(createDBClusterRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBCluster");
        request.addParameter("Version", "2014-10-31");

        java.util.List<String> availabilityZonesList = createDBClusterRequest.getAvailabilityZones();
        int availabilityZonesListIndex = 1;

        for (String availabilityZonesListValue : availabilityZonesList) {
            if (availabilityZonesListValue != null) {
                request.addParameter("AvailabilityZones.AvailabilityZone." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
            }

            availabilityZonesListIndex++;
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

        java.util.List<String> vpcSecurityGroupIdsList = createDBClusterRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
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

        java.util.List<Tag> tagsList = createDBClusterRequest.getTags();
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
        if (createDBClusterRequest.isStorageEncrypted() != null) {
            request.addParameter("StorageEncrypted", StringUtils.fromBoolean(createDBClusterRequest.isStorageEncrypted()));
        }
        if (createDBClusterRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createDBClusterRequest.getKmsKeyId()));
        }

        return request;
    }
}
