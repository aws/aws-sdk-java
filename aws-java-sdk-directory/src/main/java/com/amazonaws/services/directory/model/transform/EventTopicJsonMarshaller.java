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

package com.amazonaws.services.directory.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * EventTopicMarshaller
 */
public class EventTopicJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(EventTopic eventTopic, JSONWriter jsonWriter) {
        if (eventTopic == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (eventTopic.getDirectoryId() != null) {
                jsonWriter.key("DirectoryId")
                        .value(eventTopic.getDirectoryId());
            }

            if (eventTopic.getTopicName() != null) {
                jsonWriter.key("TopicName").value(eventTopic.getTopicName());
            }

            if (eventTopic.getTopicArn() != null) {
                jsonWriter.key("TopicArn").value(eventTopic.getTopicArn());
            }

            if (eventTopic.getCreatedDateTime() != null) {
                jsonWriter.key("CreatedDateTime").value(
                        eventTopic.getCreatedDateTime());
            }

            if (eventTopic.getStatus() != null) {
                jsonWriter.key("Status").value(eventTopic.getStatus());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventTopicJsonMarshaller instance;

    public static EventTopicJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventTopicJsonMarshaller();
        return instance;
    }

}
