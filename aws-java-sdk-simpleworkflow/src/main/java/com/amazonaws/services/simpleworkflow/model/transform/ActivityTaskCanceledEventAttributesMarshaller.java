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
 * ActivityTaskCanceledEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityTaskCanceledEventAttributesMarshaller {

    private static final MarshallingInfo<String> DETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("details").build();
    private static final MarshallingInfo<Long> SCHEDULEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduledEventId").build();
    private static final MarshallingInfo<Long> STARTEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedEventId").build();
    private static final MarshallingInfo<Long> LATESTCANCELREQUESTEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestCancelRequestedEventId").build();

    private static final ActivityTaskCanceledEventAttributesMarshaller instance = new ActivityTaskCanceledEventAttributesMarshaller();

    public static ActivityTaskCanceledEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (activityTaskCanceledEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activityTaskCanceledEventAttributes.getDetails(), DETAILS_BINDING);
            protocolMarshaller.marshall(activityTaskCanceledEventAttributes.getScheduledEventId(), SCHEDULEDEVENTID_BINDING);
            protocolMarshaller.marshall(activityTaskCanceledEventAttributes.getStartedEventId(), STARTEDEVENTID_BINDING);
            protocolMarshaller.marshall(activityTaskCanceledEventAttributes.getLatestCancelRequestedEventId(), LATESTCANCELREQUESTEDEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
