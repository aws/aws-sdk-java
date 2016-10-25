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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ConfigurationMarshaller
 */
public class ConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Configuration configuration, StructuredJsonGenerator jsonGenerator) {

        if (configuration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (configuration.getClassification() != null) {
                jsonGenerator.writeFieldName("Classification").writeValue(configuration.getClassification());
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) configuration
                    .getConfigurations();
            if (!configurationsList.isEmpty() || !configurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Configurations");
                jsonGenerator.writeStartArray();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalMap<String, String> propertiesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) configuration
                    .getProperties();
            if (!propertiesMap.isEmpty() || !propertiesMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Properties");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> propertiesMapValue : propertiesMap.entrySet()) {
                    if (propertiesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(propertiesMapValue.getKey());

                        jsonGenerator.writeValue(propertiesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigurationJsonMarshaller instance;

    public static ConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationJsonMarshaller();
        return instance;
    }

}
