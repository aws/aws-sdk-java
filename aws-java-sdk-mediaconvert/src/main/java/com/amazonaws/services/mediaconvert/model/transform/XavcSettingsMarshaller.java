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
 * XavcSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class XavcSettingsMarshaller {

    private static final MarshallingInfo<String> ADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adaptiveQuantization").build();
    private static final MarshallingInfo<String> ENTROPYENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entropyEncoding").build();
    private static final MarshallingInfo<String> FRAMERATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateControl").build();
    private static final MarshallingInfo<String> FRAMERATECONVERSIONALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateConversionAlgorithm").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<String> PROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profile").build();
    private static final MarshallingInfo<String> SLOWPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slowPal").build();
    private static final MarshallingInfo<Integer> SOFTNESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softness").build();
    private static final MarshallingInfo<String> SPATIALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spatialAdaptiveQuantization").build();
    private static final MarshallingInfo<String> TEMPORALADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("temporalAdaptiveQuantization").build();
    private static final MarshallingInfo<StructuredPojo> XAVC4KINTRACBGPROFILESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xavc4kIntraCbgProfileSettings").build();
    private static final MarshallingInfo<StructuredPojo> XAVC4KINTRAVBRPROFILESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xavc4kIntraVbrProfileSettings").build();
    private static final MarshallingInfo<StructuredPojo> XAVC4KPROFILESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xavc4kProfileSettings").build();
    private static final MarshallingInfo<StructuredPojo> XAVCHDINTRACBGPROFILESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xavcHdIntraCbgProfileSettings").build();
    private static final MarshallingInfo<StructuredPojo> XAVCHDPROFILESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xavcHdProfileSettings").build();

    private static final XavcSettingsMarshaller instance = new XavcSettingsMarshaller();

    public static XavcSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(XavcSettings xavcSettings, ProtocolMarshaller protocolMarshaller) {

        if (xavcSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(xavcSettings.getAdaptiveQuantization(), ADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(xavcSettings.getEntropyEncoding(), ENTROPYENCODING_BINDING);
            protocolMarshaller.marshall(xavcSettings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(xavcSettings.getFramerateConversionAlgorithm(), FRAMERATECONVERSIONALGORITHM_BINDING);
            protocolMarshaller.marshall(xavcSettings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(xavcSettings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(xavcSettings.getProfile(), PROFILE_BINDING);
            protocolMarshaller.marshall(xavcSettings.getSlowPal(), SLOWPAL_BINDING);
            protocolMarshaller.marshall(xavcSettings.getSoftness(), SOFTNESS_BINDING);
            protocolMarshaller.marshall(xavcSettings.getSpatialAdaptiveQuantization(), SPATIALADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(xavcSettings.getTemporalAdaptiveQuantization(), TEMPORALADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(xavcSettings.getXavc4kIntraCbgProfileSettings(), XAVC4KINTRACBGPROFILESETTINGS_BINDING);
            protocolMarshaller.marshall(xavcSettings.getXavc4kIntraVbrProfileSettings(), XAVC4KINTRAVBRPROFILESETTINGS_BINDING);
            protocolMarshaller.marshall(xavcSettings.getXavc4kProfileSettings(), XAVC4KPROFILESETTINGS_BINDING);
            protocolMarshaller.marshall(xavcSettings.getXavcHdIntraCbgProfileSettings(), XAVCHDINTRACBGPROFILESETTINGS_BINDING);
            protocolMarshaller.marshall(xavcSettings.getXavcHdProfileSettings(), XAVCHDPROFILESETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
