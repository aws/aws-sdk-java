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
 * SignalExternalWorkflowExecutionFailedEventAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalExternalWorkflowExecutionFailedEventAttributesJsonUnmarshaller implements
        Unmarshaller<SignalExternalWorkflowExecutionFailedEventAttributes, JsonUnmarshallerContext> {

    public SignalExternalWorkflowExecutionFailedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes = new SignalExternalWorkflowExecutionFailedEventAttributes();

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
                    signalExternalWorkflowExecutionFailedEventAttributes.setWorkflowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runId", targetDepth)) {
                    context.nextToken();
                    signalExternalWorkflowExecutionFailedEventAttributes.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cause", targetDepth)) {
                    context.nextToken();
                    signalExternalWorkflowExecutionFailedEventAttributes.setCause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("initiatedEventId", targetDepth)) {
                    context.nextToken();
                    signalExternalWorkflowExecutionFailedEventAttributes.setInitiatedEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("decisionTaskCompletedEventId", targetDepth)) {
                    context.nextToken();
                    signalExternalWorkflowExecutionFailedEventAttributes.setDecisionTaskCompletedEventId(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                }
                if (context.testExpression("control", targetDepth)) {
                    context.nextToken();
                    signalExternalWorkflowExecutionFailedEventAttributes.setControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return signalExternalWorkflowExecutionFailedEventAttributes;
    }

    private static SignalExternalWorkflowExecutionFailedEventAttributesJsonUnmarshaller instance;

    public static SignalExternalWorkflowExecutionFailedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SignalExternalWorkflowExecutionFailedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
