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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
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
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ReplicationInstance replicationInstance,
            JSONWriter jsonWriter) {
        if (replicationInstance == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (replicationInstance.getReplicationInstanceIdentifier() != null) {
                jsonWriter.key("ReplicationInstanceIdentifier").value(
                        replicationInstance.getReplicationInstanceIdentifier());
            }
            if (replicationInstance.getReplicationInstanceClass() != null) {
                jsonWriter.key("ReplicationInstanceClass").value(
                        replicationInstance.getReplicationInstanceClass());
            }
            if (replicationInstance.getReplicationInstanceStatus() != null) {
                jsonWriter.key("ReplicationInstanceStatus").value(
                        replicationInstance.getReplicationInstanceStatus());
            }
            if (replicationInstance.getAllocatedStorage() != null) {
                jsonWriter.key("AllocatedStorage").value(
                        replicationInstance.getAllocatedStorage());
            }
            if (replicationInstance.getInstanceCreateTime() != null) {
                jsonWriter.key("InstanceCreateTime").value(
                        replicationInstance.getInstanceCreateTime());
            }
            if (replicationInstance.getAvailabilityZone() != null) {
                jsonWriter.key("AvailabilityZone").value(
                        replicationInstance.getAvailabilityZone());
            }
            if (replicationInstance.getReplicationSubnetGroup() != null) {
                jsonWriter.key("ReplicationSubnetGroup");
                ReplicationSubnetGroupJsonMarshaller.getInstance().marshall(
                        replicationInstance.getReplicationSubnetGroup(),
                        jsonWriter);
            }
            if (replicationInstance.getPreferredMaintenanceWindow() != null) {
                jsonWriter.key("PreferredMaintenanceWindow").value(
                        replicationInstance.getPreferredMaintenanceWindow());
            }
            if (replicationInstance.getPendingModifiedValues() != null) {
                jsonWriter.key("PendingModifiedValues");
                ReplicationPendingModifiedValuesJsonMarshaller.getInstance()
                        .marshall(
                                replicationInstance.getPendingModifiedValues(),
                                jsonWriter);
            }
            if (replicationInstance.getEngineVersion() != null) {
                jsonWriter.key("EngineVersion").value(
                        replicationInstance.getEngineVersion());
            }
            if (replicationInstance.getAutoMinorVersionUpgrade() != null) {
                jsonWriter.key("AutoMinorVersionUpgrade").value(
                        replicationInstance.getAutoMinorVersionUpgrade());
            }
            if (replicationInstance.getKmsKeyId() != null) {
                jsonWriter.key("KmsKeyId").value(
                        replicationInstance.getKmsKeyId());
            }
            if (replicationInstance.getReplicationInstanceArn() != null) {
                jsonWriter.key("ReplicationInstanceArn").value(
                        replicationInstance.getReplicationInstanceArn());
            }
            if (replicationInstance.getReplicationInstancePublicIpAddress() != null) {
                jsonWriter.key("ReplicationInstancePublicIpAddress").value(
                        replicationInstance
                                .getReplicationInstancePublicIpAddress());
            }
            if (replicationInstance.getReplicationInstancePrivateIpAddress() != null) {
                jsonWriter.key("ReplicationInstancePrivateIpAddress").value(
                        replicationInstance
                                .getReplicationInstancePrivateIpAddress());
            }
            if (replicationInstance.getPubliclyAccessible() != null) {
                jsonWriter.key("PubliclyAccessible").value(
                        replicationInstance.getPubliclyAccessible());
            }

            jsonWriter.endObject();
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
