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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * WeeklyAutoScalingScheduleMarshaller
 */
public class WeeklyAutoScalingScheduleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(WeeklyAutoScalingSchedule weeklyAutoScalingSchedule,
            JSONWriter jsonWriter) {
        if (weeklyAutoScalingSchedule == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            com.amazonaws.internal.SdkInternalMap<String, String> mondayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getMonday();
            if (!mondayMap.isEmpty() || !mondayMap.isAutoConstruct()) {
                jsonWriter.key("Monday");
                jsonWriter.object();

                for (Map.Entry<String, String> mondayMapValue : mondayMap
                        .entrySet()) {
                    if (mondayMapValue.getValue() != null) {
                        jsonWriter.key(mondayMapValue.getKey());

                        jsonWriter.value(mondayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> tuesdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getTuesday();
            if (!tuesdayMap.isEmpty() || !tuesdayMap.isAutoConstruct()) {
                jsonWriter.key("Tuesday");
                jsonWriter.object();

                for (Map.Entry<String, String> tuesdayMapValue : tuesdayMap
                        .entrySet()) {
                    if (tuesdayMapValue.getValue() != null) {
                        jsonWriter.key(tuesdayMapValue.getKey());

                        jsonWriter.value(tuesdayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> wednesdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getWednesday();
            if (!wednesdayMap.isEmpty() || !wednesdayMap.isAutoConstruct()) {
                jsonWriter.key("Wednesday");
                jsonWriter.object();

                for (Map.Entry<String, String> wednesdayMapValue : wednesdayMap
                        .entrySet()) {
                    if (wednesdayMapValue.getValue() != null) {
                        jsonWriter.key(wednesdayMapValue.getKey());

                        jsonWriter.value(wednesdayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> thursdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getThursday();
            if (!thursdayMap.isEmpty() || !thursdayMap.isAutoConstruct()) {
                jsonWriter.key("Thursday");
                jsonWriter.object();

                for (Map.Entry<String, String> thursdayMapValue : thursdayMap
                        .entrySet()) {
                    if (thursdayMapValue.getValue() != null) {
                        jsonWriter.key(thursdayMapValue.getKey());

                        jsonWriter.value(thursdayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> fridayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getFriday();
            if (!fridayMap.isEmpty() || !fridayMap.isAutoConstruct()) {
                jsonWriter.key("Friday");
                jsonWriter.object();

                for (Map.Entry<String, String> fridayMapValue : fridayMap
                        .entrySet()) {
                    if (fridayMapValue.getValue() != null) {
                        jsonWriter.key(fridayMapValue.getKey());

                        jsonWriter.value(fridayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> saturdayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getSaturday();
            if (!saturdayMap.isEmpty() || !saturdayMap.isAutoConstruct()) {
                jsonWriter.key("Saturday");
                jsonWriter.object();

                for (Map.Entry<String, String> saturdayMapValue : saturdayMap
                        .entrySet()) {
                    if (saturdayMapValue.getValue() != null) {
                        jsonWriter.key(saturdayMapValue.getKey());

                        jsonWriter.value(saturdayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> sundayMap = (com.amazonaws.internal.SdkInternalMap<String, String>) weeklyAutoScalingSchedule
                    .getSunday();
            if (!sundayMap.isEmpty() || !sundayMap.isAutoConstruct()) {
                jsonWriter.key("Sunday");
                jsonWriter.object();

                for (Map.Entry<String, String> sundayMapValue : sundayMap
                        .entrySet()) {
                    if (sundayMapValue.getValue() != null) {
                        jsonWriter.key(sundayMapValue.getKey());

                        jsonWriter.value(sundayMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WeeklyAutoScalingScheduleJsonMarshaller instance;

    public static WeeklyAutoScalingScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WeeklyAutoScalingScheduleJsonMarshaller();
        return instance;
    }

}
