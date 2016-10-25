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
 * AutoScalingThresholdsMarshaller
 */
public class AutoScalingThresholdsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AutoScalingThresholds autoScalingThresholds, StructuredJsonGenerator jsonGenerator) {

        if (autoScalingThresholds == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (autoScalingThresholds.getInstanceCount() != null) {
                jsonGenerator.writeFieldName("InstanceCount").writeValue(autoScalingThresholds.getInstanceCount());
            }
            if (autoScalingThresholds.getThresholdsWaitTime() != null) {
                jsonGenerator.writeFieldName("ThresholdsWaitTime").writeValue(autoScalingThresholds.getThresholdsWaitTime());
            }
            if (autoScalingThresholds.getIgnoreMetricsTime() != null) {
                jsonGenerator.writeFieldName("IgnoreMetricsTime").writeValue(autoScalingThresholds.getIgnoreMetricsTime());
            }
            if (autoScalingThresholds.getCpuThreshold() != null) {
                jsonGenerator.writeFieldName("CpuThreshold").writeValue(autoScalingThresholds.getCpuThreshold());
            }
            if (autoScalingThresholds.getMemoryThreshold() != null) {
                jsonGenerator.writeFieldName("MemoryThreshold").writeValue(autoScalingThresholds.getMemoryThreshold());
            }
            if (autoScalingThresholds.getLoadThreshold() != null) {
                jsonGenerator.writeFieldName("LoadThreshold").writeValue(autoScalingThresholds.getLoadThreshold());
            }

            com.amazonaws.internal.SdkInternalList<String> alarmsList = (com.amazonaws.internal.SdkInternalList<String>) autoScalingThresholds.getAlarms();
            if (!alarmsList.isEmpty() || !alarmsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Alarms");
                jsonGenerator.writeStartArray();
                for (String alarmsListValue : alarmsList) {
                    if (alarmsListValue != null) {
                        jsonGenerator.writeValue(alarmsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AutoScalingThresholdsJsonMarshaller instance;

    public static AutoScalingThresholdsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingThresholdsJsonMarshaller();
        return instance;
    }

}
