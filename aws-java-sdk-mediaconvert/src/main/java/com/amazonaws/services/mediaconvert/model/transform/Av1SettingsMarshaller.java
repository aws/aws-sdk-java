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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Av1SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Av1SettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<String> FRAMERATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateControl").build();
    private static final MarshallingInfo<String> FRAMERATECONVERSIONALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateConversionAlgorithm").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<Double> GOPSIZE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gopSize").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<Integer> NUMBERBFRAMESBETWEENREFERENCEFRAMES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberBFramesBetweenReferenceFrames").build();
    private static final MarshallingInfo<StructuredPojo> QVBRSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qvbrSettings").build();
    private static final MarshallingInfo<String> RATECONTROLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rateControlMode").build();
    private static final MarshallingInfo<Integer> SLICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slices").build();
    private static final MarshallingInfo<String> SPATIALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spatialAdaptiveQuantization").build();

    private static final Av1SettingsMarshaller instance = new Av1SettingsMarshaller();

    public static Av1SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Av1Settings av1Settings, ProtocolMarshaller protocolMarshaller) {

        if (av1Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(av1Settings.getAdaptiveQuantization(), ADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(av1Settings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(av1Settings.getFramerateConversionAlgorithm(), FRAMERATECONVERSIONALGORITHM_BINDING);
            protocolMarshaller.marshall(av1Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(av1Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(av1Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(av1Settings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(av1Settings.getNumberBFramesBetweenReferenceFrames(), NUMBERBFRAMESBETWEENREFERENCEFRAMES_BINDING);
            protocolMarshaller.marshall(av1Settings.getQvbrSettings(), QVBRSETTINGS_BINDING);
            protocolMarshaller.marshall(av1Settings.getRateControlMode(), RATECONTROLMODE_BINDING);
            protocolMarshaller.marshall(av1Settings.getSlices(), SLICES_BINDING);
            protocolMarshaller.marshall(av1Settings.getSpatialAdaptiveQuantization(), SPATIALADAPTIVEQUANTIZATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
