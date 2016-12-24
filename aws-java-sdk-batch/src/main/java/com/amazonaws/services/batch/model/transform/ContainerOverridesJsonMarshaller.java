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
package com.amazonaws.services.batch.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ContainerOverridesMarshaller
 */
public class ContainerOverridesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContainerOverrides containerOverrides, StructuredJsonGenerator jsonGenerator) {

        if (containerOverrides == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (containerOverrides.getVcpus() != null) {
                jsonGenerator.writeFieldName("vcpus").writeValue(containerOverrides.getVcpus());
            }
            if (containerOverrides.getMemory() != null) {
                jsonGenerator.writeFieldName("memory").writeValue(containerOverrides.getMemory());
            }

            java.util.List<String> commandList = containerOverrides.getCommand();
            if (commandList != null) {
                jsonGenerator.writeFieldName("command");
                jsonGenerator.writeStartArray();
                for (String commandListValue : commandList) {
                    if (commandListValue != null) {
                        jsonGenerator.writeValue(commandListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<KeyValuePair> environmentList = containerOverrides.getEnvironment();
            if (environmentList != null) {
                jsonGenerator.writeFieldName("environment");
                jsonGenerator.writeStartArray();
                for (KeyValuePair environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        KeyValuePairJsonMarshaller.getInstance().marshall(environmentListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerOverridesJsonMarshaller instance;

    public static ContainerOverridesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerOverridesJsonMarshaller();
        return instance;
    }

}
