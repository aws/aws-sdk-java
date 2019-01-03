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
 * VideoDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoDescriptionMarshaller {

    private static final MarshallingInfo<String> AFDSIGNALING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afdSignaling").build();
    private static final MarshallingInfo<String> ANTIALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("antiAlias").build();
    private static final MarshallingInfo<StructuredPojo> CODECSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecSettings").build();
    private static final MarshallingInfo<String> COLORMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorMetadata").build();
    private static final MarshallingInfo<StructuredPojo> CROP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("crop").build();
    private static final MarshallingInfo<String> DROPFRAMETIMECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dropFrameTimecode").build();
    private static final MarshallingInfo<Integer> FIXEDAFD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedAfd").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("height").build();
    private static final MarshallingInfo<StructuredPojo> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("position").build();
    private static final MarshallingInfo<String> RESPONDTOAFD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("respondToAfd").build();
    private static final MarshallingInfo<String> SCALINGBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingBehavior").build();
    private static final MarshallingInfo<Integer> SHARPNESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sharpness").build();
    private static final MarshallingInfo<String> TIMECODEINSERTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeInsertion").build();
    private static final MarshallingInfo<StructuredPojo> VIDEOPREPROCESSORS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoPreprocessors").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final VideoDescriptionMarshaller instance = new VideoDescriptionMarshaller();

    public static VideoDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoDescription videoDescription, ProtocolMarshaller protocolMarshaller) {

        if (videoDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoDescription.getAfdSignaling(), AFDSIGNALING_BINDING);
            protocolMarshaller.marshall(videoDescription.getAntiAlias(), ANTIALIAS_BINDING);
            protocolMarshaller.marshall(videoDescription.getCodecSettings(), CODECSETTINGS_BINDING);
            protocolMarshaller.marshall(videoDescription.getColorMetadata(), COLORMETADATA_BINDING);
            protocolMarshaller.marshall(videoDescription.getCrop(), CROP_BINDING);
            protocolMarshaller.marshall(videoDescription.getDropFrameTimecode(), DROPFRAMETIMECODE_BINDING);
            protocolMarshaller.marshall(videoDescription.getFixedAfd(), FIXEDAFD_BINDING);
            protocolMarshaller.marshall(videoDescription.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(videoDescription.getPosition(), POSITION_BINDING);
            protocolMarshaller.marshall(videoDescription.getRespondToAfd(), RESPONDTOAFD_BINDING);
            protocolMarshaller.marshall(videoDescription.getScalingBehavior(), SCALINGBEHAVIOR_BINDING);
            protocolMarshaller.marshall(videoDescription.getSharpness(), SHARPNESS_BINDING);
            protocolMarshaller.marshall(videoDescription.getTimecodeInsertion(), TIMECODEINSERTION_BINDING);
            protocolMarshaller.marshall(videoDescription.getVideoPreprocessors(), VIDEOPREPROCESSORS_BINDING);
            protocolMarshaller.marshall(videoDescription.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
