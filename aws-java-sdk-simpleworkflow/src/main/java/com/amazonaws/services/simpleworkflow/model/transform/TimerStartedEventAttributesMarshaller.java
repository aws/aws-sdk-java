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
 * TimerStartedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimerStartedEventAttributesMarshaller {

    private static final MarshallingInfo<String> TIMERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timerId").build();
    private static final MarshallingInfo<String> CONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("control").build();
    private static final MarshallingInfo<String> STARTTOFIRETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startToFireTimeout").build();
    private static final MarshallingInfo<Long> DECISIONTASKCOMPLETEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskCompletedEventId").build();

    private static final TimerStartedEventAttributesMarshaller instance = new TimerStartedEventAttributesMarshaller();

    public static TimerStartedEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimerStartedEventAttributes timerStartedEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (timerStartedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timerStartedEventAttributes.getTimerId(), TIMERID_BINDING);
            protocolMarshaller.marshall(timerStartedEventAttributes.getControl(), CONTROL_BINDING);
            protocolMarshaller.marshall(timerStartedEventAttributes.getStartToFireTimeout(), STARTTOFIRETIMEOUT_BINDING);
            protocolMarshaller.marshall(timerStartedEventAttributes.getDecisionTaskCompletedEventId(), DECISIONTASKCOMPLETEDEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
