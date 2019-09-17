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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

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
    private static final MarshallingInfo<String> BASEURLCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseUrlContent").build();
    private static final MarshallingInfo<String> BASEURLMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseUrlManifest").build();
    private static final MarshallingInfo<List> CAPTIONLANGUAGEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionLanguageMappings").build();
    private static final MarshallingInfo<String> CAPTIONLANGUAGESETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captionLanguageSetting").build();
    private static final MarshallingInfo<String> CLIENTCACHE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientCache").build();
    private static final MarshallingInfo<String> CODECSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codecSpecification").build();
    private static final MarshallingInfo<String> CONSTANTIV_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("constantIv").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<String> DIRECTORYSTRUCTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directoryStructure").build();
    private static final MarshallingInfo<String> ENCRYPTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionType").build();
    private static final MarshallingInfo<StructuredPojo> HLSCDNSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsCdnSettings").build();
    private static final MarshallingInfo<String> IFRAMEONLYPLAYLISTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iFrameOnlyPlaylists").build();
    private static final MarshallingInfo<Integer> INDEXNSEGMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("indexNSegments").build();
    private static final MarshallingInfo<String> INPUTLOSSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossAction").build();
    private static final MarshallingInfo<String> IVINMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ivInManifest").build();
    private static final MarshallingInfo<String> IVSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ivSource").build();
    private static final MarshallingInfo<Integer> KEEPSEGMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keepSegments").build();
    private static final MarshallingInfo<String> KEYFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keyFormat").build();
    private static final MarshallingInfo<String> KEYFORMATVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keyFormatVersions").build();
    private static final MarshallingInfo<StructuredPojo> KEYPROVIDERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keyProviderSettings").build();
    private static final MarshallingInfo<String> MANIFESTCOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestCompression").build();
    private static final MarshallingInfo<String> MANIFESTDURATIONFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestDurationFormat").build();
    private static final MarshallingInfo<Integer> MINSEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minSegmentLength").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mode").build();
    private static final MarshallingInfo<String> OUTPUTSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputSelection").build();
    private static final MarshallingInfo<String> PROGRAMDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTime").build();
    private static final MarshallingInfo<Integer> PROGRAMDATETIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programDateTimePeriod").build();
    private static final MarshallingInfo<String> REDUNDANTMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redundantManifest").build();
    private static final MarshallingInfo<Integer> SEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentLength").build();
    private static final MarshallingInfo<String> SEGMENTATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationMode").build();
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
    private static final MarshallingInfo<String> TSFILEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tsFileMode").build();

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
            protocolMarshaller.marshall(hlsGroupSettings.getBaseUrlContent(), BASEURLCONTENT_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getBaseUrlManifest(), BASEURLMANIFEST_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getCaptionLanguageMappings(), CAPTIONLANGUAGEMAPPINGS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getCaptionLanguageSetting(), CAPTIONLANGUAGESETTING_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getClientCache(), CLIENTCACHE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getCodecSpecification(), CODECSPECIFICATION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getConstantIv(), CONSTANTIV_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getDirectoryStructure(), DIRECTORYSTRUCTURE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getEncryptionType(), ENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getHlsCdnSettings(), HLSCDNSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getIFrameOnlyPlaylists(), IFRAMEONLYPLAYLISTS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getIndexNSegments(), INDEXNSEGMENTS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getInputLossAction(), INPUTLOSSACTION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getIvInManifest(), IVINMANIFEST_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getIvSource(), IVSOURCE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getKeepSegments(), KEEPSEGMENTS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getKeyFormat(), KEYFORMAT_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getKeyFormatVersions(), KEYFORMATVERSIONS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getKeyProviderSettings(), KEYPROVIDERSETTINGS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getManifestCompression(), MANIFESTCOMPRESSION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getManifestDurationFormat(), MANIFESTDURATIONFORMAT_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getMinSegmentLength(), MINSEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getOutputSelection(), OUTPUTSELECTION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getProgramDateTime(), PROGRAMDATETIME_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getProgramDateTimePeriod(), PROGRAMDATETIMEPERIOD_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getRedundantManifest(), REDUNDANTMANIFEST_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getSegmentLength(), SEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getSegmentationMode(), SEGMENTATIONMODE_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getSegmentsPerSubdirectory(), SEGMENTSPERSUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getStreamInfResolution(), STREAMINFRESOLUTION_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTimedMetadataId3Frame(), TIMEDMETADATAID3FRAME_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTimedMetadataId3Period(), TIMEDMETADATAID3PERIOD_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTimestampDeltaMilliseconds(), TIMESTAMPDELTAMILLISECONDS_BINDING);
            protocolMarshaller.marshall(hlsGroupSettings.getTsFileMode(), TSFILEMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
