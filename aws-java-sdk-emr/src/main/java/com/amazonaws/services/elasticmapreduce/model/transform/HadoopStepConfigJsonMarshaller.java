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
 * HadoopStepConfigMarshaller
 */
public class HadoopStepConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(HadoopStepConfig hadoopStepConfig, StructuredJsonGenerator jsonGenerator) {

        if (hadoopStepConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (hadoopStepConfig.getJar() != null) {
                jsonGenerator.writeFieldName("Jar").writeValue(hadoopStepConfig.getJar());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> propertiesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) hadoopStepConfig
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
            if (hadoopStepConfig.getMainClass() != null) {
                jsonGenerator.writeFieldName("MainClass").writeValue(hadoopStepConfig.getMainClass());
            }

            com.amazonaws.internal.SdkInternalList<String> argsList = (com.amazonaws.internal.SdkInternalList<String>) hadoopStepConfig.getArgs();
            if (!argsList.isEmpty() || !argsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Args");
                jsonGenerator.writeStartArray();
                for (String argsListValue : argsList) {
                    if (argsListValue != null) {
                        jsonGenerator.writeValue(argsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HadoopStepConfigJsonMarshaller instance;

    public static HadoopStepConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HadoopStepConfigJsonMarshaller();
        return instance;
    }

}
