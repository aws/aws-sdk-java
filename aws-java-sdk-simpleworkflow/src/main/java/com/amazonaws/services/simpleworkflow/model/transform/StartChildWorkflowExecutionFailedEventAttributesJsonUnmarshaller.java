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
 * StartChildWorkflowExecutionFailedEventAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller implements
        Unmarshaller<StartChildWorkflowExecutionFailedEventAttributes, JsonUnmarshallerContext> {

    public StartChildWorkflowExecutionFailedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes = new StartChildWorkflowExecutionFailedEventAttributes();

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
                if (context.testExpression("workflowType", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionFailedEventAttributes.setWorkflowType(WorkflowTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cause", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionFailedEventAttributes.setCause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionFailedEventAttributes.setWorkflowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("initiatedEventId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionFailedEventAttributes.setInitiatedEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("decisionTaskCompletedEventId", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionFailedEventAttributes.setDecisionTaskCompletedEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("control", targetDepth)) {
                    context.nextToken();
                    startChildWorkflowExecutionFailedEventAttributes.setControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startChildWorkflowExecutionFailedEventAttributes;
    }

    private static StartChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller instance;

    public static StartChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
