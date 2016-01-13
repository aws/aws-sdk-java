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
 * AutoScalingThresholdsMarshaller
 */
public class AutoScalingThresholdsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(AutoScalingThresholds autoScalingThresholds,
            JSONWriter jsonWriter) {
        if (autoScalingThresholds == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (autoScalingThresholds.getInstanceCount() != null) {
                jsonWriter.key("InstanceCount").value(
                        autoScalingThresholds.getInstanceCount());
            }

            if (autoScalingThresholds.getThresholdsWaitTime() != null) {
                jsonWriter.key("ThresholdsWaitTime").value(
                        autoScalingThresholds.getThresholdsWaitTime());
            }

            if (autoScalingThresholds.getIgnoreMetricsTime() != null) {
                jsonWriter.key("IgnoreMetricsTime").value(
                        autoScalingThresholds.getIgnoreMetricsTime());
            }

            if (autoScalingThresholds.getCpuThreshold() != null) {
                jsonWriter.key("CpuThreshold").value(
                        autoScalingThresholds.getCpuThreshold());
            }

            if (autoScalingThresholds.getMemoryThreshold() != null) {
                jsonWriter.key("MemoryThreshold").value(
                        autoScalingThresholds.getMemoryThreshold());
            }

            if (autoScalingThresholds.getLoadThreshold() != null) {
                jsonWriter.key("LoadThreshold").value(
                        autoScalingThresholds.getLoadThreshold());
            }

            com.amazonaws.internal.SdkInternalList<String> alarmsList = (com.amazonaws.internal.SdkInternalList<String>) autoScalingThresholds
                    .getAlarms();
            if (!alarmsList.isEmpty() || !alarmsList.isAutoConstruct()) {
                jsonWriter.key("Alarms");
                jsonWriter.array();
                for (String alarmsListValue : alarmsList) {
                    if (alarmsListValue != null) {
                        jsonWriter.value(alarmsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AutoScalingThresholdsJsonMarshaller instance;

    public static AutoScalingThresholdsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingThresholdsJsonMarshaller();
        return instance;
    }

}
