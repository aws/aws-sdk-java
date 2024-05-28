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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivsrealtime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipConfigurationMarshaller {

    private static final MarshallingInfo<String> FEATUREDPARTICIPANTATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("featuredParticipantAttribute").build();
    private static final MarshallingInfo<Integer> GRIDGAP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gridGap").build();
    private static final MarshallingInfo<Boolean> OMITSTOPPEDVIDEO_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("omitStoppedVideo").build();
    private static final MarshallingInfo<String> PIPBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipBehavior").build();
    private static final MarshallingInfo<Integer> PIPHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipHeight").build();
    private static final MarshallingInfo<Integer> PIPOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipOffset").build();
    private static final MarshallingInfo<String> PIPPARTICIPANTATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipParticipantAttribute").build();
    private static final MarshallingInfo<String> PIPPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipPosition").build();
    private static final MarshallingInfo<Integer> PIPWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipWidth").build();
    private static final MarshallingInfo<String> VIDEOFILLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoFillMode").build();

    private static final PipConfigurationMarshaller instance = new PipConfigurationMarshaller();

    public static PipConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipConfiguration pipConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (pipConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipConfiguration.getFeaturedParticipantAttribute(), FEATUREDPARTICIPANTATTRIBUTE_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getGridGap(), GRIDGAP_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getOmitStoppedVideo(), OMITSTOPPEDVIDEO_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getPipBehavior(), PIPBEHAVIOR_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getPipHeight(), PIPHEIGHT_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getPipOffset(), PIPOFFSET_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getPipParticipantAttribute(), PIPPARTICIPANTATTRIBUTE_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getPipPosition(), PIPPOSITION_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getPipWidth(), PIPWIDTH_BINDING);
            protocolMarshaller.marshall(pipConfiguration.getVideoFillMode(), VIDEOFILLMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
