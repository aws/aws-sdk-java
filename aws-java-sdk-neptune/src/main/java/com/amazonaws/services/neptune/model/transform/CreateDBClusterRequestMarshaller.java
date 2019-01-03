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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
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

        Request<CreateDBClusterRequest> request = new DefaultRequest<CreateDBClusterRequest>(createDBClusterRequest, "AmazonNeptune");
        request.addParameter("Action", "CreateDBCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBClusterRequest.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZonesList = createDBClusterRequest.getAvailabilityZones();
            if (availabilityZonesList.isEmpty()) {
                request.addParameter("AvailabilityZones", "");
            } else {
                int availabilityZonesListIndex = 1;

                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        request.addParameter("AvailabilityZones.AvailabilityZone." + availabilityZonesListIndex,
                                StringUtils.fromString(availabilityZonesListValue));
                    }
                    availabilityZonesListIndex++;
                }
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

        if (createDBClusterRequest.getVpcSecurityGroupIds() != null) {
            java.util.List<String> vpcSecurityGroupIdsList = createDBClusterRequest.getVpcSecurityGroupIds();
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

        if (createDBClusterRequest.getTags() != null) {
            java.util.List<Tag> tagsList = createDBClusterRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
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

        return request;
    }

}
