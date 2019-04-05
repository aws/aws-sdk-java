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
 * Ac3SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Ac3SettingsMarshaller {

    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> BITSTREAMMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitstreamMode").build();
    private static final MarshallingInfo<String> CODINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codingMode").build();
    private static final MarshallingInfo<Integer> DIALNORM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialnorm").build();
    private static final MarshallingInfo<String> DYNAMICRANGECOMPRESSIONPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamicRangeCompressionProfile").build();
    private static final MarshallingInfo<String> LFEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lfeFilter").build();
    private static final MarshallingInfo<String> METADATACONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadataControl").build();
    private static final MarshallingInfo<Integer> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleRate").build();

    private static final Ac3SettingsMarshaller instance = new Ac3SettingsMarshaller();

    public static Ac3SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Ac3Settings ac3Settings, ProtocolMarshaller protocolMarshaller) {

        if (ac3Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ac3Settings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(ac3Settings.getBitstreamMode(), BITSTREAMMODE_BINDING);
            protocolMarshaller.marshall(ac3Settings.getCodingMode(), CODINGMODE_BINDING);
            protocolMarshaller.marshall(ac3Settings.getDialnorm(), DIALNORM_BINDING);
            protocolMarshaller.marshall(ac3Settings.getDynamicRangeCompressionProfile(), DYNAMICRANGECOMPRESSIONPROFILE_BINDING);
            protocolMarshaller.marshall(ac3Settings.getLfeFilter(), LFEFILTER_BINDING);
            protocolMarshaller.marshall(ac3Settings.getMetadataControl(), METADATACONTROL_BINDING);
            protocolMarshaller.marshall(ac3Settings.getSampleRate(), SAMPLERATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
