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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ScalingPolicyMarshaller
 */
public class ScalingPolicyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ScalingPolicy scalingPolicy, StructuredJsonGenerator jsonGenerator) {

        if (scalingPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (scalingPolicy.getPolicyARN() != null) {
                jsonGenerator.writeFieldName("PolicyARN").writeValue(scalingPolicy.getPolicyARN());
            }
            if (scalingPolicy.getPolicyName() != null) {
                jsonGenerator.writeFieldName("PolicyName").writeValue(scalingPolicy.getPolicyName());
            }
            if (scalingPolicy.getServiceNamespace() != null) {
                jsonGenerator.writeFieldName("ServiceNamespace").writeValue(scalingPolicy.getServiceNamespace());
            }
            if (scalingPolicy.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(scalingPolicy.getResourceId());
            }
            if (scalingPolicy.getScalableDimension() != null) {
                jsonGenerator.writeFieldName("ScalableDimension").writeValue(scalingPolicy.getScalableDimension());
            }
            if (scalingPolicy.getPolicyType() != null) {
                jsonGenerator.writeFieldName("PolicyType").writeValue(scalingPolicy.getPolicyType());
            }
            if (scalingPolicy.getStepScalingPolicyConfiguration() != null) {
                jsonGenerator.writeFieldName("StepScalingPolicyConfiguration");
                StepScalingPolicyConfigurationJsonMarshaller.getInstance().marshall(scalingPolicy.getStepScalingPolicyConfiguration(), jsonGenerator);
            }

            java.util.List<Alarm> alarmsList = scalingPolicy.getAlarms();
            if (alarmsList != null) {
                jsonGenerator.writeFieldName("Alarms");
                jsonGenerator.writeStartArray();
                for (Alarm alarmsListValue : alarmsList) {
                    if (alarmsListValue != null) {

                        AlarmJsonMarshaller.getInstance().marshall(alarmsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (scalingPolicy.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(scalingPolicy.getCreationTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScalingPolicyJsonMarshaller instance;

    public static ScalingPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPolicyJsonMarshaller();
        return instance;
    }

}
