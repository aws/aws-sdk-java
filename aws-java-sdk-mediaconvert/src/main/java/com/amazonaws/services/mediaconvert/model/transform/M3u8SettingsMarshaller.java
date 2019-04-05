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
 * M3u8SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class M3u8SettingsMarshaller {

    private static final MarshallingInfo<Integer> AUDIOFRAMESPERPES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioFramesPerPes").build();
    private static final MarshallingInfo<List> AUDIOPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioPids").build();
    private static final MarshallingInfo<String> NIELSENID3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenId3").build();
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
    private static final MarshallingInfo<Integer> SCTE35PID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Pid").build();
    private static final MarshallingInfo<String> SCTE35SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Source").build();
    private static final MarshallingInfo<String> TIMEDMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadata").build();
    private static final MarshallingInfo<Integer> TIMEDMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataPid").build();
    private static final MarshallingInfo<Integer> TRANSPORTSTREAMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transportStreamId").build();
    private static final MarshallingInfo<Integer> VIDEOPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoPid").build();

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
            protocolMarshaller.marshall(m3u8Settings.getNielsenId3(), NIELSENID3_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPatInterval(), PATINTERVAL_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPcrControl(), PCRCONTROL_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPcrPid(), PCRPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPmtInterval(), PMTINTERVAL_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPmtPid(), PMTPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getPrivateMetadataPid(), PRIVATEMETADATAPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getProgramNumber(), PROGRAMNUMBER_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getScte35Pid(), SCTE35PID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getScte35Source(), SCTE35SOURCE_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getTimedMetadata(), TIMEDMETADATA_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getTimedMetadataPid(), TIMEDMETADATAPID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getTransportStreamId(), TRANSPORTSTREAMID_BINDING);
            protocolMarshaller.marshall(m3u8Settings.getVideoPid(), VIDEOPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
