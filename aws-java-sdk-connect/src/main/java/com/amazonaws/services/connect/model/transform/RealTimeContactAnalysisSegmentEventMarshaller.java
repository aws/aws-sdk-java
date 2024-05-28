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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealTimeContactAnalysisSegmentEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealTimeContactAnalysisSegmentEventMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> PARTICIPANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantId").build();
    private static final MarshallingInfo<String> PARTICIPANTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantRole").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> EVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EventType").build();
    private static final MarshallingInfo<StructuredPojo> TIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Time").build();

    private static final RealTimeContactAnalysisSegmentEventMarshaller instance = new RealTimeContactAnalysisSegmentEventMarshaller();

    public static RealTimeContactAnalysisSegmentEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealTimeContactAnalysisSegmentEvent realTimeContactAnalysisSegmentEvent, ProtocolMarshaller protocolMarshaller) {

        if (realTimeContactAnalysisSegmentEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentEvent.getId(), ID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentEvent.getParticipantId(), PARTICIPANTID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentEvent.getParticipantRole(), PARTICIPANTROLE_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentEvent.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentEvent.getEventType(), EVENTTYPE_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentEvent.getTime(), TIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
