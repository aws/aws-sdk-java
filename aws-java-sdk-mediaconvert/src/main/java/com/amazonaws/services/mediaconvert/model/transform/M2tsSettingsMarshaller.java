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
 * M2tsSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class M2tsSettingsMarshaller {

    private static final MarshallingInfo<String> AUDIOBUFFERMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioBufferModel").build();
    private static final MarshallingInfo<Integer> AUDIOFRAMESPERPES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioFramesPerPes").build();
    private static final MarshallingInfo<List> AUDIOPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioPids").build();
    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> BUFFERMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bufferModel").build();
    private static final MarshallingInfo<StructuredPojo> DVBNITSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbNitSettings").build();
    private static final MarshallingInfo<StructuredPojo> DVBSDTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSdtSettings").build();
    private static final MarshallingInfo<List> DVBSUBPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dvbSubPids").build();
    private static final MarshallingInfo<StructuredPojo> DVBTDTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbTdtSettings").build();
    private static final MarshallingInfo<Integer> DVBTELETEXTPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbTeletextPid").build();
    private static final MarshallingInfo<String> EBPAUDIOINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebpAudioInterval").build();
    private static final MarshallingInfo<String> EBPPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebpPlacement").build();
    private static final MarshallingInfo<String> ESRATEINPES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("esRateInPes").build();
    private static final MarshallingInfo<String> FORCETSVIDEOEBPORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forceTsVideoEbpOrder").build();
    private static final MarshallingInfo<Double> FRAGMENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentTime").build();
    private static final MarshallingInfo<Integer> MAXPCRINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxPcrInterval").build();
    private static final MarshallingInfo<Integer> MINEBPINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minEbpInterval").build();
    private static final MarshallingInfo<String> NIELSENID3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenId3").build();
    private static final MarshallingInfo<Double> NULLPACKETBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nullPacketBitrate").build();
    private static final MarshallingInfo<Integer> PATINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("patInterval").build();
    private static final MarshallingInfo<String> PCRCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pcrControl").build();
    private static final MarshallingInfo<Integer> PCRPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pcrPid").build();
    private static final MarshallingInfo<Integer> PMTINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pmtInterval").build();
    private static final MarshallingInfo<Integer> PMTPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pmtPid").build();
    private static final MarshallingInfo<Integer> PRIVATEMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateMetadataPid").build();
    private static final MarshallingInfo<Integer> PROGRAMNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programNumber").build();
    private static final MarshallingInfo<String> RATEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rateMode").build();
    private static final MarshallingInfo<StructuredPojo> SCTE35ESAM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Esam").build();
    private static final MarshallingInfo<Integer> SCTE35PID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Pid").build();
    private static final MarshallingInfo<String> SCTE35SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Source").build();
    private static final MarshallingInfo<String> SEGMENTATIONMARKERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationMarkers").build();
    private static final MarshallingInfo<String> SEGMENTATIONSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationStyle").build();
    private static final MarshallingInfo<Double> SEGMENTATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationTime").build();
    private static final MarshallingInfo<Integer> TIMEDMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataPid").build();
    private static final MarshallingInfo<Integer> TRANSPORTSTREAMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transportStreamId").build();
    private static final MarshallingInfo<Integer> VIDEOPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoPid").build();

    private static final M2tsSettingsMarshaller instance = new M2tsSettingsMarshaller();

    public static M2tsSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(M2tsSettings m2tsSettings, ProtocolMarshaller protocolMarshaller) {

        if (m2tsSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(m2tsSettings.getAudioBufferModel(), AUDIOBUFFERMODEL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAudioFramesPerPes(), AUDIOFRAMESPERPES_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAudioPids(), AUDIOPIDS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getBufferModel(), BUFFERMODEL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbNitSettings(), DVBNITSETTINGS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbSdtSettings(), DVBSDTSETTINGS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbSubPids(), DVBSUBPIDS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbTdtSettings(), DVBTDTSETTINGS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbTeletextPid(), DVBTELETEXTPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEbpAudioInterval(), EBPAUDIOINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEbpPlacement(), EBPPLACEMENT_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEsRateInPes(), ESRATEINPES_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getForceTsVideoEbpOrder(), FORCETSVIDEOEBPORDER_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getFragmentTime(), FRAGMENTTIME_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getMaxPcrInterval(), MAXPCRINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getMinEbpInterval(), MINEBPINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getNielsenId3(), NIELSENID3_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getNullPacketBitrate(), NULLPACKETBITRATE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPatInterval(), PATINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPcrControl(), PCRCONTROL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPcrPid(), PCRPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPmtInterval(), PMTINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPmtPid(), PMTPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPrivateMetadataPid(), PRIVATEMETADATAPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getProgramNumber(), PROGRAMNUMBER_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getRateMode(), RATEMODE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getScte35Esam(), SCTE35ESAM_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getScte35Pid(), SCTE35PID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getScte35Source(), SCTE35SOURCE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getSegmentationMarkers(), SEGMENTATIONMARKERS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getSegmentationStyle(), SEGMENTATIONSTYLE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getSegmentationTime(), SEGMENTATIONTIME_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getTimedMetadataPid(), TIMEDMETADATAPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getTransportStreamId(), TRANSPORTSTREAMID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getVideoPid(), VIDEOPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
