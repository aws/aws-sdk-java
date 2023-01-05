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
 * ParticipatingGatewaysMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParticipatingGatewaysMarshaller {

    private static final MarshallingInfo<String> DOWNLINKMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DownlinkMode").build();
    private static final MarshallingInfo<List> GATEWAYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GatewayList").build();
    private static final MarshallingInfo<Integer> TRANSMISSIONINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransmissionInterval").build();

    private static final ParticipatingGatewaysMarshaller instance = new ParticipatingGatewaysMarshaller();

    public static ParticipatingGatewaysMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParticipatingGateways participatingGateways, ProtocolMarshaller protocolMarshaller) {

        if (participatingGateways == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(participatingGateways.getDownlinkMode(), DOWNLINKMODE_BINDING);
            protocolMarshaller.marshall(participatingGateways.getGatewayList(), GATEWAYLIST_BINDING);
            protocolMarshaller.marshall(participatingGateways.getTransmissionInterval(), TRANSMISSIONINTERVAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
