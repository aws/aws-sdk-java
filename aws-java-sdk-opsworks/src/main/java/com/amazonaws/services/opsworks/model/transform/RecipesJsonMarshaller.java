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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RecipesMarshaller
 */
public class RecipesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Recipes recipes, StructuredJsonGenerator jsonGenerator) {

        if (recipes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> setupList = (com.amazonaws.internal.SdkInternalList<String>) recipes.getSetup();
            if (!setupList.isEmpty() || !setupList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Setup");
                jsonGenerator.writeStartArray();
                for (String setupListValue : setupList) {
                    if (setupListValue != null) {
                        jsonGenerator.writeValue(setupListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> configureList = (com.amazonaws.internal.SdkInternalList<String>) recipes.getConfigure();
            if (!configureList.isEmpty() || !configureList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Configure");
                jsonGenerator.writeStartArray();
                for (String configureListValue : configureList) {
                    if (configureListValue != null) {
                        jsonGenerator.writeValue(configureListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> deployList = (com.amazonaws.internal.SdkInternalList<String>) recipes.getDeploy();
            if (!deployList.isEmpty() || !deployList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Deploy");
                jsonGenerator.writeStartArray();
                for (String deployListValue : deployList) {
                    if (deployListValue != null) {
                        jsonGenerator.writeValue(deployListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> undeployList = (com.amazonaws.internal.SdkInternalList<String>) recipes.getUndeploy();
            if (!undeployList.isEmpty() || !undeployList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Undeploy");
                jsonGenerator.writeStartArray();
                for (String undeployListValue : undeployList) {
                    if (undeployListValue != null) {
                        jsonGenerator.writeValue(undeployListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> shutdownList = (com.amazonaws.internal.SdkInternalList<String>) recipes.getShutdown();
            if (!shutdownList.isEmpty() || !shutdownList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Shutdown");
                jsonGenerator.writeStartArray();
                for (String shutdownListValue : shutdownList) {
                    if (shutdownListValue != null) {
                        jsonGenerator.writeValue(shutdownListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RecipesJsonMarshaller instance;

    public static RecipesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecipesJsonMarshaller();
        return instance;
    }

}
