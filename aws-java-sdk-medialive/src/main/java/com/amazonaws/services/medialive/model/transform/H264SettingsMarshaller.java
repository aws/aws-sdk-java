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
 * H264SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class H264SettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<String> AFDSIGNALING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afdSignaling").build();
    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<Integer> BUFFILLPCT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bufFillPct").build();
    private static final MarshallingInfo<Integer> BUFSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bufSize").build();
    private static final MarshallingInfo<String> COLORMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorMetadata").build();
    private static final MarshallingInfo<String> ENTROPYENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entropyEncoding").build();
    private static final MarshallingInfo<String> FIXEDAFD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fixedAfd").build();
    private static final MarshallingInfo<String> FLICKERAQ_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flickerAq").build();
    private static final MarshallingInfo<String> FRAMERATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateControl").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<String> GOPBREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopBReference").build();
    private static final MarshallingInfo<Integer> GOPCLOSEDCADENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopClosedCadence").build();
    private static final MarshallingInfo<Integer> GOPNUMBFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopNumBFrames").build();
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
    private static final MarshallingInfo<Integer> NUMREFFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numRefFrames").build();
    private static final MarshallingInfo<String> PARCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parControl").build();
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
    private static final MarshallingInfo<Integer> SOFTNESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softness").build();
    private static final MarshallingInfo<String> SPATIALAQ_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spatialAq").build();
    private static final MarshallingInfo<String> SUBGOPLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subgopLength").build();
    private static final MarshallingInfo<String> SYNTAX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("syntax").build();
    private static final MarshallingInfo<String> TEMPORALAQ_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("temporalAq").build();
    private static final MarshallingInfo<String> TIMECODEINSERTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeInsertion").build();

    private static final H264SettingsMarshaller instance = new H264SettingsMarshaller();

    public static H264SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(H264Settings h264Settings, ProtocolMarshaller protocolMarshaller) {

        if (h264Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(h264Settings.getAdaptiveQuantization(), ADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(h264Settings.getAfdSignaling(), AFDSIGNALING_BINDING);
            protocolMarshaller.marshall(h264Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(h264Settings.getBufFillPct(), BUFFILLPCT_BINDING);
            protocolMarshaller.marshall(h264Settings.getBufSize(), BUFSIZE_BINDING);
            protocolMarshaller.marshall(h264Settings.getColorMetadata(), COLORMETADATA_BINDING);
            protocolMarshaller.marshall(h264Settings.getEntropyEncoding(), ENTROPYENCODING_BINDING);
            protocolMarshaller.marshall(h264Settings.getFixedAfd(), FIXEDAFD_BINDING);
            protocolMarshaller.marshall(h264Settings.getFlickerAq(), FLICKERAQ_BINDING);
            protocolMarshaller.marshall(h264Settings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(h264Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(h264Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(h264Settings.getGopBReference(), GOPBREFERENCE_BINDING);
            protocolMarshaller.marshall(h264Settings.getGopClosedCadence(), GOPCLOSEDCADENCE_BINDING);
            protocolMarshaller.marshall(h264Settings.getGopNumBFrames(), GOPNUMBFRAMES_BINDING);
            protocolMarshaller.marshall(h264Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(h264Settings.getGopSizeUnits(), GOPSIZEUNITS_BINDING);
            protocolMarshaller.marshall(h264Settings.getLevel(), LEVEL_BINDING);
            protocolMarshaller.marshall(h264Settings.getLookAheadRateControl(), LOOKAHEADRATECONTROL_BINDING);
            protocolMarshaller.marshall(h264Settings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(h264Settings.getMinIInterval(), MINIINTERVAL_BINDING);
            protocolMarshaller.marshall(h264Settings.getNumRefFrames(), NUMREFFRAMES_BINDING);
            protocolMarshaller.marshall(h264Settings.getParControl(), PARCONTROL_BINDING);
            protocolMarshaller.marshall(h264Settings.getParDenominator(), PARDENOMINATOR_BINDING);
            protocolMarshaller.marshall(h264Settings.getParNumerator(), PARNUMERATOR_BINDING);
            protocolMarshaller.marshall(h264Settings.getProfile(), PROFILE_BINDING);
            protocolMarshaller.marshall(h264Settings.getQvbrQualityLevel(), QVBRQUALITYLEVEL_BINDING);
            protocolMarshaller.marshall(h264Settings.getRateControlMode(), RATECONTROLMODE_BINDING);
            protocolMarshaller.marshall(h264Settings.getScanType(), SCANTYPE_BINDING);
            protocolMarshaller.marshall(h264Settings.getSceneChangeDetect(), SCENECHANGEDETECT_BINDING);
            protocolMarshaller.marshall(h264Settings.getSlices(), SLICES_BINDING);
            protocolMarshaller.marshall(h264Settings.getSoftness(), SOFTNESS_BINDING);
            protocolMarshaller.marshall(h264Settings.getSpatialAq(), SPATIALAQ_BINDING);
            protocolMarshaller.marshall(h264Settings.getSubgopLength(), SUBGOPLENGTH_BINDING);
            protocolMarshaller.marshall(h264Settings.getSyntax(), SYNTAX_BINDING);
            protocolMarshaller.marshall(h264Settings.getTemporalAq(), TEMPORALAQ_BINDING);
            protocolMarshaller.marshall(h264Settings.getTimecodeInsertion(), TIMECODEINSERTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
