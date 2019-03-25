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
 * CmafGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CmafGroupSettingsMarshaller {

    private static final MarshallingInfo<String> BASEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("baseUrl").build();
    private static final MarshallingInfo<String> CLIENTCACHE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientCache").build();
    private static final MarshallingInfo<String> CODECSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecSpecification").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<Integer> FRAGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentLength").build();
    private static final MarshallingInfo<String> MANIFESTCOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestCompression").build();
    private static final MarshallingInfo<String> MANIFESTDURATIONFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestDurationFormat").build();
    private static final MarshallingInfo<Integer> MINBUFFERTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minBufferTime").build();
    private static final MarshallingInfo<Double> MINFINALSEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minFinalSegmentLength").build();
    private static final MarshallingInfo<String> SEGMENTCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentControl").build();
    private static final MarshallingInfo<Integer> SEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentLength").build();
    private static final MarshallingInfo<String> STREAMINFRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamInfResolution").build();
    private static final MarshallingInfo<String> WRITEDASHMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeDashManifest").build();
    private static final MarshallingInfo<String> WRITEHLSMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeHlsManifest").build();

    private static final CmafGroupSettingsMarshaller instance = new CmafGroupSettingsMarshaller();

    public static CmafGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CmafGroupSettings cmafGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (cmafGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cmafGroupSettings.getBaseUrl(), BASEURL_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getClientCache(), CLIENTCACHE_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getCodecSpecification(), CODECSPECIFICATION_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getDestinationSettings(), DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getFragmentLength(), FRAGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getManifestCompression(), MANIFESTCOMPRESSION_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getManifestDurationFormat(), MANIFESTDURATIONFORMAT_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getMinBufferTime(), MINBUFFERTIME_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getMinFinalSegmentLength(), MINFINALSEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getSegmentControl(), SEGMENTCONTROL_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getSegmentLength(), SEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getStreamInfResolution(), STREAMINFRESOLUTION_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getWriteDashManifest(), WRITEDASHMANIFEST_BINDING);
            protocolMarshaller.marshall(cmafGroupSettings.getWriteHlsManifest(), WRITEHLSMANIFEST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
