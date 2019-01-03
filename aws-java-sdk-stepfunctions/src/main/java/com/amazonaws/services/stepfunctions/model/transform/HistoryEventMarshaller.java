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
package com.amazonaws.services.stepfunctions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HistoryEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HistoryEventMarshaller {

    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<Long> ID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<Long> PREVIOUSEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previousEventId").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYSCHEDULEFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityScheduleFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYSCHEDULEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityScheduledEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYSTARTEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityStartedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYSUCCEEDEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activitySucceededEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVITYTIMEDOUTEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityTimedOutEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKSCHEDULEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskScheduledEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKSTARTFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKSTARTEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKSUBMITFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskSubmitFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKSUBMITTEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskSubmittedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKSUCCEEDEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskSucceededEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> TASKTIMEDOUTEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskTimedOutEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONSTARTEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStartedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONSUCCEEDEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionSucceededEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONABORTEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionAbortedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONTIMEDOUTEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionTimedOutEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSCHEDULEFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionScheduleFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSCHEDULEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionScheduledEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSTARTFAILEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionStartFailedEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSUCCEEDEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionSucceededEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONTIMEDOUTEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionTimedOutEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> STATEENTEREDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateEnteredEventDetails").build();
    private static final MarshallingInfo<StructuredPojo> STATEEXITEDEVENTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateExitedEventDetails").build();

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
            protocolMarshaller.marshall(historyEvent.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(historyEvent.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(historyEvent.getId(), ID_BINDING);
            protocolMarshaller.marshall(historyEvent.getPreviousEventId(), PREVIOUSEVENTID_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityFailedEventDetails(), ACTIVITYFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityScheduleFailedEventDetails(), ACTIVITYSCHEDULEFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityScheduledEventDetails(), ACTIVITYSCHEDULEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityStartedEventDetails(), ACTIVITYSTARTEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivitySucceededEventDetails(), ACTIVITYSUCCEEDEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getActivityTimedOutEventDetails(), ACTIVITYTIMEDOUTEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskFailedEventDetails(), TASKFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskScheduledEventDetails(), TASKSCHEDULEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskStartFailedEventDetails(), TASKSTARTFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskStartedEventDetails(), TASKSTARTEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskSubmitFailedEventDetails(), TASKSUBMITFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskSubmittedEventDetails(), TASKSUBMITTEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskSucceededEventDetails(), TASKSUCCEEDEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getTaskTimedOutEventDetails(), TASKTIMEDOUTEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getExecutionFailedEventDetails(), EXECUTIONFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getExecutionStartedEventDetails(), EXECUTIONSTARTEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getExecutionSucceededEventDetails(), EXECUTIONSUCCEEDEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getExecutionAbortedEventDetails(), EXECUTIONABORTEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getExecutionTimedOutEventDetails(), EXECUTIONTIMEDOUTEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionFailedEventDetails(), LAMBDAFUNCTIONFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionScheduleFailedEventDetails(), LAMBDAFUNCTIONSCHEDULEFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionScheduledEventDetails(), LAMBDAFUNCTIONSCHEDULEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionStartFailedEventDetails(), LAMBDAFUNCTIONSTARTFAILEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionSucceededEventDetails(), LAMBDAFUNCTIONSUCCEEDEDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getLambdaFunctionTimedOutEventDetails(), LAMBDAFUNCTIONTIMEDOUTEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getStateEnteredEventDetails(), STATEENTEREDEVENTDETAILS_BINDING);
            protocolMarshaller.marshall(historyEvent.getStateExitedEventDetails(), STATEEXITEDEVENTDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
