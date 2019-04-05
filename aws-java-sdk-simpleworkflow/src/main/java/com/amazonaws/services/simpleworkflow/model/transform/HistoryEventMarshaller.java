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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HistoryEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HistoryEventMarshaller {

    private static final MarshallingInfo<java.util.Date> EVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventType").build();
    private static final MarshallingInfo<Long> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventId").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONSTARTEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionStartedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONCOMPLETEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionCompletedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> COMPLETEWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("completeWorkflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> FAILWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failWorkflowExecutionFailedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONTIMEDOUTEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionTimedOutEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONCANCELEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionCanceledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CANCELWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cancelWorkflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONCONTINUEDASNEWEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("workflowExecutionContinuedAsNewEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CONTINUEASNEWWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("continueAsNewWorkflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONTERMINATEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionTerminatedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONCANCELREQUESTEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("workflowExecutionCancelRequestedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DECISIONTASKSCHEDULEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskScheduledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DECISIONTASKSTARTEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskStartedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DECISIONTASKCOMPLETEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskCompletedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> DECISIONTASKTIMEDOUTEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskTimedOutEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKSCHEDULEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskScheduledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKSTARTEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskStartedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKCOMPLETEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskCompletedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKTIMEDOUTEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskTimedOutEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKCANCELEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskCanceledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTASKCANCELREQUESTEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTaskCancelRequestedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTIONSIGNALEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionSignaledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> MARKERRECORDEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("markerRecordedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> RECORDMARKERFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordMarkerFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> TIMERSTARTEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timerStartedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> TIMERFIREDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timerFiredEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> TIMERCANCELEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timerCanceledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> STARTCHILDWORKFLOWEXECUTIONINITIATEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startChildWorkflowExecutionInitiatedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CHILDWORKFLOWEXECUTIONSTARTEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("childWorkflowExecutionStartedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CHILDWORKFLOWEXECUTIONCOMPLETEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("childWorkflowExecutionCompletedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CHILDWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("childWorkflowExecutionFailedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> CHILDWORKFLOWEXECUTIONTIMEDOUTEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("childWorkflowExecutionTimedOutEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CHILDWORKFLOWEXECUTIONCANCELEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("childWorkflowExecutionCanceledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CHILDWORKFLOWEXECUTIONTERMINATEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("childWorkflowExecutionTerminatedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SIGNALEXTERNALWORKFLOWEXECUTIONINITIATEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("signalExternalWorkflowExecutionInitiatedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> EXTERNALWORKFLOWEXECUTIONSIGNALEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("externalWorkflowExecutionSignaledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SIGNALEXTERNALWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("signalExternalWorkflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> EXTERNALWORKFLOWEXECUTIONCANCELREQUESTEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("externalWorkflowExecutionCancelRequestedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTCANCELEXTERNALWORKFLOWEXECUTIONINITIATEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestCancelExternalWorkflowExecutionInitiatedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTCANCELEXTERNALWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestCancelExternalWorkflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULEACTIVITYTASKFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleActivityTaskFailedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> REQUESTCANCELACTIVITYTASKFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestCancelActivityTaskFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> STARTTIMERFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimerFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> CANCELTIMERFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cancelTimerFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> STARTCHILDWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startChildWorkflowExecutionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSCHEDULEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionScheduledEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSTARTEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionStartedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONCOMPLETEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionCompletedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionFailedEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONTIMEDOUTEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionTimedOutEventAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULELAMBDAFUNCTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleLambdaFunctionFailedEventAttributes")
            .build();
    private static final MarshallingInfo<StructuredPojo> STARTLAMBDAFUNCTIONFAILEDEVENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startLambdaFunctionFailedEventAttributes").build();

    private static final HistoryEventMarshaller instance = new HistoryEventMarshaller();

    public static HistoryEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HistoryEvent historyEvent, ProtocolMarshaller protocolMarshaller) {

        if (historyEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(historyEvent.getEventTimestamp(), EVENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(historyEvent.getEventType(), EVENTTYPE_BINDING);
            protocolMarshaller.marshall(historyEvent.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionStartedEventAttributes(), WORKFLOWEXECUTIONSTARTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionCompletedEventAttributes(), WORKFLOWEXECUTIONCOMPLETEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getCompleteWorkflowExecutionFailedEventAttributes(),
                    COMPLETEWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionFailedEventAttributes(), WORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getFailWorkflowExecutionFailedEventAttributes(), FAILWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionTimedOutEventAttributes(), WORKFLOWEXECUTIONTIMEDOUTEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionCanceledEventAttributes(), WORKFLOWEXECUTIONCANCELEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getCancelWorkflowExecutionFailedEventAttributes(), CANCELWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionContinuedAsNewEventAttributes(),
                    WORKFLOWEXECUTIONCONTINUEDASNEWEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getContinueAsNewWorkflowExecutionFailedEventAttributes(),
                    CONTINUEASNEWWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionTerminatedEventAttributes(), WORKFLOWEXECUTIONTERMINATEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionCancelRequestedEventAttributes(),
                    WORKFLOWEXECUTIONCANCELREQUESTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getDecisionTaskScheduledEventAttributes(), DECISIONTASKSCHEDULEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getDecisionTaskStartedEventAttributes(), DECISIONTASKSTARTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getDecisionTaskCompletedEventAttributes(), DECISIONTASKCOMPLETEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getDecisionTaskTimedOutEventAttributes(), DECISIONTASKTIMEDOUTEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskScheduledEventAttributes(), ACTIVITYTASKSCHEDULEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskStartedEventAttributes(), ACTIVITYTASKSTARTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskCompletedEventAttributes(), ACTIVITYTASKCOMPLETEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskFailedEventAttributes(), ACTIVITYTASKFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskTimedOutEventAttributes(), ACTIVITYTASKTIMEDOUTEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskCanceledEventAttributes(), ACTIVITYTASKCANCELEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTaskCancelRequestedEventAttributes(), ACTIVITYTASKCANCELREQUESTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getWorkflowExecutionSignaledEventAttributes(), WORKFLOWEXECUTIONSIGNALEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getMarkerRecordedEventAttributes(), MARKERRECORDEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getRecordMarkerFailedEventAttributes(), RECORDMARKERFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getTimerStartedEventAttributes(), TIMERSTARTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getTimerFiredEventAttributes(), TIMERFIREDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getTimerCanceledEventAttributes(), TIMERCANCELEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getStartChildWorkflowExecutionInitiatedEventAttributes(),
                    STARTCHILDWORKFLOWEXECUTIONINITIATEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getChildWorkflowExecutionStartedEventAttributes(), CHILDWORKFLOWEXECUTIONSTARTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getChildWorkflowExecutionCompletedEventAttributes(),
                    CHILDWORKFLOWEXECUTIONCOMPLETEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getChildWorkflowExecutionFailedEventAttributes(), CHILDWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getChildWorkflowExecutionTimedOutEventAttributes(), CHILDWORKFLOWEXECUTIONTIMEDOUTEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getChildWorkflowExecutionCanceledEventAttributes(), CHILDWORKFLOWEXECUTIONCANCELEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getChildWorkflowExecutionTerminatedEventAttributes(),
                    CHILDWORKFLOWEXECUTIONTERMINATEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getSignalExternalWorkflowExecutionInitiatedEventAttributes(),
                    SIGNALEXTERNALWORKFLOWEXECUTIONINITIATEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getExternalWorkflowExecutionSignaledEventAttributes(),
                    EXTERNALWORKFLOWEXECUTIONSIGNALEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getSignalExternalWorkflowExecutionFailedEventAttributes(),
                    SIGNALEXTERNALWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getExternalWorkflowExecutionCancelRequestedEventAttributes(),
                    EXTERNALWORKFLOWEXECUTIONCANCELREQUESTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(),
                    REQUESTCANCELEXTERNALWORKFLOWEXECUTIONINITIATEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getRequestCancelExternalWorkflowExecutionFailedEventAttributes(),
                    REQUESTCANCELEXTERNALWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getScheduleActivityTaskFailedEventAttributes(), SCHEDULEACTIVITYTASKFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getRequestCancelActivityTaskFailedEventAttributes(),
                    REQUESTCANCELACTIVITYTASKFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getStartTimerFailedEventAttributes(), STARTTIMERFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getCancelTimerFailedEventAttributes(), CANCELTIMERFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getStartChildWorkflowExecutionFailedEventAttributes(),
                    STARTCHILDWORKFLOWEXECUTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionScheduledEventAttributes(), LAMBDAFUNCTIONSCHEDULEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionStartedEventAttributes(), LAMBDAFUNCTIONSTARTEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionCompletedEventAttributes(), LAMBDAFUNCTIONCOMPLETEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionFailedEventAttributes(), LAMBDAFUNCTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionTimedOutEventAttributes(), LAMBDAFUNCTIONTIMEDOUTEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getScheduleLambdaFunctionFailedEventAttributes(), SCHEDULELAMBDAFUNCTIONFAILEDEVENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(historyEvent.getStartLambdaFunctionFailedEventAttributes(), STARTLAMBDAFUNCTIONFAILEDEVENTATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
