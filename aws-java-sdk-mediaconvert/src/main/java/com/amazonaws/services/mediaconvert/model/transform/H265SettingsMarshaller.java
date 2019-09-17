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
 * H265SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class H265SettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<String> ALTERNATETRANSFERFUNCTIONSEI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alternateTransferFunctionSei").build();
    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> CODECLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecLevel").build();
    private static final MarshallingInfo<String> CODECPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecProfile").build();
    private static final MarshallingInfo<String> DYNAMICSUBGOP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamicSubGop").build();
    private static final MarshallingInfo<String> FLICKERADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("flickerAdaptiveQuantization").build();
    private static final MarshallingInfo<String> FRAMERATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateControl").build();
    private static final MarshallingInfo<String> FRAMERATECONVERSIONALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateConversionAlgorithm").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<String> GOPBREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopBReference").build();
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
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<Integer> MINIINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minIInterval").build();
    private static final MarshallingInfo<Integer> NUMBERBFRAMESBETWEENREFERENCEFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberBFramesBetweenReferenceFrames").build();
    private static final MarshallingInfo<Integer> NUMBERREFERENCEFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberReferenceFrames").build();
    private static final MarshallingInfo<String> PARCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parControl").build();
    private static final MarshallingInfo<Integer> PARDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parDenominator").build();
    private static final MarshallingInfo<Integer> PARNUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parNumerator").build();
    private static final MarshallingInfo<String> QUALITYTUNINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qualityTuningLevel").build();
    private static final MarshallingInfo<StructuredPojo> QVBRSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qvbrSettings").build();
    private static final MarshallingInfo<String> RATECONTROLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rateControlMode").build();
    private static final MarshallingInfo<String> SAMPLEADAPTIVEOFFSETFILTERMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleAdaptiveOffsetFilterMode").build();
    private static final MarshallingInfo<String> SCENECHANGEDETECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sceneChangeDetect").build();
    private static final MarshallingInfo<Integer> SLICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slices").build();
    private static final MarshallingInfo<String> SLOWPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slowPal").build();
    private static final MarshallingInfo<String> SPATIALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spatialAdaptiveQuantization").build();
    private static final MarshallingInfo<String> TELECINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("telecine").build();
    private static final MarshallingInfo<String> TEMPORALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("temporalAdaptiveQuantization").build();
    private static final MarshallingInfo<String> TEMPORALIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("temporalIds").build();
    private static final MarshallingInfo<String> TILES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tiles").build();
    private static final MarshallingInfo<String> UNREGISTEREDSEITIMECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unregisteredSeiTimecode").build();
    private static final MarshallingInfo<String> WRITEMP4PACKAGINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeMp4PackagingType").build();

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
            protocolMarshaller.marshall(h265Settings.getAlternateTransferFunctionSei(), ALTERNATETRANSFERFUNCTIONSEI_BINDING);
            protocolMarshaller.marshall(h265Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(h265Settings.getCodecLevel(), CODECLEVEL_BINDING);
            protocolMarshaller.marshall(h265Settings.getCodecProfile(), CODECPROFILE_BINDING);
            protocolMarshaller.marshall(h265Settings.getDynamicSubGop(), DYNAMICSUBGOP_BINDING);
            protocolMarshaller.marshall(h265Settings.getFlickerAdaptiveQuantization(), FLICKERADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(h265Settings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(h265Settings.getFramerateConversionAlgorithm(), FRAMERATECONVERSIONALGORITHM_BINDING);
            protocolMarshaller.marshall(h265Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopBReference(), GOPBREFERENCE_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopClosedCadence(), GOPCLOSEDCADENCE_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(h265Settings.getGopSizeUnits(), GOPSIZEUNITS_BINDING);
            protocolMarshaller.marshall(h265Settings.getHrdBufferInitialFillPercentage(), HRDBUFFERINITIALFILLPERCENTAGE_BINDING);
            protocolMarshaller.marshall(h265Settings.getHrdBufferSize(), HRDBUFFERSIZE_BINDING);
            protocolMarshaller.marshall(h265Settings.getInterlaceMode(), INTERLACEMODE_BINDING);
            protocolMarshaller.marshall(h265Settings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(h265Settings.getMinIInterval(), MINIINTERVAL_BINDING);
            protocolMarshaller.marshall(h265Settings.getNumberBFramesBetweenReferenceFrames(), NUMBERBFRAMESBETWEENREFERENCEFRAMES_BINDING);
            protocolMarshaller.marshall(h265Settings.getNumberReferenceFrames(), NUMBERREFERENCEFRAMES_BINDING);
            protocolMarshaller.marshall(h265Settings.getParControl(), PARCONTROL_BINDING);
            protocolMarshaller.marshall(h265Settings.getParDenominator(), PARDENOMINATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getParNumerator(), PARNUMERATOR_BINDING);
            protocolMarshaller.marshall(h265Settings.getQualityTuningLevel(), QUALITYTUNINGLEVEL_BINDING);
            protocolMarshaller.marshall(h265Settings.getQvbrSettings(), QVBRSETTINGS_BINDING);
            protocolMarshaller.marshall(h265Settings.getRateControlMode(), RATECONTROLMODE_BINDING);
            protocolMarshaller.marshall(h265Settings.getSampleAdaptiveOffsetFilterMode(), SAMPLEADAPTIVEOFFSETFILTERMODE_BINDING);
            protocolMarshaller.marshall(h265Settings.getSceneChangeDetect(), SCENECHANGEDETECT_BINDING);
            protocolMarshaller.marshall(h265Settings.getSlices(), SLICES_BINDING);
            protocolMarshaller.marshall(h265Settings.getSlowPal(), SLOWPAL_BINDING);
            protocolMarshaller.marshall(h265Settings.getSpatialAdaptiveQuantization(), SPATIALADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(h265Settings.getTelecine(), TELECINE_BINDING);
            protocolMarshaller.marshall(h265Settings.getTemporalAdaptiveQuantization(), TEMPORALADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(h265Settings.getTemporalIds(), TEMPORALIDS_BINDING);
            protocolMarshaller.marshall(h265Settings.getTiles(), TILES_BINDING);
            protocolMarshaller.marshall(h265Settings.getUnregisteredSeiTimecode(), UNREGISTEREDSEITIMECODE_BINDING);
            protocolMarshaller.marshall(h265Settings.getWriteMp4PackagingType(), WRITEMP4PACKAGINGTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
