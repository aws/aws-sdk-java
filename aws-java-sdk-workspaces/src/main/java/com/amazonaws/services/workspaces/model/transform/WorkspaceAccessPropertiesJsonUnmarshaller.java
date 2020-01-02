/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkspaceAccessProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceAccessPropertiesJsonUnmarshaller implements Unmarshaller<WorkspaceAccessProperties, JsonUnmarshallerContext> {

    public WorkspaceAccessProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceAccessProperties workspaceAccessProperties = new WorkspaceAccessProperties();

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
                if (context.testExpression("DeviceTypeWindows", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeWindows(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeOsx", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeOsx(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeWeb", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeWeb(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeIos", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeIos(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeAndroid", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeAndroid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeChromeOs", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeChromeOs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceTypeZeroClient", targetDepth)) {
                    context.nextToken();
                    workspaceAccessProperties.setDeviceTypeZeroClient(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workspaceAccessProperties;
    }

    private static WorkspaceAccessPropertiesJsonUnmarshaller instance;

    public static WorkspaceAccessPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceAccessPropertiesJsonUnmarshaller();
        return instance;
    }
}
