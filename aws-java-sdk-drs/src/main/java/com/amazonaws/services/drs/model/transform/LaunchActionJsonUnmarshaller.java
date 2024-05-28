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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LaunchAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchActionJsonUnmarshaller implements Unmarshaller<LaunchAction, JsonUnmarshallerContext> {

    public LaunchAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        LaunchAction launchAction = new LaunchAction();

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
                if (context.testExpression("actionCode", targetDepth)) {
                    context.nextToken();
                    launchAction.setActionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionId", targetDepth)) {
                    context.nextToken();
                    launchAction.setActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionVersion", targetDepth)) {
                    context.nextToken();
                    launchAction.setActionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("active", targetDepth)) {
                    context.nextToken();
                    launchAction.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    launchAction.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    launchAction.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    launchAction.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("optional", targetDepth)) {
                    context.nextToken();
                    launchAction.setOptional(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("order", targetDepth)) {
                    context.nextToken();
                    launchAction.setOrder(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    launchAction.setParameters(new MapUnmarshaller<String, LaunchActionParameter>(context.getUnmarshaller(String.class),
                            LaunchActionParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    launchAction.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return launchAction;
    }

    private static LaunchActionJsonUnmarshaller instance;

    public static LaunchActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchActionJsonUnmarshaller();
        return instance;
    }
}
