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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActionDeclarationMarshaller
 */
public class ActionDeclarationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActionDeclaration actionDeclaration, StructuredJsonGenerator jsonGenerator) {

        if (actionDeclaration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (actionDeclaration.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(actionDeclaration.getName());
            }
            if (actionDeclaration.getActionTypeId() != null) {
                jsonGenerator.writeFieldName("actionTypeId");
                ActionTypeIdJsonMarshaller.getInstance().marshall(actionDeclaration.getActionTypeId(), jsonGenerator);
            }
            if (actionDeclaration.getRunOrder() != null) {
                jsonGenerator.writeFieldName("runOrder").writeValue(actionDeclaration.getRunOrder());
            }

            java.util.Map<String, String> configurationMap = actionDeclaration.getConfiguration();
            if (configurationMap != null) {
                jsonGenerator.writeFieldName("configuration");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> configurationMapValue : configurationMap.entrySet()) {
                    if (configurationMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(configurationMapValue.getKey());

                        jsonGenerator.writeValue(configurationMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.List<OutputArtifact> outputArtifactsList = actionDeclaration.getOutputArtifacts();
            if (outputArtifactsList != null) {
                jsonGenerator.writeFieldName("outputArtifacts");
                jsonGenerator.writeStartArray();
                for (OutputArtifact outputArtifactsListValue : outputArtifactsList) {
                    if (outputArtifactsListValue != null) {

                        OutputArtifactJsonMarshaller.getInstance().marshall(outputArtifactsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<InputArtifact> inputArtifactsList = actionDeclaration.getInputArtifacts();
            if (inputArtifactsList != null) {
                jsonGenerator.writeFieldName("inputArtifacts");
                jsonGenerator.writeStartArray();
                for (InputArtifact inputArtifactsListValue : inputArtifactsList) {
                    if (inputArtifactsListValue != null) {

                        InputArtifactJsonMarshaller.getInstance().marshall(inputArtifactsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (actionDeclaration.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(actionDeclaration.getRoleArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionDeclarationJsonMarshaller instance;

    public static ActionDeclarationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionDeclarationJsonMarshaller();
        return instance;
    }

}
