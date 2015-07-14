/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * StreamDescriptionMarshaller
 */
public class StreamDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(StreamDescription streamDescription,
            JSONWriter jsonWriter) {
        if (streamDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (streamDescription.getStreamArn() != null) {
                jsonWriter.key("StreamArn").value(
                        streamDescription.getStreamArn());
            }

            if (streamDescription.getStreamLabel() != null) {
                jsonWriter.key("StreamLabel").value(
                        streamDescription.getStreamLabel());
            }

            if (streamDescription.getStreamStatus() != null) {
                jsonWriter.key("StreamStatus").value(
                        streamDescription.getStreamStatus());
            }

            if (streamDescription.getStreamViewType() != null) {
                jsonWriter.key("StreamViewType").value(
                        streamDescription.getStreamViewType());
            }

            if (streamDescription.getCreationRequestDateTime() != null) {
                jsonWriter.key("CreationRequestDateTime").value(
                        streamDescription.getCreationRequestDateTime());
            }

            if (streamDescription.getTableName() != null) {
                jsonWriter.key("TableName").value(
                        streamDescription.getTableName());
            }

            java.util.List<KeySchemaElement> keySchemaList = streamDescription
                    .getKeySchema();
            if (keySchemaList != null) {
                jsonWriter.key("KeySchema");
                jsonWriter.array();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(
                                keySchemaListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<Shard> shardsList = streamDescription.getShards();
            if (shardsList != null) {
                jsonWriter.key("Shards");
                jsonWriter.array();
                for (Shard shardsListValue : shardsList) {
                    if (shardsListValue != null) {

                        ShardJsonMarshaller.getInstance().marshall(
                                shardsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (streamDescription.getLastEvaluatedShardId() != null) {
                jsonWriter.key("LastEvaluatedShardId").value(
                        streamDescription.getLastEvaluatedShardId());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StreamDescriptionJsonMarshaller instance;

    public static StreamDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamDescriptionJsonMarshaller();
        return instance;
    }

}
