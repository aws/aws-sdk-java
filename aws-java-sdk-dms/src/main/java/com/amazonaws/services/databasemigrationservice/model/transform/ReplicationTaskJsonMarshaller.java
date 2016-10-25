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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ReplicationTaskMarshaller
 */
public class ReplicationTaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReplicationTask replicationTask, StructuredJsonGenerator jsonGenerator) {

        if (replicationTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (replicationTask.getReplicationTaskIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskIdentifier").writeValue(replicationTask.getReplicationTaskIdentifier());
            }
            if (replicationTask.getSourceEndpointArn() != null) {
                jsonGenerator.writeFieldName("SourceEndpointArn").writeValue(replicationTask.getSourceEndpointArn());
            }
            if (replicationTask.getTargetEndpointArn() != null) {
                jsonGenerator.writeFieldName("TargetEndpointArn").writeValue(replicationTask.getTargetEndpointArn());
            }
            if (replicationTask.getReplicationInstanceArn() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceArn").writeValue(replicationTask.getReplicationInstanceArn());
            }
            if (replicationTask.getMigrationType() != null) {
                jsonGenerator.writeFieldName("MigrationType").writeValue(replicationTask.getMigrationType());
            }
            if (replicationTask.getTableMappings() != null) {
                jsonGenerator.writeFieldName("TableMappings").writeValue(replicationTask.getTableMappings());
            }
            if (replicationTask.getReplicationTaskSettings() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskSettings").writeValue(replicationTask.getReplicationTaskSettings());
            }
            if (replicationTask.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(replicationTask.getStatus());
            }
            if (replicationTask.getLastFailureMessage() != null) {
                jsonGenerator.writeFieldName("LastFailureMessage").writeValue(replicationTask.getLastFailureMessage());
            }
            if (replicationTask.getReplicationTaskCreationDate() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskCreationDate").writeValue(replicationTask.getReplicationTaskCreationDate());
            }
            if (replicationTask.getReplicationTaskStartDate() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskStartDate").writeValue(replicationTask.getReplicationTaskStartDate());
            }
            if (replicationTask.getReplicationTaskArn() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskArn").writeValue(replicationTask.getReplicationTaskArn());
            }
            if (replicationTask.getReplicationTaskStats() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskStats");
                ReplicationTaskStatsJsonMarshaller.getInstance().marshall(replicationTask.getReplicationTaskStats(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationTaskJsonMarshaller instance;

    public static ReplicationTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskJsonMarshaller();
        return instance;
    }

}
