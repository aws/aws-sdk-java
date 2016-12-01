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
package com.amazonaws.services.health.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;
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

            if (event.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(event.getArn());
            }
            if (event.getService() != null) {
                jsonGenerator.writeFieldName("service").writeValue(event.getService());
            }
            if (event.getEventTypeCode() != null) {
                jsonGenerator.writeFieldName("eventTypeCode").writeValue(event.getEventTypeCode());
            }
            if (event.getEventTypeCategory() != null) {
                jsonGenerator.writeFieldName("eventTypeCategory").writeValue(event.getEventTypeCategory());
            }
            if (event.getRegion() != null) {
                jsonGenerator.writeFieldName("region").writeValue(event.getRegion());
            }
            if (event.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("availabilityZone").writeValue(event.getAvailabilityZone());
            }
            if (event.getStartTime() != null) {
                jsonGenerator.writeFieldName("startTime").writeValue(event.getStartTime());
            }
            if (event.getEndTime() != null) {
                jsonGenerator.writeFieldName("endTime").writeValue(event.getEndTime());
            }
            if (event.getLastUpdatedTime() != null) {
                jsonGenerator.writeFieldName("lastUpdatedTime").writeValue(event.getLastUpdatedTime());
            }
            if (event.getStatusCode() != null) {
                jsonGenerator.writeFieldName("statusCode").writeValue(event.getStatusCode());
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
