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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioDescriptionMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUDIONORMALIZATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioNormalizationSettings").build();
    private static final MarshallingInfo<String> AUDIOSELECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioSelectorName").build();
    private static final MarshallingInfo<String> AUDIOTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioType").build();
    private static final MarshallingInfo<String> AUDIOTYPECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioTypeControl").build();
    private static final MarshallingInfo<StructuredPojo> CODECSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecSettings").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("languageCode").build();
    private static final MarshallingInfo<String> LANGUAGECODECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("languageCodeControl").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> REMIXSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remixSettings").build();
    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamName").build();

    private static final AudioDescriptionMarshaller instance = new AudioDescriptionMarshaller();

    public static AudioDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioDescription audioDescription, ProtocolMarshaller protocolMarshaller) {

        if (audioDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioDescription.getAudioNormalizationSettings(), AUDIONORMALIZATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(audioDescription.getAudioSelectorName(), AUDIOSELECTORNAME_BINDING);
            protocolMarshaller.marshall(audioDescription.getAudioType(), AUDIOTYPE_BINDING);
            protocolMarshaller.marshall(audioDescription.getAudioTypeControl(), AUDIOTYPECONTROL_BINDING);
            protocolMarshaller.marshall(audioDescription.getCodecSettings(), CODECSETTINGS_BINDING);
            protocolMarshaller.marshall(audioDescription.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(audioDescription.getLanguageCodeControl(), LANGUAGECODECONTROL_BINDING);
            protocolMarshaller.marshall(audioDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(audioDescription.getRemixSettings(), REMIXSETTINGS_BINDING);
            protocolMarshaller.marshall(audioDescription.getStreamName(), STREAMNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
