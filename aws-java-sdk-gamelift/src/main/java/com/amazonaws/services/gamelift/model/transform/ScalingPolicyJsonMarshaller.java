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
package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
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

            if (scalingPolicy.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(scalingPolicy.getFleetId());
            }
            if (scalingPolicy.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(scalingPolicy.getName());
            }
            if (scalingPolicy.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(scalingPolicy.getStatus());
            }
            if (scalingPolicy.getScalingAdjustment() != null) {
                jsonGenerator.writeFieldName("ScalingAdjustment").writeValue(scalingPolicy.getScalingAdjustment());
            }
            if (scalingPolicy.getScalingAdjustmentType() != null) {
                jsonGenerator.writeFieldName("ScalingAdjustmentType").writeValue(scalingPolicy.getScalingAdjustmentType());
            }
            if (scalingPolicy.getComparisonOperator() != null) {
                jsonGenerator.writeFieldName("ComparisonOperator").writeValue(scalingPolicy.getComparisonOperator());
            }
            if (scalingPolicy.getThreshold() != null) {
                jsonGenerator.writeFieldName("Threshold").writeValue(scalingPolicy.getThreshold());
            }
            if (scalingPolicy.getEvaluationPeriods() != null) {
                jsonGenerator.writeFieldName("EvaluationPeriods").writeValue(scalingPolicy.getEvaluationPeriods());
            }
            if (scalingPolicy.getMetricName() != null) {
                jsonGenerator.writeFieldName("MetricName").writeValue(scalingPolicy.getMetricName());
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
