/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * H265SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class H265SettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<String> AFDSIGNALING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afdSignaling").build();
    private static final MarshallingInfo<String> ALTERNATIVETRANSFERFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alternativeTransferFunction").build();
    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<Integer> BUFSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bufSize").build();
    private static final MarshallingInfo<String> COLORMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorMetadata").build();
    private static final MarshallingInfo<StructuredPojo> COLORSPACESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorSpaceSettings").build();
    private static final MarshallingInfo<String> FIXEDAFD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fixedAfd").build();
    private static final MarshallingInfo<String> FLICKERAQ_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flickerAq").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<Integer> GOPCLOSEDCADENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopClosedCadence").build();
    private static final MarshallingInfo<Double> GOPSIZE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gopSize").build();
    private static final MarshallingInfo<String> GOPSIZEUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopSizeUnits").build();
    private static final MarshallingInfo<String> LEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("level").build();
    private static final MarshallingInfo<String> LOOKAHEADRATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookAheadRateControl").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<Integer> MINIINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minIInterval").build();
    private static final MarshallingInfo<Integer> PARDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parDenominator").build();
    private static final MarshallingInfo<Integer> PARNUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parNumerator").build();
    private static final MarshallingInfo<String> PROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profile").build();
    private static final MarshallingInfo<Integer> QVBRQUALITYLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qvbrQualityLevel").build();
    private static final MarshallingInfo<String> RATECONTROLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rateControlMode").build();
    private static final MarshallingInfo<String> SCANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanType").build();
    private static final MarshallingInfo<String> SCENECHANGEDETECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sceneChangeDetect").build();
    private static final MarshallingInfo<Integer> SLICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slices").build();
    private static final MarshallingInfo<String> TIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tier").build();
    private static final MarshallingInfo<String> TIMECODEINSERTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeInsertion").build();

    private static final H265SettingsMarshaller instance = new H265SettingsMarshaller();

    public static H265SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(H265Settings h265Settings, ProtocolMarshaller protocolMarshaller) {

        if (h265Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(h265Settings.getAdaptiveQuantization(), ADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(h265Settings.getAfdSignaling(), AFDSIGNALING_BINDING);
            protocolMarshaller.marshall(h265Settings.getAlternativeTransferFunction(), ALTERNATIVETRANSFERFUNCTION_BINDING);
            protocolMarshaller.marshall(h265Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(h265Settings.getBufSize(), BUFSIZE_BINDING);
            protocolMarshaller.marshall(h265Settings.getColorMetadata(), COLORMETADATA_BINDING);
            protocolMarshaller.marshall(h265Settings.getColorSpaceSettings(), COLORSPACESETTINGS_BINDING);
            protocolMarshaller.marshall(h265Settings.getFixedAfd(), FIXEDAFD_BINDING);
            protocolMarshaller.marshall(h265Settings.getFlickerAq(), FLICKERAQ_BINDING);
            protocolMarshaller.marshall(h265Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopClosedCadence(), GOPCLOSEDCADENCE_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopSizeUnits(), GOPSIZEUNITS_BINDING);
            protocolMarshaller.marshall(h265Settings.getLevel(), LEVEL_BINDING);
            protocolMarshaller.marshall(h265Settings.getLookAheadRateControl(), LOOKAHEADRATECONTROL_BINDING);
            protocolMarshaller.marshall(h265Settings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(h265Settings.getMinIInterval(), MINIINTERVAL_BINDING);
            protocolMarshaller.marshall(h265Settings.getParDenominator(), PARDENOMINATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getParNumerator(), PARNUMERATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getProfile(), PROFILE_BINDING);
            protocolMarshaller.marshall(h265Settings.getQvbrQualityLevel(), QVBRQUALITYLEVEL_BINDING);
            protocolMarshaller.marshall(h265Settings.getRateControlMode(), RATECONTROLMODE_BINDING);
            protocolMarshaller.marshall(h265Settings.getScanType(), SCANTYPE_BINDING);
            protocolMarshaller.marshall(h265Settings.getSceneChangeDetect(), SCENECHANGEDETECT_BINDING);
            protocolMarshaller.marshall(h265Settings.getSlices(), SLICES_BINDING);
            protocolMarshaller.marshall(h265Settings.getTier(), TIER_BINDING);
            protocolMarshaller.marshall(h265Settings.getTimecodeInsertion(), TIMECODEINSERTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
