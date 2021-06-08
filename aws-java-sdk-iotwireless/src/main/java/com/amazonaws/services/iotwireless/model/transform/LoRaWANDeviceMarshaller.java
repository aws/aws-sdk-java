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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoRaWANDeviceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANDeviceMarshaller {

    private static final MarshallingInfo<String> DEVEUI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DevEui").build();
    private static final MarshallingInfo<String> DEVICEPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceProfileId").build();
    private static final MarshallingInfo<String> SERVICEPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceProfileId").build();
    private static final MarshallingInfo<StructuredPojo> OTAAV1_1_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OtaaV1_1").build();
    private static final MarshallingInfo<StructuredPojo> OTAAV1_0_X_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OtaaV1_0_x").build();
    private static final MarshallingInfo<StructuredPojo> ABPV1_1_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AbpV1_1").build();
    private static final MarshallingInfo<StructuredPojo> ABPV1_0_X_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AbpV1_0_x").build();

    private static final LoRaWANDeviceMarshaller instance = new LoRaWANDeviceMarshaller();

    public static LoRaWANDeviceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANDevice loRaWANDevice, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANDevice == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANDevice.getDevEui(), DEVEUI_BINDING);
            protocolMarshaller.marshall(loRaWANDevice.getDeviceProfileId(), DEVICEPROFILEID_BINDING);
            protocolMarshaller.marshall(loRaWANDevice.getServiceProfileId(), SERVICEPROFILEID_BINDING);
            protocolMarshaller.marshall(loRaWANDevice.getOtaaV1_1(), OTAAV1_1_BINDING);
            protocolMarshaller.marshall(loRaWANDevice.getOtaaV1_0_x(), OTAAV1_0_X_BINDING);
            protocolMarshaller.marshall(loRaWANDevice.getAbpV1_1(), ABPV1_1_BINDING);
            protocolMarshaller.marshall(loRaWANDevice.getAbpV1_0_x(), ABPV1_0_X_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
