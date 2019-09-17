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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsGroupSettingsMarshaller {

    private static final MarshallingInfo<List> ADMARKERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("adMarkers").build();
    private static final MarshallingInfo<String> BASEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("baseUrl").build();
    private static final MarshallingInfo<List> CAPTIONLANGUAGEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionLanguageMappings").build();
    private static final MarshallingInfo<String> CAPTIONLANGUAGESETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionLanguageSetting").build();
    private static final MarshallingInfo<String> CLIENTCACHE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientCache").build();
    private static final MarshallingInfo<String> CODECSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecSpecification").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationSettings").build();
    private static final MarshallingInfo<String> DIRECTORYSTRUCTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directoryStructure").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<String> MANIFESTCOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestCompression").build();
    private static final MarshallingInfo<String> MANIFESTDURATIONFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestDurationFormat").build();
    private static final MarshallingInfo<Double> MINFINALSEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minFinalSegmentLength").build();
    private static final MarshallingInfo<Integer> MINSEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minSegmentLength").build();
    private static final MarshallingInfo<String> OUTPUTSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputSelection").build();
    private static final MarshallingInfo<String> PROGRAMDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTime").build();
    private static final MarshallingInfo<Integer> PROGRAMDATETIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTimePeriod").build();
    private static final MarshallingInfo<String> SEGMENTCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentControl").build();
    private static final MarshallingInfo<Integer> SEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentLength").build();
    private static final MarshallingInfo<Integer> SEGMENTSPERSUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentsPerSubdirectory").build();
    private static final MarshallingInfo<String> STREAMINFRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamInfResolution").build();
    private static final MarshallingInfo<String> TIMEDMETADATAID3FRAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataId3Frame").build();
    private static final MarshallingInfo<Integer> TIMEDMETADATAID3PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataId3Period").build();
    private static final MarshallingInfo<Integer> TIMESTAMPDELTAMILLISECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timestampDeltaMilliseconds").build();

    private static final HlsGroupSettingsMarshaller instance = new HlsGroupSettingsMarshaller();

    public static HlsGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsGroupSettings hlsGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsGroupSettings.getAdMarkers(), ADMARKERS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getBaseUrl(), BASEURL_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getCaptionLanguageMappings(), CAPTIONLANGUAGEMAPPINGS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getCaptionLanguageSetting(), CAPTIONLANGUAGESETTING_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getClientCache(), CLIENTCACHE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getCodecSpecification(), CODECSPECIFICATION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getDestinationSettings(), DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getDirectoryStructure(), DIRECTORYSTRUCTURE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getManifestCompression(), MANIFESTCOMPRESSION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getManifestDurationFormat(), MANIFESTDURATIONFORMAT_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getMinFinalSegmentLength(), MINFINALSEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getMinSegmentLength(), MINSEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getOutputSelection(), OUTPUTSELECTION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getProgramDateTime(), PROGRAMDATETIME_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getProgramDateTimePeriod(), PROGRAMDATETIMEPERIOD_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getSegmentControl(), SEGMENTCONTROL_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getSegmentLength(), SEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getSegmentsPerSubdirectory(), SEGMENTSPERSUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getStreamInfResolution(), STREAMINFRESOLUTION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTimedMetadataId3Frame(), TIMEDMETADATAID3FRAME_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTimedMetadataId3Period(), TIMEDMETADATAID3PERIOD_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTimestampDeltaMilliseconds(), TIMESTAMPDELTAMILLISECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
