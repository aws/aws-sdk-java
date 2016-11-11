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
 * MetricFilterMarshaller
 */
public class MetricFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MetricFilter metricFilter, StructuredJsonGenerator jsonGenerator) {

        if (metricFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (metricFilter.getFilterName() != null) {
                jsonGenerator.writeFieldName("filterName").writeValue(metricFilter.getFilterName());
            }
            if (metricFilter.getFilterPattern() != null) {
                jsonGenerator.writeFieldName("filterPattern").writeValue(metricFilter.getFilterPattern());
            }

            com.amazonaws.internal.SdkInternalList<MetricTransformation> metricTransformationsList = (com.amazonaws.internal.SdkInternalList<MetricTransformation>) metricFilter
                    .getMetricTransformations();
            if (!metricTransformationsList.isEmpty() || !metricTransformationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("metricTransformations");
                jsonGenerator.writeStartArray();
                for (MetricTransformation metricTransformationsListValue : metricTransformationsList) {
                    if (metricTransformationsListValue != null) {

                        MetricTransformationJsonMarshaller.getInstance().marshall(metricTransformationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (metricFilter.getCreationTime() != null) {
                jsonGenerator.writeFieldName("creationTime").writeValue(metricFilter.getCreationTime());
            }
            if (metricFilter.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(metricFilter.getLogGroupName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MetricFilterJsonMarshaller instance;

    public static MetricFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterJsonMarshaller();
        return instance;
    }

}
