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
 * SuiteMarshaller
 */
public class SuiteJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Suite suite, StructuredJsonGenerator jsonGenerator) {

        if (suite == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (suite.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(suite.getArn());
            }
            if (suite.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(suite.getName());
            }
            if (suite.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(suite.getType());
            }
            if (suite.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(suite.getCreated());
            }
            if (suite.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(suite.getStatus());
            }
            if (suite.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(suite.getResult());
            }
            if (suite.getStarted() != null) {
                jsonGenerator.writeFieldName("started").writeValue(suite.getStarted());
            }
            if (suite.getStopped() != null) {
                jsonGenerator.writeFieldName("stopped").writeValue(suite.getStopped());
            }
            if (suite.getCounters() != null) {
                jsonGenerator.writeFieldName("counters");
                CountersJsonMarshaller.getInstance().marshall(suite.getCounters(), jsonGenerator);
            }
            if (suite.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(suite.getMessage());
            }
            if (suite.getDeviceMinutes() != null) {
                jsonGenerator.writeFieldName("deviceMinutes");
                DeviceMinutesJsonMarshaller.getInstance().marshall(suite.getDeviceMinutes(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SuiteJsonMarshaller instance;

    public static SuiteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SuiteJsonMarshaller();
        return instance;
    }

}
