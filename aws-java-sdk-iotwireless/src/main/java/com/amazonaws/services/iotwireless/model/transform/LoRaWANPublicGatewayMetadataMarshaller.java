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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoRaWANPublicGatewayMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANPublicGatewayMetadataMarshaller {

    private static final MarshallingInfo<String> PROVIDERNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProviderNetId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Double> RSSI_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rssi").build();
    private static final MarshallingInfo<Double> SNR_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Snr").build();
    private static final MarshallingInfo<String> RFREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RfRegion").build();
    private static final MarshallingInfo<Boolean> DLALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DlAllowed").build();

    private static final LoRaWANPublicGatewayMetadataMarshaller instance = new LoRaWANPublicGatewayMetadataMarshaller();

    public static LoRaWANPublicGatewayMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANPublicGatewayMetadata loRaWANPublicGatewayMetadata, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANPublicGatewayMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANPublicGatewayMetadata.getProviderNetId(), PROVIDERNETID_BINDING);
            protocolMarshaller.marshall(loRaWANPublicGatewayMetadata.getId(), ID_BINDING);
            protocolMarshaller.marshall(loRaWANPublicGatewayMetadata.getRssi(), RSSI_BINDING);
            protocolMarshaller.marshall(loRaWANPublicGatewayMetadata.getSnr(), SNR_BINDING);
            protocolMarshaller.marshall(loRaWANPublicGatewayMetadata.getRfRegion(), RFREGION_BINDING);
            protocolMarshaller.marshall(loRaWANPublicGatewayMetadata.getDlAllowed(), DLALLOWED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
