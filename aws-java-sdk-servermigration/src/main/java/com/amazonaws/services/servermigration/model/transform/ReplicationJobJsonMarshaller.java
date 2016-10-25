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
 * ReplicationJobMarshaller
 */
public class ReplicationJobJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReplicationJob replicationJob, StructuredJsonGenerator jsonGenerator) {

        if (replicationJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (replicationJob.getReplicationJobId() != null) {
                jsonGenerator.writeFieldName("replicationJobId").writeValue(replicationJob.getReplicationJobId());
            }
            if (replicationJob.getServerId() != null) {
                jsonGenerator.writeFieldName("serverId").writeValue(replicationJob.getServerId());
            }
            if (replicationJob.getServerType() != null) {
                jsonGenerator.writeFieldName("serverType").writeValue(replicationJob.getServerType());
            }
            if (replicationJob.getVmServer() != null) {
                jsonGenerator.writeFieldName("vmServer");
                VmServerJsonMarshaller.getInstance().marshall(replicationJob.getVmServer(), jsonGenerator);
            }
            if (replicationJob.getSeedReplicationTime() != null) {
                jsonGenerator.writeFieldName("seedReplicationTime").writeValue(replicationJob.getSeedReplicationTime());
            }
            if (replicationJob.getFrequency() != null) {
                jsonGenerator.writeFieldName("frequency").writeValue(replicationJob.getFrequency());
            }
            if (replicationJob.getNextReplicationRunStartTime() != null) {
                jsonGenerator.writeFieldName("nextReplicationRunStartTime").writeValue(replicationJob.getNextReplicationRunStartTime());
            }
            if (replicationJob.getLicenseType() != null) {
                jsonGenerator.writeFieldName("licenseType").writeValue(replicationJob.getLicenseType());
            }
            if (replicationJob.getRoleName() != null) {
                jsonGenerator.writeFieldName("roleName").writeValue(replicationJob.getRoleName());
            }
            if (replicationJob.getLatestAmiId() != null) {
                jsonGenerator.writeFieldName("latestAmiId").writeValue(replicationJob.getLatestAmiId());
            }
            if (replicationJob.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(replicationJob.getState());
            }
            if (replicationJob.getStatusMessage() != null) {
                jsonGenerator.writeFieldName("statusMessage").writeValue(replicationJob.getStatusMessage());
            }
            if (replicationJob.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(replicationJob.getDescription());
            }

            java.util.List<ReplicationRun> replicationRunListList = replicationJob.getReplicationRunList();
            if (replicationRunListList != null) {
                jsonGenerator.writeFieldName("replicationRunList");
                jsonGenerator.writeStartArray();
                for (ReplicationRun replicationRunListListValue : replicationRunListList) {
                    if (replicationRunListListValue != null) {

                        ReplicationRunJsonMarshaller.getInstance().marshall(replicationRunListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationJobJsonMarshaller instance;

    public static ReplicationJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationJobJsonMarshaller();
        return instance;
    }

}
