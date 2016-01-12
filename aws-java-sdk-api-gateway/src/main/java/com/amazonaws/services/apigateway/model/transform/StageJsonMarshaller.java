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

package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * StageMarshaller
 */
public class StageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Stage stage, JSONWriter jsonWriter) {
        if (stage == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (stage.getDeploymentId() != null) {
                jsonWriter.key("deploymentId").value(stage.getDeploymentId());
            }

            if (stage.getClientCertificateId() != null) {
                jsonWriter.key("clientCertificateId").value(
                        stage.getClientCertificateId());
            }

            if (stage.getStageName() != null) {
                jsonWriter.key("stageName").value(stage.getStageName());
            }

            if (stage.getDescription() != null) {
                jsonWriter.key("description").value(stage.getDescription());
            }

            if (stage.getCacheClusterEnabled() != null) {
                jsonWriter.key("cacheClusterEnabled").value(
                        stage.getCacheClusterEnabled());
            }

            if (stage.getCacheClusterSize() != null) {
                jsonWriter.key("cacheClusterSize").value(
                        stage.getCacheClusterSize());
            }

            if (stage.getCacheClusterStatus() != null) {
                jsonWriter.key("cacheClusterStatus").value(
                        stage.getCacheClusterStatus());
            }

            java.util.Map<String, MethodSetting> methodSettingsMap = stage
                    .getMethodSettings();
            if (methodSettingsMap != null) {
                jsonWriter.key("methodSettings");
                jsonWriter.object();

                for (Map.Entry<String, MethodSetting> methodSettingsMapValue : methodSettingsMap
                        .entrySet()) {
                    if (methodSettingsMapValue.getValue() != null) {
                        jsonWriter.key(methodSettingsMapValue.getKey());

                        MethodSettingJsonMarshaller.getInstance().marshall(
                                methodSettingsMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, String> variablesMap = stage.getVariables();
            if (variablesMap != null) {
                jsonWriter.key("variables");
                jsonWriter.object();

                for (Map.Entry<String, String> variablesMapValue : variablesMap
                        .entrySet()) {
                    if (variablesMapValue.getValue() != null) {
                        jsonWriter.key(variablesMapValue.getKey());

                        jsonWriter.value(variablesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (stage.getCreatedDate() != null) {
                jsonWriter.key("createdDate").value(stage.getCreatedDate());
            }

            if (stage.getLastUpdatedDate() != null) {
                jsonWriter.key("lastUpdatedDate").value(
                        stage.getLastUpdatedDate());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StageJsonMarshaller instance;

    public static StageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonMarshaller();
        return instance;
    }

}
