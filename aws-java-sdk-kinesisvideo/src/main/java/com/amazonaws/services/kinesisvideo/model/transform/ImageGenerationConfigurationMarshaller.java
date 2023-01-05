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
package com.amazonaws.services.kinesisvideo.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImageGenerationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImageGenerationConfigurationMarshaller {

    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> IMAGESELECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageSelectorType").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationConfig").build();
    private static final MarshallingInfo<Integer> SAMPLINGINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SamplingInterval").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<Map> FORMATCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FormatConfig").build();
    private static final MarshallingInfo<Integer> WIDTHPIXELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WidthPixels").build();
    private static final MarshallingInfo<Integer> HEIGHTPIXELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeightPixels").build();

    private static final ImageGenerationConfigurationMarshaller instance = new ImageGenerationConfigurationMarshaller();

    public static ImageGenerationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImageGenerationConfiguration imageGenerationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (imageGenerationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(imageGenerationConfiguration.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getImageSelectorType(), IMAGESELECTORTYPE_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getDestinationConfig(), DESTINATIONCONFIG_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getSamplingInterval(), SAMPLINGINTERVAL_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getFormatConfig(), FORMATCONFIG_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getWidthPixels(), WIDTHPIXELS_BINDING);
            protocolMarshaller.marshall(imageGenerationConfiguration.getHeightPixels(), HEIGHTPIXELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
