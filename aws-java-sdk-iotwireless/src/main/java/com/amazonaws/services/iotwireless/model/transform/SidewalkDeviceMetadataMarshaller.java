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
 * SidewalkDeviceMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SidewalkDeviceMetadataMarshaller {

    private static final MarshallingInfo<Integer> RSSI_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rssi").build();
    private static final MarshallingInfo<String> BATTERYLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatteryLevel").build();
    private static final MarshallingInfo<String> EVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Event").build();
    private static final MarshallingInfo<String> DEVICESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceState").build();

    private static final SidewalkDeviceMetadataMarshaller instance = new SidewalkDeviceMetadataMarshaller();

    public static SidewalkDeviceMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SidewalkDeviceMetadata sidewalkDeviceMetadata, ProtocolMarshaller protocolMarshaller) {

        if (sidewalkDeviceMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sidewalkDeviceMetadata.getRssi(), RSSI_BINDING);
            protocolMarshaller.marshall(sidewalkDeviceMetadata.getBatteryLevel(), BATTERYLEVEL_BINDING);
            protocolMarshaller.marshall(sidewalkDeviceMetadata.getEvent(), EVENT_BINDING);
            protocolMarshaller.marshall(sidewalkDeviceMetadata.getDeviceState(), DEVICESTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
