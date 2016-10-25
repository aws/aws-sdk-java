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
 * ContainerOverrideMarshaller
 */
public class ContainerOverrideJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContainerOverride containerOverride, StructuredJsonGenerator jsonGenerator) {

        if (containerOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (containerOverride.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(containerOverride.getName());
            }

            com.amazonaws.internal.SdkInternalList<String> commandList = (com.amazonaws.internal.SdkInternalList<String>) containerOverride.getCommand();
            if (!commandList.isEmpty() || !commandList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("command");
                jsonGenerator.writeStartArray();
                for (String commandListValue : commandList) {
                    if (commandListValue != null) {
                        jsonGenerator.writeValue(commandListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<KeyValuePair> environmentList = (com.amazonaws.internal.SdkInternalList<KeyValuePair>) containerOverride
                    .getEnvironment();
            if (!environmentList.isEmpty() || !environmentList.isAutoConstruct()) {
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

    private static ContainerOverrideJsonMarshaller instance;

    public static ContainerOverrideJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerOverrideJsonMarshaller();
        return instance;
    }

}
