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
 * ActivityTypeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityTypeConfigurationMarshaller {

    private static final MarshallingInfo<String> DEFAULTTASKSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskStartToCloseTimeout").build();
    private static final MarshallingInfo<String> DEFAULTTASKHEARTBEATTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskHeartbeatTimeout").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTTASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskList").build();
    private static final MarshallingInfo<String> DEFAULTTASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskPriority").build();
    private static final MarshallingInfo<String> DEFAULTTASKSCHEDULETOSTARTTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskScheduleToStartTimeout").build();
    private static final MarshallingInfo<String> DEFAULTTASKSCHEDULETOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTaskScheduleToCloseTimeout").build();

    private static final ActivityTypeConfigurationMarshaller instance = new ActivityTypeConfigurationMarshaller();

    public static ActivityTypeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActivityTypeConfiguration activityTypeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (activityTypeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activityTypeConfiguration.getDefaultTaskStartToCloseTimeout(), DEFAULTTASKSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(activityTypeConfiguration.getDefaultTaskHeartbeatTimeout(), DEFAULTTASKHEARTBEATTIMEOUT_BINDING);
            protocolMarshaller.marshall(activityTypeConfiguration.getDefaultTaskList(), DEFAULTTASKLIST_BINDING);
            protocolMarshaller.marshall(activityTypeConfiguration.getDefaultTaskPriority(), DEFAULTTASKPRIORITY_BINDING);
            protocolMarshaller.marshall(activityTypeConfiguration.getDefaultTaskScheduleToStartTimeout(), DEFAULTTASKSCHEDULETOSTARTTIMEOUT_BINDING);
            protocolMarshaller.marshall(activityTypeConfiguration.getDefaultTaskScheduleToCloseTimeout(), DEFAULTTASKSCHEDULETOCLOSETIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
