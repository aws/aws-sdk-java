/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Mpeg2SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Mpeg2SettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<String> AFDSIGNALING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afdSignaling").build();
    private static final MarshallingInfo<String> COLORMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorMetadata").build();
    private static final MarshallingInfo<String> COLORSPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorSpace").build();
    private static final MarshallingInfo<String> DISPLAYASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayAspectRatio").build();
    private static final MarshallingInfo<StructuredPojo> FILTERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterSettings").build();
    private static final MarshallingInfo<String> FIXEDAFD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fixedAfd").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<Integer> GOPCLOSEDCADENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopClosedCadence").build();
    private static final MarshallingInfo<Integer> GOPNUMBFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopNumBFrames").build();
    private static final MarshallingInfo<Double> GOPSIZE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gopSize").build();
    private static final MarshallingInfo<String> GOPSIZEUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopSizeUnits").build();
    private static final MarshallingInfo<String> SCANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanType").build();
    private static final MarshallingInfo<String> SUBGOPLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subgopLength").build();
    private static final MarshallingInfo<String> TIMECODEINSERTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeInsertion").build();

    private static final Mpeg2SettingsMarshaller instance = new Mpeg2SettingsMarshaller();

    public static Mpeg2SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Mpeg2Settings mpeg2Settings, ProtocolMarshaller protocolMarshaller) {

        if (mpeg2Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mpeg2Settings.getAdaptiveQuantization(), ADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getAfdSignaling(), AFDSIGNALING_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getColorMetadata(), COLORMETADATA_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getColorSpace(), COLORSPACE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getDisplayAspectRatio(), DISPLAYASPECTRATIO_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFilterSettings(), FILTERSETTINGS_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFixedAfd(), FIXEDAFD_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopClosedCadence(), GOPCLOSEDCADENCE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopNumBFrames(), GOPNUMBFRAMES_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopSizeUnits(), GOPSIZEUNITS_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getScanType(), SCANTYPE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getSubgopLength(), SUBGOPLENGTH_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getTimecodeInsertion(), TIMECODEINSERTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
