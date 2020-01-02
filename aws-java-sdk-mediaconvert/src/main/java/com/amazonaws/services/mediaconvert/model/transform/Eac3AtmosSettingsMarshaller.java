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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Eac3AtmosSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Eac3AtmosSettingsMarshaller {

    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> BITSTREAMMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitstreamMode").build();
    private static final MarshallingInfo<String> CODINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codingMode").build();
    private static final MarshallingInfo<String> DIALOGUEINTELLIGENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialogueIntelligence").build();
    private static final MarshallingInfo<String> DYNAMICRANGECOMPRESSIONLINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamicRangeCompressionLine").build();
    private static final MarshallingInfo<String> DYNAMICRANGECOMPRESSIONRF_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamicRangeCompressionRf").build();
    private static final MarshallingInfo<Double> LOROCENTERMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loRoCenterMixLevel").build();
    private static final MarshallingInfo<Double> LOROSURROUNDMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loRoSurroundMixLevel").build();
    private static final MarshallingInfo<Double> LTRTCENTERMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ltRtCenterMixLevel").build();
    private static final MarshallingInfo<Double> LTRTSURROUNDMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ltRtSurroundMixLevel").build();
    private static final MarshallingInfo<String> METERINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("meteringMode").build();
    private static final MarshallingInfo<Integer> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleRate").build();
    private static final MarshallingInfo<Integer> SPEECHTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("speechThreshold").build();
    private static final MarshallingInfo<String> STEREODOWNMIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stereoDownmix").build();
    private static final MarshallingInfo<String> SURROUNDEXMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("surroundExMode").build();

    private static final Eac3AtmosSettingsMarshaller instance = new Eac3AtmosSettingsMarshaller();

    public static Eac3AtmosSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Eac3AtmosSettings eac3AtmosSettings, ProtocolMarshaller protocolMarshaller) {

        if (eac3AtmosSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eac3AtmosSettings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getBitstreamMode(), BITSTREAMMODE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getCodingMode(), CODINGMODE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getDialogueIntelligence(), DIALOGUEINTELLIGENCE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getDynamicRangeCompressionLine(), DYNAMICRANGECOMPRESSIONLINE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getDynamicRangeCompressionRf(), DYNAMICRANGECOMPRESSIONRF_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getLoRoCenterMixLevel(), LOROCENTERMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getLoRoSurroundMixLevel(), LOROSURROUNDMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getLtRtCenterMixLevel(), LTRTCENTERMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getLtRtSurroundMixLevel(), LTRTSURROUNDMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getMeteringMode(), METERINGMODE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getSpeechThreshold(), SPEECHTHRESHOLD_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getStereoDownmix(), STEREODOWNMIX_BINDING);
            protocolMarshaller.marshall(eac3AtmosSettings.getSurroundExMode(), SURROUNDEXMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
