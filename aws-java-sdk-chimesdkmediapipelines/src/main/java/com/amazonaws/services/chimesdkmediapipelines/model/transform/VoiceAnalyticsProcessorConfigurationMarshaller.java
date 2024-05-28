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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VoiceAnalyticsProcessorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VoiceAnalyticsProcessorConfigurationMarshaller {

    private static final MarshallingInfo<String> SPEAKERSEARCHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpeakerSearchStatus").build();
    private static final MarshallingInfo<String> VOICETONEANALYSISSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceToneAnalysisStatus").build();

    private static final VoiceAnalyticsProcessorConfigurationMarshaller instance = new VoiceAnalyticsProcessorConfigurationMarshaller();

    public static VoiceAnalyticsProcessorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VoiceAnalyticsProcessorConfiguration voiceAnalyticsProcessorConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (voiceAnalyticsProcessorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(voiceAnalyticsProcessorConfiguration.getSpeakerSearchStatus(), SPEAKERSEARCHSTATUS_BINDING);
            protocolMarshaller.marshall(voiceAnalyticsProcessorConfiguration.getVoiceToneAnalysisStatus(), VOICETONEANALYSISSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
