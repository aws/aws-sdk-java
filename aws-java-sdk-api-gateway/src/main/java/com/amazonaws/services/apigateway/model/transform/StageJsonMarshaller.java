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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StageMarshaller
 */
public class StageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Stage stage, StructuredJsonGenerator jsonGenerator) {

        if (stage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stage.getDeploymentId() != null) {
                jsonGenerator.writeFieldName("deploymentId").writeValue(stage.getDeploymentId());
            }
            if (stage.getClientCertificateId() != null) {
                jsonGenerator.writeFieldName("clientCertificateId").writeValue(stage.getClientCertificateId());
            }
            if (stage.getStageName() != null) {
                jsonGenerator.writeFieldName("stageName").writeValue(stage.getStageName());
            }
            if (stage.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(stage.getDescription());
            }
            if (stage.getCacheClusterEnabled() != null) {
                jsonGenerator.writeFieldName("cacheClusterEnabled").writeValue(stage.getCacheClusterEnabled());
            }
            if (stage.getCacheClusterSize() != null) {
                jsonGenerator.writeFieldName("cacheClusterSize").writeValue(stage.getCacheClusterSize());
            }
            if (stage.getCacheClusterStatus() != null) {
                jsonGenerator.writeFieldName("cacheClusterStatus").writeValue(stage.getCacheClusterStatus());
            }

            java.util.Map<String, MethodSetting> methodSettingsMap = stage.getMethodSettings();
            if (methodSettingsMap != null) {
                jsonGenerator.writeFieldName("methodSettings");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, MethodSetting> methodSettingsMapValue : methodSettingsMap.entrySet()) {
                    if (methodSettingsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(methodSettingsMapValue.getKey());

                        MethodSettingJsonMarshaller.getInstance().marshall(methodSettingsMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> variablesMap = stage.getVariables();
            if (variablesMap != null) {
                jsonGenerator.writeFieldName("variables");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> variablesMapValue : variablesMap.entrySet()) {
                    if (variablesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(variablesMapValue.getKey());

                        jsonGenerator.writeValue(variablesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (stage.getCreatedDate() != null) {
                jsonGenerator.writeFieldName("createdDate").writeValue(stage.getCreatedDate());
            }
            if (stage.getLastUpdatedDate() != null) {
                jsonGenerator.writeFieldName("lastUpdatedDate").writeValue(stage.getLastUpdatedDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StageJsonMarshaller instance;

    public static StageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonMarshaller();
        return instance;
    }

}
