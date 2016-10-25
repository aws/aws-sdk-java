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
 * ActionTypeMarshaller
 */
public class ActionTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActionType actionType, StructuredJsonGenerator jsonGenerator) {

        if (actionType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (actionType.getId() != null) {
                jsonGenerator.writeFieldName("id");
                ActionTypeIdJsonMarshaller.getInstance().marshall(actionType.getId(), jsonGenerator);
            }
            if (actionType.getSettings() != null) {
                jsonGenerator.writeFieldName("settings");
                ActionTypeSettingsJsonMarshaller.getInstance().marshall(actionType.getSettings(), jsonGenerator);
            }

            java.util.List<ActionConfigurationProperty> actionConfigurationPropertiesList = actionType.getActionConfigurationProperties();
            if (actionConfigurationPropertiesList != null) {
                jsonGenerator.writeFieldName("actionConfigurationProperties");
                jsonGenerator.writeStartArray();
                for (ActionConfigurationProperty actionConfigurationPropertiesListValue : actionConfigurationPropertiesList) {
                    if (actionConfigurationPropertiesListValue != null) {

                        ActionConfigurationPropertyJsonMarshaller.getInstance().marshall(actionConfigurationPropertiesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (actionType.getInputArtifactDetails() != null) {
                jsonGenerator.writeFieldName("inputArtifactDetails");
                ArtifactDetailsJsonMarshaller.getInstance().marshall(actionType.getInputArtifactDetails(), jsonGenerator);
            }
            if (actionType.getOutputArtifactDetails() != null) {
                jsonGenerator.writeFieldName("outputArtifactDetails");
                ArtifactDetailsJsonMarshaller.getInstance().marshall(actionType.getOutputArtifactDetails(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionTypeJsonMarshaller instance;

    public static ActionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionTypeJsonMarshaller();
        return instance;
    }

}
