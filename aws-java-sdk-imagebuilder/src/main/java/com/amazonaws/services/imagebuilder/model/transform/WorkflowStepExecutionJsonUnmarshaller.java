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
 * WorkflowStepExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepExecutionJsonUnmarshaller implements Unmarshaller<WorkflowStepExecution, JsonUnmarshallerContext> {

    public WorkflowStepExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowStepExecution workflowStepExecution = new WorkflowStepExecution();

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
                if (context.testExpression("stepExecutionId", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setStepExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBuildVersionArn", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setImageBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowExecutionId", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setWorkflowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowBuildVersionArn", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setWorkflowBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("action", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    workflowStepExecution.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflowStepExecution;
    }

    private static WorkflowStepExecutionJsonUnmarshaller instance;

    public static WorkflowStepExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowStepExecutionJsonUnmarshaller();
        return instance;
    }
}
