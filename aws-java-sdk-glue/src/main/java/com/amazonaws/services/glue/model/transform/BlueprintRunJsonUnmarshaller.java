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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BlueprintRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueprintRunJsonUnmarshaller implements Unmarshaller<BlueprintRun, JsonUnmarshallerContext> {

    public BlueprintRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        BlueprintRun blueprintRun = new BlueprintRun();

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
                if (context.testExpression("BlueprintName", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setBlueprintName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RunId", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkflowName", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setWorkflowName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RollbackErrorMessage", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setRollbackErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    blueprintRun.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return blueprintRun;
    }

    private static BlueprintRunJsonUnmarshaller instance;

    public static BlueprintRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlueprintRunJsonUnmarshaller();
        return instance;
    }
}
