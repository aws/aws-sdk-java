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
package com.amazonaws.services.private5g.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceIdentifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceIdentifierMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DEVICEIDENTIFIERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceIdentifierArn").build();
    private static final MarshallingInfo<String> ICCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iccid").build();
    private static final MarshallingInfo<String> IMSI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imsi").build();
    private static final MarshallingInfo<String> NETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkArn").build();
    private static final MarshallingInfo<String> ORDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("orderArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TRAFFICGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trafficGroupArn").build();
    private static final MarshallingInfo<String> VENDOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vendor").build();

    private static final DeviceIdentifierMarshaller instance = new DeviceIdentifierMarshaller();

    public static DeviceIdentifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceIdentifier deviceIdentifier, ProtocolMarshaller protocolMarshaller) {

        if (deviceIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceIdentifier.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getDeviceIdentifierArn(), DEVICEIDENTIFIERARN_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getIccid(), ICCID_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getImsi(), IMSI_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getNetworkArn(), NETWORKARN_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getOrderArn(), ORDERARN_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getTrafficGroupArn(), TRAFFICGROUPARN_BINDING);
            protocolMarshaller.marshall(deviceIdentifier.getVendor(), VENDOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
