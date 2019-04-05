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
 * CaptionDescriptionPresetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaptionDescriptionPresetMarshaller {

    private static final MarshallingInfo<String> CUSTOMLANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customLanguageCode").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationSettings").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("languageCode").build();
    private static final MarshallingInfo<String> LANGUAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("languageDescription").build();

    private static final CaptionDescriptionPresetMarshaller instance = new CaptionDescriptionPresetMarshaller();

    public static CaptionDescriptionPresetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CaptionDescriptionPreset captionDescriptionPreset, ProtocolMarshaller protocolMarshaller) {

        if (captionDescriptionPreset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(captionDescriptionPreset.getCustomLanguageCode(), CUSTOMLANGUAGECODE_BINDING);
            protocolMarshaller.marshall(captionDescriptionPreset.getDestinationSettings(), DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDescriptionPreset.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(captionDescriptionPreset.getLanguageDescription(), LANGUAGEDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
