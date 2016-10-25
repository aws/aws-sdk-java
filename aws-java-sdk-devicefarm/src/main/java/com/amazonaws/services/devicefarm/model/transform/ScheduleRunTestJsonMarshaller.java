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
 * ScheduleRunTestMarshaller
 */
public class ScheduleRunTestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ScheduleRunTest scheduleRunTest, StructuredJsonGenerator jsonGenerator) {

        if (scheduleRunTest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (scheduleRunTest.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(scheduleRunTest.getType());
            }
            if (scheduleRunTest.getTestPackageArn() != null) {
                jsonGenerator.writeFieldName("testPackageArn").writeValue(scheduleRunTest.getTestPackageArn());
            }
            if (scheduleRunTest.getFilter() != null) {
                jsonGenerator.writeFieldName("filter").writeValue(scheduleRunTest.getFilter());
            }

            java.util.Map<String, String> parametersMap = scheduleRunTest.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeValue(parametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScheduleRunTestJsonMarshaller instance;

    public static ScheduleRunTestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleRunTestJsonMarshaller();
        return instance;
    }

}
