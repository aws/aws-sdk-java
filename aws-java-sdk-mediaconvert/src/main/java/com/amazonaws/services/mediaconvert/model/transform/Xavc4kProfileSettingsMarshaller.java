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
 * Xavc4kProfileSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Xavc4kProfileSettingsMarshaller {

    private static final MarshallingInfo<String> BITRATECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitrateClass").build();
    private static final MarshallingInfo<String> CODECPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecProfile").build();
    private static final MarshallingInfo<String> FLICKERADAPTIVEQUANTIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("flickerAdaptiveQuantization").build();
    private static final MarshallingInfo<String> GOPBREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopBReference").build();
    private static final MarshallingInfo<Integer> GOPCLOSEDCADENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gopClosedCadence").build();
    private static final MarshallingInfo<Integer> HRDBUFFERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hrdBufferSize").build();
    private static final MarshallingInfo<String> QUALITYTUNINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qualityTuningLevel").build();
    private static final MarshallingInfo<Integer> SLICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slices").build();

    private static final Xavc4kProfileSettingsMarshaller instance = new Xavc4kProfileSettingsMarshaller();

    public static Xavc4kProfileSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Xavc4kProfileSettings xavc4kProfileSettings, ProtocolMarshaller protocolMarshaller) {

        if (xavc4kProfileSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(xavc4kProfileSettings.getBitrateClass(), BITRATECLASS_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getCodecProfile(), CODECPROFILE_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getFlickerAdaptiveQuantization(), FLICKERADAPTIVEQUANTIZATION_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getGopBReference(), GOPBREFERENCE_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getGopClosedCadence(), GOPCLOSEDCADENCE_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getHrdBufferSize(), HRDBUFFERSIZE_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getQualityTuningLevel(), QUALITYTUNINGLEVEL_BINDING);
            protocolMarshaller.marshall(xavc4kProfileSettings.getSlices(), SLICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
