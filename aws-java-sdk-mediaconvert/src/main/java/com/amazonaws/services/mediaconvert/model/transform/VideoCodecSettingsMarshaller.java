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
 * VideoCodecSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoCodecSettingsMarshaller {

    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<StructuredPojo> FRAMECAPTURESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameCaptureSettings").build();
    private static final MarshallingInfo<StructuredPojo> H264SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("h264Settings").build();
    private static final MarshallingInfo<StructuredPojo> H265SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("h265Settings").build();
    private static final MarshallingInfo<StructuredPojo> MPEG2SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mpeg2Settings").build();
    private static final MarshallingInfo<StructuredPojo> PRORESSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proresSettings").build();

    private static final VideoCodecSettingsMarshaller instance = new VideoCodecSettingsMarshaller();

    public static VideoCodecSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoCodecSettings videoCodecSettings, ProtocolMarshaller protocolMarshaller) {

        if (videoCodecSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoCodecSettings.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(videoCodecSettings.getFrameCaptureSettings(), FRAMECAPTURESETTINGS_BINDING);
            protocolMarshaller.marshall(videoCodecSettings.getH264Settings(), H264SETTINGS_BINDING);
            protocolMarshaller.marshall(videoCodecSettings.getH265Settings(), H265SETTINGS_BINDING);
            protocolMarshaller.marshall(videoCodecSettings.getMpeg2Settings(), MPEG2SETTINGS_BINDING);
            protocolMarshaller.marshall(videoCodecSettings.getProresSettings(), PRORESSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
