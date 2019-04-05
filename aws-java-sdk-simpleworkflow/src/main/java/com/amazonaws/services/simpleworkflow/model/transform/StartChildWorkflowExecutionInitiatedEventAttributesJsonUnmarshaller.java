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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartChildWorkflowExecutionInitiatedEventAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller implements
        Unmarshaller<StartChildWorkflowExecutionInitiatedEventAttributes, JsonUnmarshallerContext> {

    public StartChildWorkflowExecutionInitiatedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes = new StartChildWorkflowExecutionInitiatedEventAttributes();

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
                if (context.testExpression("workflowId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setWorkflowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowType", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setWorkflowType(WorkflowTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("control", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setExecutionStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("taskList", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskPriority", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setTaskPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("decisionTaskCompletedEventId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes
                            .setDecisionTaskCompletedEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("childPolicy", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setChildPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setTaskStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tagList", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setTagList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("lambdaRole", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setLambdaRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startChildWorkflowExecutionInitiatedEventAttributes;
    }

    private static StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller instance;

    public static StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
