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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ProcessorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessorJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Processor processor, StructuredJsonGenerator jsonGenerator) {

        if (processor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (processor.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(processor.getType());
            }

            java.util.List<ProcessorParameter> parametersList = processor.getParameters();
            if (parametersList != null) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartArray();
                for (ProcessorParameter parametersListValue : parametersList) {
                    if (parametersListValue != null) {

                        ProcessorParameterJsonMarshaller.getInstance().marshall(parametersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProcessorJsonMarshaller instance;

    public static ProcessorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessorJsonMarshaller();
        return instance;
    }

}
