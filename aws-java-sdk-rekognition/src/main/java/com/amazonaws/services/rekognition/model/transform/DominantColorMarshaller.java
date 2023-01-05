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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DominantColorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DominantColorMarshaller {

    private static final MarshallingInfo<Integer> RED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Red").build();
    private static final MarshallingInfo<Integer> BLUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Blue").build();
    private static final MarshallingInfo<Integer> GREEN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Green").build();
    private static final MarshallingInfo<String> HEXCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HexCode").build();
    private static final MarshallingInfo<String> CSSCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CSSColor").build();
    private static final MarshallingInfo<String> SIMPLIFIEDCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SimplifiedColor").build();
    private static final MarshallingInfo<Float> PIXELPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PixelPercent").build();

    private static final DominantColorMarshaller instance = new DominantColorMarshaller();

    public static DominantColorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DominantColor dominantColor, ProtocolMarshaller protocolMarshaller) {

        if (dominantColor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dominantColor.getRed(), RED_BINDING);
            protocolMarshaller.marshall(dominantColor.getBlue(), BLUE_BINDING);
            protocolMarshaller.marshall(dominantColor.getGreen(), GREEN_BINDING);
            protocolMarshaller.marshall(dominantColor.getHexCode(), HEXCODE_BINDING);
            protocolMarshaller.marshall(dominantColor.getCSSColor(), CSSCOLOR_BINDING);
            protocolMarshaller.marshall(dominantColor.getSimplifiedColor(), SIMPLIFIEDCOLOR_BINDING);
            protocolMarshaller.marshall(dominantColor.getPixelPercent(), PIXELPERCENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
