/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetPluginResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPluginResultJsonUnmarshaller implements Unmarshaller<GetPluginResult, JsonUnmarshallerContext> {

    public GetPluginResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPluginResult getPluginResult = new GetPluginResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getPluginResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pluginId", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setPluginId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serverUrl", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authConfiguration", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setAuthConfiguration(PluginAuthConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customPluginConfiguration", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setCustomPluginConfiguration(CustomPluginConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("buildStatus", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setBuildStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pluginArn", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setPluginArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getPluginResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getPluginResult;
    }

    private static GetPluginResultJsonUnmarshaller instance;

    public static GetPluginResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPluginResultJsonUnmarshaller();
        return instance;
    }
}
