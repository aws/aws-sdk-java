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
 * AvcIntraSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AvcIntraSettingsMarshaller {

    private static final MarshallingInfo<String> AVCINTRACLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("avcIntraClass").build();
    private static final MarshallingInfo<StructuredPojo> AVCINTRAUHDSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("avcIntraUhdSettings").build();
    private static final MarshallingInfo<String> FRAMERATECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateControl").build();
    private static final MarshallingInfo<String> FRAMERATECONVERSIONALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateConversionAlgorithm").build();
    private static final MarshallingInfo<Integer> FRAMERATEDENOMINATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateDenominator").build();
    private static final MarshallingInfo<Integer> FRAMERATENUMERATOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("framerateNumerator").build();
    private static final MarshallingInfo<String> INTERLACEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interlaceMode").build();
    private static final MarshallingInfo<String> SCANTYPECONVERSIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanTypeConversionMode").build();
    private static final MarshallingInfo<String> SLOWPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slowPal").build();
    private static final MarshallingInfo<String> TELECINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("telecine").build();

    private static final AvcIntraSettingsMarshaller instance = new AvcIntraSettingsMarshaller();

    public static AvcIntraSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AvcIntraSettings avcIntraSettings, ProtocolMarshaller protocolMarshaller) {

        if (avcIntraSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(avcIntraSettings.getAvcIntraClass(), AVCINTRACLASS_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getAvcIntraUhdSettings(), AVCINTRAUHDSETTINGS_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getFramerateControl(), FRAMERATECONTROL_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getFramerateConversionAlgorithm(), FRAMERATECONVERSIONALGORITHM_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getFramerateDenominator(), FRAMERATEDENOMINATOR_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getFramerateNumerator(), FRAMERATENUMERATOR_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getInterlaceMode(), INTERLACEMODE_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getScanTypeConversionMode(), SCANTYPECONVERSIONMODE_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getSlowPal(), SLOWPAL_BINDING);
            protocolMarshaller.marshall(avcIntraSettings.getTelecine(), TELECINE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
