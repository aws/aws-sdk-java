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
 * DvbSubDestinationSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DvbSubDestinationSettingsMarshaller {

    private static final MarshallingInfo<String> ALIGNMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alignment").build();
    private static final MarshallingInfo<String> BACKGROUNDCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backgroundColor").build();
    private static final MarshallingInfo<Integer> BACKGROUNDOPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backgroundOpacity").build();
    private static final MarshallingInfo<StructuredPojo> FONT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("font").build();
    private static final MarshallingInfo<String> FONTCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fontColor").build();
    private static final MarshallingInfo<Integer> FONTOPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fontOpacity").build();
    private static final MarshallingInfo<Integer> FONTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fontResolution").build();
    private static final MarshallingInfo<String> FONTSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fontSize").build();
    private static final MarshallingInfo<String> OUTLINECOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outlineColor").build();
    private static final MarshallingInfo<Integer> OUTLINESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outlineSize").build();
    private static final MarshallingInfo<String> SHADOWCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shadowColor").build();
    private static final MarshallingInfo<Integer> SHADOWOPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shadowOpacity").build();
    private static final MarshallingInfo<Integer> SHADOWXOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shadowXOffset").build();
    private static final MarshallingInfo<Integer> SHADOWYOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shadowYOffset").build();
    private static final MarshallingInfo<String> TELETEXTGRIDCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("teletextGridControl").build();
    private static final MarshallingInfo<Integer> XPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xPosition").build();
    private static final MarshallingInfo<Integer> YPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("yPosition").build();

    private static final DvbSubDestinationSettingsMarshaller instance = new DvbSubDestinationSettingsMarshaller();

    public static DvbSubDestinationSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DvbSubDestinationSettings dvbSubDestinationSettings, ProtocolMarshaller protocolMarshaller) {

        if (dvbSubDestinationSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dvbSubDestinationSettings.getAlignment(), ALIGNMENT_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getBackgroundColor(), BACKGROUNDCOLOR_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getBackgroundOpacity(), BACKGROUNDOPACITY_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getFont(), FONT_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getFontColor(), FONTCOLOR_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getFontOpacity(), FONTOPACITY_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getFontResolution(), FONTRESOLUTION_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getFontSize(), FONTSIZE_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getOutlineColor(), OUTLINECOLOR_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getOutlineSize(), OUTLINESIZE_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getShadowColor(), SHADOWCOLOR_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getShadowOpacity(), SHADOWOPACITY_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getShadowXOffset(), SHADOWXOFFSET_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getShadowYOffset(), SHADOWYOFFSET_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getTeletextGridControl(), TELETEXTGRIDCONTROL_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getXPosition(), XPOSITION_BINDING);
            protocolMarshaller.marshall(dvbSubDestinationSettings.getYPosition(), YPOSITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
