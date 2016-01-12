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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RecipesMarshaller
 */
public class RecipesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Recipes recipes, JSONWriter jsonWriter) {
        if (recipes == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            com.amazonaws.internal.SdkInternalList<String> setupList = (com.amazonaws.internal.SdkInternalList<String>) recipes
                    .getSetup();
            if (!setupList.isEmpty() || !setupList.isAutoConstruct()) {
                jsonWriter.key("Setup");
                jsonWriter.array();
                for (String setupListValue : setupList) {
                    if (setupListValue != null) {
                        jsonWriter.value(setupListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> configureList = (com.amazonaws.internal.SdkInternalList<String>) recipes
                    .getConfigure();
            if (!configureList.isEmpty() || !configureList.isAutoConstruct()) {
                jsonWriter.key("Configure");
                jsonWriter.array();
                for (String configureListValue : configureList) {
                    if (configureListValue != null) {
                        jsonWriter.value(configureListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> deployList = (com.amazonaws.internal.SdkInternalList<String>) recipes
                    .getDeploy();
            if (!deployList.isEmpty() || !deployList.isAutoConstruct()) {
                jsonWriter.key("Deploy");
                jsonWriter.array();
                for (String deployListValue : deployList) {
                    if (deployListValue != null) {
                        jsonWriter.value(deployListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> undeployList = (com.amazonaws.internal.SdkInternalList<String>) recipes
                    .getUndeploy();
            if (!undeployList.isEmpty() || !undeployList.isAutoConstruct()) {
                jsonWriter.key("Undeploy");
                jsonWriter.array();
                for (String undeployListValue : undeployList) {
                    if (undeployListValue != null) {
                        jsonWriter.value(undeployListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> shutdownList = (com.amazonaws.internal.SdkInternalList<String>) recipes
                    .getShutdown();
            if (!shutdownList.isEmpty() || !shutdownList.isAutoConstruct()) {
                jsonWriter.key("Shutdown");
                jsonWriter.array();
                for (String shutdownListValue : shutdownList) {
                    if (shutdownListValue != null) {
                        jsonWriter.value(shutdownListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RecipesJsonMarshaller instance;

    public static RecipesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecipesJsonMarshaller();
        return instance;
    }

}
