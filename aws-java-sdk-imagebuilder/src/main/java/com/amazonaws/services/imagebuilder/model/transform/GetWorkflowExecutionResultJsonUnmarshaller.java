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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetWorkflowExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowExecutionResultJsonUnmarshaller implements Unmarshaller<GetWorkflowExecutionResult, JsonUnmarshallerContext> {

    public GetWorkflowExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWorkflowExecutionResult getWorkflowExecutionResult = new GetWorkflowExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWorkflowExecutionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("requestId", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowBuildVersionArn", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setWorkflowBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowExecutionId", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setWorkflowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBuildVersionArn", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setImageBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalStepCount", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsSucceeded", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepsSucceeded(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsFailed", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepsFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsSkipped", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepsSkipped(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setEndTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parallelGroup", targetDepth)) {
                    context.nextToken();
                    getWorkflowExecutionResult.setParallelGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWorkflowExecutionResult;
    }

    private static GetWorkflowExecutionResultJsonUnmarshaller instance;

    public static GetWorkflowExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWorkflowExecutionResultJsonUnmarshaller();
        return instance;
    }
}
