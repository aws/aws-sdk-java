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
package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MetricTransformationMarshaller
 */
public class MetricTransformationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MetricTransformation metricTransformation, StructuredJsonGenerator jsonGenerator) {

        if (metricTransformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (metricTransformation.getMetricName() != null) {
                jsonGenerator.writeFieldName("metricName").writeValue(metricTransformation.getMetricName());
            }
            if (metricTransformation.getMetricNamespace() != null) {
                jsonGenerator.writeFieldName("metricNamespace").writeValue(metricTransformation.getMetricNamespace());
            }
            if (metricTransformation.getMetricValue() != null) {
                jsonGenerator.writeFieldName("metricValue").writeValue(metricTransformation.getMetricValue());
            }
            if (metricTransformation.getDefaultValue() != null) {
                jsonGenerator.writeFieldName("defaultValue").writeValue(metricTransformation.getDefaultValue());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MetricTransformationJsonMarshaller instance;

    public static MetricTransformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricTransformationJsonMarshaller();
        return instance;
    }

}
