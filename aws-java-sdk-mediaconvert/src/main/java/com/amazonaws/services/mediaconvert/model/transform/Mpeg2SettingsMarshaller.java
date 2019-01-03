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
 * Mpeg2SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Mpeg2SettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> CODECLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecLevel").build();
    private static final MarshallingInfo<String> CODECPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecProfile").build();
    private static final MarshallingInfo<String> DYNAMICSUBGOP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamicSubGop").build();
    private static final MarshallingInfo<String> FRAMERATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateControl").build();
    private static final MarshallingInfo<String> FRAMERATECONVERSIONALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateConversionAlgorithm").build();
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
    private static final MarshallingInfo<Integer> HRDBUFFERINITIALFILLPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hrdBufferInitialFillPercentage").build();
    private static final MarshallingInfo<Integer> HRDBUFFERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hrdBufferSize").build();
    private static final MarshallingInfo<String> INTERLACEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interlaceMode").build();
    private static final MarshallingInfo<String> INTRADCPRECISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intraDcPrecision").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<Integer> MINIINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minIInterval").build();
    private static final MarshallingInfo<Integer> NUMBERBFRAMESBETWEENREFERENCEFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberBFramesBetweenReferenceFrames").build();
    private static final MarshallingInfo<String> PARCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parControl").build();
    private static final MarshallingInfo<Integer> PARDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parDenominator").build();
    private static final MarshallingInfo<Integer> PARNUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parNumerator").build();
    private static final MarshallingInfo<String> QUALITYTUNINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qualityTuningLevel").build();
    private static final MarshallingInfo<String> RATECONTROLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rateControlMode").build();
    private static final MarshallingInfo<String> SCENECHANGEDETECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sceneChangeDetect").build();
    private static final MarshallingInfo<String> SLOWPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slowPal").build();
    private static final MarshallingInfo<Integer> SOFTNESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softness").build();
    private static final MarshallingInfo<String> SPATIALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spatialAdaptiveQuantization").build();
    private static final MarshallingInfo<String> SYNTAX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("syntax").build();
    private static final MarshallingInfo<String> TELECINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("telecine").build();
    private static final MarshallingInfo<String> TEMPORALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("temporalAdaptiveQuantization").build();

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
            protocolMarshaller.marshall(mpeg2Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getCodecLevel(), CODECLEVEL_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getCodecProfile(), CODECPROFILE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getDynamicSubGop(), DYNAMICSUBGOP_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFramerateConversionAlgorithm(), FRAMERATECONVERSIONALGORITHM_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopClosedCadence(), GOPCLOSEDCADENCE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getGopSizeUnits(), GOPSIZEUNITS_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getHrdBufferInitialFillPercentage(), HRDBUFFERINITIALFILLPERCENTAGE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getHrdBufferSize(), HRDBUFFERSIZE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getInterlaceMode(), INTERLACEMODE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getIntraDcPrecision(), INTRADCPRECISION_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getMinIInterval(), MINIINTERVAL_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getNumberBFramesBetweenReferenceFrames(), NUMBERBFRAMESBETWEENREFERENCEFRAMES_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getParControl(), PARCONTROL_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getParDenominator(), PARDENOMINATOR_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getParNumerator(), PARNUMERATOR_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getQualityTuningLevel(), QUALITYTUNINGLEVEL_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getRateControlMode(), RATECONTROLMODE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getSceneChangeDetect(), SCENECHANGEDETECT_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getSlowPal(), SLOWPAL_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getSoftness(), SOFTNESS_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getSpatialAdaptiveQuantization(), SPATIALADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getSyntax(), SYNTAX_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getTelecine(), TELECINE_BINDING);
            protocolMarshaller.marshall(mpeg2Settings.getTemporalAdaptiveQuantization(), TEMPORALADAPTIVEQUANTIZATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
