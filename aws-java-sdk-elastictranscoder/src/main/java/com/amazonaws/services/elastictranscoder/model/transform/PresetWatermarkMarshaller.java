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
 * PresetWatermarkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PresetWatermarkMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> MAXWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxWidth").build();
    private static final MarshallingInfo<String> MAXHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxHeight").build();
    private static final MarshallingInfo<String> SIZINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizingPolicy").build();
    private static final MarshallingInfo<String> HORIZONTALALIGN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HorizontalAlign").build();
    private static final MarshallingInfo<String> HORIZONTALOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HorizontalOffset").build();
    private static final MarshallingInfo<String> VERTICALALIGN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerticalAlign").build();
    private static final MarshallingInfo<String> VERTICALOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerticalOffset").build();
    private static final MarshallingInfo<String> OPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Opacity").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Target").build();

    private static final PresetWatermarkMarshaller instance = new PresetWatermarkMarshaller();

    public static PresetWatermarkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PresetWatermark presetWatermark, ProtocolMarshaller protocolMarshaller) {

        if (presetWatermark == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(presetWatermark.getId(), ID_BINDING);
            protocolMarshaller.marshall(presetWatermark.getMaxWidth(), MAXWIDTH_BINDING);
            protocolMarshaller.marshall(presetWatermark.getMaxHeight(), MAXHEIGHT_BINDING);
            protocolMarshaller.marshall(presetWatermark.getSizingPolicy(), SIZINGPOLICY_BINDING);
            protocolMarshaller.marshall(presetWatermark.getHorizontalAlign(), HORIZONTALALIGN_BINDING);
            protocolMarshaller.marshall(presetWatermark.getHorizontalOffset(), HORIZONTALOFFSET_BINDING);
            protocolMarshaller.marshall(presetWatermark.getVerticalAlign(), VERTICALALIGN_BINDING);
            protocolMarshaller.marshall(presetWatermark.getVerticalOffset(), VERTICALOFFSET_BINDING);
            protocolMarshaller.marshall(presetWatermark.getOpacity(), OPACITY_BINDING);
            protocolMarshaller.marshall(presetWatermark.getTarget(), TARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
