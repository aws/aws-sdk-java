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

package com.amazonaws.services.kinesis.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesis.model.*;
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

            if (streamDescription.getStreamName() != null) {
                jsonWriter.key("StreamName").value(
                        streamDescription.getStreamName());
            }

            if (streamDescription.getStreamARN() != null) {
                jsonWriter.key("StreamARN").value(
                        streamDescription.getStreamARN());
            }

            if (streamDescription.getStreamStatus() != null) {
                jsonWriter.key("StreamStatus").value(
                        streamDescription.getStreamStatus());
            }

            com.amazonaws.internal.SdkInternalList<Shard> shardsList = (com.amazonaws.internal.SdkInternalList<Shard>) streamDescription
                    .getShards();
            if (!shardsList.isEmpty() || !shardsList.isAutoConstruct()) {
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

            if (streamDescription.getHasMoreShards() != null) {
                jsonWriter.key("HasMoreShards").value(
                        streamDescription.getHasMoreShards());
            }

            if (streamDescription.getRetentionPeriodHours() != null) {
                jsonWriter.key("RetentionPeriodHours").value(
                        streamDescription.getRetentionPeriodHours());
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
