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

package com.amazonaws.services.cloudtrail.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * EventMarshaller
 */
public class EventJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Event event, JSONWriter jsonWriter) {
        if (event == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (event.getEventId() != null) {
                jsonWriter.key("EventId").value(event.getEventId());
            }

            if (event.getEventName() != null) {
                jsonWriter.key("EventName").value(event.getEventName());
            }

            if (event.getEventTime() != null) {
                jsonWriter.key("EventTime").value(event.getEventTime());
            }

            if (event.getUsername() != null) {
                jsonWriter.key("Username").value(event.getUsername());
            }

            com.amazonaws.internal.SdkInternalList<Resource> resourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) event
                    .getResources();
            if (!resourcesList.isEmpty() || !resourcesList.isAutoConstruct()) {
                jsonWriter.key("Resources");
                jsonWriter.array();
                for (Resource resourcesListValue : resourcesList) {
                    if (resourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(
                                resourcesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (event.getCloudTrailEvent() != null) {
                jsonWriter.key("CloudTrailEvent").value(
                        event.getCloudTrailEvent());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventJsonMarshaller instance;

    public static EventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonMarshaller();
        return instance;
    }

}
