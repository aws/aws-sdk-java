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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CaptionSelectorSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaptionSelectorSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ARIBSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aribSourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> DVBSUBSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSubSourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> EMBEDDEDSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("embeddedSourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE20SOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte20SourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE27SOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte27SourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> TELETEXTSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("teletextSourceSettings").build();

    private static final CaptionSelectorSettingsMarshaller instance = new CaptionSelectorSettingsMarshaller();

    public static CaptionSelectorSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CaptionSelectorSettings captionSelectorSettings, ProtocolMarshaller protocolMarshaller) {

        if (captionSelectorSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(captionSelectorSettings.getAribSourceSettings(), ARIBSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSelectorSettings.getDvbSubSourceSettings(), DVBSUBSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSelectorSettings.getEmbeddedSourceSettings(), EMBEDDEDSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSelectorSettings.getScte20SourceSettings(), SCTE20SOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSelectorSettings.getScte27SourceSettings(), SCTE27SOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSelectorSettings.getTeletextSourceSettings(), TELETEXTSOURCESETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
