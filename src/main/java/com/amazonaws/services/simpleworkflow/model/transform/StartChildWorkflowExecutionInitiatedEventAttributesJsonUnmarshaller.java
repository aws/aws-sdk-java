/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Start Child Workflow Execution Initiated Event Attributes JSON Unmarshaller
 */
public class StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller implements Unmarshaller<StartChildWorkflowExecutionInitiatedEventAttributes, JsonUnmarshallerContext> {

    

    public StartChildWorkflowExecutionInitiatedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes = new StartChildWorkflowExecutionInitiatedEventAttributes();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return startChildWorkflowExecutionInitiatedEventAttributes;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("workflowId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setWorkflowId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workflowType", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setWorkflowType(WorkflowTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("control", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setControl(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setInput(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setExecutionStartToCloseTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskList", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("decisionTaskCompletedEventId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setDecisionTaskCompletedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("childPolicy", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setChildPolicy(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionInitiatedEventAttributes.setTaskStartToCloseTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tagList", targetDepth)) {
                    startChildWorkflowExecutionInitiatedEventAttributes.setTagList(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return startChildWorkflowExecutionInitiatedEventAttributes;
                }
            }
            token = context.nextToken();
        }
    }

    private static StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller instance;
    public static StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    