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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CountersMarshaller
 */
public class CountersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Counters counters, StructuredJsonGenerator jsonGenerator) {

        if (counters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (counters.getTotal() != null) {
                jsonGenerator.writeFieldName("total").writeValue(counters.getTotal());
            }
            if (counters.getPassed() != null) {
                jsonGenerator.writeFieldName("passed").writeValue(counters.getPassed());
            }
            if (counters.getFailed() != null) {
                jsonGenerator.writeFieldName("failed").writeValue(counters.getFailed());
            }
            if (counters.getWarned() != null) {
                jsonGenerator.writeFieldName("warned").writeValue(counters.getWarned());
            }
            if (counters.getErrored() != null) {
                jsonGenerator.writeFieldName("errored").writeValue(counters.getErrored());
            }
            if (counters.getStopped() != null) {
                jsonGenerator.writeFieldName("stopped").writeValue(counters.getStopped());
            }
            if (counters.getSkipped() != null) {
                jsonGenerator.writeFieldName("skipped").writeValue(counters.getSkipped());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CountersJsonMarshaller instance;

    public static CountersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CountersJsonMarshaller();
        return instance;
    }

}
