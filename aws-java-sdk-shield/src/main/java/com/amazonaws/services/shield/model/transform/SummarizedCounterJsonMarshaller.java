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
package com.amazonaws.services.shield.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SummarizedCounterMarshaller
 */
public class SummarizedCounterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SummarizedCounter summarizedCounter, StructuredJsonGenerator jsonGenerator) {

        if (summarizedCounter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (summarizedCounter.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(summarizedCounter.getName());
            }
            if (summarizedCounter.getMax() != null) {
                jsonGenerator.writeFieldName("Max").writeValue(summarizedCounter.getMax());
            }
            if (summarizedCounter.getAverage() != null) {
                jsonGenerator.writeFieldName("Average").writeValue(summarizedCounter.getAverage());
            }
            if (summarizedCounter.getSum() != null) {
                jsonGenerator.writeFieldName("Sum").writeValue(summarizedCounter.getSum());
            }
            if (summarizedCounter.getN() != null) {
                jsonGenerator.writeFieldName("N").writeValue(summarizedCounter.getN());
            }
            if (summarizedCounter.getUnit() != null) {
                jsonGenerator.writeFieldName("Unit").writeValue(summarizedCounter.getUnit());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SummarizedCounterJsonMarshaller instance;

    public static SummarizedCounterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SummarizedCounterJsonMarshaller();
        return instance;
    }

}
