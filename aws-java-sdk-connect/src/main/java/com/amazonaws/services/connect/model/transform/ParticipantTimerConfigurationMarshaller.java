/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ParticipantTimerConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParticipantTimerConfigurationMarshaller {

    private static final MarshallingInfo<String> PARTICIPANTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantRole").build();
    private static final MarshallingInfo<String> TIMERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimerType").build();
    private static final MarshallingInfo<StructuredPojo> TIMERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimerValue").build();

    private static final ParticipantTimerConfigurationMarshaller instance = new ParticipantTimerConfigurationMarshaller();

    public static ParticipantTimerConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParticipantTimerConfiguration participantTimerConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (participantTimerConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(participantTimerConfiguration.getParticipantRole(), PARTICIPANTROLE_BINDING);
            protocolMarshaller.marshall(participantTimerConfiguration.getTimerType(), TIMERTYPE_BINDING);
            protocolMarshaller.marshall(participantTimerConfiguration.getTimerValue(), TIMERVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
