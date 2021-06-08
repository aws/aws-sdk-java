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
 * WirelessDeviceStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WirelessDeviceStatisticsMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESTINATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationName").build();
    private static final MarshallingInfo<String> LASTUPLINKRECEIVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUplinkReceivedAt").build();
    private static final MarshallingInfo<StructuredPojo> LORAWAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoRaWAN").build();
    private static final MarshallingInfo<StructuredPojo> SIDEWALK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Sidewalk").build();

    private static final WirelessDeviceStatisticsMarshaller instance = new WirelessDeviceStatisticsMarshaller();

    public static WirelessDeviceStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WirelessDeviceStatistics wirelessDeviceStatistics, ProtocolMarshaller protocolMarshaller) {

        if (wirelessDeviceStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wirelessDeviceStatistics.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getId(), ID_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getName(), NAME_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getDestinationName(), DESTINATIONNAME_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getLastUplinkReceivedAt(), LASTUPLINKRECEIVEDAT_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getLoRaWAN(), LORAWAN_BINDING);
            protocolMarshaller.marshall(wirelessDeviceStatistics.getSidewalk(), SIDEWALK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
