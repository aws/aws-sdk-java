/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransportStreamProgramMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransportStreamProgramMarshaller {

    private static final MarshallingInfo<Integer> PCRPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pcrPid").build();
    private static final MarshallingInfo<String> PROGRAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programName").build();
    private static final MarshallingInfo<Integer> PROGRAMNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programNumber").build();
    private static final MarshallingInfo<Integer> PROGRAMPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("programPid").build();
    private static final MarshallingInfo<List> STREAMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("streams").build();

    private static final TransportStreamProgramMarshaller instance = new TransportStreamProgramMarshaller();

    public static TransportStreamProgramMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransportStreamProgram transportStreamProgram, ProtocolMarshaller protocolMarshaller) {

        if (transportStreamProgram == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transportStreamProgram.getPcrPid(), PCRPID_BINDING);
            protocolMarshaller.marshall(transportStreamProgram.getProgramName(), PROGRAMNAME_BINDING);
            protocolMarshaller.marshall(transportStreamProgram.getProgramNumber(), PROGRAMNUMBER_BINDING);
            protocolMarshaller.marshall(transportStreamProgram.getProgramPid(), PROGRAMPID_BINDING);
            protocolMarshaller.marshall(transportStreamProgram.getStreams(), STREAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
