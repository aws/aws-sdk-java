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

package com.amazonaws.services.gamelift.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ScalingPolicyMarshaller
 */
public class ScalingPolicyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ScalingPolicy scalingPolicy, JSONWriter jsonWriter) {
        if (scalingPolicy == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (scalingPolicy.getFleetId() != null) {
                jsonWriter.key("FleetId").value(scalingPolicy.getFleetId());
            }

            if (scalingPolicy.getName() != null) {
                jsonWriter.key("Name").value(scalingPolicy.getName());
            }

            if (scalingPolicy.getStatus() != null) {
                jsonWriter.key("Status").value(scalingPolicy.getStatus());
            }

            if (scalingPolicy.getScalingAdjustment() != null) {
                jsonWriter.key("ScalingAdjustment").value(
                        scalingPolicy.getScalingAdjustment());
            }

            if (scalingPolicy.getScalingAdjustmentType() != null) {
                jsonWriter.key("ScalingAdjustmentType").value(
                        scalingPolicy.getScalingAdjustmentType());
            }

            if (scalingPolicy.getComparisonOperator() != null) {
                jsonWriter.key("ComparisonOperator").value(
                        scalingPolicy.getComparisonOperator());
            }

            if (scalingPolicy.getThreshold() != null) {
                jsonWriter.key("Threshold").value(scalingPolicy.getThreshold());
            }

            if (scalingPolicy.getEvaluationPeriods() != null) {
                jsonWriter.key("EvaluationPeriods").value(
                        scalingPolicy.getEvaluationPeriods());
            }

            if (scalingPolicy.getMetricName() != null) {
                jsonWriter.key("MetricName").value(
                        scalingPolicy.getMetricName());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScalingPolicyJsonMarshaller instance;

    public static ScalingPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPolicyJsonMarshaller();
        return instance;
    }

}
