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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FontConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FontConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FONTSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FontSize").build();
    private static final MarshallingInfo<String> FONTDECORATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FontDecoration").build();
    private static final MarshallingInfo<String> FONTCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FontColor").build();
    private static final MarshallingInfo<StructuredPojo> FONTWEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FontWeight").build();
    private static final MarshallingInfo<String> FONTSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FontStyle").build();

    private static final FontConfigurationMarshaller instance = new FontConfigurationMarshaller();

    public static FontConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FontConfiguration fontConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (fontConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fontConfiguration.getFontSize(), FONTSIZE_BINDING);
            protocolMarshaller.marshall(fontConfiguration.getFontDecoration(), FONTDECORATION_BINDING);
            protocolMarshaller.marshall(fontConfiguration.getFontColor(), FONTCOLOR_BINDING);
            protocolMarshaller.marshall(fontConfiguration.getFontWeight(), FONTWEIGHT_BINDING);
            protocolMarshaller.marshall(fontConfiguration.getFontStyle(), FONTSTYLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
