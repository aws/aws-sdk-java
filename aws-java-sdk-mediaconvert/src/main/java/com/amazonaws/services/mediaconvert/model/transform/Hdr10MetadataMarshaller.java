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
 * Hdr10MetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Hdr10MetadataMarshaller {

    private static final MarshallingInfo<Integer> BLUEPRIMARYX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bluePrimaryX").build();
    private static final MarshallingInfo<Integer> BLUEPRIMARYY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bluePrimaryY").build();
    private static final MarshallingInfo<Integer> GREENPRIMARYX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greenPrimaryX").build();
    private static final MarshallingInfo<Integer> GREENPRIMARYY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greenPrimaryY").build();
    private static final MarshallingInfo<Integer> MAXCONTENTLIGHTLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxContentLightLevel").build();
    private static final MarshallingInfo<Integer> MAXFRAMEAVERAGELIGHTLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxFrameAverageLightLevel").build();
    private static final MarshallingInfo<Integer> MAXLUMINANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxLuminance").build();
    private static final MarshallingInfo<Integer> MINLUMINANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minLuminance").build();
    private static final MarshallingInfo<Integer> REDPRIMARYX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redPrimaryX").build();
    private static final MarshallingInfo<Integer> REDPRIMARYY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redPrimaryY").build();
    private static final MarshallingInfo<Integer> WHITEPOINTX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("whitePointX").build();
    private static final MarshallingInfo<Integer> WHITEPOINTY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("whitePointY").build();

    private static final Hdr10MetadataMarshaller instance = new Hdr10MetadataMarshaller();

    public static Hdr10MetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Hdr10Metadata hdr10Metadata, ProtocolMarshaller protocolMarshaller) {

        if (hdr10Metadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hdr10Metadata.getBluePrimaryX(), BLUEPRIMARYX_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getBluePrimaryY(), BLUEPRIMARYY_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getGreenPrimaryX(), GREENPRIMARYX_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getGreenPrimaryY(), GREENPRIMARYY_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getMaxContentLightLevel(), MAXCONTENTLIGHTLEVEL_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getMaxFrameAverageLightLevel(), MAXFRAMEAVERAGELIGHTLEVEL_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getMaxLuminance(), MAXLUMINANCE_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getMinLuminance(), MINLUMINANCE_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getRedPrimaryX(), REDPRIMARYX_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getRedPrimaryY(), REDPRIMARYY_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getWhitePointX(), WHITEPOINTX_BINDING);
            protocolMarshaller.marshall(hdr10Metadata.getWhitePointY(), WHITEPOINTY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
