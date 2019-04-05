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
 * AacSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AacSettingsMarshaller {

    private static final MarshallingInfo<Double> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> CODINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codingMode").build();
    private static final MarshallingInfo<String> INPUTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputType").build();
    private static final MarshallingInfo<String> PROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profile").build();
    private static final MarshallingInfo<String> RATECONTROLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rateControlMode").build();
    private static final MarshallingInfo<String> RAWFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rawFormat").build();
    private static final MarshallingInfo<Double> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleRate").build();
    private static final MarshallingInfo<String> SPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spec").build();
    private static final MarshallingInfo<String> VBRQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vbrQuality").build();

    private static final AacSettingsMarshaller instance = new AacSettingsMarshaller();

    public static AacSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AacSettings aacSettings, ProtocolMarshaller protocolMarshaller) {

        if (aacSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aacSettings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(aacSettings.getCodingMode(), CODINGMODE_BINDING);
            protocolMarshaller.marshall(aacSettings.getInputType(), INPUTTYPE_BINDING);
            protocolMarshaller.marshall(aacSettings.getProfile(), PROFILE_BINDING);
            protocolMarshaller.marshall(aacSettings.getRateControlMode(), RATECONTROLMODE_BINDING);
            protocolMarshaller.marshall(aacSettings.getRawFormat(), RAWFORMAT_BINDING);
            protocolMarshaller.marshall(aacSettings.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(aacSettings.getSpec(), SPEC_BINDING);
            protocolMarshaller.marshall(aacSettings.getVbrQuality(), VBRQUALITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
