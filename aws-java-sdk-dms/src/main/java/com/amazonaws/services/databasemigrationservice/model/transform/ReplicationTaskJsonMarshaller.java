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
 * ReplicationTaskMarshaller
 */
public class ReplicationTaskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ReplicationTask replicationTask, JSONWriter jsonWriter) {
        if (replicationTask == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (replicationTask.getReplicationTaskIdentifier() != null) {
                jsonWriter.key("ReplicationTaskIdentifier").value(
                        replicationTask.getReplicationTaskIdentifier());
            }
            if (replicationTask.getSourceEndpointArn() != null) {
                jsonWriter.key("SourceEndpointArn").value(
                        replicationTask.getSourceEndpointArn());
            }
            if (replicationTask.getTargetEndpointArn() != null) {
                jsonWriter.key("TargetEndpointArn").value(
                        replicationTask.getTargetEndpointArn());
            }
            if (replicationTask.getReplicationInstanceArn() != null) {
                jsonWriter.key("ReplicationInstanceArn").value(
                        replicationTask.getReplicationInstanceArn());
            }
            if (replicationTask.getMigrationType() != null) {
                jsonWriter.key("MigrationType").value(
                        replicationTask.getMigrationType());
            }
            if (replicationTask.getTableMappings() != null) {
                jsonWriter.key("TableMappings").value(
                        replicationTask.getTableMappings());
            }
            if (replicationTask.getReplicationTaskSettings() != null) {
                jsonWriter.key("ReplicationTaskSettings").value(
                        replicationTask.getReplicationTaskSettings());
            }
            if (replicationTask.getStatus() != null) {
                jsonWriter.key("Status").value(replicationTask.getStatus());
            }
            if (replicationTask.getLastFailureMessage() != null) {
                jsonWriter.key("LastFailureMessage").value(
                        replicationTask.getLastFailureMessage());
            }
            if (replicationTask.getReplicationTaskCreationDate() != null) {
                jsonWriter.key("ReplicationTaskCreationDate").value(
                        replicationTask.getReplicationTaskCreationDate());
            }
            if (replicationTask.getReplicationTaskStartDate() != null) {
                jsonWriter.key("ReplicationTaskStartDate").value(
                        replicationTask.getReplicationTaskStartDate());
            }
            if (replicationTask.getReplicationTaskArn() != null) {
                jsonWriter.key("ReplicationTaskArn").value(
                        replicationTask.getReplicationTaskArn());
            }
            if (replicationTask.getReplicationTaskStats() != null) {
                jsonWriter.key("ReplicationTaskStats");
                ReplicationTaskStatsJsonMarshaller.getInstance().marshall(
                        replicationTask.getReplicationTaskStats(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationTaskJsonMarshaller instance;

    public static ReplicationTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskJsonMarshaller();
        return instance;
    }

}
