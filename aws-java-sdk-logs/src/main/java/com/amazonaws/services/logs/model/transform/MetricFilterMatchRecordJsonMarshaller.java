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
 * MetricFilterMatchRecordMarshaller
 */
public class MetricFilterMatchRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MetricFilterMatchRecord metricFilterMatchRecord, StructuredJsonGenerator jsonGenerator) {

        if (metricFilterMatchRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (metricFilterMatchRecord.getEventNumber() != null) {
                jsonGenerator.writeFieldName("eventNumber").writeValue(metricFilterMatchRecord.getEventNumber());
            }
            if (metricFilterMatchRecord.getEventMessage() != null) {
                jsonGenerator.writeFieldName("eventMessage").writeValue(metricFilterMatchRecord.getEventMessage());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> extractedValuesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) metricFilterMatchRecord
                    .getExtractedValues();
            if (!extractedValuesMap.isEmpty() || !extractedValuesMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("extractedValues");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> extractedValuesMapValue : extractedValuesMap.entrySet()) {
                    if (extractedValuesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(extractedValuesMapValue.getKey());

                        jsonGenerator.writeValue(extractedValuesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MetricFilterMatchRecordJsonMarshaller instance;

    public static MetricFilterMatchRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterMatchRecordJsonMarshaller();
        return instance;
    }

}
