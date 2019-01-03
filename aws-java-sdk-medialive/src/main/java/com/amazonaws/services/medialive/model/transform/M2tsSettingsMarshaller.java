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
 * M2tsSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class M2tsSettingsMarshaller {

    private static final MarshallingInfo<String> ABSENTINPUTAUDIOBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("absentInputAudioBehavior").build();
    private static final MarshallingInfo<String> ARIB_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arib").build();
    private static final MarshallingInfo<String> ARIBCAPTIONSPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aribCaptionsPid").build();
    private static final MarshallingInfo<String> ARIBCAPTIONSPIDCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aribCaptionsPidControl").build();
    private static final MarshallingInfo<String> AUDIOBUFFERMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioBufferModel").build();
    private static final MarshallingInfo<Integer> AUDIOFRAMESPERPES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioFramesPerPes").build();
    private static final MarshallingInfo<String> AUDIOPIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioPids").build();
    private static final MarshallingInfo<String> AUDIOSTREAMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioStreamType").build();
    private static final MarshallingInfo<Integer> BITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bitrate").build();
    private static final MarshallingInfo<String> BUFFERMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bufferModel").build();
    private static final MarshallingInfo<String> CCDESCRIPTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ccDescriptor").build();
    private static final MarshallingInfo<StructuredPojo> DVBNITSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbNitSettings").build();
    private static final MarshallingInfo<StructuredPojo> DVBSDTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSdtSettings").build();
    private static final MarshallingInfo<String> DVBSUBPIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbSubPids").build();
    private static final MarshallingInfo<StructuredPojo> DVBTDTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbTdtSettings").build();
    private static final MarshallingInfo<String> DVBTELETEXTPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbTeletextPid").build();
    private static final MarshallingInfo<String> EBIF_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ebif").build();
    private static final MarshallingInfo<String> EBPAUDIOINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebpAudioInterval").build();
    private static final MarshallingInfo<Integer> EBPLOOKAHEADMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebpLookaheadMs").build();
    private static final MarshallingInfo<String> EBPPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebpPlacement").build();
    private static final MarshallingInfo<String> ECMPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ecmPid").build();
    private static final MarshallingInfo<String> ESRATEINPES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("esRateInPes").build();
    private static final MarshallingInfo<String> ETVPLATFORMPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("etvPlatformPid").build();
    private static final MarshallingInfo<String> ETVSIGNALPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("etvSignalPid").build();
    private static final MarshallingInfo<Double> FRAGMENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentTime").build();
    private static final MarshallingInfo<String> KLV_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("klv").build();
    private static final MarshallingInfo<String> KLVDATAPIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("klvDataPids").build();
    private static final MarshallingInfo<Double> NULLPACKETBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nullPacketBitrate").build();
    private static final MarshallingInfo<Integer> PATINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("patInterval").build();
    private static final MarshallingInfo<String> PCRCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pcrControl").build();
    private static final MarshallingInfo<Integer> PCRPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pcrPeriod").build();
    private static final MarshallingInfo<String> PCRPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pcrPid").build();
    private static final MarshallingInfo<Integer> PMTINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pmtInterval").build();
    private static final MarshallingInfo<String> PMTPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pmtPid").build();
    private static final MarshallingInfo<Integer> PROGRAMNUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programNum").build();
    private static final MarshallingInfo<String> RATEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rateMode").build();
    private static final MarshallingInfo<String> SCTE27PIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte27Pids").build();
    private static final MarshallingInfo<String> SCTE35CONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Control").build();
    private static final MarshallingInfo<String> SCTE35PID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scte35Pid").build();
    private static final MarshallingInfo<String> SEGMENTATIONMARKERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationMarkers").build();
    private static final MarshallingInfo<String> SEGMENTATIONSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationStyle").build();
    private static final MarshallingInfo<Double> SEGMENTATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationTime").build();
    private static final MarshallingInfo<String> TIMEDMETADATABEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataBehavior").build();
    private static final MarshallingInfo<String> TIMEDMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataPid").build();
    private static final MarshallingInfo<Integer> TRANSPORTSTREAMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transportStreamId").build();
    private static final MarshallingInfo<String> VIDEOPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("videoPid").build();

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
            protocolMarshaller.marshall(m2tsSettings.getAbsentInputAudioBehavior(), ABSENTINPUTAUDIOBEHAVIOR_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getArib(), ARIB_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAribCaptionsPid(), ARIBCAPTIONSPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAribCaptionsPidControl(), ARIBCAPTIONSPIDCONTROL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAudioBufferModel(), AUDIOBUFFERMODEL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAudioFramesPerPes(), AUDIOFRAMESPERPES_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAudioPids(), AUDIOPIDS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getAudioStreamType(), AUDIOSTREAMTYPE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getBitrate(), BITRATE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getBufferModel(), BUFFERMODEL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getCcDescriptor(), CCDESCRIPTOR_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbNitSettings(), DVBNITSETTINGS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbSdtSettings(), DVBSDTSETTINGS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbSubPids(), DVBSUBPIDS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbTdtSettings(), DVBTDTSETTINGS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getDvbTeletextPid(), DVBTELETEXTPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEbif(), EBIF_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEbpAudioInterval(), EBPAUDIOINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEbpLookaheadMs(), EBPLOOKAHEADMS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEbpPlacement(), EBPPLACEMENT_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEcmPid(), ECMPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEsRateInPes(), ESRATEINPES_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEtvPlatformPid(), ETVPLATFORMPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getEtvSignalPid(), ETVSIGNALPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getFragmentTime(), FRAGMENTTIME_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getKlv(), KLV_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getKlvDataPids(), KLVDATAPIDS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getNullPacketBitrate(), NULLPACKETBITRATE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPatInterval(), PATINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPcrControl(), PCRCONTROL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPcrPeriod(), PCRPERIOD_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPcrPid(), PCRPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPmtInterval(), PMTINTERVAL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getPmtPid(), PMTPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getProgramNum(), PROGRAMNUM_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getRateMode(), RATEMODE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getScte27Pids(), SCTE27PIDS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getScte35Control(), SCTE35CONTROL_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getScte35Pid(), SCTE35PID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getSegmentationMarkers(), SEGMENTATIONMARKERS_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getSegmentationStyle(), SEGMENTATIONSTYLE_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getSegmentationTime(), SEGMENTATIONTIME_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getTimedMetadataBehavior(), TIMEDMETADATABEHAVIOR_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getTimedMetadataPid(), TIMEDMETADATAPID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getTransportStreamId(), TRANSPORTSTREAMID_BINDING);
            protocolMarshaller.marshall(m2tsSettings.getVideoPid(), VIDEOPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
