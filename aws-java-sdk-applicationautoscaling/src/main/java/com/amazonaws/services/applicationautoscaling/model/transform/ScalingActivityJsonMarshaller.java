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
 * ScalingActivityMarshaller
 */
public class ScalingActivityJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ScalingActivity scalingActivity, StructuredJsonGenerator jsonGenerator) {

        if (scalingActivity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (scalingActivity.getActivityId() != null) {
                jsonGenerator.writeFieldName("ActivityId").writeValue(scalingActivity.getActivityId());
            }
            if (scalingActivity.getServiceNamespace() != null) {
                jsonGenerator.writeFieldName("ServiceNamespace").writeValue(scalingActivity.getServiceNamespace());
            }
            if (scalingActivity.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(scalingActivity.getResourceId());
            }
            if (scalingActivity.getScalableDimension() != null) {
                jsonGenerator.writeFieldName("ScalableDimension").writeValue(scalingActivity.getScalableDimension());
            }
            if (scalingActivity.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(scalingActivity.getDescription());
            }
            if (scalingActivity.getCause() != null) {
                jsonGenerator.writeFieldName("Cause").writeValue(scalingActivity.getCause());
            }
            if (scalingActivity.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(scalingActivity.getStartTime());
            }
            if (scalingActivity.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(scalingActivity.getEndTime());
            }
            if (scalingActivity.getStatusCode() != null) {
                jsonGenerator.writeFieldName("StatusCode").writeValue(scalingActivity.getStatusCode());
            }
            if (scalingActivity.getStatusMessage() != null) {
                jsonGenerator.writeFieldName("StatusMessage").writeValue(scalingActivity.getStatusMessage());
            }
            if (scalingActivity.getDetails() != null) {
                jsonGenerator.writeFieldName("Details").writeValue(scalingActivity.getDetails());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScalingActivityJsonMarshaller instance;

    public static ScalingActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingActivityJsonMarshaller();
        return instance;
    }

}
