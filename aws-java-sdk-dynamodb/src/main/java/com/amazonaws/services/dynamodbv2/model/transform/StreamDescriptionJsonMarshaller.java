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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;
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

            if (streamDescription.getStreamArn() != null) {
                jsonGenerator.writeFieldName("StreamArn").writeValue(streamDescription.getStreamArn());
            }
            if (streamDescription.getStreamLabel() != null) {
                jsonGenerator.writeFieldName("StreamLabel").writeValue(streamDescription.getStreamLabel());
            }
            if (streamDescription.getStreamStatus() != null) {
                jsonGenerator.writeFieldName("StreamStatus").writeValue(streamDescription.getStreamStatus());
            }
            if (streamDescription.getStreamViewType() != null) {
                jsonGenerator.writeFieldName("StreamViewType").writeValue(streamDescription.getStreamViewType());
            }
            if (streamDescription.getCreationRequestDateTime() != null) {
                jsonGenerator.writeFieldName("CreationRequestDateTime").writeValue(streamDescription.getCreationRequestDateTime());
            }
            if (streamDescription.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(streamDescription.getTableName());
            }

            java.util.List<KeySchemaElement> keySchemaList = streamDescription.getKeySchema();
            if (keySchemaList != null) {
                jsonGenerator.writeFieldName("KeySchema");
                jsonGenerator.writeStartArray();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Shard> shardsList = streamDescription.getShards();
            if (shardsList != null) {
                jsonGenerator.writeFieldName("Shards");
                jsonGenerator.writeStartArray();
                for (Shard shardsListValue : shardsList) {
                    if (shardsListValue != null) {

                        ShardJsonMarshaller.getInstance().marshall(shardsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (streamDescription.getLastEvaluatedShardId() != null) {
                jsonGenerator.writeFieldName("LastEvaluatedShardId").writeValue(streamDescription.getLastEvaluatedShardId());
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
