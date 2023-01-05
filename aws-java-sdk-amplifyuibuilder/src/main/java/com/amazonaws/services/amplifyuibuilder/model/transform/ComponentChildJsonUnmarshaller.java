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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComponentChild JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentChildJsonUnmarshaller implements Unmarshaller<ComponentChild, JsonUnmarshallerContext> {

    public ComponentChild unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComponentChild componentChild = new ComponentChild();

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
                if (context.testExpression("children", targetDepth)) {
                    context.nextToken();
                    componentChild.setChildren(new ListUnmarshaller<ComponentChild>(ComponentChildJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("componentType", targetDepth)) {
                    context.nextToken();
                    componentChild.setComponentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("events", targetDepth)) {
                    context.nextToken();
                    componentChild.setEvents(new MapUnmarshaller<String, ComponentEvent>(context.getUnmarshaller(String.class), ComponentEventJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    componentChild.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("properties", targetDepth)) {
                    context.nextToken();
                    componentChild.setProperties(new MapUnmarshaller<String, ComponentProperty>(context.getUnmarshaller(String.class),
                            ComponentPropertyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("sourceId", targetDepth)) {
                    context.nextToken();
                    componentChild.setSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return componentChild;
    }

    private static ComponentChildJsonUnmarshaller instance;

    public static ComponentChildJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentChildJsonUnmarshaller();
        return instance;
    }
}
