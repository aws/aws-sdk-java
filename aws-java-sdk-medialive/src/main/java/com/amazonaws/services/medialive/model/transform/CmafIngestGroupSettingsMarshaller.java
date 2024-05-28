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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CmafIngestGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CmafIngestGroupSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<String> NIELSENID3BEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenId3Behavior").build();
    private static final MarshallingInfo<String> SCTE35TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Type").build();
    private static final MarshallingInfo<Integer> SEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentLength").build();
    private static final MarshallingInfo<String> SEGMENTLENGTHUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentLengthUnits").build();
    private static final MarshallingInfo<Integer> SENDDELAYMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sendDelayMs").build();

    private static final CmafIngestGroupSettingsMarshaller instance = new CmafIngestGroupSettingsMarshaller();

    public static CmafIngestGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CmafIngestGroupSettings cmafIngestGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (cmafIngestGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cmafIngestGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(cmafIngestGroupSettings.getNielsenId3Behavior(), NIELSENID3BEHAVIOR_BINDING);
            protocolMarshaller.marshall(cmafIngestGroupSettings.getScte35Type(), SCTE35TYPE_BINDING);
            protocolMarshaller.marshall(cmafIngestGroupSettings.getSegmentLength(), SEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(cmafIngestGroupSettings.getSegmentLengthUnits(), SEGMENTLENGTHUNITS_BINDING);
            protocolMarshaller.marshall(cmafIngestGroupSettings.getSendDelayMs(), SENDDELAYMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
