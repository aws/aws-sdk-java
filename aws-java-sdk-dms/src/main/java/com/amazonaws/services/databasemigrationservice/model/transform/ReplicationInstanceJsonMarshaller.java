/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ReplicationInstanceMarshaller
 */
public class ReplicationInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReplicationInstance replicationInstance,
            StructuredJsonGenerator jsonGenerator) {

        if (replicationInstance == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (replicationInstance.getReplicationInstanceIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceIdentifier")
                        .writeValue(
                                replicationInstance
                                        .getReplicationInstanceIdentifier());
            }
            if (replicationInstance.getReplicationInstanceClass() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceClass")
                        .writeValue(
                                replicationInstance
                                        .getReplicationInstanceClass());
            }
            if (replicationInstance.getReplicationInstanceStatus() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceStatus")
                        .writeValue(
                                replicationInstance
                                        .getReplicationInstanceStatus());
            }
            if (replicationInstance.getAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("AllocatedStorage").writeValue(
                        replicationInstance.getAllocatedStorage());
            }
            if (replicationInstance.getInstanceCreateTime() != null) {
                jsonGenerator.writeFieldName("InstanceCreateTime").writeValue(
                        replicationInstance.getInstanceCreateTime());
            }
            if (replicationInstance.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(
                        replicationInstance.getAvailabilityZone());
            }
            if (replicationInstance.getReplicationSubnetGroup() != null) {
                jsonGenerator.writeFieldName("ReplicationSubnetGroup");
                ReplicationSubnetGroupJsonMarshaller.getInstance().marshall(
                        replicationInstance.getReplicationSubnetGroup(),
                        jsonGenerator);
            }
            if (replicationInstance.getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow")
                        .writeValue(
                                replicationInstance
                                        .getPreferredMaintenanceWindow());
            }
            if (replicationInstance.getPendingModifiedValues() != null) {
                jsonGenerator.writeFieldName("PendingModifiedValues");
                ReplicationPendingModifiedValuesJsonMarshaller.getInstance()
                        .marshall(
                                replicationInstance.getPendingModifiedValues(),
                                jsonGenerator);
            }
            if (replicationInstance.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(
                        replicationInstance.getEngineVersion());
            }
            if (replicationInstance.getAutoMinorVersionUpgrade() != null) {
                jsonGenerator.writeFieldName("AutoMinorVersionUpgrade")
                        .writeValue(
                                replicationInstance
                                        .getAutoMinorVersionUpgrade());
            }
            if (replicationInstance.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(
                        replicationInstance.getKmsKeyId());
            }
            if (replicationInstance.getReplicationInstanceArn() != null) {
                jsonGenerator
                        .writeFieldName("ReplicationInstanceArn")
                        .writeValue(
                                replicationInstance.getReplicationInstanceArn());
            }
            if (replicationInstance.getReplicationInstancePublicIpAddress() != null) {
                jsonGenerator.writeFieldName(
                        "ReplicationInstancePublicIpAddress").writeValue(
                        replicationInstance
                                .getReplicationInstancePublicIpAddress());
            }
            if (replicationInstance.getReplicationInstancePrivateIpAddress() != null) {
                jsonGenerator.writeFieldName(
                        "ReplicationInstancePrivateIpAddress").writeValue(
                        replicationInstance
                                .getReplicationInstancePrivateIpAddress());
            }
            if (replicationInstance.getPubliclyAccessible() != null) {
                jsonGenerator.writeFieldName("PubliclyAccessible").writeValue(
                        replicationInstance.getPubliclyAccessible());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationInstanceJsonMarshaller instance;

    public static ReplicationInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationInstanceJsonMarshaller();
        return instance;
    }

}
