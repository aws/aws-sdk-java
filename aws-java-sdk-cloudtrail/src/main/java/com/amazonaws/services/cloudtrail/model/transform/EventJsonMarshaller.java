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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EventMarshaller
 */
public class EventJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Event event, StructuredJsonGenerator jsonGenerator) {

        if (event == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (event.getEventId() != null) {
                jsonGenerator.writeFieldName("EventId").writeValue(event.getEventId());
            }
            if (event.getEventName() != null) {
                jsonGenerator.writeFieldName("EventName").writeValue(event.getEventName());
            }
            if (event.getEventTime() != null) {
                jsonGenerator.writeFieldName("EventTime").writeValue(event.getEventTime());
            }
            if (event.getEventSource() != null) {
                jsonGenerator.writeFieldName("EventSource").writeValue(event.getEventSource());
            }
            if (event.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(event.getUsername());
            }

            com.amazonaws.internal.SdkInternalList<Resource> resourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) event.getResources();
            if (!resourcesList.isEmpty() || !resourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Resources");
                jsonGenerator.writeStartArray();
                for (Resource resourcesListValue : resourcesList) {
                    if (resourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(resourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (event.getCloudTrailEvent() != null) {
                jsonGenerator.writeFieldName("CloudTrailEvent").writeValue(event.getCloudTrailEvent());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventJsonMarshaller instance;

    public static EventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonMarshaller();
        return instance;
    }

}
