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

package com.amazonaws.services.logs.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * MetricFilterMatchRecordMarshaller
 */
public class MetricFilterMatchRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(MetricFilterMatchRecord metricFilterMatchRecord,
            JSONWriter jsonWriter) {
        if (metricFilterMatchRecord == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (metricFilterMatchRecord.getEventNumber() != null) {
                jsonWriter.key("eventNumber").value(
                        metricFilterMatchRecord.getEventNumber());
            }

            if (metricFilterMatchRecord.getEventMessage() != null) {
                jsonWriter.key("eventMessage").value(
                        metricFilterMatchRecord.getEventMessage());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> extractedValuesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) metricFilterMatchRecord
                    .getExtractedValues();
            if (!extractedValuesMap.isEmpty()
                    || !extractedValuesMap.isAutoConstruct()) {
                jsonWriter.key("extractedValues");
                jsonWriter.object();

                for (Map.Entry<String, String> extractedValuesMapValue : extractedValuesMap
                        .entrySet()) {
                    if (extractedValuesMapValue.getValue() != null) {
                        jsonWriter.key(extractedValuesMapValue.getKey());

                        jsonWriter.value(extractedValuesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MetricFilterMatchRecordJsonMarshaller instance;

    public static MetricFilterMatchRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterMatchRecordJsonMarshaller();
        return instance;
    }

}
