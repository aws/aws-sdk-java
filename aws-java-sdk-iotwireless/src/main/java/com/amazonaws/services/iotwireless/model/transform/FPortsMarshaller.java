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
package com.amazonaws.services.iotwireless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FPortsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FPortsMarshaller {

    private static final MarshallingInfo<Integer> FUOTA_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Fuota").build();
    private static final MarshallingInfo<Integer> MULTICAST_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Multicast").build();
    private static final MarshallingInfo<Integer> CLOCKSYNC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClockSync").build();
    private static final MarshallingInfo<StructuredPojo> POSITIONING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Positioning").build();
    private static final MarshallingInfo<List> APPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Applications").build();

    private static final FPortsMarshaller instance = new FPortsMarshaller();

    public static FPortsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FPorts fPorts, ProtocolMarshaller protocolMarshaller) {

        if (fPorts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fPorts.getFuota(), FUOTA_BINDING);
            protocolMarshaller.marshall(fPorts.getMulticast(), MULTICAST_BINDING);
            protocolMarshaller.marshall(fPorts.getClockSync(), CLOCKSYNC_BINDING);
            protocolMarshaller.marshall(fPorts.getPositioning(), POSITIONING_BINDING);
            protocolMarshaller.marshall(fPorts.getApplications(), APPLICATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
