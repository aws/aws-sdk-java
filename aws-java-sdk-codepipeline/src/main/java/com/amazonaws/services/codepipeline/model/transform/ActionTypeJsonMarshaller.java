/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codepipeline.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ActionTypeMarshaller
 */
public class ActionTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ActionType actionType, JSONWriter jsonWriter) {
        if (actionType == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (actionType.getId() != null) {
                jsonWriter.key("id");
                ActionTypeIdJsonMarshaller.getInstance().marshall(
                        actionType.getId(), jsonWriter);
            }

            if (actionType.getSettings() != null) {
                jsonWriter.key("settings");
                ActionTypeSettingsJsonMarshaller.getInstance().marshall(
                        actionType.getSettings(), jsonWriter);
            }

            java.util.List<ActionConfigurationProperty> actionConfigurationPropertiesList = actionType
                    .getActionConfigurationProperties();
            if (actionConfigurationPropertiesList != null) {
                jsonWriter.key("actionConfigurationProperties");
                jsonWriter.array();
                for (ActionConfigurationProperty actionConfigurationPropertiesListValue : actionConfigurationPropertiesList) {
                    if (actionConfigurationPropertiesListValue != null) {

                        ActionConfigurationPropertyJsonMarshaller.getInstance()
                                .marshall(
                                        actionConfigurationPropertiesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (actionType.getInputArtifactDetails() != null) {
                jsonWriter.key("inputArtifactDetails");
                ArtifactDetailsJsonMarshaller.getInstance().marshall(
                        actionType.getInputArtifactDetails(), jsonWriter);
            }

            if (actionType.getOutputArtifactDetails() != null) {
                jsonWriter.key("outputArtifactDetails");
                ArtifactDetailsJsonMarshaller.getInstance().marshall(
                        actionType.getOutputArtifactDetails(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionTypeJsonMarshaller instance;

    public static ActionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionTypeJsonMarshaller();
        return instance;
    }

}
