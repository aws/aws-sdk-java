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
 * ColorCorrectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColorCorrectorMarshaller {

    private static final MarshallingInfo<Integer> BRIGHTNESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("brightness").build();
    private static final MarshallingInfo<String> COLORSPACECONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorSpaceConversion").build();
    private static final MarshallingInfo<Integer> CONTRAST_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contrast").build();
    private static final MarshallingInfo<StructuredPojo> HDR10METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hdr10Metadata").build();
    private static final MarshallingInfo<Integer> HUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hue").build();
    private static final MarshallingInfo<Integer> SATURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("saturation").build();

    private static final ColorCorrectorMarshaller instance = new ColorCorrectorMarshaller();

    public static ColorCorrectorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColorCorrector colorCorrector, ProtocolMarshaller protocolMarshaller) {

        if (colorCorrector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(colorCorrector.getBrightness(), BRIGHTNESS_BINDING);
            protocolMarshaller.marshall(colorCorrector.getColorSpaceConversion(), COLORSPACECONVERSION_BINDING);
            protocolMarshaller.marshall(colorCorrector.getContrast(), CONTRAST_BINDING);
            protocolMarshaller.marshall(colorCorrector.getHdr10Metadata(), HDR10METADATA_BINDING);
            protocolMarshaller.marshall(colorCorrector.getHue(), HUE_BINDING);
            protocolMarshaller.marshall(colorCorrector.getSaturation(), SATURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
