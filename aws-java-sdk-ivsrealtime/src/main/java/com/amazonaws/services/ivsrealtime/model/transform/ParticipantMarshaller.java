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
package com.amazonaws.services.ivsrealtime.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivsrealtime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParticipantMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParticipantMarshaller {

    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<String> BROWSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("browserName").build();
    private static final MarshallingInfo<String> BROWSERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("browserVersion").build();
    private static final MarshallingInfo<java.util.Date> FIRSTJOINTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstJoinTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> ISPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ispName").build();
    private static final MarshallingInfo<String> OSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("osName").build();
    private static final MarshallingInfo<String> OSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("osVersion").build();
    private static final MarshallingInfo<String> PARTICIPANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("participantId").build();
    private static final MarshallingInfo<Boolean> PUBLISHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("published").build();
    private static final MarshallingInfo<String> SDKVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sdkVersion").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();

    private static final ParticipantMarshaller instance = new ParticipantMarshaller();

    public static ParticipantMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Participant participant, ProtocolMarshaller protocolMarshaller) {

        if (participant == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(participant.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(participant.getBrowserName(), BROWSERNAME_BINDING);
            protocolMarshaller.marshall(participant.getBrowserVersion(), BROWSERVERSION_BINDING);
            protocolMarshaller.marshall(participant.getFirstJoinTime(), FIRSTJOINTIME_BINDING);
            protocolMarshaller.marshall(participant.getIspName(), ISPNAME_BINDING);
            protocolMarshaller.marshall(participant.getOsName(), OSNAME_BINDING);
            protocolMarshaller.marshall(participant.getOsVersion(), OSVERSION_BINDING);
            protocolMarshaller.marshall(participant.getParticipantId(), PARTICIPANTID_BINDING);
            protocolMarshaller.marshall(participant.getPublished(), PUBLISHED_BINDING);
            protocolMarshaller.marshall(participant.getSdkVersion(), SDKVERSION_BINDING);
            protocolMarshaller.marshall(participant.getState(), STATE_BINDING);
            protocolMarshaller.marshall(participant.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
