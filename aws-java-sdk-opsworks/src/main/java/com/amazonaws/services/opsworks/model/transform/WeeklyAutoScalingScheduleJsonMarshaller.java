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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * WeeklyAutoScalingScheduleMarshaller
 */
public class WeeklyAutoScalingScheduleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WeeklyAutoScalingSchedule weeklyAutoScalingSchedule, StructuredJsonGenerator jsonGenerator) {

        if (weeklyAutoScalingSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalMap<String, String> mondayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getMonday();
            if (!mondayMap.isEmpty() || !mondayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Monday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> mondayMapValue : mondayMap.entrySet()) {
                    if (mondayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(mondayMapValue.getKey());

                        jsonGenerator.writeValue(mondayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> tuesdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getTuesday();
            if (!tuesdayMap.isEmpty() || !tuesdayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Tuesday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tuesdayMapValue : tuesdayMap.entrySet()) {
                    if (tuesdayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tuesdayMapValue.getKey());

                        jsonGenerator.writeValue(tuesdayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> wednesdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getWednesday();
            if (!wednesdayMap.isEmpty() || !wednesdayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Wednesday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> wednesdayMapValue : wednesdayMap.entrySet()) {
                    if (wednesdayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(wednesdayMapValue.getKey());

                        jsonGenerator.writeValue(wednesdayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> thursdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getThursday();
            if (!thursdayMap.isEmpty() || !thursdayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Thursday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> thursdayMapValue : thursdayMap.entrySet()) {
                    if (thursdayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(thursdayMapValue.getKey());

                        jsonGenerator.writeValue(thursdayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> fridayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getFriday();
            if (!fridayMap.isEmpty() || !fridayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Friday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> fridayMapValue : fridayMap.entrySet()) {
                    if (fridayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(fridayMapValue.getKey());

                        jsonGenerator.writeValue(fridayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> saturdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getSaturday();
            if (!saturdayMap.isEmpty() || !saturdayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Saturday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> saturdayMapValue : saturdayMap.entrySet()) {
                    if (saturdayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(saturdayMapValue.getKey());

                        jsonGenerator.writeValue(saturdayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> sundayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getSunday();
            if (!sundayMap.isEmpty() || !sundayMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Sunday");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> sundayMapValue : sundayMap.entrySet()) {
                    if (sundayMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(sundayMapValue.getKey());

                        jsonGenerator.writeValue(sundayMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WeeklyAutoScalingScheduleJsonMarshaller instance;

    public static WeeklyAutoScalingScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WeeklyAutoScalingScheduleJsonMarshaller();
        return instance;
    }

}
