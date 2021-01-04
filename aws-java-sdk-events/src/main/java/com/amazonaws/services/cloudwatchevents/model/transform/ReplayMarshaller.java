/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplayMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplayMarshaller {

    private static final MarshallingInfo<String> REPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplayName").build();
    private static final MarshallingInfo<String> EVENTSOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceArn").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> STATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReason").build();
    private static final MarshallingInfo<java.util.Date> EVENTSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EVENTENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EVENTLASTREPLAYEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventLastReplayedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REPLAYSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplayStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REPLAYENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplayEndTime").timestampFormat("unixTimestamp").build();

    private static final ReplayMarshaller instance = new ReplayMarshaller();

    public static ReplayMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Replay replay, ProtocolMarshaller protocolMarshaller) {

        if (replay == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replay.getReplayName(), REPLAYNAME_BINDING);
            protocolMarshaller.marshall(replay.getEventSourceArn(), EVENTSOURCEARN_BINDING);
            protocolMarshaller.marshall(replay.getState(), STATE_BINDING);
            protocolMarshaller.marshall(replay.getStateReason(), STATEREASON_BINDING);
            protocolMarshaller.marshall(replay.getEventStartTime(), EVENTSTARTTIME_BINDING);
            protocolMarshaller.marshall(replay.getEventEndTime(), EVENTENDTIME_BINDING);
            protocolMarshaller.marshall(replay.getEventLastReplayedTime(), EVENTLASTREPLAYEDTIME_BINDING);
            protocolMarshaller.marshall(replay.getReplayStartTime(), REPLAYSTARTTIME_BINDING);
            protocolMarshaller.marshall(replay.getReplayEndTime(), REPLAYENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
