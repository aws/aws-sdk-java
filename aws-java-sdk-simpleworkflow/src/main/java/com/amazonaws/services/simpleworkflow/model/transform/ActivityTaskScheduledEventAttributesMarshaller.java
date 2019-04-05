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
 * ActivityTaskScheduledEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityTaskScheduledEventAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIVITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityType").build();
    private static final MarshallingInfo<String> ACTIVITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activityId").build();
    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("input").build();
    private static final MarshallingInfo<String> CONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("control").build();
    private static final MarshallingInfo<String> SCHEDULETOSTARTTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleToStartTimeout").build();
    private static final MarshallingInfo<String> SCHEDULETOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleToCloseTimeout").build();
    private static final MarshallingInfo<String> STARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startToCloseTimeout").build();
    private static final MarshallingInfo<StructuredPojo> TASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskList").build();
    private static final MarshallingInfo<String> TASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskPriority").build();
    private static final MarshallingInfo<Long> DECISIONTASKCOMPLETEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskCompletedEventId").build();
    private static final MarshallingInfo<String> HEARTBEATTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("heartbeatTimeout").build();

    private static final ActivityTaskScheduledEventAttributesMarshaller instance = new ActivityTaskScheduledEventAttributesMarshaller();

    public static ActivityTaskScheduledEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (activityTaskScheduledEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getActivityType(), ACTIVITYTYPE_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getActivityId(), ACTIVITYID_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getControl(), CONTROL_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getScheduleToStartTimeout(), SCHEDULETOSTARTTIMEOUT_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getScheduleToCloseTimeout(), SCHEDULETOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getStartToCloseTimeout(), STARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getTaskList(), TASKLIST_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getTaskPriority(), TASKPRIORITY_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getDecisionTaskCompletedEventId(), DECISIONTASKCOMPLETEDEVENTID_BINDING);
            protocolMarshaller.marshall(activityTaskScheduledEventAttributes.getHeartbeatTimeout(), HEARTBEATTIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
