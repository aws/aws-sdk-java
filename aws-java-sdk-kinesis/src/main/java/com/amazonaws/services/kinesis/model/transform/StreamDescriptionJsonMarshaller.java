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
package com.amazonaws.services.kinesis.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StreamDescriptionMarshaller
 */
public class StreamDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StreamDescription streamDescription, StructuredJsonGenerator jsonGenerator) {

        if (streamDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (streamDescription.getStreamName() != null) {
                jsonGenerator.writeFieldName("StreamName").writeValue(streamDescription.getStreamName());
            }
            if (streamDescription.getStreamARN() != null) {
                jsonGenerator.writeFieldName("StreamARN").writeValue(streamDescription.getStreamARN());
            }
            if (streamDescription.getStreamStatus() != null) {
                jsonGenerator.writeFieldName("StreamStatus").writeValue(streamDescription.getStreamStatus());
            }

            com.amazonaws.internal.SdkInternalList<Shard> shardsList = (com.amazonaws.internal.SdkInternalList<Shard>) streamDescription.getShards();
            if (!shardsList.isEmpty() || !shardsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Shards");
                jsonGenerator.writeStartArray();
                for (Shard shardsListValue : shardsList) {
                    if (shardsListValue != null) {

                        ShardJsonMarshaller.getInstance().marshall(shardsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (streamDescription.getHasMoreShards() != null) {
                jsonGenerator.writeFieldName("HasMoreShards").writeValue(streamDescription.getHasMoreShards());
            }
            if (streamDescription.getRetentionPeriodHours() != null) {
                jsonGenerator.writeFieldName("RetentionPeriodHours").writeValue(streamDescription.getRetentionPeriodHours());
            }
            if (streamDescription.getStreamCreationTimestamp() != null) {
                jsonGenerator.writeFieldName("StreamCreationTimestamp").writeValue(streamDescription.getStreamCreationTimestamp());
            }

            com.amazonaws.internal.SdkInternalList<EnhancedMetrics> enhancedMonitoringList = (com.amazonaws.internal.SdkInternalList<EnhancedMetrics>) streamDescription
                    .getEnhancedMonitoring();
            if (!enhancedMonitoringList.isEmpty() || !enhancedMonitoringList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EnhancedMonitoring");
                jsonGenerator.writeStartArray();
                for (EnhancedMetrics enhancedMonitoringListValue : enhancedMonitoringList) {
                    if (enhancedMonitoringListValue != null) {

                        EnhancedMetricsJsonMarshaller.getInstance().marshall(enhancedMonitoringListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StreamDescriptionJsonMarshaller instance;

    public static StreamDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionJsonMarshaller();
        return instance;
    }

}
