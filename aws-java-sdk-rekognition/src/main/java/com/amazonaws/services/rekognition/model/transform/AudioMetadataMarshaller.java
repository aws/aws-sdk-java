/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AudioMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AudioMetadataMarshaller {

    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Codec").build();
    private static final MarshallingInfo<Long> DURATIONMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationMillis").build();
    private static final MarshallingInfo<Long> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SampleRate").build();
    private static final MarshallingInfo<Long> NUMBEROFCHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfChannels").build();

    private static final AudioMetadataMarshaller instance = new AudioMetadataMarshaller();

    public static AudioMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AudioMetadata audioMetadata, ProtocolMarshaller protocolMarshaller) {

        if (audioMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(audioMetadata.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(audioMetadata.getDurationMillis(), DURATIONMILLIS_BINDING);
            protocolMarshaller.marshall(audioMetadata.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(audioMetadata.getNumberOfChannels(), NUMBEROFCHANNELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
