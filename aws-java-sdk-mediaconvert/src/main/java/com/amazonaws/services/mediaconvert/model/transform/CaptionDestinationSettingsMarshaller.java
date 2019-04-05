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
 * CaptionDestinationSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaptionDestinationSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> BURNINDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("burninDestinationSettings").build();
    private static final MarshallingInfo<String> DESTINATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationType").build();
    private static final MarshallingInfo<StructuredPojo> DVBSUBDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSubDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> EMBEDDEDDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("embeddedDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCCDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sccDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> TELETEXTDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("teletextDestinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> TTMLDESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ttmlDestinationSettings").build();

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
            protocolMarshaller.marshall(captionDestinationSettings.getBurninDestinationSettings(), BURNINDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getDestinationType(), DESTINATIONTYPE_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getDvbSubDestinationSettings(), DVBSUBDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getEmbeddedDestinationSettings(), EMBEDDEDDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getSccDestinationSettings(), SCCDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getTeletextDestinationSettings(), TELETEXTDESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(captionDestinationSettings.getTtmlDestinationSettings(), TTMLDESTINATIONSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
