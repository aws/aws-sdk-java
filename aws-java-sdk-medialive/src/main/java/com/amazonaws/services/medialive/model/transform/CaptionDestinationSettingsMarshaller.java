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
 * CaptionDestinationSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaptionDestinationSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ARIBDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aribDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> BURNINDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("burnInDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> DVBSUBDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSubDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> EMBEDDEDDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("embeddedDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> EMBEDDEDPLUSSCTE20DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("embeddedPlusScte20DestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> RTMPCAPTIONINFODESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rtmpCaptionInfoDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE20PLUSEMBEDDEDDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte20PlusEmbeddedDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE27DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte27DestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> SMPTETTDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("smpteTtDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> TELETEXTDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("teletextDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> TTMLDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ttmlDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> WEBVTTDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("webvttDestinationSettings").build();

    private static final CaptionDestinationSettingsMarshaller instance = new CaptionDestinationSettingsMarshaller();

    public static CaptionDestinationSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CaptionDestinationSettings captionDestinationSettings, ProtocolMarshaller protocolMarshaller) {

        if (captionDestinationSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(captionDestinationSettings.getAribDestinationSettings(), ARIBDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getBurnInDestinationSettings(), BURNINDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getDvbSubDestinationSettings(), DVBSUBDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getEmbeddedDestinationSettings(), EMBEDDEDDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getEmbeddedPlusScte20DestinationSettings(), EMBEDDEDPLUSSCTE20DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getRtmpCaptionInfoDestinationSettings(), RTMPCAPTIONINFODESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getScte20PlusEmbeddedDestinationSettings(), SCTE20PLUSEMBEDDEDDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getScte27DestinationSettings(), SCTE27DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getSmpteTtDestinationSettings(), SMPTETTDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getTeletextDestinationSettings(), TELETEXTDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getTtmlDestinationSettings(), TTMLDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getWebvttDestinationSettings(), WEBVTTDESTINATIONSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
