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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VideoParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoParametersMarshaller {

    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Codec").build();
    private static final MarshallingInfo<Map> CODECOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodecOptions").build();
    private static final MarshallingInfo<String> KEYFRAMESMAXDIST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyframesMaxDist").build();
    private static final MarshallingInfo<String> FIXEDGOP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FixedGOP").build();
    private static final MarshallingInfo<String> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BitRate").build();
    private static final MarshallingInfo<String> FRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FrameRate").build();
    private static final MarshallingInfo<String> MAXFRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFrameRate").build();
    private static final MarshallingInfo<String> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resolution").build();
    private static final MarshallingInfo<String> ASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AspectRatio").build();
    private static final MarshallingInfo<String> MAXWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxWidth").build();
    private static final MarshallingInfo<String> MAXHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxHeight").build();
    private static final MarshallingInfo<String> DISPLAYASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayAspectRatio").build();
    private static final MarshallingInfo<String> SIZINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizingPolicy").build();
    private static final MarshallingInfo<String> PADDINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaddingPolicy").build();
    private static final MarshallingInfo<List> WATERMARKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Watermarks").build();

    private static final VideoParametersMarshaller instance = new VideoParametersMarshaller();

    public static VideoParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoParameters videoParameters, ProtocolMarshaller protocolMarshaller) {

        if (videoParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoParameters.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(videoParameters.getCodecOptions(), CODECOPTIONS_BINDING);
            protocolMarshaller.marshall(videoParameters.getKeyframesMaxDist(), KEYFRAMESMAXDIST_BINDING);
            protocolMarshaller.marshall(videoParameters.getFixedGOP(), FIXEDGOP_BINDING);
            protocolMarshaller.marshall(videoParameters.getBitRate(), BITRATE_BINDING);
            protocolMarshaller.marshall(videoParameters.getFrameRate(), FRAMERATE_BINDING);
            protocolMarshaller.marshall(videoParameters.getMaxFrameRate(), MAXFRAMERATE_BINDING);
            protocolMarshaller.marshall(videoParameters.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(videoParameters.getAspectRatio(), ASPECTRATIO_BINDING);
            protocolMarshaller.marshall(videoParameters.getMaxWidth(), MAXWIDTH_BINDING);
            protocolMarshaller.marshall(videoParameters.getMaxHeight(), MAXHEIGHT_BINDING);
            protocolMarshaller.marshall(videoParameters.getDisplayAspectRatio(), DISPLAYASPECTRATIO_BINDING);
            protocolMarshaller.marshall(videoParameters.getSizingPolicy(), SIZINGPOLICY_BINDING);
            protocolMarshaller.marshall(videoParameters.getPaddingPolicy(), PADDINGPOLICY_BINDING);
            protocolMarshaller.marshall(videoParameters.getWatermarks(), WATERMARKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
