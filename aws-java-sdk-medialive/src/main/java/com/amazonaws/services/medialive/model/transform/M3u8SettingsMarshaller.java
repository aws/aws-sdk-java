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
 * M3u8SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class M3u8SettingsMarshaller {

    private static final MarshallingInfo<Integer> AUDIOFRAMESPERPES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioFramesPerPes").build();
    private static final MarshallingInfo<String> AUDIOPIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioPids").build();
    private static final MarshallingInfo<String> ECMPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ecmPid").build();
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
    private static final MarshallingInfo<String> SCTE35BEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Behavior").build();
    private static final MarshallingInfo<String> SCTE35PID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scte35Pid").build();
    private static final MarshallingInfo<String> TIMEDMETADATABEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataBehavior").build();
    private static final MarshallingInfo<String> TIMEDMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataPid").build();
    private static final MarshallingInfo<Integer> TRANSPORTSTREAMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transportStreamId").build();
    private static final MarshallingInfo<String> VIDEOPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("videoPid").build();

    private static final M3u8SettingsMarshaller instance = new M3u8SettingsMarshaller();

    public static M3u8SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(M3u8Settings m3u8Settings, ProtocolMarshaller protocolMarshaller) {

        if (m3u8Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(m3u8Settings.getAudioFramesPerPes(), AUDIOFRAMESPERPES_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getAudioPids(), AUDIOPIDS_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getEcmPid(), ECMPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPatInterval(), PATINTERVAL_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPcrControl(), PCRCONTROL_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPcrPeriod(), PCRPERIOD_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPcrPid(), PCRPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPmtInterval(), PMTINTERVAL_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPmtPid(), PMTPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getProgramNum(), PROGRAMNUM_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getScte35Behavior(), SCTE35BEHAVIOR_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getScte35Pid(), SCTE35PID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getTimedMetadataBehavior(), TIMEDMETADATABEHAVIOR_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getTimedMetadataPid(), TIMEDMETADATAPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getTransportStreamId(), TRANSPORTSTREAMID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getVideoPid(), VIDEOPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
