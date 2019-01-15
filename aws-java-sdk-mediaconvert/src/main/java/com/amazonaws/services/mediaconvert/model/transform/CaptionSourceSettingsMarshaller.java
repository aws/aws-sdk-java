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
 * CaptionSourceSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaptionSourceSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANCILLARYSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ancillarySourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> DVBSUBSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSubSourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> EMBEDDEDSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("embeddedSourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> FILESOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSourceSettings").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceType").build();
    private static final MarshallingInfo<StructuredPojo> TELETEXTSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("teletextSourceSettings").build();
    private static final MarshallingInfo<StructuredPojo> TRACKSOURCESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trackSourceSettings").build();

    private static final CaptionSourceSettingsMarshaller instance = new CaptionSourceSettingsMarshaller();

    public static CaptionSourceSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CaptionSourceSettings captionSourceSettings, ProtocolMarshaller protocolMarshaller) {

        if (captionSourceSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(captionSourceSettings.getAncillarySourceSettings(), ANCILLARYSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSourceSettings.getDvbSubSourceSettings(), DVBSUBSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSourceSettings.getEmbeddedSourceSettings(), EMBEDDEDSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSourceSettings.getFileSourceSettings(), FILESOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSourceSettings.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(captionSourceSettings.getTeletextSourceSettings(), TELETEXTSOURCESETTINGS_BINDING);
            protocolMarshaller.marshall(captionSourceSettings.getTrackSourceSettings(), TRACKSOURCESETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
