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
 * VideoConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoConfigurationMarshaller {

    private static final MarshallingInfo<String> AVCLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("avcLevel").build();
    private static final MarshallingInfo<String> AVCPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("avcProfile").build();
    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<String> ENCODER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("encoder").build();
    private static final MarshallingInfo<Long> TARGETBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targetBitrate").build();
    private static final MarshallingInfo<Long> TARGETFRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetFramerate").build();
    private static final MarshallingInfo<Long> VIDEOHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("videoHeight").build();
    private static final MarshallingInfo<Long> VIDEOWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("videoWidth").build();

    private static final VideoConfigurationMarshaller instance = new VideoConfigurationMarshaller();

    public static VideoConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoConfiguration videoConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (videoConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoConfiguration.getAvcLevel(), AVCLEVEL_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getAvcProfile(), AVCPROFILE_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getEncoder(), ENCODER_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getTargetBitrate(), TARGETBITRATE_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getTargetFramerate(), TARGETFRAMERATE_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getVideoHeight(), VIDEOHEIGHT_BINDING);
            protocolMarshaller.marshall(videoConfiguration.getVideoWidth(), VIDEOWIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
