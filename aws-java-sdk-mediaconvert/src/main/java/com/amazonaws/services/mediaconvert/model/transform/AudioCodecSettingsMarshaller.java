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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioCodecSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioCodecSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> AACSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aacSettings").build();
    private static final MarshallingInfo<StructuredPojo> AC3SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ac3Settings").build();
    private static final MarshallingInfo<StructuredPojo> AIFFSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aiffSettings").build();
    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<StructuredPojo> EAC3SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eac3Settings").build();
    private static final MarshallingInfo<StructuredPojo> MP2SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mp2Settings").build();
    private static final MarshallingInfo<StructuredPojo> WAVSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("wavSettings").build();

    private static final AudioCodecSettingsMarshaller instance = new AudioCodecSettingsMarshaller();

    public static AudioCodecSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioCodecSettings audioCodecSettings, ProtocolMarshaller protocolMarshaller) {

        if (audioCodecSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioCodecSettings.getAacSettings(), AACSETTINGS_BINDING);
            protocolMarshaller.marshall(audioCodecSettings.getAc3Settings(), AC3SETTINGS_BINDING);
            protocolMarshaller.marshall(audioCodecSettings.getAiffSettings(), AIFFSETTINGS_BINDING);
            protocolMarshaller.marshall(audioCodecSettings.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(audioCodecSettings.getEac3Settings(), EAC3SETTINGS_BINDING);
            protocolMarshaller.marshall(audioCodecSettings.getMp2Settings(), MP2SETTINGS_BINDING);
            protocolMarshaller.marshall(audioCodecSettings.getWavSettings(), WAVSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
