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
 * StreamRecordMarshaller
 */
public class StreamRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(StreamRecord streamRecord, JSONWriter jsonWriter) {
        if (streamRecord == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            java.util.Map<String, AttributeValue> keysMap = streamRecord
                    .getKeys();
            if (keysMap != null) {
                jsonWriter.key("Keys");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> keysMapValue : keysMap
                        .entrySet()) {
                    if (keysMapValue.getValue() != null) {
                        jsonWriter.key(keysMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                keysMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, AttributeValue> newImageMap = streamRecord
                    .getNewImage();
            if (newImageMap != null) {
                jsonWriter.key("NewImage");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> newImageMapValue : newImageMap
                        .entrySet()) {
                    if (newImageMapValue.getValue() != null) {
                        jsonWriter.key(newImageMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                newImageMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, AttributeValue> oldImageMap = streamRecord
                    .getOldImage();
            if (oldImageMap != null) {
                jsonWriter.key("OldImage");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> oldImageMapValue : oldImageMap
                        .entrySet()) {
                    if (oldImageMapValue.getValue() != null) {
                        jsonWriter.key(oldImageMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                oldImageMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            if (streamRecord.getSequenceNumber() != null) {
                jsonWriter.key("SequenceNumber").value(
                        streamRecord.getSequenceNumber());
            }

            if (streamRecord.getSizeBytes() != null) {
                jsonWriter.key("SizeBytes").value(streamRecord.getSizeBytes());
            }

            if (streamRecord.getStreamViewType() != null) {
                jsonWriter.key("StreamViewType").value(
                        streamRecord.getStreamViewType());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StreamRecordJsonMarshaller instance;

    public static StreamRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamRecordJsonMarshaller();
        return instance;
    }

}
