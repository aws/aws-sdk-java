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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionState JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionStateJsonUnmarshaller implements Unmarshaller<ActionState, JsonUnmarshallerContext> {

    public ActionState unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionState actionState = new ActionState();

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
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    actionState.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentRevision", targetDepth)) {
                    context.nextToken();
                    actionState.setCurrentRevision(ActionRevisionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("latestExecution", targetDepth)) {
                    context.nextToken();
                    actionState.setLatestExecution(ActionExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("entityUrl", targetDepth)) {
                    context.nextToken();
                    actionState.setEntityUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revisionUrl", targetDepth)) {
                    context.nextToken();
                    actionState.setRevisionUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionState;
    }

    private static ActionStateJsonUnmarshaller instance;

    public static ActionStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionStateJsonUnmarshaller();
        return instance;
    }
}
