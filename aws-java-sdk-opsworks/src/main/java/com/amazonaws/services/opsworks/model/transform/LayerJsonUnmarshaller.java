/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Layer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayerJsonUnmarshaller implements Unmarshaller<Layer, JsonUnmarshallerContext> {

    public Layer unmarshall(JsonUnmarshallerContext context) throws Exception {
        Layer layer = new Layer();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    layer.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    layer.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LayerId", targetDepth)) {
                    context.nextToken();
                    layer.setLayerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    layer.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    layer.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Shortname", targetDepth)) {
                    context.nextToken();
                    layer.setShortname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    layer.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsConfiguration", targetDepth)) {
                    context.nextToken();
                    layer.setCloudWatchLogsConfiguration(CloudWatchLogsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomInstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    layer.setCustomInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomJson", targetDepth)) {
                    context.nextToken();
                    layer.setCustomJson(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomSecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    layer.setCustomSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DefaultSecurityGroupNames", targetDepth)) {
                    context.nextToken();
                    layer.setDefaultSecurityGroupNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Packages", targetDepth)) {
                    context.nextToken();
                    layer.setPackages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("VolumeConfigurations", targetDepth)) {
                    context.nextToken();
                    layer.setVolumeConfigurations(new ListUnmarshaller<VolumeConfiguration>(VolumeConfigurationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("EnableAutoHealing", targetDepth)) {
                    context.nextToken();
                    layer.setEnableAutoHealing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutoAssignElasticIps", targetDepth)) {
                    context.nextToken();
                    layer.setAutoAssignElasticIps(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutoAssignPublicIps", targetDepth)) {
                    context.nextToken();
                    layer.setAutoAssignPublicIps(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRecipes", targetDepth)) {
                    context.nextToken();
                    layer.setDefaultRecipes(RecipesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomRecipes", targetDepth)) {
                    context.nextToken();
                    layer.setCustomRecipes(RecipesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    layer.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstallUpdatesOnBoot", targetDepth)) {
                    context.nextToken();
                    layer.setInstallUpdatesOnBoot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseEbsOptimizedInstances", targetDepth)) {
                    context.nextToken();
                    layer.setUseEbsOptimizedInstances(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LifecycleEventConfiguration", targetDepth)) {
                    context.nextToken();
                    layer.setLifecycleEventConfiguration(LifecycleEventConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return layer;
    }

    private static LayerJsonUnmarshaller instance;

    public static LayerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LayerJsonUnmarshaller();
        return instance;
    }
}
