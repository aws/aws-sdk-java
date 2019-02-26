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
 * HistoryEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoryEventJsonUnmarshaller implements Unmarshaller<HistoryEvent, JsonUnmarshallerContext> {

    public HistoryEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        HistoryEvent historyEvent = new HistoryEvent();

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
                if (context.testExpression("eventTimestamp", targetDepth)) {
                    context.nextToken();
                    historyEvent.setEventTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    historyEvent.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    historyEvent.setEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("workflowExecutionStartedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionStartedEventAttributes(WorkflowExecutionStartedEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("workflowExecutionCompletedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionCompletedEventAttributes(WorkflowExecutionCompletedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("completeWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setCompleteWorkflowExecutionFailedEventAttributes(CompleteWorkflowExecutionFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("workflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionFailedEventAttributes(WorkflowExecutionFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("failWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setFailWorkflowExecutionFailedEventAttributes(FailWorkflowExecutionFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("workflowExecutionTimedOutEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionTimedOutEventAttributes(WorkflowExecutionTimedOutEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("workflowExecutionCanceledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionCanceledEventAttributes(WorkflowExecutionCanceledEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("cancelWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setCancelWorkflowExecutionFailedEventAttributes(CancelWorkflowExecutionFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("workflowExecutionContinuedAsNewEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionContinuedAsNewEventAttributes(WorkflowExecutionContinuedAsNewEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("continueAsNewWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setContinueAsNewWorkflowExecutionFailedEventAttributes(ContinueAsNewWorkflowExecutionFailedEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("workflowExecutionTerminatedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionTerminatedEventAttributes(WorkflowExecutionTerminatedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("workflowExecutionCancelRequestedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionCancelRequestedEventAttributes(WorkflowExecutionCancelRequestedEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("decisionTaskScheduledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setDecisionTaskScheduledEventAttributes(DecisionTaskScheduledEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("decisionTaskStartedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setDecisionTaskStartedEventAttributes(DecisionTaskStartedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("decisionTaskCompletedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setDecisionTaskCompletedEventAttributes(DecisionTaskCompletedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("decisionTaskTimedOutEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setDecisionTaskTimedOutEventAttributes(DecisionTaskTimedOutEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskScheduledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setActivityTaskScheduledEventAttributes(ActivityTaskScheduledEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskStartedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityTaskStartedEventAttributes(ActivityTaskStartedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskCompletedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setActivityTaskCompletedEventAttributes(ActivityTaskCompletedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityTaskFailedEventAttributes(ActivityTaskFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskTimedOutEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityTaskTimedOutEventAttributes(ActivityTaskTimedOutEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskCanceledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityTaskCanceledEventAttributes(ActivityTaskCanceledEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTaskCancelRequestedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityTaskCancelRequestedEventAttributes(ActivityTaskCancelRequestedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("workflowExecutionSignaledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setWorkflowExecutionSignaledEventAttributes(WorkflowExecutionSignaledEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("markerRecordedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setMarkerRecordedEventAttributes(MarkerRecordedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recordMarkerFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setRecordMarkerFailedEventAttributes(RecordMarkerFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timerStartedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setTimerStartedEventAttributes(TimerStartedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timerFiredEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setTimerFiredEventAttributes(TimerFiredEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timerCanceledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setTimerCanceledEventAttributes(TimerCanceledEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startChildWorkflowExecutionInitiatedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setStartChildWorkflowExecutionInitiatedEventAttributes(StartChildWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("childWorkflowExecutionStartedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setChildWorkflowExecutionStartedEventAttributes(ChildWorkflowExecutionStartedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("childWorkflowExecutionCompletedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setChildWorkflowExecutionCompletedEventAttributes(ChildWorkflowExecutionCompletedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("childWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setChildWorkflowExecutionFailedEventAttributes(ChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("childWorkflowExecutionTimedOutEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setChildWorkflowExecutionTimedOutEventAttributes(ChildWorkflowExecutionTimedOutEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("childWorkflowExecutionCanceledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setChildWorkflowExecutionCanceledEventAttributes(ChildWorkflowExecutionCanceledEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("childWorkflowExecutionTerminatedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setChildWorkflowExecutionTerminatedEventAttributes(ChildWorkflowExecutionTerminatedEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("signalExternalWorkflowExecutionInitiatedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setSignalExternalWorkflowExecutionInitiatedEventAttributes(SignalExternalWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("externalWorkflowExecutionSignaledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setExternalWorkflowExecutionSignaledEventAttributes(ExternalWorkflowExecutionSignaledEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("signalExternalWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setSignalExternalWorkflowExecutionFailedEventAttributes(SignalExternalWorkflowExecutionFailedEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("externalWorkflowExecutionCancelRequestedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setExternalWorkflowExecutionCancelRequestedEventAttributes(ExternalWorkflowExecutionCancelRequestedEventAttributesJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("requestCancelExternalWorkflowExecutionInitiatedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(RequestCancelExternalWorkflowExecutionInitiatedEventAttributesJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("requestCancelExternalWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setRequestCancelExternalWorkflowExecutionFailedEventAttributes(RequestCancelExternalWorkflowExecutionFailedEventAttributesJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduleActivityTaskFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setScheduleActivityTaskFailedEventAttributes(ScheduleActivityTaskFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("requestCancelActivityTaskFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setRequestCancelActivityTaskFailedEventAttributes(RequestCancelActivityTaskFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("startTimerFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setStartTimerFailedEventAttributes(StartTimerFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cancelTimerFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setCancelTimerFailedEventAttributes(CancelTimerFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startChildWorkflowExecutionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setStartChildWorkflowExecutionFailedEventAttributes(StartChildWorkflowExecutionFailedEventAttributesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionScheduledEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionScheduledEventAttributes(LambdaFunctionScheduledEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lambdaFunctionStartedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent
                            .setLambdaFunctionStartedEventAttributes(LambdaFunctionStartedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionCompletedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionCompletedEventAttributes(LambdaFunctionCompletedEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lambdaFunctionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionFailedEventAttributes(LambdaFunctionFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionTimedOutEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionTimedOutEventAttributes(LambdaFunctionTimedOutEventAttributesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("scheduleLambdaFunctionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setScheduleLambdaFunctionFailedEventAttributes(ScheduleLambdaFunctionFailedEventAttributesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("startLambdaFunctionFailedEventAttributes", targetDepth)) {
                    context.nextToken();
                    historyEvent.setStartLambdaFunctionFailedEventAttributes(StartLambdaFunctionFailedEventAttributesJsonUnmarshaller.getInstance().unmarshall(
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

        return historyEvent;
    }

    private static HistoryEventJsonUnmarshaller instance;

    public static HistoryEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HistoryEventJsonUnmarshaller();
        return instance;
    }
}
