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
 * TestMarshaller
 */
public class TestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Test test, StructuredJsonGenerator jsonGenerator) {

        if (test == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (test.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(test.getArn());
            }
            if (test.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(test.getName());
            }
            if (test.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(test.getType());
            }
            if (test.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(test.getCreated());
            }
            if (test.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(test.getStatus());
            }
            if (test.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(test.getResult());
            }
            if (test.getStarted() != null) {
                jsonGenerator.writeFieldName("started").writeValue(test.getStarted());
            }
            if (test.getStopped() != null) {
                jsonGenerator.writeFieldName("stopped").writeValue(test.getStopped());
            }
            if (test.getCounters() != null) {
                jsonGenerator.writeFieldName("counters");
                CountersJsonMarshaller.getInstance().marshall(test.getCounters(), jsonGenerator);
            }
            if (test.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(test.getMessage());
            }
            if (test.getDeviceMinutes() != null) {
                jsonGenerator.writeFieldName("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(test.getDeviceMinutes(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TestJsonMarshaller instance;

    public static TestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TestJsonMarshaller();
        return instance;
    }

}
