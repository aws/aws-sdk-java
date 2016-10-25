/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * HistoryEventMarshaller
 */
public class HistoryEventJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(HistoryEvent historyEvent, StructuredJsonGenerator jsonGenerator) {

        if (historyEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (historyEvent.getEventTimestamp() != null) {
                jsonGenerator.writeFieldName("eventTimestamp").writeValue(historyEvent.getEventTimestamp());
            }
            if (historyEvent.getEventType() != null) {
                jsonGenerator.writeFieldName("eventType").writeValue(historyEvent.getEventType());
            }
            if (historyEvent.getEventId() != null) {
                jsonGenerator.writeFieldName("eventId").writeValue(historyEvent.getEventId());
            }
            if (historyEvent.getWorkflowExecutionStartedEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionStartedEventAttributes");
                WorkflowExecutionStartedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionStartedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionCompletedEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionCompletedEventAttributes");
                WorkflowExecutionCompletedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionCompletedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getCompleteWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("completeWorkflowExecutionFailedEventAttributes");
                CompleteWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getCompleteWorkflowExecutionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionFailedEventAttributes");
                WorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionFailedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getFailWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("failWorkflowExecutionFailedEventAttributes");
                FailWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getFailWorkflowExecutionFailedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionTimedOutEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionTimedOutEventAttributes");
                WorkflowExecutionTimedOutEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionTimedOutEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionCanceledEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionCanceledEventAttributes");
                WorkflowExecutionCanceledEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionCanceledEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getCancelWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("cancelWorkflowExecutionFailedEventAttributes");
                CancelWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getCancelWorkflowExecutionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionContinuedAsNewEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionContinuedAsNewEventAttributes");
                WorkflowExecutionContinuedAsNewEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getWorkflowExecutionContinuedAsNewEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getContinueAsNewWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("continueAsNewWorkflowExecutionFailedEventAttributes");
                ContinueAsNewWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getContinueAsNewWorkflowExecutionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionTerminatedEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionTerminatedEventAttributes");
                WorkflowExecutionTerminatedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionTerminatedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionCancelRequestedEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionCancelRequestedEventAttributes");
                WorkflowExecutionCancelRequestedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getWorkflowExecutionCancelRequestedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getDecisionTaskScheduledEventAttributes() != null) {
                jsonGenerator.writeFieldName("decisionTaskScheduledEventAttributes");
                DecisionTaskScheduledEventAttributesJsonMarshaller.getInstance()
                        .marshall(historyEvent.getDecisionTaskScheduledEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getDecisionTaskStartedEventAttributes() != null) {
                jsonGenerator.writeFieldName("decisionTaskStartedEventAttributes");
                DecisionTaskStartedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getDecisionTaskStartedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getDecisionTaskCompletedEventAttributes() != null) {
                jsonGenerator.writeFieldName("decisionTaskCompletedEventAttributes");
                DecisionTaskCompletedEventAttributesJsonMarshaller.getInstance()
                        .marshall(historyEvent.getDecisionTaskCompletedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getDecisionTaskTimedOutEventAttributes() != null) {
                jsonGenerator.writeFieldName("decisionTaskTimedOutEventAttributes");
                DecisionTaskTimedOutEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getDecisionTaskTimedOutEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskScheduledEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskScheduledEventAttributes");
                ActivityTaskScheduledEventAttributesJsonMarshaller.getInstance()
                        .marshall(historyEvent.getActivityTaskScheduledEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskStartedEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskStartedEventAttributes");
                ActivityTaskStartedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getActivityTaskStartedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskCompletedEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskCompletedEventAttributes");
                ActivityTaskCompletedEventAttributesJsonMarshaller.getInstance()
                        .marshall(historyEvent.getActivityTaskCompletedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskFailedEventAttributes");
                ActivityTaskFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getActivityTaskFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskTimedOutEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskTimedOutEventAttributes");
                ActivityTaskTimedOutEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getActivityTaskTimedOutEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskCanceledEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskCanceledEventAttributes");
                ActivityTaskCanceledEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getActivityTaskCanceledEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getActivityTaskCancelRequestedEventAttributes() != null) {
                jsonGenerator.writeFieldName("activityTaskCancelRequestedEventAttributes");
                ActivityTaskCancelRequestedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getActivityTaskCancelRequestedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getWorkflowExecutionSignaledEventAttributes() != null) {
                jsonGenerator.writeFieldName("workflowExecutionSignaledEventAttributes");
                WorkflowExecutionSignaledEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getWorkflowExecutionSignaledEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getMarkerRecordedEventAttributes() != null) {
                jsonGenerator.writeFieldName("markerRecordedEventAttributes");
                MarkerRecordedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getMarkerRecordedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getRecordMarkerFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("recordMarkerFailedEventAttributes");
                RecordMarkerFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getRecordMarkerFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getTimerStartedEventAttributes() != null) {
                jsonGenerator.writeFieldName("timerStartedEventAttributes");
                TimerStartedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getTimerStartedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getTimerFiredEventAttributes() != null) {
                jsonGenerator.writeFieldName("timerFiredEventAttributes");
                TimerFiredEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getTimerFiredEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getTimerCanceledEventAttributes() != null) {
                jsonGenerator.writeFieldName("timerCanceledEventAttributes");
                TimerCanceledEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getTimerCanceledEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getStartChildWorkflowExecutionInitiatedEventAttributes() != null) {
                jsonGenerator.writeFieldName("startChildWorkflowExecutionInitiatedEventAttributes");
                StartChildWorkflowExecutionInitiatedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getStartChildWorkflowExecutionInitiatedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getChildWorkflowExecutionStartedEventAttributes() != null) {
                jsonGenerator.writeFieldName("childWorkflowExecutionStartedEventAttributes");
                ChildWorkflowExecutionStartedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getChildWorkflowExecutionStartedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getChildWorkflowExecutionCompletedEventAttributes() != null) {
                jsonGenerator.writeFieldName("childWorkflowExecutionCompletedEventAttributes");
                ChildWorkflowExecutionCompletedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getChildWorkflowExecutionCompletedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getChildWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("childWorkflowExecutionFailedEventAttributes");
                ChildWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getChildWorkflowExecutionFailedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getChildWorkflowExecutionTimedOutEventAttributes() != null) {
                jsonGenerator.writeFieldName("childWorkflowExecutionTimedOutEventAttributes");
                ChildWorkflowExecutionTimedOutEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getChildWorkflowExecutionTimedOutEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getChildWorkflowExecutionCanceledEventAttributes() != null) {
                jsonGenerator.writeFieldName("childWorkflowExecutionCanceledEventAttributes");
                ChildWorkflowExecutionCanceledEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getChildWorkflowExecutionCanceledEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getChildWorkflowExecutionTerminatedEventAttributes() != null) {
                jsonGenerator.writeFieldName("childWorkflowExecutionTerminatedEventAttributes");
                ChildWorkflowExecutionTerminatedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getChildWorkflowExecutionTerminatedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getSignalExternalWorkflowExecutionInitiatedEventAttributes() != null) {
                jsonGenerator.writeFieldName("signalExternalWorkflowExecutionInitiatedEventAttributes");
                SignalExternalWorkflowExecutionInitiatedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getSignalExternalWorkflowExecutionInitiatedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getExternalWorkflowExecutionSignaledEventAttributes() != null) {
                jsonGenerator.writeFieldName("externalWorkflowExecutionSignaledEventAttributes");
                ExternalWorkflowExecutionSignaledEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getExternalWorkflowExecutionSignaledEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getSignalExternalWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("signalExternalWorkflowExecutionFailedEventAttributes");
                SignalExternalWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getSignalExternalWorkflowExecutionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getExternalWorkflowExecutionCancelRequestedEventAttributes() != null) {
                jsonGenerator.writeFieldName("externalWorkflowExecutionCancelRequestedEventAttributes");
                ExternalWorkflowExecutionCancelRequestedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getExternalWorkflowExecutionCancelRequestedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() != null) {
                jsonGenerator.writeFieldName("requestCancelExternalWorkflowExecutionInitiatedEventAttributes");
                RequestCancelExternalWorkflowExecutionInitiatedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("requestCancelExternalWorkflowExecutionFailedEventAttributes");
                RequestCancelExternalWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getRequestCancelExternalWorkflowExecutionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getScheduleActivityTaskFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("scheduleActivityTaskFailedEventAttributes");
                ScheduleActivityTaskFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getScheduleActivityTaskFailedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getRequestCancelActivityTaskFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("requestCancelActivityTaskFailedEventAttributes");
                RequestCancelActivityTaskFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getRequestCancelActivityTaskFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getStartTimerFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("startTimerFailedEventAttributes");
                StartTimerFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getStartTimerFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getCancelTimerFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("cancelTimerFailedEventAttributes");
                CancelTimerFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getCancelTimerFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getStartChildWorkflowExecutionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("startChildWorkflowExecutionFailedEventAttributes");
                StartChildWorkflowExecutionFailedEventAttributesJsonMarshaller.getInstance().marshall(
                        historyEvent.getStartChildWorkflowExecutionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionScheduledEventAttributes() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionScheduledEventAttributes");
                LambdaFunctionScheduledEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionScheduledEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionStartedEventAttributes() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionStartedEventAttributes");
                LambdaFunctionStartedEventAttributesJsonMarshaller.getInstance()
                        .marshall(historyEvent.getLambdaFunctionStartedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionCompletedEventAttributes() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionCompletedEventAttributes");
                LambdaFunctionCompletedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionCompletedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionFailedEventAttributes");
                LambdaFunctionFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionFailedEventAttributes(), jsonGenerator);
            }
            if (historyEvent.getLambdaFunctionTimedOutEventAttributes() != null) {
                jsonGenerator.writeFieldName("lambdaFunctionTimedOutEventAttributes");
                LambdaFunctionTimedOutEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getLambdaFunctionTimedOutEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getScheduleLambdaFunctionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("scheduleLambdaFunctionFailedEventAttributes");
                ScheduleLambdaFunctionFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getScheduleLambdaFunctionFailedEventAttributes(),
                        jsonGenerator);
            }
            if (historyEvent.getStartLambdaFunctionFailedEventAttributes() != null) {
                jsonGenerator.writeFieldName("startLambdaFunctionFailedEventAttributes");
                StartLambdaFunctionFailedEventAttributesJsonMarshaller.getInstance().marshall(historyEvent.getStartLambdaFunctionFailedEventAttributes(),
                        jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HistoryEventJsonMarshaller instance;

    public static HistoryEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HistoryEventJsonMarshaller();
        return instance;
    }

}
