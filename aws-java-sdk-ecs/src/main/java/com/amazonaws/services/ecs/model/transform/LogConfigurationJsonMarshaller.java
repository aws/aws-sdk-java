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
package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LogConfigurationMarshaller
 */
public class LogConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LogConfiguration logConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (logConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (logConfiguration.getLogDriver() != null) {
                jsonGenerator.writeFieldName("logDriver").writeValue(logConfiguration.getLogDriver());
            }

            java.util.Map<String, String> optionsMap = logConfiguration.getOptions();
            if (optionsMap != null) {
                jsonGenerator.writeFieldName("options");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> optionsMapValue : optionsMap.entrySet()) {
                    if (optionsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(optionsMapValue.getKey());

                        jsonGenerator.writeValue(optionsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LogConfigurationJsonMarshaller instance;

    public static LogConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogConfigurationJsonMarshaller();
        return instance;
    }

}
