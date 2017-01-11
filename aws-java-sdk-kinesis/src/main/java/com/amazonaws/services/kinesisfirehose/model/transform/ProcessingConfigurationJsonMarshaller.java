/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.protocol.json.*;

/**
 * ProcessingConfigurationMarshaller
 */
public class ProcessingConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ProcessingConfiguration processingConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (processingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (processingConfiguration.getEnabled() != null) {
                jsonGenerator.writeFieldName("Enabled").writeValue(processingConfiguration.getEnabled());
            }

            java.util.List<Processor> processorsList = processingConfiguration.getProcessors();
            if (processorsList != null) {
                jsonGenerator.writeFieldName("Processors");
                jsonGenerator.writeStartArray();
                for (Processor processorsListValue : processorsList) {
                    if (processorsListValue != null) {

                        ProcessorJsonMarshaller.getInstance().marshall(processorsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProcessingConfigurationJsonMarshaller instance;

    public static ProcessingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingConfigurationJsonMarshaller();
        return instance;
    }

}
