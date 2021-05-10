/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LoRaWANGatewayMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANGatewayMarshaller {

    private static final MarshallingInfo<String> GATEWAYEUI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayEui").build();
    private static final MarshallingInfo<String> RFREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RfRegion").build();
    private static final MarshallingInfo<List> JOINEUIFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JoinEuiFilters").build();
    private static final MarshallingInfo<List> NETIDFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetIdFilters").build();
    private static final MarshallingInfo<List> SUBBANDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubBands").build();

    private static final LoRaWANGatewayMarshaller instance = new LoRaWANGatewayMarshaller();

    public static LoRaWANGatewayMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANGateway loRaWANGateway, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANGateway == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANGateway.getGatewayEui(), GATEWAYEUI_BINDING);
            protocolMarshaller.marshall(loRaWANGateway.getRfRegion(), RFREGION_BINDING);
            protocolMarshaller.marshall(loRaWANGateway.getJoinEuiFilters(), JOINEUIFILTERS_BINDING);
            protocolMarshaller.marshall(loRaWANGateway.getNetIdFilters(), NETIDFILTERS_BINDING);
            protocolMarshaller.marshall(loRaWANGateway.getSubBands(), SUBBANDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
