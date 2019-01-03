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
 * Eac3SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Eac3SettingsMarshaller {

    private static final MarshallingInfo<String> ATTENUATIONCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attenuationControl").build();
    private static final MarshallingInfo<Double> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> BITSTREAMMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitstreamMode").build();
    private static final MarshallingInfo<String> CODINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codingMode").build();
    private static final MarshallingInfo<String> DCFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dcFilter").build();
    private static final MarshallingInfo<Integer> DIALNORM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialnorm").build();
    private static final MarshallingInfo<String> DRCLINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("drcLine").build();
    private static final MarshallingInfo<String> DRCRF_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("drcRf").build();
    private static final MarshallingInfo<String> LFECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lfeControl").build();
    private static final MarshallingInfo<String> LFEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lfeFilter").build();
    private static final MarshallingInfo<Double> LOROCENTERMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loRoCenterMixLevel").build();
    private static final MarshallingInfo<Double> LOROSURROUNDMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loRoSurroundMixLevel").build();
    private static final MarshallingInfo<Double> LTRTCENTERMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ltRtCenterMixLevel").build();
    private static final MarshallingInfo<Double> LTRTSURROUNDMIXLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ltRtSurroundMixLevel").build();
    private static final MarshallingInfo<String> METADATACONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadataControl").build();
    private static final MarshallingInfo<String> PASSTHROUGHCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("passthroughControl").build();
    private static final MarshallingInfo<String> PHASECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("phaseControl").build();
    private static final MarshallingInfo<String> STEREODOWNMIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stereoDownmix").build();
    private static final MarshallingInfo<String> SURROUNDEXMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("surroundExMode").build();
    private static final MarshallingInfo<String> SURROUNDMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("surroundMode").build();

    private static final Eac3SettingsMarshaller instance = new Eac3SettingsMarshaller();

    public static Eac3SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Eac3Settings eac3Settings, ProtocolMarshaller protocolMarshaller) {

        if (eac3Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eac3Settings.getAttenuationControl(), ATTENUATIONCONTROL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(eac3Settings.getBitstreamMode(), BITSTREAMMODE_BINDING);
            protocolMarshaller.marshall(eac3Settings.getCodingMode(), CODINGMODE_BINDING);
            protocolMarshaller.marshall(eac3Settings.getDcFilter(), DCFILTER_BINDING);
            protocolMarshaller.marshall(eac3Settings.getDialnorm(), DIALNORM_BINDING);
            protocolMarshaller.marshall(eac3Settings.getDrcLine(), DRCLINE_BINDING);
            protocolMarshaller.marshall(eac3Settings.getDrcRf(), DRCRF_BINDING);
            protocolMarshaller.marshall(eac3Settings.getLfeControl(), LFECONTROL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getLfeFilter(), LFEFILTER_BINDING);
            protocolMarshaller.marshall(eac3Settings.getLoRoCenterMixLevel(), LOROCENTERMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getLoRoSurroundMixLevel(), LOROSURROUNDMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getLtRtCenterMixLevel(), LTRTCENTERMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getLtRtSurroundMixLevel(), LTRTSURROUNDMIXLEVEL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getMetadataControl(), METADATACONTROL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getPassthroughControl(), PASSTHROUGHCONTROL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getPhaseControl(), PHASECONTROL_BINDING);
            protocolMarshaller.marshall(eac3Settings.getStereoDownmix(), STEREODOWNMIX_BINDING);
            protocolMarshaller.marshall(eac3Settings.getSurroundExMode(), SURROUNDEXMODE_BINDING);
            protocolMarshaller.marshall(eac3Settings.getSurroundMode(), SURROUNDMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
