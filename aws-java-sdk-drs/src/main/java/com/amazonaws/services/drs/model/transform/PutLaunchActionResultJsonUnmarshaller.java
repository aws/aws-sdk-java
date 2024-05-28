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
 * PutLaunchActionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLaunchActionResultJsonUnmarshaller implements Unmarshaller<PutLaunchActionResult, JsonUnmarshallerContext> {

    public PutLaunchActionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutLaunchActionResult putLaunchActionResult = new PutLaunchActionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putLaunchActionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actionCode", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setActionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionId", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionVersion", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setActionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("active", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("optional", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setOptional(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("order", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setOrder(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setParameters(new MapUnmarshaller<String, LaunchActionParameter>(context.getUnmarshaller(String.class),
                            LaunchActionParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    putLaunchActionResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putLaunchActionResult;
    }

    private static PutLaunchActionResultJsonUnmarshaller instance;

    public static PutLaunchActionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutLaunchActionResultJsonUnmarshaller();
        return instance;
    }
}
