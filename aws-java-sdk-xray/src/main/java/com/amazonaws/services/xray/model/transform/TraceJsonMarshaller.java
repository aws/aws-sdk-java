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
package com.amazonaws.services.xray.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TraceMarshaller
 */
public class TraceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Trace trace, StructuredJsonGenerator jsonGenerator) {

        if (trace == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (trace.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(trace.getId());
            }
            if (trace.getDuration() != null) {
                jsonGenerator.writeFieldName("Duration").writeValue(trace.getDuration());
            }

            java.util.List<Segment> segmentsList = trace.getSegments();
            if (segmentsList != null) {
                jsonGenerator.writeFieldName("Segments");
                jsonGenerator.writeStartArray();
                for (Segment segmentsListValue : segmentsList) {
                    if (segmentsListValue != null) {

                        SegmentJsonMarshaller.getInstance().marshall(segmentsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TraceJsonMarshaller instance;

    public static TraceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TraceJsonMarshaller();
        return instance;
    }

}
