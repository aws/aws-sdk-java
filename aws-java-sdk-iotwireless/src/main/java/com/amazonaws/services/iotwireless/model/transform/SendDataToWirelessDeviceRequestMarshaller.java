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
 * SendDataToWirelessDeviceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendDataToWirelessDeviceRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Integer> TRANSMITMODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransmitMode").build();
    private static final MarshallingInfo<String> PAYLOADDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PayloadData").build();
    private static final MarshallingInfo<StructuredPojo> WIRELESSMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessMetadata").build();

    private static final SendDataToWirelessDeviceRequestMarshaller instance = new SendDataToWirelessDeviceRequestMarshaller();

    public static SendDataToWirelessDeviceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendDataToWirelessDeviceRequest sendDataToWirelessDeviceRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendDataToWirelessDeviceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendDataToWirelessDeviceRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(sendDataToWirelessDeviceRequest.getTransmitMode(), TRANSMITMODE_BINDING);
            protocolMarshaller.marshall(sendDataToWirelessDeviceRequest.getPayloadData(), PAYLOADDATA_BINDING);
            protocolMarshaller.marshall(sendDataToWirelessDeviceRequest.getWirelessMetadata(), WIRELESSMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
