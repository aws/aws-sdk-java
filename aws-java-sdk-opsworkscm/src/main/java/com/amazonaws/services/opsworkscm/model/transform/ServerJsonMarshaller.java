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
 * ServerMarshaller
 */
public class ServerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Server server, StructuredJsonGenerator jsonGenerator) {

        if (server == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (server.getBackupRetentionCount() != null) {
                jsonGenerator.writeFieldName("BackupRetentionCount").writeValue(server.getBackupRetentionCount());
            }
            if (server.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(server.getServerName());
            }
            if (server.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(server.getCreatedAt());
            }
            if (server.getDisableAutomatedBackup() != null) {
                jsonGenerator.writeFieldName("DisableAutomatedBackup").writeValue(server.getDisableAutomatedBackup());
            }
            if (server.getEndpoint() != null) {
                jsonGenerator.writeFieldName("Endpoint").writeValue(server.getEndpoint());
            }
            if (server.getEngine() != null) {
                jsonGenerator.writeFieldName("Engine").writeValue(server.getEngine());
            }
            if (server.getEngineModel() != null) {
                jsonGenerator.writeFieldName("EngineModel").writeValue(server.getEngineModel());
            }

            java.util.List<EngineAttribute> engineAttributesList = server.getEngineAttributes();
            if (engineAttributesList != null) {
                jsonGenerator.writeFieldName("EngineAttributes");
                jsonGenerator.writeStartArray();
                for (EngineAttribute engineAttributesListValue : engineAttributesList) {
                    if (engineAttributesListValue != null) {

                        EngineAttributeJsonMarshaller.getInstance().marshall(engineAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (server.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(server.getEngineVersion());
            }
            if (server.getInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("InstanceProfileArn").writeValue(server.getInstanceProfileArn());
            }
            if (server.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(server.getInstanceType());
            }
            if (server.getKeyPair() != null) {
                jsonGenerator.writeFieldName("KeyPair").writeValue(server.getKeyPair());
            }
            if (server.getMaintenanceStatus() != null) {
                jsonGenerator.writeFieldName("MaintenanceStatus").writeValue(server.getMaintenanceStatus());
            }
            if (server.getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow").writeValue(server.getPreferredMaintenanceWindow());
            }
            if (server.getPreferredBackupWindow() != null) {
                jsonGenerator.writeFieldName("PreferredBackupWindow").writeValue(server.getPreferredBackupWindow());
            }

            java.util.List<String> securityGroupIdsList = server.getSecurityGroupIds();
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
            if (server.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(server.getServiceRoleArn());
            }
            if (server.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(server.getStatus());
            }
            if (server.getStatusReason() != null) {
                jsonGenerator.writeFieldName("StatusReason").writeValue(server.getStatusReason());
            }

            java.util.List<String> subnetIdsList = server.getSubnetIds();
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
            if (server.getServerArn() != null) {
                jsonGenerator.writeFieldName("ServerArn").writeValue(server.getServerArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServerJsonMarshaller instance;

    public static ServerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServerJsonMarshaller();
        return instance;
    }

}
