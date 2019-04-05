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
package com.amazonaws.services.medialive.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EncoderSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EncoderSettingsMarshaller {

    private static final MarshallingInfo<List> AUDIODESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioDescriptions").build();
    private static final MarshallingInfo<StructuredPojo> AVAILBLANKING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availBlanking").build();
    private static final MarshallingInfo<StructuredPojo> AVAILCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BLACKOUTSLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blackoutSlate").build();
    private static final MarshallingInfo<List> CAPTIONDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionDescriptions").build();
    private static final MarshallingInfo<StructuredPojo> GLOBALCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("globalConfiguration").build();
    private static final MarshallingInfo<List> OUTPUTGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputGroups").build();
    private static final MarshallingInfo<StructuredPojo> TIMECODECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeConfig").build();
    private static final MarshallingInfo<List> VIDEODESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoDescriptions").build();

    private static final EncoderSettingsMarshaller instance = new EncoderSettingsMarshaller();

    public static EncoderSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EncoderSettings encoderSettings, ProtocolMarshaller protocolMarshaller) {

        if (encoderSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(encoderSettings.getAudioDescriptions(), AUDIODESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(encoderSettings.getAvailBlanking(), AVAILBLANKING_BINDING);
            protocolMarshaller.marshall(encoderSettings.getAvailConfiguration(), AVAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(encoderSettings.getBlackoutSlate(), BLACKOUTSLATE_BINDING);
            protocolMarshaller.marshall(encoderSettings.getCaptionDescriptions(), CAPTIONDESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(encoderSettings.getGlobalConfiguration(), GLOBALCONFIGURATION_BINDING);
            protocolMarshaller.marshall(encoderSettings.getOutputGroups(), OUTPUTGROUPS_BINDING);
            protocolMarshaller.marshall(encoderSettings.getTimecodeConfig(), TIMECODECONFIG_BINDING);
            protocolMarshaller.marshall(encoderSettings.getVideoDescriptions(), VIDEODESCRIPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
