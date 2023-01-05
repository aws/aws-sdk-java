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
package com.amazonaws.services.ivs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioConfigurationMarshaller {

    private static final MarshallingInfo<Long> CHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("channels").build();
    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<Long> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sampleRate").build();
    private static final MarshallingInfo<Long> TARGETBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targetBitrate").build();

    private static final AudioConfigurationMarshaller instance = new AudioConfigurationMarshaller();

    public static AudioConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioConfiguration audioConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (audioConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioConfiguration.getChannels(), CHANNELS_BINDING);
            protocolMarshaller.marshall(audioConfiguration.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(audioConfiguration.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(audioConfiguration.getTargetBitrate(), TARGETBITRATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
