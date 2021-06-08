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
 * Vp9SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Vp9SettingsMarshaller {

    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
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
    private static final MarshallingInfo<Integer> HRDBUFFERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hrdBufferSize").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
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

    private static final Vp9SettingsMarshaller instance = new Vp9SettingsMarshaller();

    public static Vp9SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Vp9Settings vp9Settings, ProtocolMarshaller protocolMarshaller) {

        if (vp9Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vp9Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(vp9Settings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(vp9Settings.getFramerateConversionAlgorithm(), FRAMERATECONVERSIONALGORITHM_BINDING);
            protocolMarshaller.marshall(vp9Settings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(vp9Settings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(vp9Settings.getGopSize(), GOPSIZE_BINDING);
            protocolMarshaller.marshall(vp9Settings.getHrdBufferSize(), HRDBUFFERSIZE_BINDING);
            protocolMarshaller.marshall(vp9Settings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(vp9Settings.getParControl(), PARCONTROL_BINDING);
            protocolMarshaller.marshall(vp9Settings.getParDenominator(), PARDENOMINATOR_BINDING);
            protocolMarshaller.marshall(vp9Settings.getParNumerator(), PARNUMERATOR_BINDING);
            protocolMarshaller.marshall(vp9Settings.getQualityTuningLevel(), QUALITYTUNINGLEVEL_BINDING);
            protocolMarshaller.marshall(vp9Settings.getRateControlMode(), RATECONTROLMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
