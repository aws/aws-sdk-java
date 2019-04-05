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
package com.amazonaws.services.elastictranscoder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioParametersMarshaller {

    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Codec").build();
    private static final MarshallingInfo<String> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleRate").build();
    private static final MarshallingInfo<String> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BitRate").build();
    private static final MarshallingInfo<String> CHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Channels").build();
    private static final MarshallingInfo<String> AUDIOPACKINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioPackingMode").build();
    private static final MarshallingInfo<StructuredPojo> CODECOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodecOptions").build();

    private static final AudioParametersMarshaller instance = new AudioParametersMarshaller();

    public static AudioParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioParameters audioParameters, ProtocolMarshaller protocolMarshaller) {

        if (audioParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioParameters.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(audioParameters.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(audioParameters.getBitRate(), BITRATE_BINDING);
            protocolMarshaller.marshall(audioParameters.getChannels(), CHANNELS_BINDING);
            protocolMarshaller.marshall(audioParameters.getAudioPackingMode(), AUDIOPACKINGMODE_BINDING);
            protocolMarshaller.marshall(audioParameters.getCodecOptions(), CODECOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
