/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopicRefreshScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopicRefreshScheduleMarshaller {

    private static final MarshallingInfo<Boolean> ISENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsEnabled").build();
    private static final MarshallingInfo<Boolean> BASEDONSPICESCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BasedOnSpiceSchedule").build();
    private static final MarshallingInfo<java.util.Date> STARTINGAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<String> REPEATAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RepeatAt").build();
    private static final MarshallingInfo<String> TOPICSCHEDULETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopicScheduleType").build();

    private static final TopicRefreshScheduleMarshaller instance = new TopicRefreshScheduleMarshaller();

    public static TopicRefreshScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopicRefreshSchedule topicRefreshSchedule, ProtocolMarshaller protocolMarshaller) {

        if (topicRefreshSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topicRefreshSchedule.getIsEnabled(), ISENABLED_BINDING);
            protocolMarshaller.marshall(topicRefreshSchedule.getBasedOnSpiceSchedule(), BASEDONSPICESCHEDULE_BINDING);
            protocolMarshaller.marshall(topicRefreshSchedule.getStartingAt(), STARTINGAT_BINDING);
            protocolMarshaller.marshall(topicRefreshSchedule.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(topicRefreshSchedule.getRepeatAt(), REPEATAT_BINDING);
            protocolMarshaller.marshall(topicRefreshSchedule.getTopicScheduleType(), TOPICSCHEDULETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
