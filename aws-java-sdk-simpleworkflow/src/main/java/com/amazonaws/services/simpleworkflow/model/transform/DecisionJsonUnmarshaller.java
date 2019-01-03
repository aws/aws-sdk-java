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
 * Decision JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecisionJsonUnmarshaller implements Unmarshaller<Decision, JsonUnmarshallerContext> {

    public Decision unmarshall(JsonUnmarshallerContext context) throws Exception {
        Decision decision = new Decision();

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
                if (context.testExpression("decisionType", targetDepth)) {
                    context.nextToken();
                    decision.setDecisionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduleActivityTaskDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("requestCancelActivityTaskDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("completeWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("failWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("cancelWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("continueAsNewWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setContinueAsNewWorkflowExecutionDecisionAttributes(ContinueAsNewWorkflowExecutionDecisionAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("recordMarkerDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTimerDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setStartTimerDecisionAttributes(StartTimerDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cancelTimerDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setCancelTimerDecisionAttributes(CancelTimerDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("signalExternalWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setSignalExternalWorkflowExecutionDecisionAttributes(SignalExternalWorkflowExecutionDecisionAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("requestCancelExternalWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setRequestCancelExternalWorkflowExecutionDecisionAttributes(RequestCancelExternalWorkflowExecutionDecisionAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("startChildWorkflowExecutionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setStartChildWorkflowExecutionDecisionAttributes(StartChildWorkflowExecutionDecisionAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("scheduleLambdaFunctionDecisionAttributes", targetDepth)) {
                    context.nextToken();
                    decision.setScheduleLambdaFunctionDecisionAttributes(ScheduleLambdaFunctionDecisionAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return decision;
    }

    private static DecisionJsonUnmarshaller instance;

    public static DecisionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DecisionJsonUnmarshaller();
        return instance;
    }
}
