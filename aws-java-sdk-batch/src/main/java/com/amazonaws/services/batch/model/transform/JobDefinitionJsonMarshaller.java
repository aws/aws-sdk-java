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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.protocol.json.*;

/**
 * JobDefinitionMarshaller
 */
public class JobDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobDefinition jobDefinition, StructuredJsonGenerator jsonGenerator) {

        if (jobDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobDefinition.getJobDefinitionName() != null) {
                jsonGenerator.writeFieldName("jobDefinitionName").writeValue(jobDefinition.getJobDefinitionName());
            }
            if (jobDefinition.getJobDefinitionArn() != null) {
                jsonGenerator.writeFieldName("jobDefinitionArn").writeValue(jobDefinition.getJobDefinitionArn());
            }
            if (jobDefinition.getRevision() != null) {
                jsonGenerator.writeFieldName("revision").writeValue(jobDefinition.getRevision());
            }
            if (jobDefinition.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(jobDefinition.getStatus());
            }
            if (jobDefinition.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(jobDefinition.getType());
            }

            java.util.Map<String, String> parametersMap = jobDefinition.getParameters();
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
            if (jobDefinition.getContainerProperties() != null) {
                jsonGenerator.writeFieldName("containerProperties");
                ContainerPropertiesJsonMarshaller.getInstance().marshall(jobDefinition.getContainerProperties(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobDefinitionJsonMarshaller instance;

    public static JobDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobDefinitionJsonMarshaller();
        return instance;
    }

}
