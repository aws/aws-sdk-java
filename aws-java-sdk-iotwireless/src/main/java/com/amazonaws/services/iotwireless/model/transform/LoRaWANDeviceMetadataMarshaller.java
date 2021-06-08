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
 * LoRaWANDeviceMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANDeviceMetadataMarshaller {

    private static final MarshallingInfo<String> DEVEUI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DevEui").build();
    private static final MarshallingInfo<Integer> FPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FPort").build();
    private static final MarshallingInfo<Integer> DATARATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRate").build();
    private static final MarshallingInfo<Integer> FREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Frequency").build();
    private static final MarshallingInfo<String> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timestamp").build();
    private static final MarshallingInfo<List> GATEWAYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Gateways").build();

    private static final LoRaWANDeviceMetadataMarshaller instance = new LoRaWANDeviceMetadataMarshaller();

    public static LoRaWANDeviceMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANDeviceMetadata loRaWANDeviceMetadata, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANDeviceMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANDeviceMetadata.getDevEui(), DEVEUI_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceMetadata.getFPort(), FPORT_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceMetadata.getDataRate(), DATARATE_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceMetadata.getFrequency(), FREQUENCY_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceMetadata.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(loRaWANDeviceMetadata.getGateways(), GATEWAYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
