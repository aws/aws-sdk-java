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
 * ReplicationTaskStatsMarshaller
 */
public class ReplicationTaskStatsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReplicationTaskStats replicationTaskStats, StructuredJsonGenerator jsonGenerator) {

        if (replicationTaskStats == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (replicationTaskStats.getFullLoadProgressPercent() != null) {
                jsonGenerator.writeFieldName("FullLoadProgressPercent").writeValue(replicationTaskStats.getFullLoadProgressPercent());
            }
            if (replicationTaskStats.getElapsedTimeMillis() != null) {
                jsonGenerator.writeFieldName("ElapsedTimeMillis").writeValue(replicationTaskStats.getElapsedTimeMillis());
            }
            if (replicationTaskStats.getTablesLoaded() != null) {
                jsonGenerator.writeFieldName("TablesLoaded").writeValue(replicationTaskStats.getTablesLoaded());
            }
            if (replicationTaskStats.getTablesLoading() != null) {
                jsonGenerator.writeFieldName("TablesLoading").writeValue(replicationTaskStats.getTablesLoading());
            }
            if (replicationTaskStats.getTablesQueued() != null) {
                jsonGenerator.writeFieldName("TablesQueued").writeValue(replicationTaskStats.getTablesQueued());
            }
            if (replicationTaskStats.getTablesErrored() != null) {
                jsonGenerator.writeFieldName("TablesErrored").writeValue(replicationTaskStats.getTablesErrored());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationTaskStatsJsonMarshaller instance;

    public static ReplicationTaskStatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskStatsJsonMarshaller();
        return instance;
    }

}
