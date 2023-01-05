/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmsap.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Component JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentJsonUnmarshaller implements Unmarshaller<Component, JsonUnmarshallerContext> {

    public Component unmarshall(JsonUnmarshallerContext context) throws Exception {
        Component component = new Component();

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
                if (context.testExpression("ComponentId", targetDepth)) {
                    context.nextToken();
                    component.setComponentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    component.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComponentType", targetDepth)) {
                    context.nextToken();
                    component.setComponentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    component.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Databases", targetDepth)) {
                    context.nextToken();
                    component.setDatabases(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Hosts", targetDepth)) {
                    context.nextToken();
                    component.setHosts(new ListUnmarshaller<Host>(HostJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PrimaryHost", targetDepth)) {
                    context.nextToken();
                    component.setPrimaryHost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    context.nextToken();
                    component.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return component;
    }

    private static ComponentJsonUnmarshaller instance;

    public static ComponentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentJsonUnmarshaller();
        return instance;
    }
}
