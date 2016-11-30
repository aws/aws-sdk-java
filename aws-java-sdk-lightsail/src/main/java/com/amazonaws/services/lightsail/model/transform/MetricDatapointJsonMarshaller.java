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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MetricDatapointMarshaller
 */
public class MetricDatapointJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MetricDatapoint metricDatapoint, StructuredJsonGenerator jsonGenerator) {

        if (metricDatapoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (metricDatapoint.getAverage() != null) {
                jsonGenerator.writeFieldName("average").writeValue(metricDatapoint.getAverage());
            }
            if (metricDatapoint.getMaximum() != null) {
                jsonGenerator.writeFieldName("maximum").writeValue(metricDatapoint.getMaximum());
            }
            if (metricDatapoint.getMinimum() != null) {
                jsonGenerator.writeFieldName("minimum").writeValue(metricDatapoint.getMinimum());
            }
            if (metricDatapoint.getSampleCount() != null) {
                jsonGenerator.writeFieldName("sampleCount").writeValue(metricDatapoint.getSampleCount());
            }
            if (metricDatapoint.getSum() != null) {
                jsonGenerator.writeFieldName("sum").writeValue(metricDatapoint.getSum());
            }
            if (metricDatapoint.getTimestamp() != null) {
                jsonGenerator.writeFieldName("timestamp").writeValue(metricDatapoint.getTimestamp());
            }
            if (metricDatapoint.getUnit() != null) {
                jsonGenerator.writeFieldName("unit").writeValue(metricDatapoint.getUnit());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MetricDatapointJsonMarshaller instance;

    public static MetricDatapointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatapointJsonMarshaller();
        return instance;
    }

}
