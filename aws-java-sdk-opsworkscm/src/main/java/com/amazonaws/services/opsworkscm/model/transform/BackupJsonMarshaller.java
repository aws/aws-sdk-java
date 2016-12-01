/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworkscm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworkscm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * BackupMarshaller
 */
public class BackupJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Backup backup, StructuredJsonGenerator jsonGenerator) {

        if (backup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (backup.getBackupArn() != null) {
                jsonGenerator.writeFieldName("BackupArn").writeValue(backup.getBackupArn());
            }
            if (backup.getBackupId() != null) {
                jsonGenerator.writeFieldName("BackupId").writeValue(backup.getBackupId());
            }
            if (backup.getBackupType() != null) {
                jsonGenerator.writeFieldName("BackupType").writeValue(backup.getBackupType());
            }
            if (backup.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(backup.getCreatedAt());
            }
            if (backup.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(backup.getDescription());
            }
            if (backup.getEngine() != null) {
                jsonGenerator.writeFieldName("Engine").writeValue(backup.getEngine());
            }
            if (backup.getEngineModel() != null) {
                jsonGenerator.writeFieldName("EngineModel").writeValue(backup.getEngineModel());
            }
            if (backup.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(backup.getEngineVersion());
            }
            if (backup.getInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("InstanceProfileArn").writeValue(backup.getInstanceProfileArn());
            }
            if (backup.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(backup.getInstanceType());
            }
            if (backup.getKeyPair() != null) {
                jsonGenerator.writeFieldName("KeyPair").writeValue(backup.getKeyPair());
            }
            if (backup.getPreferredBackupWindow() != null) {
                jsonGenerator.writeFieldName("PreferredBackupWindow").writeValue(backup.getPreferredBackupWindow());
            }
            if (backup.getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow").writeValue(backup.getPreferredMaintenanceWindow());
            }
            if (backup.getS3DataSize() != null) {
                jsonGenerator.writeFieldName("S3DataSize").writeValue(backup.getS3DataSize());
            }
            if (backup.getS3DataUrl() != null) {
                jsonGenerator.writeFieldName("S3DataUrl").writeValue(backup.getS3DataUrl());
            }
            if (backup.getS3LogUrl() != null) {
                jsonGenerator.writeFieldName("S3LogUrl").writeValue(backup.getS3LogUrl());
            }

            java.util.List<String> securityGroupIdsList = backup.getSecurityGroupIds();
            if (securityGroupIdsList != null) {
                jsonGenerator.writeFieldName("SecurityGroupIds");
                jsonGenerator.writeStartArray();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonGenerator.writeValue(securityGroupIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (backup.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(backup.getServerName());
            }
            if (backup.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(backup.getServiceRoleArn());
            }
            if (backup.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(backup.getStatus());
            }
            if (backup.getStatusDescription() != null) {
                jsonGenerator.writeFieldName("StatusDescription").writeValue(backup.getStatusDescription());
            }

            java.util.List<String> subnetIdsList = backup.getSubnetIds();
            if (subnetIdsList != null) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (backup.getToolsVersion() != null) {
                jsonGenerator.writeFieldName("ToolsVersion").writeValue(backup.getToolsVersion());
            }
            if (backup.getUserArn() != null) {
                jsonGenerator.writeFieldName("UserArn").writeValue(backup.getUserArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BackupJsonMarshaller instance;

    public static BackupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupJsonMarshaller();
        return instance;
    }

}
