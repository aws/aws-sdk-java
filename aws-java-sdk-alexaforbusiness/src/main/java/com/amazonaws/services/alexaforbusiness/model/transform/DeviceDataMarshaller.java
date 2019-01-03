/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceDataMarshaller {

    private static final MarshallingInfo<String> DEVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceArn").build();
    private static final MarshallingInfo<String> DEVICESERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceSerialNumber").build();
    private static final MarshallingInfo<String> DEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceType").build();
    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceName").build();
    private static final MarshallingInfo<String> SOFTWAREVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SoftwareVersion").build();
    private static final MarshallingInfo<String> MACADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MacAddress").build();
    private static final MarshallingInfo<String> DEVICESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceStatus").build();
    private static final MarshallingInfo<String> ROOMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoomArn").build();
    private static final MarshallingInfo<String> ROOMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoomName").build();
    private static final MarshallingInfo<StructuredPojo> DEVICESTATUSINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceStatusInfo").build();

    private static final DeviceDataMarshaller instance = new DeviceDataMarshaller();

    public static DeviceDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceData deviceData, ProtocolMarshaller protocolMarshaller) {

        if (deviceData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceData.getDeviceArn(), DEVICEARN_BINDING);
            protocolMarshaller.marshall(deviceData.getDeviceSerialNumber(), DEVICESERIALNUMBER_BINDING);
            protocolMarshaller.marshall(deviceData.getDeviceType(), DEVICETYPE_BINDING);
            protocolMarshaller.marshall(deviceData.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(deviceData.getSoftwareVersion(), SOFTWAREVERSION_BINDING);
            protocolMarshaller.marshall(deviceData.getMacAddress(), MACADDRESS_BINDING);
            protocolMarshaller.marshall(deviceData.getDeviceStatus(), DEVICESTATUS_BINDING);
            protocolMarshaller.marshall(deviceData.getRoomArn(), ROOMARN_BINDING);
            protocolMarshaller.marshall(deviceData.getRoomName(), ROOMNAME_BINDING);
            protocolMarshaller.marshall(deviceData.getDeviceStatusInfo(), DEVICESTATUSINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
