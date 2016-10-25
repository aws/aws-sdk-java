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
package com.amazonaws.services.servermigration.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ReplicationRunMarshaller
 */
public class ReplicationRunJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReplicationRun replicationRun, StructuredJsonGenerator jsonGenerator) {

        if (replicationRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (replicationRun.getReplicationRunId() != null) {
                jsonGenerator.writeFieldName("replicationRunId").writeValue(replicationRun.getReplicationRunId());
            }
            if (replicationRun.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(replicationRun.getState());
            }
            if (replicationRun.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(replicationRun.getType());
            }
            if (replicationRun.getStatusMessage() != null) {
                jsonGenerator.writeFieldName("statusMessage").writeValue(replicationRun.getStatusMessage());
            }
            if (replicationRun.getAmiId() != null) {
                jsonGenerator.writeFieldName("amiId").writeValue(replicationRun.getAmiId());
            }
            if (replicationRun.getScheduledStartTime() != null) {
                jsonGenerator.writeFieldName("scheduledStartTime").writeValue(replicationRun.getScheduledStartTime());
            }
            if (replicationRun.getCompletedTime() != null) {
                jsonGenerator.writeFieldName("completedTime").writeValue(replicationRun.getCompletedTime());
            }
            if (replicationRun.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(replicationRun.getDescription());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationRunJsonMarshaller instance;

    public static ReplicationRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationRunJsonMarshaller();
        return instance;
    }

}
