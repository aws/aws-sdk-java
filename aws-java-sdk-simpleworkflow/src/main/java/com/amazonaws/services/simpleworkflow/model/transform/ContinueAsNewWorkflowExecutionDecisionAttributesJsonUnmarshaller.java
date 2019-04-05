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
 * ContinueAsNewWorkflowExecutionDecisionAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinueAsNewWorkflowExecutionDecisionAttributesJsonUnmarshaller implements
        Unmarshaller<ContinueAsNewWorkflowExecutionDecisionAttributes, JsonUnmarshallerContext> {

    public ContinueAsNewWorkflowExecutionDecisionAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes = new ContinueAsNewWorkflowExecutionDecisionAttributes();

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
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setExecutionStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskList", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskPriority", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setTaskPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setTaskStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("childPolicy", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setChildPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tagList", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setTagList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("workflowTypeVersion", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setWorkflowTypeVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lambdaRole", targetDepth)) {
                    context.nextToken();
                    continueAsNewWorkflowExecutionDecisionAttributes.setLambdaRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return continueAsNewWorkflowExecutionDecisionAttributes;
    }

    private static ContinueAsNewWorkflowExecutionDecisionAttributesJsonUnmarshaller instance;

    public static ContinueAsNewWorkflowExecutionDecisionAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContinueAsNewWorkflowExecutionDecisionAttributesJsonUnmarshaller();
        return instance;
    }
}
