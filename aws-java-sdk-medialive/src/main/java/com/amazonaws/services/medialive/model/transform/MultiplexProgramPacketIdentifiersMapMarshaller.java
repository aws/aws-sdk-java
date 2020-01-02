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
package com.amazonaws.services.medialive.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MultiplexProgramPacketIdentifiersMapMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MultiplexProgramPacketIdentifiersMapMarshaller {

    private static final MarshallingInfo<List> AUDIOPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audioPids").build();
    private static final MarshallingInfo<List> DVBSUBPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dvbSubPids").build();
    private static final MarshallingInfo<Integer> DVBTELETEXTPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dvbTeletextPid").build();
    private static final MarshallingInfo<Integer> ETVPLATFORMPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("etvPlatformPid").build();
    private static final MarshallingInfo<Integer> ETVSIGNALPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("etvSignalPid").build();
    private static final MarshallingInfo<List> KLVDATAPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("klvDataPids").build();
    private static final MarshallingInfo<Integer> PCRPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pcrPid").build();
    private static final MarshallingInfo<Integer> PMTPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pmtPid").build();
    private static final MarshallingInfo<Integer> PRIVATEMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateMetadataPid").build();
    private static final MarshallingInfo<List> SCTE27PIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scte27Pids").build();
    private static final MarshallingInfo<Integer> SCTE35PID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35Pid").build();
    private static final MarshallingInfo<Integer> TIMEDMETADATAPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataPid").build();
    private static final MarshallingInfo<Integer> VIDEOPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoPid").build();

    private static final MultiplexProgramPacketIdentifiersMapMarshaller instance = new MultiplexProgramPacketIdentifiersMapMarshaller();

    public static MultiplexProgramPacketIdentifiersMapMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MultiplexProgramPacketIdentifiersMap multiplexProgramPacketIdentifiersMap, ProtocolMarshaller protocolMarshaller) {

        if (multiplexProgramPacketIdentifiersMap == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getAudioPids(), AUDIOPIDS_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getDvbSubPids(), DVBSUBPIDS_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getDvbTeletextPid(), DVBTELETEXTPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getEtvPlatformPid(), ETVPLATFORMPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getEtvSignalPid(), ETVSIGNALPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getKlvDataPids(), KLVDATAPIDS_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getPcrPid(), PCRPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getPmtPid(), PMTPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getPrivateMetadataPid(), PRIVATEMETADATAPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getScte27Pids(), SCTE27PIDS_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getScte35Pid(), SCTE35PID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getTimedMetadataPid(), TIMEDMETADATAPID_BINDING);
            protocolMarshaller.marshall(multiplexProgramPacketIdentifiersMap.getVideoPid(), VIDEOPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
