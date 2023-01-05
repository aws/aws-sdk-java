/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObdInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObdInterfaceMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Integer> REQUESTMESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestMessageId").build();
    private static final MarshallingInfo<String> OBDSTANDARD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("obdStandard").build();
    private static final MarshallingInfo<Integer> PIDREQUESTINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pidRequestIntervalSeconds").build();
    private static final MarshallingInfo<Integer> DTCREQUESTINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dtcRequestIntervalSeconds").build();
    private static final MarshallingInfo<Boolean> USEEXTENDEDIDS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useExtendedIds").build();
    private static final MarshallingInfo<Boolean> HASTRANSMISSIONECU_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hasTransmissionEcu").build();

    private static final ObdInterfaceMarshaller instance = new ObdInterfaceMarshaller();

    public static ObdInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ObdInterface obdInterface, ProtocolMarshaller protocolMarshaller) {

        if (obdInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(obdInterface.getName(), NAME_BINDING);
            protocolMarshaller.marshall(obdInterface.getRequestMessageId(), REQUESTMESSAGEID_BINDING);
            protocolMarshaller.marshall(obdInterface.getObdStandard(), OBDSTANDARD_BINDING);
            protocolMarshaller.marshall(obdInterface.getPidRequestIntervalSeconds(), PIDREQUESTINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(obdInterface.getDtcRequestIntervalSeconds(), DTCREQUESTINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(obdInterface.getUseExtendedIds(), USEEXTENDEDIDS_BINDING);
            protocolMarshaller.marshall(obdInterface.getHasTransmissionEcu(), HASTRANSMISSIONECU_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
