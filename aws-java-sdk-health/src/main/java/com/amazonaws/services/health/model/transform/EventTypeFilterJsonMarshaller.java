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
 * EventTypeFilterMarshaller
 */
public class EventTypeFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EventTypeFilter eventTypeFilter, StructuredJsonGenerator jsonGenerator) {

        if (eventTypeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<String> eventTypeCodesList = eventTypeFilter.getEventTypeCodes();
            if (eventTypeCodesList != null) {
                jsonGenerator.writeFieldName("eventTypeCodes");
                jsonGenerator.writeStartArray();
                for (String eventTypeCodesListValue : eventTypeCodesList) {
                    if (eventTypeCodesListValue != null) {
                        jsonGenerator.writeValue(eventTypeCodesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> servicesList = eventTypeFilter.getServices();
            if (servicesList != null) {
                jsonGenerator.writeFieldName("services");
                jsonGenerator.writeStartArray();
                for (String servicesListValue : servicesList) {
                    if (servicesListValue != null) {
                        jsonGenerator.writeValue(servicesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> eventTypeCategoriesList = eventTypeFilter.getEventTypeCategories();
            if (eventTypeCategoriesList != null) {
                jsonGenerator.writeFieldName("eventTypeCategories");
                jsonGenerator.writeStartArray();
                for (String eventTypeCategoriesListValue : eventTypeCategoriesList) {
                    if (eventTypeCategoriesListValue != null) {
                        jsonGenerator.writeValue(eventTypeCategoriesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventTypeFilterJsonMarshaller instance;

    public static EventTypeFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventTypeFilterJsonMarshaller();
        return instance;
    }

}
