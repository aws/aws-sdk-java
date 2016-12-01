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
 * EntityFilterMarshaller
 */
public class EntityFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EntityFilter entityFilter, StructuredJsonGenerator jsonGenerator) {

        if (entityFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<String> eventArnsList = entityFilter.getEventArns();
            if (eventArnsList != null) {
                jsonGenerator.writeFieldName("eventArns");
                jsonGenerator.writeStartArray();
                for (String eventArnsListValue : eventArnsList) {
                    if (eventArnsListValue != null) {
                        jsonGenerator.writeValue(eventArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> entityArnsList = entityFilter.getEntityArns();
            if (entityArnsList != null) {
                jsonGenerator.writeFieldName("entityArns");
                jsonGenerator.writeStartArray();
                for (String entityArnsListValue : entityArnsList) {
                    if (entityArnsListValue != null) {
                        jsonGenerator.writeValue(entityArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> entityValuesList = entityFilter.getEntityValues();
            if (entityValuesList != null) {
                jsonGenerator.writeFieldName("entityValues");
                jsonGenerator.writeStartArray();
                for (String entityValuesListValue : entityValuesList) {
                    if (entityValuesListValue != null) {
                        jsonGenerator.writeValue(entityValuesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<DateTimeRange> lastUpdatedTimesList = entityFilter.getLastUpdatedTimes();
            if (lastUpdatedTimesList != null) {
                jsonGenerator.writeFieldName("lastUpdatedTimes");
                jsonGenerator.writeStartArray();
                for (DateTimeRange lastUpdatedTimesListValue : lastUpdatedTimesList) {
                    if (lastUpdatedTimesListValue != null) {

                        DateTimeRangeJsonMarshaller.getInstance().marshall(lastUpdatedTimesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<java.util.Map<String, String>> tagsList = entityFilter.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (java.util.Map<String, String> tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        jsonGenerator.writeStartObject();
                        for (Map.Entry<String, String> TagsListMapEntry : tagsListValue.entrySet()) {
                            if (TagsListMapEntry.getValue() != null) {
                                jsonGenerator.writeFieldName(TagsListMapEntry.getKey());
                                jsonGenerator.writeValue(TagsListMapEntry.getValue());
                            }
                        }
                        jsonGenerator.writeEndObject();
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> statusCodesList = entityFilter.getStatusCodes();
            if (statusCodesList != null) {
                jsonGenerator.writeFieldName("statusCodes");
                jsonGenerator.writeStartArray();
                for (String statusCodesListValue : statusCodesList) {
                    if (statusCodesListValue != null) {
                        jsonGenerator.writeValue(statusCodesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EntityFilterJsonMarshaller instance;

    public static EntityFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityFilterJsonMarshaller();
        return instance;
    }

}
